import java.util.Scanner;

/**
 * La classe Withdrawal étend la classe Transaction et représente un retrait d'argent d'une machine ATM.
 * @author Melanie Malek
 * @version Le dimance 15 janvier 2023
 */

class Withdrawal extends Transaction 
{
  private int amount;

  // constante qui correspond à l'option d'annuler la transaction
  private final static int CANCELED = 6;

  // constructeur
  public Withdrawal(Account account) 
  { 
    // initialise les variables de la classe parent
    super(account);
  }

  @Override
  public void execute() 
  {
    double availableBalance; 

    amount = displayMenuOfAmounts();

    if (amount != CANCELED) 
    {
      availableBalance = account.getBalance();
      if (amount <= availableBalance) 
      {
        account.debit(amount);
        System.out.println("\nVotre argent a été distribué. Veuillez prendre votre argent maintenant.");
      } 
      else 
      { 
        System.out.println("\nFonds insuffisants sur votre compte." + "\n\nVeuillez choisir un montant plus petit.");
      }
    } 
    else 
    { 
      System.out.println("\nAnnulation de la transaction...");
      return; 
    }

  }

  private int displayMenuOfAmounts() 
  {
    int userChoice = 0; // variable pour stocker le choix le l'utilisateur

    int[] amounts = { 0, 20, 40, 60, 100, 200 };

    while (userChoice == 0) {
      System.out.println("\nMenu de sommes:");
      System.out.println("1 - $20");
      System.out.println("2 - $40");
      System.out.println("3 - $60");
      System.out.println("4 - $100");
      System.out.println("5 - $200");
      System.out.println("6 - Annuler la transaction");
      System.out.print("\nChoisissez un montant à retirer: ");

      Scanner s = new Scanner(System.in);
      int input = s.nextInt(); 

      if (input == 1 || input == 2 || input == 3 || input == 4 || input == 5) 
      {
        userChoice = amounts[input]; 
      } 
      else if (input == CANCELED) 
      {
        userChoice = CANCELED; 
      } 
      else 
      {
        System.out.println("\nSélection invalide. Réessayez.");
      }

    }
    return userChoice; 
  }
}
