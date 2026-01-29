class Details1
{
// encapsulation without setter and getter
private int count=90;
 void increment(){
    count++;
 }
 void decrement(){
    count--;
 }
 int getCount()
 {
    return count;
 }
}
class Counter{
    public static void main(String[] args) {
        Details1 d1=new Details1();
        d1.increment();
        d1.decrement();
        d1.increment();
        System.out.println(d1.getCount());
    }
}