interface Service{
    void display();
}
class Alpha implements Service{
    public void display(){
        System.out.println("In alpha Class");
    }
}
class Gamma implements Service{
    public void display(){
        System.out.println("In gamma class");
    }
}
class Beta{
    Service service;
    void show(){
        service.display();
    }
}
public class TestLoose {
    public static void main(String[] args) {

        Service s = new Alpha();   
        Beta b = new Beta();

        b.service = s;             // dependency injection
        b.show();

        // Change dependency
        b.service = new Gamma();
        b.show();
    }
}
