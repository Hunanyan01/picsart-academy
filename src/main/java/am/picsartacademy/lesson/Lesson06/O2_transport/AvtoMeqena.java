package am.picsartacademy.lesson.Lesson06.O2_transport;

import am.picsartacademy.lesson.Lesson06.O3_yertuxi.Uxxi;
import am.picsartacademy.lesson.Lesson06.O4_gorcoxutyunner.KareliEVarel;

public class AvtoMeqena extends TransportayinMijoc implements KareliEVarel {

    public AvtoMeqena(String anun, int aragutyun) {
        super(anun, aragutyun);
    }

    @Override
    public void sharjvel() {
        System.out.println("Avtomeqena " + anun + " → sharjvum e " + aragutyun + " km/h aragutyamb, poxocnerov");
    }

    @Override
    public void varel() {
        System.out.println(anun + " kareli e varel poxocnerov ");
    }
}