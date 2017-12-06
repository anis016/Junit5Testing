package test.java;

import main.java.FizzBuzz;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;

/**
 * Created by sayed on 06.12.17.
 */
class FizzBuzzTest {

    private FizzBuzz fizzBuzz;
    static int counter = 0;

    // @BeforeEach – runs the annotated method before each test method in the same class;
    // equivalent to the previous @Before and @After
    @BeforeEach
    public void beforeEach() {
        counter ++;
        System.out.println(" Starting Test Number: " + counter);
        fizzBuzz = new FizzBuzz();
    }

    /*
    // @BeforeAll - runs the annotated method before any test methods in the class once; (@AfterAll similar)
    // equivalent to the previous @BeforeClass
    // Note: this method must be static.
    @BeforeAll
    public static void beforeOnce() {
        counter ++;
        System.out.println(" Starting Test Number: " + counter);
        fizzBuzz = new FizzBuzz();
    }
    */

    // same like @BeforeEach, @AfterEach – runs the annotated method after each test method in the same class;
    // equivalent to the previous @After
    @AfterEach
    public void afterEach() {
        System.out.println(" Test Number: " + counter + " Finished.\n");
        // fizzBuzz = null;
    }

    // @Test – denotes a test method; unlike the @Test annotation from previous versions, it doesn’t accept any arguments
    // @DisplayName – specifies a custom name for the test class or method
    @Test
    @DisplayName("Play FizzBuzz with Number = 3")
    public void testFizz() {

        String res = fizzBuzz.play(3);
        Assertions.assertEquals(res, "Fizz");
    }

    // @Disabled – prevents a test class or method from running; similar to the previous @Ignore
    @Disabled
    @Test
    @DisplayName("Play FizzBuzz with Number = 4")
    public void testNumber4IgnoringThis() {
        String res = fizzBuzz.play(4);
        Assertions.assertEquals(res, "Will Not Fail");
    }

    @Test
    @DisplayName("Play FizzBuzz with Number = 5")
    public void testBuzz() {

        String res = fizzBuzz.play(5);
        Assertions.assertEquals(res, "Buzz");
    }

    @Test
    @DisplayName("Play FizzBuzz with Number = 2")
    public void testNumber2() {

        String res = fizzBuzz.play(2);
        Assertions.assertEquals(res, "2");
    }

    @Test
    @DisplayName("Play FizzBuzz with Number = 15")
    public void testFizzBuzz() {

        String res = fizzBuzz.play(15);
        Assertions.assertEquals(res, "Fizz Buzz");
    }
}