package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(List.of(10, 5, 3, 2, 1, 9, 6, 54, 2, 0));
        System.out.println(hashSet);
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet.stream().toList());
        System.out.println(treeSet);

        Map map = new Map();
        String[] firstNames = new String[10];
        String[] lastNames = new String[10];
        for(int i = 0;i<10;i++){
            firstNames[i] = "FirstName" + i % 5;
            lastNames[i] = "LastName" + i % 4;
        }
        HashMap hashMap = map.createMap(lastNames,firstNames);
        map.print();
        System.out.println("getSameFirstNameCount - " + map.getSameFirstNameCount());
        System.out.println("getSameLastNameCount - " + map.getSameLastNameCount());
    }
}
