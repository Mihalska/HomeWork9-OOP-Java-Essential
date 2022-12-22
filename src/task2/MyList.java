package task2;

import java.util.ArrayList;

interface List1 <T>{
void add(T obj );
T get();
void display();

}

public class MyList <T> implements List1 <T>{
 ArrayList<T> list = new ArrayList<>( );
public  T obj;

 @Override
public void add( T obj) {
this .obj = obj;
 }
 @Override
 public T get() {
  return obj;
 }
@Override
public void display() {
 System.out.println(list.size()  );
 }
}

