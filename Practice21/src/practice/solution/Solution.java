package practice.solution;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution<T,K,V> {

    public ArrayList<T> newArrayList(T... elements){
        return new ArrayList<>(Arrays.asList(elements));
    }

    public HashSet<T> newHashSet(T... elements){
        return new HashSet<>(Arrays.asList(elements));
    }

    public HashMap<K,V> newHashMap(K[] keys, V[] values){
        if(keys.length != values.length) throw new IllegalArgumentException();
        HashMap<K,V> hashMap = new HashMap<>();
        for(int i = 0;i<keys.length;i++){
            hashMap.put(keys[i],values[i]);
        }
        return hashMap;
    }
}
