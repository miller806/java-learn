package com.jay.test;

import com.google.common.collect.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

import static com.google.common.collect.Sets.*;


@Slf4j
public class SetsMapsTest {
    @Test
    void setsTest() {
        ImmutableSet<String> set = ImmutableSet.of("a", "b", "c");
        ImmutableList<String> list = ImmutableList.of("a", "b", "c");
        ImmutableMap<String, String> map = ImmutableMap.of("a", "1", "b", "2");
        log.info("{}", set);
        log.info("{}", list);
        log.info("{}", map);

        //set交差并
        HashSet<Integer> setA = newHashSet(1, 2, 3, 4, 5);
        HashSet<Integer> setB = newHashSet(1, 2, 4, 6, 7, 8);
        SetView<Integer> union = Sets.union(setA, setB);
        log.info("{}", union);
        SetView<Integer> difference = Sets.difference(setA, setB);
        log.info("{}", difference);
        SetView<Integer> intersection = Sets.intersection(setA, setB);
        log.info("{}", intersection);

        //map交差并
        HashMap<String, Integer> mapA = Maps.newHashMap();
        mapA.put("a", 1);
        mapA.put("b", 2);
        mapA.put("c", 3);
        HashMap<String, Integer> mapB = Maps.newHashMap();
        mapB.put("b", 20);
        mapB.put("c", 3);
        mapB.put("d", 4);
        MapDifference<String, Integer> mapDifference = Maps.difference(mapA, mapB);
        //mapA 和 mapB 相同的 entry
        System.out.println(mapDifference.entriesInCommon());
        //mapA 和 mapB key相同的value不同的 entry
        System.out.println(mapDifference.entriesDiffering());
        //只存在 mapA 的 entry
        System.out.println(mapDifference.entriesOnlyOnLeft());
        //只存在 mapB 的 entry
        System.out.println(mapDifference.entriesOnlyOnRight());
    }
}
