package com.example.CollectionFrameworkJava8.list;

import java.util.*;

public class map {


    public static void main(String args[]) {

        Map<String, Integer> hm
                = new HashMap<>();

        // Inserting pairs in above Map
        // using put() method
        hm.put("b", 200);
//        hm.put("b", 2000);
        hm.put("a", 100);
        hm.put("c", 300);
        hm.put("d", 400);

        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }




/**
 *
 clear()--->	This method is used to clear and remove all of the elements or mappings from a specified Map collection.
 containsKey(Object)--->	This method is used to check whether a particular key is being mapped into the Map or not. It takes the key element as a parameter and returns True if that element is mapped in the map.
 containsValue(Object)---> This method is used to check whether a particular value is being mapped by a single or more than one key in the Map. It takes the value as a parameter and returns True if that value is mapped by any of the key in the map.
 entrySet()--->	This method is used to create a set out of the same elements contained in the map. It basically returns a set view of the map or we can create a new set and store the map elements into them.
 equals(Object)--->	This method is used to check for equality between two maps. It verifies whether the elements of one map passed as a parameter is equal to the elements of this map or not.
 get(Object)---> This method is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. It returns NULL when the map contains no such mapping for the key.
 hashCode()--->	This method is used to generate a hashCode for the given map containing keys and values.
 isEmpty()---> This method is used to check if a map is having any entry for key and value pairs. If no mapping exists, then this returns true.
 keySet()--->	This method is used to return a Set view of the keys contained in this map. The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
 put(Object, Object)--> This method is used to associate the specified value with the specified key in this map.
 putAll(Map)---> This method is used to copy all of the mappings from the specified map to this map.
 remove(Object)	This method is used to remove the mapping for a key from this map if it is present in the map.
 size()--->	This method is used to return the number of key/value pairs available in the map.
 values()---> This method is used to create a collection out of the values of the map. It basically returns a Collection view of the values in the HashMap.
 getOrDefault(Object key, V defaultValue)---> Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
 merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)--->	If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.
 putIfAbsent(K key, V value)---> If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the curassociaterent value.
 **/
    }


}
