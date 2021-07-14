package com.jay.test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Collection;

@Slf4j
public class MultimapTest {

    @Test
    void multiMapTest() {
        Multimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("aa", "1");
        multimap.put("aa", "2");
        multimap.put("aa", "23");
        multimap.put("bb", "2");
        multimap.put("cc", "5");
        Collection<String> collection = multimap.get("aa");
        log.info("{}", collection);
        log.info("{}", collection.size());
    }
}
