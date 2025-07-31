package am.picsartacademy.draft.Homeevork;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);


        String a1 = s1.nextLine();
        String[] numbers = a1.split(" ");

        ArrayList<Integer> a2 = new ArrayList<>(List.of());
        for (String number : numbers) {
            a2.add(Integer.parseInt(number));
        }

        int zuyq = 0;
        int kent = 0;
        int bajanvum3i = 0;

        for (int i = 0; i < a2.size(); i++) {
            int number = a2.get(i);

            if (number % 2 == 0) {
                zuyq++;
            } else {
                kent++;
            }

            if (number % 3 == 0) {
                bajanvum3i++;
            }
        }

        System.out.println("zuyqer qanaak - [" + zuyq + "]");
        System.out.println("kenter qanaak - [" + kent + "]");
        System.out.println("3-in baajaanvox qanaak - [" + bajanvum3i + "]");

        Collections.sort(a2);
        System.out.println("dasaakargvac poqric mec - " + a2);
        Collections.reverse(a2);
        System.out.println("dasaakargvac mecic poqr - " + a2);


    }
}



