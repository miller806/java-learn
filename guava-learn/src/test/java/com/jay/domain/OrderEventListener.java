package com.jay.domain;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderEventListener {
    @Subscribe
    public void dealWithEvent(OrderMessage event) {
        log.info("消息内容:{}", event.getMessage());
    }
}
