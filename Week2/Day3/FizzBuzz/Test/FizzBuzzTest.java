import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void fizzBuzz() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(3);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void fizzBuzz2() {
        int number = -3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void fizzBuzz3() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void fizzBuzz4() {
        int number = 13;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void fizzBuzz5() {
        int number = 31;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
}