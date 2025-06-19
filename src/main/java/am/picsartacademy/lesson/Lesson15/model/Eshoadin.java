package am.picsartacademy.lesson.Lesson15.model;

import java.util.Map;

public class Eshoadin<K, V> {
    private Map<K, V> map;

    public Map<K, V> getMap() {
        return map;
    }

    public void setMap(Map<K, V> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Eshoadin{" +
                "map=" + map +
                '}';
    }
}
