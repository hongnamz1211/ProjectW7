package fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    @DisplayName("Chia hết cho 3")
    void divThree() {
        int number = 6;
        String expect = "Fizz";

        assertEquals(expect, FizzBuzz.fizzBuzz(number));
    }

    @Test
    @DisplayName("Chia hết cho 5")
    void divFive() {
        int number = 20;
        String expect = "Buzz";

        assertEquals(expect, FizzBuzz.fizzBuzz(number));
    }

    @Test
    @DisplayName("Chia hết cho 3 & 5")
    void divThreeAndFive() {
        int number = 30;
        String expect = "FizzBuzz";

        assertEquals(expect, FizzBuzz.fizzBuzz(number));
    }

    @Test
    @DisplayName("Không chia hết")
    void notDiv() {
        int number = 31;
        String expect = "'" + number + "'";

        assertEquals(expect, FizzBuzz.fizzBuzz(number));
    }
}