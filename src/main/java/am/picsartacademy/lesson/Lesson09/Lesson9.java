package am.picsartacademy.lesson.Lesson09;

public class Lesson9 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        boolean aa = false;

        try {
            int result = a * b;
            System.out.println("result  " + result);
        } catch (ArithmeticException e) {
            System.out.println("chi hamapatasxanum");
        }

    }
}
