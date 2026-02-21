interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("payment through Upi Id");
    }
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Payment through Card ");
    }
}

class Amazon {
    Payment payment;

    void setPayment(Payment payment) {
        this.payment = payment;
    }

    void checkout() {
        payment.pay();
        System.out.println("Order placed");

    }
}

public class SetterInjection {
    public static void main(String[] args) {
        Amazon a = new Amazon();
        a.setPayment(new UpiPayment());
        a.checkout();
        a.setPayment(new CardPayment());
        a.checkout();
    }
}