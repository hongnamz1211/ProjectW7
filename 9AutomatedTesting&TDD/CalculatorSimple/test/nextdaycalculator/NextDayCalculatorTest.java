package nextdaycalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("TestCase1")
    void testCase1() {
        int day = 1;
        int month = 1;
        int year = 2018;

        String expected = "2/1/2018";
        assertEquals(expected, NextDayCalculator.findNextDay(day, month, year));
    }

    @Test
    @DisplayName("TestCase2")
    void testCase2() {
        int day = 31;
        int month = 1;
        int year = 2018;

        String expected = "1/2/2018";
        assertEquals(expected, NextDayCalculator.findNextDay(day, month, year));
    }

    @Test
    @DisplayName("TestCase3")
    void testCase3() {
        int day = 30;
        int month = 4;
        int year = 2018;

        String expected = "1/5/2018";
        assertEquals(expected, NextDayCalculator.findNextDay(day, month, year));
    }

    @Test
    @DisplayName("TestCase4")
    void testCase4() {
        int day = 28;
        int month = 2;
        int year = 2018;

        String expected = "1/3/2018";
        assertEquals(expected, NextDayCalculator.findNextDay(day, month, year));
    }

    @Test
    @DisplayName("TestCase5")
    void testCase5() {
        int day = 29;
        int month = 2;
        int year = 2020;

        String expected = "1/3/2020";
        assertEquals(expected, NextDayCalculator.findNextDay(day, month, year));
    }


    @Test
    @DisplayName("TestCase6")
    void testCase6() {
        int day = 31;
        int month = 12;
        int year = 2018;

        String expected = "1/1/2019";
        assertEquals(expected, NextDayCalculator.findNextDay(day, month, year));
    }

    @Test
    @DisplayName("TestCase7")
    void testCase7() {
        int day = 28;
        int month = 2;
        int year = 2000;

        String expect = "29/2/2000";
        assertEquals(expect, NextDayCalculator.findNextDay(day, month, year));
    }


    @Test
    @DisplayName("TestCase8")
    void testCase8() {
        int day = 29;
        int month = 2;
        int year = 2001;

        String expect = "Không có ngày kể trên!!!";
        assertEquals(expect, NextDayCalculator.findNextDay(day, month, year));
    }
}