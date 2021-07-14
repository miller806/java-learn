package com.jay.test;

import com.google.common.eventbus.EventBus;
import com.jay.domain.OrderEventListener;
import com.jay.domain.OrderMessage;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class EventBusTest {
    @Test
    void EventBusTest() {
        EventBus eventBus = new EventBus("lwl");
        eventBus.register(new OrderEventListener());
        eventBus.post(new OrderMessage("ls"));
    }
}
