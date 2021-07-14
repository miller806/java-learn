package com.jay.test;

import com.google.common.cache.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.ExecutionException;

@Slf4j
public class CacheTest {
    @Test
    void testCache0() throws ExecutionException {
        LoadingCache<Integer, Long> cache = CacheBuilder.newBuilder().initialCapacity(10)
                .concurrencyLevel(10)
                .expireAfterAccess(Duration.ofSeconds(10))
                .weakValues()
                .recordStats()
                .removalListener(new RemovalListener<Integer, Long>() {
                    @Override
                    public void onRemoval(RemovalNotification<Integer, Long> notification) {
                        System.out.println("removed");
                    }
                })
                .build(new CacheLoader<Integer, Long>() {
                    @Override
                    public Long load(Integer key) throws Exception {
                        return System.currentTimeMillis();
                    }
                });
        for (int i = 0; i < 10; i++) {
            cache.put(i, i * 10000L);
        }
        log.info("{}", cache.get(9));
    }
}
