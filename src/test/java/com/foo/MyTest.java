package com.foo;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class MyTest {

    @Test
    void this_test_should_always_fail() {
        fail();
    }

    @Test
    void this_test_should_always_succeed() {
        assertTrue(true);
    }
}
