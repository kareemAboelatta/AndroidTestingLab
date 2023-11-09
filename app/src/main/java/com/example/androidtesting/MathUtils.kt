package com.example.androidtesting

object MathUtils {

    fun calculateArea(width: Int, height: Int): Int {
        if (width < 0 || height < 0) {
            throw IllegalArgumentException("Width and Height must be non-negative")
        }
        return width * height
    }
}


object TemperatureUtils {

    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 9 / 5 + 32
    }

    fun fahrenheitToCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * 5 / 9
    }

}


object BmiCalculator {

    fun calculateBmi(weightInKg: Double, heightInMeters: Double): Double {
        if (weightInKg <= 0.0 || heightInMeters <= 0.0) {
            throw IllegalArgumentException("Weight and height must be greater than zero")
        }
        return weightInKg / (heightInMeters * heightInMeters)
    }

}


