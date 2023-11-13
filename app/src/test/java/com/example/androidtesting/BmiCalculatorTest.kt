package com.example.androidtesting

import com.example.androidtesting.core_unit.BmiCalculator

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class BmiCalculatorTest {

    @Test
    fun calculateBmi_ValidInput_ReturnsCorrectBmi() {
        val weightInKg = 70.0
        val heightInMeters = 1.75
        val expectedBmi = 22.86 // The expected BMI value

        val result = BmiCalculator.calculateBmi(weightInKg, heightInMeters)

        assertThat(result).isWithin(0.01).of(expectedBmi)
    }

    @Test(expected = IllegalArgumentException::class)
    fun calculateBmi_NegativeWeight_ThrowsIllegalArgumentException() {
        val weightInKg = -1.0
        val heightInMeters = 1.75

        BmiCalculator.calculateBmi(weightInKg, heightInMeters)
    }

    @Test(expected = IllegalArgumentException::class)
    fun calculateBmi_NegativeHeight_ThrowsIllegalArgumentException() {
        val weightInKg = 70.0
        val heightInMeters = -1.75

        BmiCalculator.calculateBmi(weightInKg, heightInMeters)
    }

    @Test(expected = IllegalArgumentException::class)
    fun calculateBmi_ZeroWeight_ThrowsIllegalArgumentException() {
        val weightInKg = 0.0
        val heightInMeters = 1.75

        BmiCalculator.calculateBmi(weightInKg, heightInMeters)
    }

    @Test(expected = IllegalArgumentException::class)
    fun calculateBmi_ZeroHeight_ThrowsIllegalArgumentException() {
        val weightInKg = 70.0
        val heightInMeters = 0.0

        BmiCalculator.calculateBmi(weightInKg, heightInMeters)
    }
}
