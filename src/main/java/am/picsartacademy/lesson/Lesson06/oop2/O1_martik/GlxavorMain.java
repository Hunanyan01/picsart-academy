package am.picsartacademy.lesson.Lesson06.oop2.O1_martik;

import java.util.List;
import java.util.ArrayList;

import am.picsartacademy.lesson.Lesson06.oop2.O3_yertuxi.Kangar;
import am.picsartacademy.lesson.Lesson06.oop2.O3_yertuxi.Uxxi;
import am.picsartacademy.lesson.Lesson06.oop2.O2_transport.*;


public class GlxavorMain {
    public static void main(String[] args) {
        Kangar a1 = new Kangar("Tumanyan");
        Kangar a2 = new Kangar("Komitas");
        Kangar a3 = new Kangar("Eraz");
        List<Kangar> kangarner = new ArrayList<>();
        kangarner.add(a1);
        kangarner.add(a2);
        kangarner.add(a3);


        Uxxi uxi = new Uxxi(kangarner);
        System.out.println("\n\n");
        Avtobus bus = new Avtobus("Bus #1", 44, uxi);//AVTOBUSSS

        bus.varel();

        AvtoMeqena meqena = new AvtoMeqena("BMW", 120);//AVTOMEQENA
        //  meqena.varel();
        meqena.sharjvel();
        Hecaniv hecaniv = new Hecaniv("Suzuki", 20);//HECANIV
        hecaniv.nstel();

        Samakat samakat = new Samakat("lav firmai", 15);
        samakat.varel();
        Skuter skuter = new Skuter("shat lav firmai", 25);
        skuter.varel();

//        List<KareliEVarel> var = new ArrayList<>();
//        var.add(new Avtobus("Yerevan bus", 45));
//        var.add(new AvtoMeqena("BMW", 120));
//        var.add(new Samakat("MicroSamakat", 15));
//
//        System.out.println("\n\n");
//        for (KareliEVarel v : var) {
//            v.varel();
//        }
//        System.out.println("_________________________________");
//
//        Varord v = new Varord("Ashot", 39);
//        Avtobus b = new Avtobus("Bus 5", 60);
//        Avtobus e = new Avtobus("Bus 40", 76);
//        Avtobus w = new Avtobus("Bus 15", 90);
//        Avtobus q = new Avtobus("Bus 1", 120);
//        b.setVarord(v);
//        e.setVarord(v);
//        w.setVarord(v);
//        q.setVarord(v);
//
//
//        b.avelacnelUxevor(new Uxevor("Anna", 25));
//        b.avelacnelUxevor(new Uxevor("Davit", 22));
//        b.avelacnelUxevor(new Uxevor("Karen", 30));
//        b.avelacnelUxevor(new Uxevor("Lilit", 27));
//
//        b.tpelUghevorner();
//        b.tpelInfo();
//        e.tpelInfo();
//        w.tpelInfo();
//        q.tpelInfo();


//        b.tpelInfo();
//        b.tpel();

//        Varord vv = new Varord("Ashot", 39);
//        Avtobus bb = new Avtobus("Bus 5", 60);
//        bb.setVarord(v);
//
//        bb.avelacnelUxevor(new Uxevor("Anna", 25));
//        bb.avelacnelUxevor(new Uxevor("Davit", 22));
//
//        bb.tpelInfo();


    }
}