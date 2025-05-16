package am.picsartacademy.lesson;

public class Lesson3 {
    public static void main(String[] args) {

        System.out.println("1)Պետք է անցնել զանգվածի միջով և փոխել հարևան տարրերի տեղերը, եթե ձախ թիվը մեծ է աջից։");
        int[] bubble1 = {45, 23, 12, 5, 34, 7, 19, 48, 3, 29, 50, 17, 8, 26, 40, 2, 31, 10, 13, 44, 1, 38, 11, 24, 6, 20, 37, 9, 28, 41, 15, 22, 4, 16, 33, 25, 14, 49, 30, 21, 32, 27, 18, 39, 35, 36, 43, 42, 47, 46};

        for (int i = 0; i < bubble1.length; i++) {//ancum
            for (int j = 0; j < bubble1.length - i - 1; j++) {//buuble - i -1 nshanakum e naxaverji tvov avart
                if (bubble1[j] > bubble1[j + 1]) {//hamematum true == folse ete dzax tive mec e ancnum enq paymanin
                    int temp = bubble1[j];//nshanakum enq
                    bubble1[j] = bubble1[j + 1];//hascenerum arjeqi popoxutyun
                    bubble1[j + 1] = temp;//nshanakum enq
                } else {
                    System.out.println("pttuyt - " + i + "  -kariq chka sortavorman - " + j + " hasceyum");//hamapatasxanecum
                }
            }
        }

        for (int bubbleSort : bubble1) {//ardyunqneri vrayov ancum forich-i mijocov
            System.out.print(bubbleSort + " ");//ardyunq
        }


        System.out.println("\n\n2)մասամբ դասավորում 1 ցիկլ, որը անցնում է զանգվածի միջով մեկ անգամ և փոխում է հարևան տարրերի կարգը, եթե հարկավոր է\n");//voch liarjeq cikl anum e ptuyt miayn mek anqam


        int[] bubble2 = {45, 23, 12, 5, 34, 7, 19, 48, 3, 29, 50, 17, 8, 26, 40, 2, 31, 10, 13, 44, 1, 38, 11, 24, 6, 20, 37, 9, 28, 41, 15, 22, 4, 16, 33, 25, 14, 49, 30, 21, 32, 27, 18, 39, 35, 36, 43, 42, 47, 46};

        for (int i = 0; i < bubble2.length - 1; i++) {
            if (bubble2[i] > bubble2[i + 1]) {
                int x = bubble2[i];
                bubble2[i] = bubble2[i + 1];
                bubble2[i + 1] = x;
            }
        }
        for (int x : bubble2) {
            System.out.print(x + " ");
        }


        System.out.println("\n\n3)գրել ծրագիր, որը կստանա բարձրությունը (N), և կկառուցի այդքան տողից բաղկացած պիրամիդ՝ օգտագործելով USD ($):");


        int barcrutyun = 10; //N

        for (int i = 1; i <= barcrutyun; i++) { //ancnuma amen meki vrayov
            for (int j = 1; j <= barcrutyun - i; j++) {// N - i anum enq vorpesi dzaxic nuyn pes stananq burgi patker
                System.out.print(" ");//enqana prabela anum michev  j = lini Barcrutyan N-1 u ancnum myus cikl
            }
            for (int s = 1; s <= (2 * i - 1); s++) { //tpuma ($) ete hamapatasxanuma pahanji sahmanerin
                System.out.print("$");
            }
            System.out.println();//ancum mi tox nerqev
        }


    }
}