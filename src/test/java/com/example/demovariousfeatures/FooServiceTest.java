package com.example.demovariousfeatures;

import ch.qos.logback.classic.Level;
import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Copyright (c) 2020 Carrefour, All rights reserved.
 * <p>
 * 9fbef606107a605d69c0edbcd8029e5d
 */
class FooServiceTest {

    @Test
    void sayHello() {
        String expectedInfoMessage = "Keyboard not responding. Press any key to continue...";
        String expectedWarnMessage = "Congratulations, you are pregnant!";

        LogCaptor<FooService> logCaptor = LogCaptor.forClass(FooService.class);

        FooService fooService = new FooService();
        fooService.sayHello();

        assertThat(logCaptor.getLogs(Level.INFO)).contains(expectedInfoMessage);
        assertThat(logCaptor.getLogs(Level.WARN)).contains(expectedWarnMessage);

    }
}