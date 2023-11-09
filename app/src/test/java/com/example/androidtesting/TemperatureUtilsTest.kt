package com.example.androidtesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TemperatureUtilsTest {

    @Test
    fun celsiusToFahrenheit() {
    }

    @Test
    fun fahrenheitToCelsius() {
    }

    @Test
    fun whenConvertCelsiusToFahrenheit_ShouldReturnCorrectResult() {
        val celsius = 0.0
        val expectedResult = 32.0
        val result = TemperatureUtils.celsiusToFahrenheit(celsius)
        assertThat(result).isEqualTo(expectedResult)
    }

    /**The line assertThat(result).isWithin(0.01).of(expectedBmi) is an assertion statement using
     * the Truth library, which is designed to make test assertions more readable and their
     * failure messages more helpful.

    Here's the breakdown of what this statement does:

    assertThat(result): This is the starting point of a Truth assertion. It tells the framework to
    evaluate the result variable.
    isWithin(0.01): This specifies a tolerance for comparing floating-point numbers. It's saying
    that the check should pass as long as the result is within 0.01 units of the value you're
    comparing it against.
    .of(expectedBmi): This is the expected value for the result. The isWithin check will pass if
    result is within 0.01 units of expectedBmi.
    So, in the context of your BMI test, assertThat(result).isWithin(0.01).of(expectedBmi) asserts
    that the result should be equal to expectedBmi, give or take 0.01. This tolerance is often necessary
    because floating-point calculations can have small rounding errors, so exact equality checks (==) can
    fail for two numbers that are effectively equivalent for practical purposes.

    In other words, if expectedBmi is 22.86, your result can be anywhere from 22.85 to 22.87, and
    the test will still pass. This allows the test to account for minor inaccuracies in floating-point
    arithmetic without failing unnecessarily.
     */
    @Test
    fun whenConvertFahrenheitToCelsius_ShouldReturnCorrectResult() {
        val fahrenheit = 32.0
        val expectedResult = 0.0
        val result = TemperatureUtils.fahrenheitToCelsius(fahrenheit)
        assertThat(result).isWithin(0.001).of(expectedResult)

    }

    @Test
    fun whenConvertCelsiusToFahrenheitWithNegative_ShouldReturnCorrectResult() {
        val celsius = -40.0
        val expectedResult = -40.0
        val result = TemperatureUtils.celsiusToFahrenheit(celsius)
        assertThat(result).isEqualTo(expectedResult)
    }

    @Test
    fun whenConvertFahrenheitToCelsiusWithNegative_ShouldReturnCorrectResult() {
        val fahrenheit = -40.0
        val expectedResult = -40.0
        val result = TemperatureUtils.fahrenheitToCelsius(fahrenheit)
        assertThat(result).isWithin(0.001).of(expectedResult)
    }

    @Test
    fun whenConvertCelsiusToFahrenheitWithPositive_ShouldReturnCorrectResult() {
        val celsius = 100.0
        val expectedResult = 212.0
        val result = TemperatureUtils.celsiusToFahrenheit(celsius)
        assertThat(result).isEqualTo(expectedResult)
    }

    @Test
    fun whenConvertFahrenheitToCelsiusWithPositive_ShouldReturnCorrectResult() {
        val fahrenheit = 212.0
        val expectedResult = 100.0
        val result = TemperatureUtils.fahrenheitToCelsius(fahrenheit)
        assertThat(result).isWithin(0.001).of(expectedResult)
    }

}