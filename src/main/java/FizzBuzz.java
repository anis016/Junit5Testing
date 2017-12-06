package main.java;

/**
 * Created by sayed on 06.12.17.
 */
public class FizzBuzz {

    public String play(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        int sp = 0;
        if( (num % 3) == 0 ) {
            stringBuilder.append("Fizz");
            sp = 1;
        } if ( (num % 5) == 0 ) {
            if (sp == 1) {
                stringBuilder.append(" ");
            }
            stringBuilder.append("Buzz");
            sp = 1;
        }
        if (sp == 0) {
            return String.valueOf(num);
        }
        return stringBuilder.toString();
    }

    public static void main(String... args) {
        String fizzBuzz = new FizzBuzz().play(15);
        System.out.println(fizzBuzz);
    }
}
