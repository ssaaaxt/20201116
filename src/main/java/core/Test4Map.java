package core;

import java.util.HashMap;

public class Test4Map {

    public static void main(String[] args) {

        Dog dogA = new Dog(1,"a","red") ;
        Dog dogB = new Dog(2,"a","red") ;


        HashMap map = new HashMap();

        map.put("a","aa");
        map.put("b","aa");
        map.put("c","aa");
        map.put(dogA,"doga");
        map.put(dogB,"dogb");
        System.out.println(map);

    }
}
