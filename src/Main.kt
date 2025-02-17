fun main() {
println("40.5 Degrees Celsius = ${TemperatureConverter.celsiusToFahrenheit(40.5)} Degrees Fahrenheit")
    println("74.5 Degrees Fahrenheit = ${TemperatureConverter.fahrenheitToCelsius(74.5)} Degrees Celsius")
    println("74.5 Degrees Fahrenheit = ${TemperatureConverter.fahrenheitToKelvin(74.5)} Kelvin")
    println("40.5 Degrees Celsius = ${TemperatureConverter.celsiusToKelvin(40.5)} Kelvin")

    }

class TemperatureConverter {
    companion object {

        fun celsiusToFahrenheit(celsius: Double): Double {
            return 9 / 5 * (celsius) + 32
        }

        fun fahrenheitToCelsius(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5 / 9
        }
        fun celsiusToKelvin(celsius: Double): Double {
            return celsius + 273
        }
        fun fahrenheitToKelvin(fahrenheit: Double): Double {
            return fahrenheit - 273
        }
    }
}