package com.kap.hackerrank.datastructures;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Konstantinos Antoniou
 */
public class VolumeByField<K, V> {

    private Map<K, V> volumeByFieldMap = new HashMap<>();

    public Map<K, V> getVolumeByFieldMap() {
        return volumeByFieldMap;
    }
}
