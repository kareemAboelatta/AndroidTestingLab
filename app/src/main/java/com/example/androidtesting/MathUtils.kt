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


object FibCalculator {

   fun fib(n: Int):Long{
       if (n < 0)
           throw IllegalArgumentException()

       if ((n == 0) or (n == 1)){
           return n.toLong()
       }

       var a= 0L
       var b= 1L
       var c= 1L
       (1..n-1).forEach { i->
           c=a+b
           a=b
           b=c
       }
       return c
   }




}




//0 1 1 2 3 5    8 13 21 34 55 89














