package com.kap.hackerrank.datastructures;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Konstantinos Antoniou
 */
public class VolumeByField<K, V> {

    private Map<K, V> entries = new HashMap<>();

    public Map<K, V> getEntries() {
        return entries;
    }
}
