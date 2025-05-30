package am.picsartacademy.lesson.Lesson06.oop2.O2_transport;

import am.picsartacademy.lesson.Lesson06.oop2.O3_yertuxi.Kangar;
import am.picsartacademy.lesson.Lesson06.oop2.O3_yertuxi.Uxxi;
import am.picsartacademy.lesson.Lesson06.oop2.O4_gorcoxutyunner.KareliEVarel;


public class Avtobus extends TransportayinMijoc implements KareliEVarel {

    @Override
    public void varel() {
        System.out.println("Avtobus " + anun + " → yertevekum e " + aragutyun + " km/h aragutyamb");
        System.out.println("With the following bus stations:");
        for (Kangar kangar : mashrut.getKangars()) {
            System.out.println(kangar.getAnun());
        }

    }

    private Uxxi mashrut;

    public Avtobus(String anun, int aragutyun, Uxxi mashrut) {
        super(anun, aragutyun);
        this.mashrut = mashrut;
    }

    public void setMashrut(Uxxi mashrut) {
        this.mashrut = mashrut;
    }

//    public void tpelMarshruty() {
//        System.out.println("Avtobus " + anun + " yertuxi:");
//        mashrut.tpelKangarner();
//    }
}

