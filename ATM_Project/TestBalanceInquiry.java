/**
 * Cette classe s'agit d'un test de la classe BalanceInquiry. On y voit des tests unitaires de chaque
 * méthode ainsi que chaque objet.
 * @author Melanie Malek
 * @version Le dimanche 15 janvier 2023
 */

public class TestBalanceInquiry {

    private static Account account;
    public static void main(String[] args){
        setup();
        testExecuteBalanceInquiry();
    }
 
    private static void setup(){
       account = new Account(111, 111, 1000);
    }

    private static void testExecuteBalanceInquiry(){
        BalanceInquiry balanceInquiry = new BalanceInquiry(account);
        balanceInquiry.execute();
    }
}
