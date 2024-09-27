fun main() {
    // Celsius a Fahrenheit
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { celsius ->
        (celsius * 9 / 5) + 32
    }

    // Kelvin a Celsius
    printFinalTemperature(350.0, "Kelvin", "Celsius") { kelvin ->
        kelvin - 273.15
    }

    // Fahrenheit a Kelvin
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { fahrenheit ->
        (fahrenheit - 32) * 5 / 9 + 273.15
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
