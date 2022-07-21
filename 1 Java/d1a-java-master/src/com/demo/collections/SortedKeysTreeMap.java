package com.demo.collections;
import java.util.*;
public class SortedKeysTreeMap
{
  public static void main(String[] args)
  {
        Map<Integer, Object> sampleMap = new TreeMap<Integer, Object>();
        sampleMap.put(1,null); 
        sampleMap.put(50, null); 
        sampleMap.put(3, null); 
        sampleMap.put(2, null); 
        sampleMap.put(4, null); 
 
       System.out.println(sampleMap);
   }
}