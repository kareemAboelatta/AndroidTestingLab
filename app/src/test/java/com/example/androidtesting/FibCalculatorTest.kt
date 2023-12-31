package com.example.androidtesting

import com.example.androidtesting.core_unit.FibCalculator
import com.google.common.truth.Truth
import org.junit.Test

class FibCalculatorTest{


    @Test(expected = IllegalArgumentException::class)
    fun whenEnterNegativeNumberShouldThrowError() {
        val number = -5
        FibCalculator.fib(number)
    }


    @Test
    fun whenEnterZeroShouldReturnZero() {
        val number = 0
        val result = FibCalculator.fib(number)
        Truth.assertThat(result).isEqualTo(0)

    }


    @Test
    fun whenEnterOneShouldReturnOne() {
        val number = 1
        val result = FibCalculator.fib(number)
        Truth.assertThat(result).isEqualTo(1)
    }


    @Test
    fun whenEnterPositiveNumberShouldReturnRightResult() {
        val number = 10
        val rightAnswer = fibByRightWay(number)
        val result = FibCalculator.fib(number) // fun we want to test
        Truth.assertThat(result).isEqualTo(rightAnswer)
    }



    fun fibByRightWay(n:Int): Long{
        if (n == 0 || n == 1)
            return n.toLong()
        return  fibByRightWay(n-1) + fibByRightWay(n-2)
    }
}