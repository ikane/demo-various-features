package com.example.demovariousfeatures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (c) 2020 Carrefour, All rights reserved.
 * <p>
 * 9fbef606107a605d69c0edbcd8029e5d
 */
public class FooService {
    private static final Logger LOGGER = LoggerFactory.getLogger(FooService.class);

    public void sayHello() {
        LOGGER.info("Keyboard not responding. Press any key to continue...");
        LOGGER.warn("Congratulations, you are pregnant!");
    }
}
