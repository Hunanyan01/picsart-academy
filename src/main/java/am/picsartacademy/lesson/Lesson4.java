package am.picsartacademy.lesson;

public class Lesson4 {
    public static void main(String[] args) {
        ;
        int[] array = new int[]{3, 5, 21, 32, 312321, 44, -7};

        for (int member : array) {
            if (member % 2 == 0)
                continue;


            System.out.println(member);
        }
        System.out.println("\n\nՏպել Հակառակ Կոնյ Պիրամիդա (հակառակ հիերարխիա)");

        int x =array[0];

        for (int i = x; i >=1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
