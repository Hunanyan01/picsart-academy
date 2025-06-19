package am.picsartacademy.lesson.Lesson15;

import am.picsartacademy.lesson.Lesson15.model.Box;
import am.picsartacademy.lesson.Lesson15.model.Eshoadin;
import am.picsartacademy.lesson.Lesson15.model.Pair;
import am.picsartacademy.lesson.Lesson15.model.Sum;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        System.out.println("_____________________________BOX___________________________________");
        Box<String> b1 = new Box<>();
        b1.setBox1("Hello");
        System.out.println(b1.getBox1());

        System.out.printcln("_____________________________Pair__________________________________");

        Pair<Integer, String> b2 = new Pair();
        b2.setLog(1234);
        b2.setPas("0000");
        System.out.println(b2.getLog() + " " + b2.getPas());

        System.out.println("___________________________Eshoadin________________________________");

        Eshoadin<Integer, String> b3 = new Eshoadin<>();
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "Hello  1");
        hash.put(2, "Hello  2");
        hash.put(3, "Hello  3");
        hash.put(4, "Hello  4");

        b3.setMap(hash);
        System.out.println(b3.getMap());

        Set<Map.Entry<Integer, String>> entries = hash.entrySet();
        for (Map.Entry<Integer, String> x : entries) {
            System.out.println(x);
        }
        System.out.println(b3);


        System.out.println("_____________________________Sum____________________________________");

        Sum b4 = new Sum();
        System.out.println(b4.gumar(10,10,5));
        System.out.println(b4.gumar(10,10,10,5));
    }
}
