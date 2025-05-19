package am.picsartacademy.lesson.Lesson05;

import am.picsartacademy.lesson.Lesson05.models.Bjishk;
import am.picsartacademy.lesson.Lesson05.models.Hivand;
import am.picsartacademy.lesson.Lesson05.models.Hivandanoc;
import am.picsartacademy.lesson.Lesson05.models.Mart;


public class Main {
    public static void main(String[] args) {
        Bjishk doctor = new Bjishk();
        doctor.anun = "Anna";
        doctor.azganun = "Khachatryan";
        doctor.tariq = 40;
        doctor.masnagitutyun = "Terapevt";
        doctor.apahovagir = true;

        Hivand patient = new Hivand();
        patient.anun = "Davit";
        patient.azganun = "Hunanyan";
        patient.tariq = 25;
        patient.hivandutyun = "Glxacav ";
        patient.apahovagir = false;

        Hivandanoc hosp = new Hivandanoc();
        hosp.bjishk = doctor;
        hosp.hivand = patient;

        doctor.tsanotacnel();
        patient.tsanotacnel();
        System.out.println("----------------------------------------");
        hosp.yndunel();


        Mart m = new Mart();

        m.anun = "Davit";
        m.azganun = "Hunanyan";
        m.tariq = 25;
        m.apahovagir = true;

        System.out.println("Anun: " + m.anun);
        System.out.println("Azganun: " + m.azganun);
        System.out.println("Tariq: " + m.tariq);
        System.out.println("Apahovagrutyan arkayutyun: " + m.apahovagir);


        Mart davo = new Mart();
        davo.anun = "Davit";
        davo.azganun = "Hunanyan";
        davo.tariq = 25;
        davo.apahovagir = true;

        Mart anna = new Mart();
        anna.anun = "Anna";
        anna.azganun = "Khachatryan";
        anna.tariq = 30;
        anna.apahovagir = false;

        Mart poxos = new Mart();
        poxos.anun = "Poxos";
        poxos.azganun = "Kirakosyan";
        poxos.tariq = 28;
        poxos.apahovagir = true;


    }
}

