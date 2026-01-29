class Details2
{
    private int amount=98;
    void withDrawAmount(int amo)
    {
        amount=amount-amo;
    }
    int getAmount()
    {
        return amount;
    }
}
public class BadEncapsulation{
    public static void main(String[] args) {
        Details2 d1=new Details2();
        d1.withDrawAmount(890);
        System.out.println(d1.getAmount());


    }
}