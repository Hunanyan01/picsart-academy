package am.picsartacademy.lesson.Lesson06.O3_yertuxi;

import java.util.ArrayList;
import java.util.List;


public class Uxxi {
    private List<Kangar> kangarner;
    public Uxxi(){
        this.kangarner =  new ArrayList<>();
    }

    public void avelacnelKangar(Kangar k){
        kangarner.add(k);
    }

    public void tpelKangarner(){
        for (Kangar k: kangarner){
            System.out.println(k.getAnun());
        }
    }
}

