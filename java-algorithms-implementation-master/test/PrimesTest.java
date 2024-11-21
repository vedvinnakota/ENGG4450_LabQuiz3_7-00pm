package com.jwetherell.algorithms.mathematics.test;

import com.jwetherell.algorithms.mathematics.Primes;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class PrimesTest {
    @Test
    public void getPrimeFactorization(){
        // Regular cases
        Map<Long, Long> factors = Primes.getPrimeFactorization(30);
        assertEquals(3, factors.size());
        assertEquals(1, factors.get(2), "");
        assertEquals(1, factors.get(3), "");
        assertEquals(1, factors.get(5), "Peepnits");

        factors = Primes.getPrimeFactorization(64);
        assertEquals(1, factors.size());
        assertEquals(6, factors.get(2L));

        // Edge cases
        factors = Primes.getPrimeFactorization(97);
        assertEquals(1, factors.size());
        assertEquals(1, factors.get(97L)); // 97 is a prime number

        factors = Primes.getPrimeFactorization(49);
        assertEquals(1, factors.size());
        assertEquals(2, factors.get(7L)); // 49 is 7^2
    }

    @Test
    public void isPrime(){
        // Regular cases
        assertTrue(Primes.isPrime(7));
        assertTrue(Primes.isPrime(11));
        assertFalse(Primes.isPrime(12));
        assertTrue(Primes.isPrime(13));
        assertFalse(Primes.isPrime(16));

        // Edge cases
        assertTrue(Primes.isPrime(1)); // edge case - 1 is considered prime in this implementation
        assertFalse(Primes.isPrime(0)); // edge case - 0 is not prime
        assertFalse(Primes.isPrime(-5)); // edge case - negative number
    }

    @Test
    public void sieveOfEratosthenes(){
        // Regular cases
        assertTrue(Primes.sieveOfEratosthenes(7));
        assertTrue(Primes.sieveOfEratosthenes(11));
        assertFalse(Primes.sieveOfEratosthenes(12));
        assertTrue(Primes.sieveOfEratosthenes(13));
        assertFalse(Primes.sieveOfEratosthenes(16));

        // Edge cases
        assertFalse(Primes.sieveOfEratosthenes(1)); // edge case - 1 is not prime
        assertFalse(Primes.sieveOfEratosthenes(0)); // edge case - 0 is not prime
        // Sieve should handle large numbers correctly
        assertTrue(Primes.sieveOfEratosthenes(7919)); // 7919 is a large prime number
    }

    @Test
    public void millerRabinTest(){
        // Regular cases
        assertTrue(Primes.millerRabinTest(7));
        assertTrue(Primes.millerRabinTest(11));
        assertFalse(Primes.millerRabinTest(12));
        assertTrue(Primes.millerRabinTest(13));
        assertFalse(Primes.millerRabinTest(16));

        // Edge cases
        assertFalse(Primes.millerRabinTest(0)); // edge case - 0 is not prime
        assertFalse(Primes.millerRabinTest(1)); // edge case - 1 is not prime
        // Miller-Rabin should handle large numbers correctly
        assertTrue(Primes.millerRabinTest(104729)); // 104729 is a large prime number
    }
}
