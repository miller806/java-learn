package com.jay.test;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class BiMapTest {
    @Test
    void biMapTest() {
        BiMap<String, String> biMap = HashBiMap.create();
        biMap.put("a", "1");
        biMap.put("b", "2");
        biMap.put("c", "3");
        biMap.put("d", "4");
        log.info("{}", biMap);
        BiMap<String, String> biMap1 = biMap.inverse();
        log.info("{}", biMap1);
    }
}
