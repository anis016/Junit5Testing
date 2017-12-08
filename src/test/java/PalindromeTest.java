package test.java;

import main.java.Palindrome;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class PalindromeTest {

    Palindrome palindrome;

    @BeforeEach
    public void beforeEach() {
        palindrome = new Palindrome();
    }

    @AfterEach
    public void afterEach() {
        palindrome = null;
    }

    @Test
    public void isPalindromeTest1() {
        String res = palindrome.isPalindrome("mama");
        Assertions.assertEquals("No", res);
    }

    @Test
    public void isPalindromeTest2() {
        String res = palindrome.isPalindrome("mamat");
        Assertions.assertEquals("No", res);
    }

    @Test
    public void isPalindromeTest3() {
        String res = palindrome.isPalindrome("mamam");
        Assertions.assertEquals("Yes", res);
    }

    // http://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests
    @ParameterizedTest
    @ValueSource(strings = {"ama", "mam", "radar"})
    public void paramPalindromeTest4(String candidate) {
        Assertions.assertNotNull(candidate);
        String res = palindrome.isPalindrome(candidate);
        Assertions.assertEquals("Yes", res);
        System.out.println("Calling Once ? ");
    }

    @ParameterizedTest
    @CsvSource({ "foo, 1", "bar, 2", "'baz, qux', 3" })
    void testWithCsvSource(String first, int second) {
        Assertions.assertNotNull(first);
        Assertions.assertNotEquals(0, second);
    }

    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void testWithMultiArgMethodSource(String str, int num, List<String> list) {
        Assertions.assertEquals(3, str.length());
        Assertions.assertTrue(num >=1 && num <=2);
        Assertions.assertEquals(2, list.size());
    }

    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                Arguments.of("foo", 1, Arrays.asList("a", "b")),
                Arguments.of("bar", 2, Arrays.asList("x", "y"))
        );
    }

}