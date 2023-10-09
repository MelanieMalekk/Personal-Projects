/**
 * La classe Transaction est une superclasse abstraite qui représente la notion de transaction ATM.
 * Elle contient les caractéristiques communes des sous-classes Withdrawal, Deposit et BalanceInquiry.
 * @author Melanie Malek
 * @version Le dimanche 15 janvier 2023
 */
abstract class Transaction 
{
    // attribut protecté afin d'être visible dans les sous-classes
    protected Account account; // compte impliqué

    // constructeur 
    public Transaction(Account account) 
    {
        this.account = account;
    }
 
    public Account getAccount()
    {
        return account;
    }

    // effectue la transaction (surcharchée par chaque classe enfant)
    abstract public void execute(); // déclaration de la méthode mais l'implémentation se fait dans les sous-classes
}
