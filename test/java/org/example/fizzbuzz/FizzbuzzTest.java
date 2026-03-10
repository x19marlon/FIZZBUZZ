package org.example.fizzbuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzbuzzTest {
    @Test
    void minTestDomainRange(){
     //Arrange
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        int minValue =-1;

        //Act &&
        assertThrows(IllegalArgumentException.class,()-> fizzbuzz.calculate(minValue));
    }

    @Test
    void maxTestDomainRange(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        int minValue =101;

        //Act &&
        assertThrows(IllegalArgumentException.class,()-> fizzbuzz.calculate(minValue));
    }

    @Test
    void testBuzz(){
        Fizzbuzz fizzbuzz= new Fizzbuzz();
        int value = 25;
        String expected = "BUZZ";
        String result = fizzbuzz.calculate(value);
        assertEquals(expected,result);
    }

    @Test
    void testFizz(){
        Fizzbuzz fizzbuzz= new Fizzbuzz();
        int value = 27;
        String expected = "FIZZ";
        String result = fizzbuzz.calculate(value);
        assertEquals(expected,result);
    }

    @Test
    void testNumber(){
        Fizzbuzz fizzbuzz= new Fizzbuzz();
        int value = 4;
        String expected = "4";
        String result = fizzbuzz.calculate(value);
        assertEquals(expected,result);
    }
}