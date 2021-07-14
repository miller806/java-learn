package com.jay.test;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TableTest {
    @Test
    void tableTest() {
        Table<String, String, Integer> table = HashBasedTable.create();
        table.put("a", "i", 1);
        table.put("a", "ii", 2);
        table.put("b", "i", 3);
        table.put("b", "ii", 4);
        log.info("{}", table.get("a", "ii"));
    }
}
