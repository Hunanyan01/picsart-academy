package am.picsartacademy.lesson.Lesson15.model;

public class Sum {


    public  int gumar(int... nums) {
        int s = 0;
        for (int n : nums) {
            s += n;
        }
        return s;
    }

}
