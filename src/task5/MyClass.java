package task5;

public class MyClass <T> {
    public T value;
    public MyClass (){
    }
    public MyClass(T value) {
        this.value = value;
    }
    public static  <V> MyClass <V> factoryMethod() {
        return new MyClass<>();
    }
    public static  <V> MyClass <V> factoryMethod(V str) {
        return new MyClass<>(str );
    }


}
