import java.util.Scanner;

/**
 * La classe Deposit étend Transaction. Elle représente un dépôt d'argent dans le compte
 * @author Melanie Malek
 * @version Le dimanche 15 janvier 2023
 */ 

class Deposit extends Transaction 
{
	private double amount; // montant à déposer

	private final static int CANCELED = 0; // constante pour choix d'annuler la transaction

	// constructeur
	public Deposit(Account account) 
	{
		super(account);
	}

	@Override
	public void execute() 
	{
		amount = promptForDepositAmount(); 

		if (amount != CANCELED) 
		{
			System.out.print("\nVeuillez insérer une enveloppe de dépôt contenant l'argent ");
			System.out.printf("$%,.2f", amount);
			System.out.println(".");

			System.out.println("\nEnveloppe reçu.\nL'argent a été déposé dans votre compte.");

			account.credit(amount);
		}
		else 
		{ 
			System.out.println("\nAnnulation de la transaction...");
		}
	}

	private double promptForDepositAmount() 
	{
		System.out.print("\nVeuillez saisir un montant de dépôt en dollars uniquement " + " (ou 0 pour annuler): ");
		int input = new Scanner(System.in).nextInt(); 
		
		if (input == CANCELED) 
		{
			return CANCELED;
		} 
		else 
		{
			return (double) input; 
		}
	}
}
