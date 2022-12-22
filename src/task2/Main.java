package task2;

public class Main {
    public static void main(String[] args) {
        //створили екземпляр класу MyList з типом  Integer
        MyList  <Integer > my1 = new MyList<>() ;
        //використовуємо його екземпляр аналогічно екземпляру List
        my1.list.add(5) ;
        my1.list.add(4) ;
        my1.list.add(10) ;
        my1.list.add(10) ;
        my1.list.add(6) ;
        my1.list.add(25) ;
        System.out.println(my1.list);
        System.out.println(my1.list.get(5)) ;
        my1.display() ;
        //створили екземпляр класу MyList з типом  String
        MyList  <String  > my2 = new MyList<>() ;
        my2.list.add("Hello ");
        my2.list.add("World");
        my2.list.add("!!!!");
        System.out.println(my2.list );
        System.out.println(my2.list.get(2) );
        my2.display() ;

    }
}
