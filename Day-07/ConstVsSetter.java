public class ConstVsSetter {
    private int amount;

    public ConstVsSetter(int amount ) {
        this.amount=amount;
    }
    int ConstVsSetter(int amount)
    {
        return this .amount=amount;
    }
    public static void main(String[] args) {
        ConstVsSetter c =new ConstVsSetter(9090);
        System.out.println( c.ConstVsSetter(8080));
    }
    }
