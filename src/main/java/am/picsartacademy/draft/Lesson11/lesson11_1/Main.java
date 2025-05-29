package am.picsartacademy.draft.Lesson11.lesson11_1;


public class Main {
    public static void main(String[] args) {
        Student s1 =new Student(15);
        Student s2 =new Student(25);
        swap(s1,s2);
        chabge(s1);
        System.out.println(s1.getAge());
       // System.out.println(s1.getAge());
      //  System.out.println(s2.getAge());
    }
    public static void swap(Student a,Student b){
        Student temp =a;
        a=b;
        b=temp;
        System.out.println(a.getAge());
        System.out.println(b.getAge());

    }

    public static void chabge (Student a){
        a.setAge(100);
        a= new Student(20);
        a.setAge(500);
    }
}
