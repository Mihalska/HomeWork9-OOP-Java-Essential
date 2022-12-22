package task3;
import java.util.*;

interface Dictionary <T , V > {
  void put (T  key,  V value) ;
  V get ();
  void display ();
}
public class MyDictionary <T , V > implements Dictionary <T, V > {
    HashMap <T , V> map = new HashMap <>();
    public T  key;
    public V value;
    @Override
    public void put(T key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public V get () {
      return value   ;
    }
    @Override
    public void display() {
        System.out.println(map.size() );
    }
}




