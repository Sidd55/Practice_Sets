package Set2_CodingQues;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Siddharth", 60); 
        map.put("Akshay", 20); 
        map.put("Dinesh", 80); 
        map.put("Ravi", 59); 
        
        // using Java 7
        TreeMap<String,Integer> sortedMap = new TreeMap<>(map);
        
        for(Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
        	System.out.println("Key is :  " + entry.getKey() +  ", Value is : " + entry.getValue());
        }
        
        System.out.println();
        // using java 8
        
        LinkedHashMap<String,Integer> sortMap = new LinkedHashMap<String,Integer>();
        
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x -> sortMap.put(x.getKey(), x.getValue()));
        
        for(Map.Entry<String, Integer> entry : sortMap.entrySet()) {
        	System.out.println("Key is :  " + entry.getKey() +  ", Value is : " + entry.getValue());
        }

	}

}
