package am.picsartacademy.lesson.Lesson06.oop2.O2_transport;

import am.picsartacademy.lesson.Lesson06.oop2.O4_gorcoxutyunner.KareliENstel;

public class Hecaniv extends TransportayinMijoc implements KareliENstel {

    public Hecaniv(String anun, int aragutyun) {
        super(anun, aragutyun);
    }

    @Override
    public void sharjvel() {
        System.out.println("Hecaniv " + anun + " kareli e varel " + aragutyun + ", avtomeqenaneri het mi texov.");
    }

    @Override
    public void nstel() {
        System.out.println("Hecaniv " + anun + " → kareli e nstel, u varel");
    }
}