package com.epam.test;

import com.epam.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "54,true",
            "0,false",
            "32,true",
            "-278,false",
            "java,false"
    })
    void isPositiveNumberMethod(String input, boolean expected) {
        boolean result = StringUtils.isPositiveNumber(input);
        assertEquals(result,expected);
    }


}