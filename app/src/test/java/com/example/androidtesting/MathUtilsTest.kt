package com.example.androidtesting

import com.example.androidtesting.core_unit.MathUtils
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class MathUtilsTest {

    @Test(expected = IllegalArgumentException::class)
    fun whenEnterNegativeWidthShouldThrowError() {
        val width = -1
        val height = 5
        MathUtils.calculateArea(width, height)
    }

    @Test(expected = IllegalArgumentException::class)
    fun whenEnterNegativeHeightShouldThrowError() {
        val width = 5
        val height = -1
        MathUtils.calculateArea(width, height)
    }

    @Test(expected = IllegalArgumentException::class)
    fun whenEnterBothNegativeNumbersShouldThrowError() {
        val width = -5
        val height = -5
        MathUtils.calculateArea(width, height)
    }

    @Test
    fun whenEnterZeroForWidthShouldReturnZero() {
        val width = 0
        val height = 5
        val result = MathUtils.calculateArea(width, height)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun whenEnterZeroForHeightShouldReturnZero() {
        val width = 5
        val height = 0
        val result = MathUtils.calculateArea(width, height)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun whenEnterValidNumbersShouldReturnCorrectArea() {
        val width = 10
        val height = 5
        val result = MathUtils.calculateArea(width, height)
        assertThat(result).isEqualTo(50) // Assuming the calculateArea function is implemented correctly
    }

    @Test
    fun whenEnterLargeNumbersShouldReturnCorrectArea() {
        val width = 10000
        val height = 5000
        val result = MathUtils.calculateArea(width, height)
        assertThat(result).isEqualTo(50000000) // Assuming the calculateArea function is implemented correctly and can handle large numbers
    }
}
