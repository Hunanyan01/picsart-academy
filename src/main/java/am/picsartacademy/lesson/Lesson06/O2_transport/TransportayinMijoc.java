package am.picsartacademy.lesson.Lesson06.O2_transport;
import am.picsartacademy.lesson.Lesson06.O1_martik.Uxevor;
import am.picsartacademy.lesson.Lesson06.O1_martik.Varord;

import java.util.ArrayList;
import java.util.List;

public class TransportayinMijoc {

    public void avelacnelUxevor(Uxevor u) {
        ughevorner.add(u);
    }

    protected Varord varord;

    public void setVarord(Varord varord) {
        this.varord = varord;
    }
    public void tpelInfo() {
        System.out.println("Transporty " + anun + " (aragutyun: " + aragutyun + " km/h)");
        if (varord != null) {
            System.out.println("Varel e: " + varord.getAnun() + ", tariq: " + varord.getTariq());
        }
    }
    protected List<Uxevor> ughevorner = new ArrayList<>();

    protected String anun;
    protected int aragutyun;

    public TransportayinMijoc(String anun, int aragutyun) {
        this.anun = anun;
        this.aragutyun = aragutyun;
    }

    public void sharjvel() {
        System.out.println(anun + " sharjvum e " + aragutyun + " km/h aragutyamb.");
    }

    public void tpel() {

    }



    public void tpelUghevorner() {
        System.out.println("Uxevorner:");
        for (Uxevor u : ughevorner) {
            System.out.println("- " + u.getAnun() + " (" + u.getTariq() + " tarekan) ");
        }

    }
}