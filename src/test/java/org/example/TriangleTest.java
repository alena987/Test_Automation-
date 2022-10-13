package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TriangleTest {


    @ParameterizedTest
    @ValueSource (ints = { "7", "5", "7"})
    public void isParameterizedTest(Integer int) {System.out.println (int);}
}
