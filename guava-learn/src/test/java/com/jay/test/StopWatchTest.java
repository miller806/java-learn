package com.jay.test;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

/**
 * 计时器
 */
@Slf4j
public class StopWatchTest {
    @Test
    void stopWatchTest() {
        Stopwatch w = Stopwatch.createStarted();
        for (int i = 0; i < 1000000; i++) {

        }
        long nanos = w.elapsed(TimeUnit.MILLISECONDS);
        log.info("代码执行时间：{}", nanos);
    }
}
