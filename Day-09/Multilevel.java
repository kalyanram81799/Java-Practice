class Aeroplane{
        void show(){
            System.out.println("In Aeroplane Method");
        }
}
class CargoPlane extends Aeroplane{
        void show(){
            System.out.println("In Cargoplane Method");
        }
}
class FighterPlane extends CargoPlane{
    void show(){
        
            System.out.println("In Fighterplane Method");
        }

}
public class Multilevel
{
    public static void main(String[] args) {
         Aeroplane a=new Aeroplane();
         a.show();
         CargoPlane c=new CargoPlane();
         c.show();
         FighterPlane f=new FighterPlane();
         f.show();
    }
}