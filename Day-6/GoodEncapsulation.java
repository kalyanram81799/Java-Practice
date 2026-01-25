
class Details2
{
    private int amount=98;
    void withDrawAmount(int amo){
    if(amo>0 && amo<=amount)
    {
        amount=amount-amo;
    }
    else{
        System.out.println("Hey Legend Unable to access Negative");
    }
}
    int getAmount()
    {
        return amount;
    }
}

public class GoodEncapsulation{
    public static void main(String[] args) {
        Details2 d1=new Details2();
        d1.withDrawAmount(890);
        System.out.println(d1.getAmount());


    }
}