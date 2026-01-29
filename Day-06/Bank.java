class Details{
   private int balance;

   void depositAmount(int amount){
    if(amount>0)
     {
        balance=balance+amount;
     }
   }


   void withDrawAmount(int amount){
        if(amount>0 && amount<=balance)
        {
             balance = balance - amount;
        }
   }
   int checkBalance()
   {
    return balance;
   }
}
public class Bank
{
    public static void main(String args[])
    {
        Details d1=new Details();
        d1.depositAmount(2500);
        d1.withDrawAmount(1000);
        System.out.println(d1.checkBalance());
    }
}