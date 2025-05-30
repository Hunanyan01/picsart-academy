package am.picsartacademy.lesson.Lesson05.oop1.models;

public class Mart {
    public String anun;
    public String azganun;
    public int tariq;
    public boolean apahovagir;



    public void tsanotacnel() {
        System.out.println("es " + anun + " " + azganun + " em , " + tariq + " tarekan։");

        if (apahovagir) {
            System.out.println("Apahovagrvac em ");
        } else {
            System.out.println("Chem apahovagrvac ");
        }


    }
}