package com.jay.test;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class MultiSetTest {
    @Test
    void multiSetTest() {
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("a");
        multiset.add("a");
        multiset.add("a");
        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        log.info("{}", multiset.size());
        log.info("{}", multiset.count("a"));
        log.info("{}", multiset.count("b"));
    }
}
