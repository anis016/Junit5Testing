package test.java;

import main.java.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by sayed on 06.12.17.
 */
class FizzBuzzTest {

    @Test
    @DisplayName("Play FizzBuzz with Number = 3")
    public void testFizz() {

        String fizzBuzz = new FizzBuzz().play(3);
        Assertions.assertEquals(fizzBuzz, "Fizz");
    }

    @Test
    @DisplayName("Play FizzBuzz with Number = 5")
    public void testBuzz() {

        String fizzBuzz = new FizzBuzz().play(5);
        Assertions.assertEquals(fizzBuzz, "Buzz");
    }

    @Test
    @DisplayName("Play FizzBuzz with Number = 2")
    public void testNumber2() {

        String fizzBuzz = new FizzBuzz().play(2);
        Assertions.assertEquals(fizzBuzz, "2");
    }
}