/**
 * La classe BalanceInquiry étend la classe Transaction et représente une demande de solde 
 * d'un compte bancaire.
 * @author Melanie Malek
 * @version Le dimanche 15 janvier 2023
 */

class BalanceInquiry extends Transaction 
{ 
    // constructeur
    public BalanceInquiry(Account account) // compte hérité de la classe Transaction
    {
        super(account); // appel le constructeur de la classe parent
    }

    // effectue la transaction
    @Override
    public void execute() // méthode implémentée dans chaque sous-classe
    {
        double Balance = account.getBalance();
        System.out.println("\nInformation de solde :");
        System.out.println(" - Solde: ");
        System.out.printf("$%,.2f", Balance);
        System.out.println("");
    }
}