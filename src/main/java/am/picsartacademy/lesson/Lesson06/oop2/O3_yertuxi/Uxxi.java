package am.picsartacademy.lesson.Lesson06.oop2.O3_yertuxi;

import java.util.List;


public class Uxxi {
    private List<Kangar> kangarner;
    public Uxxi(List<Kangar> kangarner) {
        this.kangarner =  kangarner;
    }

    public void avelacnelKangar(Kangar k){
        kangarner.add(k);
    }

    public void removeKangar(Kangar k){
        kangarner.remove(k);
    }

    public List<Kangar> getKangars(){
        return kangarner;
    }

    public void tpelKangarner(){
        for (Kangar k: kangarner){
            System.out.println(k.getAnun());
        }
    }
}

