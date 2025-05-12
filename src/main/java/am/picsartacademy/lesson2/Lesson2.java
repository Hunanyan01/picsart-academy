package am.picsartacademy.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("___________________(Task 1)_______________________");
        System.out.println("Ստեղծիր զանգված (array) և լրացրու այն երկու թվով։");
        int[] array1 = new int[2];//1)stexcel 2 texani zangvac ev texadrrel tver

        array1[0] = 10;
        array1[1] = 20;

        System.out.println(array1[0]);

        for (int number : array1) { //tpum enq bolor tarery
            System.out.print(number + " ");
        }
        System.out.println("\n\n___________________(Task 2)_______________________");
        System.out.println("Ստեղծիր զանգված և լրացրու այն 1-ից 1000 թվերով (ներառյալ)։");
        int[] array2 = new int[1001];//2)stexcel 1000 texani zangvac ev tal arjeqner

        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
            array2[i] = i;//zangvaci arjeqnery ev hacenery hamnknen

            System.out.println("hasce - " + i + "    zangvaci arjeq - " + array2[i]);
        }
        System.out.println("\n\n___________________(Task 3)_______________________");
        System.out.println("Ստեղծիր զանգված և լրացրու այն կենտ թվերով -20-ից մինչև 20 միջակայքում (ներառյալ)։");

        int hashvel = 0; //3) -20 ic 20 tveri mijakayqum gtel em kentery ev tpel
        for (int i = -20; i <= 20; i++) {
            if (i % 2 != 0) {
                hashvel++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nkent tveri qanaky  " + hashvel + " hat e");
        System.out.println("\n\n___________________(Task 4)_______________________");
        System.out.println("Ստեղծիր զանգված և լցրու այն։ Տպիր բոլոր էլեմենտները, որոնք բաժանվում են 5-ի վրա։");

        //Homework 2
        //1)stexcel em zangvac vori arjeqnery bajanvum en 5-i
        int[] array3 = {1, 3, 5, 7, 10, 20, 30, 50, 51, -20, 15, 100, 250, 1000, 1020};

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % 5 == 0) {
                System.out.print(array3[i] + " ");
            }
        }

        System.out.println("\n\n___________________(Task 5)_______________________");
        System.out.println("Ստեղծիր զանգված և լցրու այն։ Տպիր բոլոր էլեմենտները, որոնք գտնվում են 24.12 և 467.23");
        double[] array4 = {1.2, 1.99, 50.5, 24.12, 24.11, 99.50, 100.40, 10.99, 42.10, 9, 467.23, 50};

        for (int i = 0; i < array4.length; i++) {
            if (array4[i] >= 24.12 && array4[i] <= 467.23) {
                System.out.print(array4[i] + " ");
            }
        }
        System.out.println("\n\n___________________(Task 6)_______________________");
        System.out.println("Ստեղծիր զանգված և լցրու այն։ Տպիր այն էլեմենտների քանակը, որոնք բաժանվում են 2-ի վրա։");

        int[] array5 = {1, 3, 5, 7, 10, 20, 30, 50, 51, -20, 15, 100, 250, 1000, 1020};
        int hashiv = 0;
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] % 2 == 0) {
                hashiv++;

            }
        }
        System.out.println("zuyg tveri qanakn e - " + hashiv);
        System.out.println("\n\n___________________(Task 7)_______________________");
        System.out.println("Քեզ տրված է ամբողջ թիվ N, որը գտնվում է 0-ից մեծ և 21-ից փոքր միջակայքում (0 < N < 21):\n" +
                "Պետք է տպես այդ թվի առաջին 10 բազմապատկումները (multiples):\n" +
                "Յուրաքանչյուր տողում պետք է գրես հետևյալ ձևով՝\n" +
                "N x i = արդյունք, որտեղ i-ը տատանվում է 1-ից մինչև 10։\n");

        int N = 20;

        if (N >= 0 && N <= 21) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " * " + i + " = " + (N * i));
            }
        } else {
            System.out.println("mutqagrvac tivy chi hamapatasxanum");
        }
    }

}
