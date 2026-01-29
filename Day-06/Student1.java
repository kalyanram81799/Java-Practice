class Stud
{
 private int marks;
 void setMarks(int marks)
 {
    if(marks>=0 && marks <=100)
    {
        this.marks=marks;
    }
 }


 int getMarks()
 {
    return marks;
 }


}
public class Student1{
    public static void main(String[] args)
    {
        Stud s1=new Stud();
        s1.setMarks(-80);
        s1.setMarks(90);
        System.out.println(s1.getMarks()); 
    }
}
