import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {

   public static void main(String args[]) {
   
      // Create a hash map
      HashMap<String, Double> hm = new HashMap<String, Double>();
      
      // Put elements to the map
      hm.put("Zara", (3434.34));
      hm.put("Mahnaz", (123.22));
      hm.put("Ayan", (1378.00));
      hm.put("Daisy", (99.22));
      hm.put("Qadir", (-19.08));
      
      System.out.println("HashMap before sorting by keys in ascending order ");
      for (Entry<String, Double> entry : hm.entrySet()) {
    	  System.out.println("Key = " + entry.getKey() + 
                  ", Value = " + entry.getValue());
      }
      
      System.out.println();
      
      //Sort the above HashMap
      
      TreeMap<String, Double> sorted = new TreeMap<>(hm);
      Set<Entry<String,Double>> mappings = sorted.entrySet();
      
      System.out.println("HashMap after sorting by keys in ascending order ");
      for(Entry<String, Double> mapping : mappings){
          System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
      }
      
      System.out.println();
      
      // Deposit 1000 into Zara's account
      double balance = hm.get("Zara").doubleValue();
      hm.put("Zara", (balance + 1000));
      System.out.println("Zara's new balance: " + hm.get("Zara"));
   }


}