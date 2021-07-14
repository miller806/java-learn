package com.jay.test;

import com.google.common.util.concurrent.RateLimiter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;


@Slf4j
public class RateLimiterTest {
    @Test
    void rateLimiterTest() {
        RateLimiter rateLimiter = RateLimiter.create(2, 3, TimeUnit.SECONDS);
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
        log.info("获取一个令牌时间：{}",rateLimiter.acquire());
    }
}
