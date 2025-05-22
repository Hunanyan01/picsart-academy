package am.picsartacademy.lesson.Lesson06.O2_transport;

import am.picsartacademy.lesson.Lesson06.O3_yertuxi.Uxxi;
import am.picsartacademy.lesson.Lesson06.O4_gorcoxutyunner.KareliEVarel;


public class Avtobus extends TransportayinMijoc implements KareliEVarel {

    @Override
    public void varel() {
        System.out.println("Avtobus " + anun + " → yertevekum e " + aragutyun + " km/h aragutyamb, kangarnerov");
    }

    private Uxxi mashrut;

    public Avtobus(String anun, int aragutyun) {
        super(anun, aragutyun);
        this.mashrut = new Uxxi();
    }

    public void setMashrut(Uxxi mashrut) {
        this.mashrut = mashrut;
    }

//    public void tpelMarshruty() {
//        System.out.println("Avtobus " + anun + " yertuxi:");
//        mashrut.tpelKangarner();
//    }
}

