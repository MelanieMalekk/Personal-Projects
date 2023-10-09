import java.util.Scanner;

/**
 * Cette classe s'agit de l'application princpale, soit une machine ATM qui performe des transactions selon
 * les besoins de l'utilisateur.
 * @author Melanie Malek
 * @version Le dimanche 15 janvier 2023
 */
 
class ATM 
{
  private boolean userAuthenticated; 
  private Account userAccount;
  private Account[] accounts; 

  // constantes correspondant aux options du menu principal
  private static final int BALANCE_INQUIRY = 1;
  private static final int WITHDRAWAL = 2;
  private static final int DEPOSIT = 3;
  private static final int EXIT = 4;

  // le constructeur ATM qui ne prend aucun argument et qui initialise les variables d'instance
  public ATM() 
  {
    userAuthenticated = false; // l'utilisateur n'est pas authentifié au début
    accounts = new Account[2]; // just 2 comptes afin de tester
    accounts[0] = new Account(12345, 54321, 1000.0);
    accounts[1] = new Account(98765, 56789, 200.0);
  }

  // récupérer l'objet Account contenant le numéro de compte spécifié
  private Account getAccount(int accountNumber, int pin) 
  {
    // passer à travers les comptes pour rechercher le numéro de compte correspondant
    for (Account currentAccount : accounts) 
    {
      // retourner le compte actuel s'ils sont pareils
      if ((currentAccount.getAccountNumber() == accountNumber) && (currentAccount.getAccountPin() == pin)) 
      {
        return currentAccount;
      }
    }
    return null; 
  }

  public void run() 
  {
    // authentifier l'utilisateur
    while (!userAuthenticated) 
    {
      System.out.println("\nBienvenue!");
      authenticateUser(); 
    }

    performTransactions(); 
    userAuthenticated = false; 
    System.out.println("\nMerci! Au revoir!");

  }

  private void authenticateUser() 
  {
    System.out.print("\nSVP entrez votre numéro de compte: ");
    Scanner input = new Scanner(System.in);
    int accountNumber = input.nextInt(); 
    System.out.print("\nEntrez votre mot de passe: "); 
    int pin = input.nextInt(); 
    userAccount = getAccount(accountNumber, pin); 
    if (userAccount != null) // si le compte est valide, un objet de type Account est créé avec l'information du compte
    {
      userAuthenticated = true;
    }

    // vérifier si l'authentification a réussi
    if (!userAuthenticated)
    {
      System.out.println("Numéro de compte ou mot de passe invalide. Veuillez réessayer.");
    }
  }

  // afficher le menu principal et effectuer des transactions
  private void performTransactions() 
  {
    // variable pour stocker la transaction choisie
    Transaction currentTransaction = null;

    boolean userExited = false; 

    while (!userExited) 
    {
      // afficher le menu principal et obtenir le choix de l'utilisateur
      int mainMenuSelection = displayMainMenu();

      if (mainMenuSelection == BALANCE_INQUIRY || mainMenuSelection == WITHDRAWAL || mainMenuSelection == DEPOSIT) 
      {
        // initialiser comme nouvel objet du type choisi
        currentTransaction = createTransaction(mainMenuSelection);

        currentTransaction.execute(); // exécuter la transaction

      } 
      else if (mainMenuSelection == EXIT) 
      {
        System.out.println("\nDésactivation du système...");
        userExited = true; 
      } else 
        System.out.println("\nVous n'avez pas entrez une bonne valeur. Réessayez.");
    }
  }

  private int displayMainMenu() 
  {
    System.out.println("\nMenu principal:");
    System.out.println("1 - Afficher mon solde");
    System.out.println("2 - Retirer des fonds");
    System.out.println("3 - Déposer des fonds");
    System.out.println("4 - Quitter\n");
    System.out.println("Entrez votre choix: ");
    return new Scanner(System.in).nextInt(); 
  }

  private Transaction createTransaction(int type) 
  {
    Transaction temp = null; // variable de type Transaction temporaire

    // determiner quel type de Transaction à créer
    if (type == BALANCE_INQUIRY) 
    {
      temp = new BalanceInquiry(userAccount);
    } 
    else if (type == WITHDRAWAL) 
    {
      temp = new Withdrawal(userAccount);
    } 
    else if (type == DEPOSIT) 
    {
      temp = new Deposit(userAccount);
    }
    return temp; // retourner le nouvel objet
  }

  public static void main(String[] args) 
  {
    ATM theATM = new ATM();
    theATM.run();
  }
}
