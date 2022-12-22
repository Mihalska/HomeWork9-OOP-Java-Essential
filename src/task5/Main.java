package task5;

public class Main {
    public static void main(String[] args) {

    MyClass <Integer > integer = new MyClass<>(10);
    MyClass <Integer > integer1= new MyClass<>();
    integer1.value = 20;
    System.out.println(integer.value  );
    System.out.println(integer1.value );
          MyClass <String> string = MyClass.factoryMethod();
          string.value = "Factory method1";
          MyClass <String> string1 = MyClass.factoryMethod("Factory method2");
    System.out.println(string.value );
    System.out.println(string1.value );




    }
 }