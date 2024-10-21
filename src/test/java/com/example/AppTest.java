package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

    App app = new App();

    @Test
    public void testCreateTable() {
        String result = App.table(2);

        String expectedOutput = "2 x 1 = 2\n" +
                "2 x 2 = 4\n" +
                "2 x 3 = 6\n" +
                "2 x 4 = 8\n" +
                "2 x 5 = 10\n" +
                "2 x 6 = 12\n" +
                "2 x 7 = 14\n" +
                "2 x 8 = 16\n" +
                "2 x 9 = 18\n" +
                "2 x 10 = 20\n";

        assertEquals(expectedOutput, result);
    }
}
