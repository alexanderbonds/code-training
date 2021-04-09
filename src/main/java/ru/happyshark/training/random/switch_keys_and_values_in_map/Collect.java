package ru.happyshark.training.random.switch_keys_and_values_in_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * Пишем метод, который на вход Map <K,V> и возвращет Map, где ключи и значения поменяны местами
 * Так как значения могут совпадать, то тип значения в Map будет уже не K, а Collection<K>
 *
 */

public class Collect {

    public static <K,V> Map <V, Collection<K>> inverse(Map<? extends K, ? extends V> map){
        Map<V,Collection<K>> superMap = new HashMap<>();
        for (K k : map.keySet()) {
            V value2 = map.get(k);
            superMap.compute(value2,(V, KS) -> {
                if (KS == null) KS = new HashSet<>();
                KS.add(k);
                return KS;
            });
        }
        return superMap;
    }
}