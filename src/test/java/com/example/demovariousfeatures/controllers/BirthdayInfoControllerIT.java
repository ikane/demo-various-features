package com.example.demovariousfeatures.controllers;

import com.example.demovariousfeatures.services.BasicBirthdayService;
import com.example.demovariousfeatures.services.BirthdayService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Copyright (c) 2020 Carrefour, All rights reserved.
 * <p>
 * 9fbef606107a605d69c0edbcd8029e5d
 */
@AutoConfigureMockMvc
@ContextConfiguration(classes = {BirthdayInfoController.class, BasicBirthdayService.class})
@WebMvcTest
class BirthdayInfoControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getDayOfWeek() throws Exception {

        String bd1 = LocalDate.of(1979, 7, 14).format(DateTimeFormatter.ISO_DATE);

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/birthday/dayOfWeek")
                .content(bd1)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))

                .andExpect(status().isOk())
                .andReturn();

        String body = mvcResult.getResponse().getContentAsString();
        assertThat(body).isNotNull();
        assertThat(body).isEqualTo("SATURDAY");
    }
}