package com.example.demovariousfeatures.services;

import java.time.LocalDate;

/**
 * Copyright (c) 2020 Carrefour, All rights reserved.
 * <p>
 * 9fbef606107a605d69c0edbcd8029e5d
 */
public interface BirthdayService {
    LocalDate getValidBirthday(String birthdayString) ;

    String getBirthDOW(LocalDate birthday);

    String getChineseZodiac(LocalDate birthday);

    String getStarSign(LocalDate birthday) ;
}
