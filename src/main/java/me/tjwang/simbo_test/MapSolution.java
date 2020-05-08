package me.tjwang.simbo_test;

import java.util.HashMap;
import java.util.Map;


public class MapSolution implements IfceFindTwoNumberThatFits{
    // O(n) solution by using set and find the complement
    public int[] findTwoNumberThatFits(int[] arr, int target) {
        Map<Integer, Integer> map = new DefaultHashMap<Integer, Integer>(0);
        // Why theres no JavaScript Array.prototype.map() in Java :/ Java Stream is so
        // cluncky...
        for (int num : arr) {
            Integer v = map.get(num);
            map.put(num, v+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer a = entry.getKey();
            Integer complement = target - a;
            if (map.containsKey(complement)) {
                // check cases that is itself.
                if(complement.equals(a)) {
                    if(map.get(a) <= 1) {
                        continue;
                    }
                }
                return new int[] { a.intValue(), complement.intValue() };
            }
        }
        return null;
    }

    public class DefaultHashMap<K, V> extends HashMap<K, V> {
        protected V defaultValue;

        public DefaultHashMap(V defaultValue) {
            this.defaultValue = defaultValue;
        }

        @Override
        public V get(Object k) {
            return containsKey(k) ? super.get(k) : defaultValue;
        }
    }
}
