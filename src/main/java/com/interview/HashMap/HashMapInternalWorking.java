package com.interview.HashMap;

import java.util.HashMap;

public class HashMapInternalWorking {
    public static void main(String[] args) {
        // how HashMap works internally in Java?
        // HashMap is a data structure that stores key-value pairs.
        // It uses an array of buckets to store the entries.
        // Each bucket is a linked list or a balanced tree (in case of high collisions).
        // When we put a key-value pair, it calculates the hash code of the key
        // and determines the bucket index using modulo operation.
        // If there is a collision (i.e., multiple keys map to the same bucket),
        // it adds the new entry to the linked list or tree at that bucket.
        // When we get a value by key, it again calculates the hash code,
        // finds the appropriate bucket, and then searches through the linked list
        // or tree to find the matching key and return its value.

        HashMap<String, Integer> nameAgeMap = new HashMap<>();
        nameAgeMap.put("Sanjay", 30);
        nameAgeMap.put("Amit", 25);
        nameAgeMap.put("Ravi", 28);

        nameAgeMap.get("Amit"); // returns 25
        nameAgeMap.remove("Ravi"); // removes the entry for "Ravi")
    }
}
