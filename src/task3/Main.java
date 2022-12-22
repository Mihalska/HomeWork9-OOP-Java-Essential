package task3;

public class Main {
    public static void main(String[] args) {
        ////створили екземпляр класу MyDictionary з типами  String, String
        MyDictionary  <String, String > myMap = new MyDictionary<>() ;
        //реалізуємо можливість використання його екземпляру
        myMap.map.put("Green","tree" );
        myMap.map.put("Blue","water" );
        myMap.map.put("Yellow","sun" );
        System.out.println(myMap.map );
        System.out.println(myMap.map.get("Blue"));
        myMap.display() ;
   }
}
