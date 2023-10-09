/**
 * Cette classe représente un compte bancaire. Dans cette classe, nous déclarons des 
 * variables et les initialisons dans un constructeur. Nous avons plusieurs méthodes 
 * qui modifient leurs valeurs ou les retournent. 
 * @author Melanie Malek
 * @version Le dimanche 15 janvier 2023
 */ 

class Account 
{
    //définition des attributs 
    private int accountNumber; 
    private int pin; 
    private double balance; 
    
    // le constructeur qui initialise les attributs
    public Account(int theAccountNumber, int thePIN, double theBalance) 
    {
        accountNumber = theAccountNumber;
        pin = thePIN;
        balance = theBalance;
    }

    // détermine si le mot de passe suggérer par l'utilisateur correspond à celui dans Account
    public boolean validatePIN(int userPIN) 
    {
        if (userPIN == pin) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }

    // retourne le solde total
    public double getBalance() 
    {
        return balance;
    }

    // crédite un montant au compte
    public void credit(double amount) 
    {
        balance += amount; 
    }

    // débite un montant du compte
    public void debit(double amount) 
    {
        balance -= amount; 
    }

    // retourne le numéro du compte
    public int getAccountNumber() 
    {
        return accountNumber;
    }

    // retourne le mot de passe
    public int getAccountPin() 
    {
        return pin;
    }
}