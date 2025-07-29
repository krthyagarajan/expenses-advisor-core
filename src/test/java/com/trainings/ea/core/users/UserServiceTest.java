package com.trainings.ea.core.users;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class UserServiceTest {



    @DisplayName("Basic test")
    @ParameterizedTest
    @ValueSource(strings = {"Sachin","",""})
    void test(String name){
        Assertions.assertEquals("Sachin", name);



    }

}

