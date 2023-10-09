/**
 * Cette classe teste les méthodes ainsi que les objets de la classe Account.
 * @author Melanie Malek
 * @version Le dimanche 15 janvier 2023
 */

public class TestAccount 
{
    private static Account account;
    public static void main(String[] args) 
    { 
        setup();
        testValidatePIN();
        testGetBalance();
        testCredit();
        testDebit();
        testGetAccountNumber();
        testAccountPin();
    }

    private static void setup()
    {
        account = new Account(6789, 9876, 500.0);
    }

    private static void testValidatePIN()
    {
        // l'évaluation d'un mot de passe invalide
        boolean value = account.validatePIN(0);
        if(value != false)
        {
            System.out.println("testValidatePIN raté");
        }
        
        // l'évaluation d'un mot de passe valide
        value = account.validatePIN(9876);
        if(value != true)
        {
            System.out.println("testValidatePIN réussi");
        }
    }

    private static void testGetBalance()
    {
        double balance = account.getBalance();
        if(balance != 500)
        {
            System.out.println("testGetBalance raté");
        }
    }

    private static void testCredit()
    {
        int amount = 10;
        double initialBalance = account.getBalance();
        account.credit(amount);
        if(account.getBalance() != initialBalance + 10)
        {
            System.out.println("testCredit raté");
        }
    }

    private static void testDebit()
    {
        int amount = 10;
        double initialBalance = account.getBalance();
        account.debit(amount);

        if(account.getBalance() != initialBalance - 10)
        {
            System.out.println("testDebit raté");
        }
    }

    private static void testGetAccountNumber()
    {
        int accountNumber = account.getAccountNumber();
        if (accountNumber != 6789)
        {
            System.out.println("testGetAccountNumber raté");
        }
    }

    private static void testAccountPin()
    {
        int accountPin = account.getAccountPin();
        if(accountPin != 9876)
        {
            System.out.println("testAccountPin raté");
        }
    }
}
