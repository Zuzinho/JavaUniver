package practice;

import java.util.HashMap;

public class Map{
    String[] keys;
    String[] values;
    public HashMap<String,String> createMap(String[] keys,String[] values){
        if(keys.length != values.length) return null;
        this.keys = keys;
        this.values = values;
        HashMap<String,String> hashMap = new HashMap<>();
        for(int i = 0;i<keys.length;i++) hashMap.put(keys[i],values[i]);
        return hashMap;
    }
    public int getSameFirstNameCount(){
        int count = 0;
        for(int i = 0;i<values.length - 1;i++){
            String firstName = values[i];
            for(int j = i + 1;j< values.length;j++){
                if(firstName.equals(values[j])){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public int getSameLastNameCount(){
        int count = 0;
        for(int i = 0;i<keys.length - 1;i++){
            String lastName = keys[i];
            for(int j = i + 1;j< keys.length;j++){
                if(lastName.equals(keys[j])){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public void print(){
        System.out.println('{');
        for(int i = 0;i< keys.length;i++){
            System.out.println(keys[i] + '=' + values[i] + ',');
        }
        System.out.println('}');
    }
}
