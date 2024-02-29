

package finallab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
   // private static Iterable<Entry<String, Integer>> e;


    public static void main(String[] args) {
       HashMap<String,Integer> map =  new HashMap<String,Integer>();
       int count;
       try {
          FileReader input = new FileReader("input.txt");
          BufferedReader bufRead = new BufferedReader(input);
          HashSet hSet = new HashSet();
          String line;
          while((line = bufRead.readLine()) != null){
          String[] Split = line.split(" ");
          for(int i=0;i<Split.length;i++){
               if(hSet.contains(Split[i])){
                 count=map.get(Split[i]);
                 count++;
                 map.put(Split[i],count);
               }
               else{
                map.put(Split[i],1);
                hSet.add(Split[i]);
               }
          }
          }
          Set<Entry<String,Integer>> out = map.entrySet();
          for(Entry<String,Integer>item:out) {
              if(item.getValue()==1)
                  System.out.println(item.getKey());
          }
          System.out.println("---------------");
          String[] s = (String[]) hSet.toArray(new String[0]);
          for(int i=0;i<s.length;i++)
          {
                System.out.println(s[i]);
          }
          input.close();
       }catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Usage: java ReadFile filename\n");
       }catch (IOException e){           
          e.printStackTrace();
       }

    }


}
