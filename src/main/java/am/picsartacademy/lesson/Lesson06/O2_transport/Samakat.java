package am.picsartacademy.lesson.Lesson06.O2_transport;

import am.picsartacademy.lesson.Lesson06.O3_yertuxi.Uxxi;
import am.picsartacademy.lesson.Lesson06.O4_gorcoxutyunner.KareliEVarel;


public class Samakat extends TransportayinMijoc implements KareliEVarel {

    public Samakat(String anun, int aragutyun) {
        super(anun, aragutyun);
    }

    @Override
    public void varel() {
        System.out.println("Samakat " + anun + " → karli e varel " + aragutyun + " km/h aragutyamb, harmar e qaxaqayin poxocneri hamar.");
    }
}

