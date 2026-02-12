public class LocalInner {
    void show() {
        class Local {
            void message() {
                System.out.println("Inside Local Class");
            }
        }

        Local obj = new Local();
        obj.message();
    }
    public static void main(String[] args) 
    {
       LocalInner t = new LocalInner();
        t.show();
    }
}
