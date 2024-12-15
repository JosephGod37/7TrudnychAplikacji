package com.example.a7trudnychaplikacji


interface Weather {
    fun wyswietl(): String
}


class Sunny : Weather {
    override fun wyswietl(): String {
        return "Dzisiaj będzie słonecznie. Wspaniały dzień na spacery!"
    }
}

class Rainy : Weather {
    override fun wyswietl(): String {
        return "Oczekiwany deszcz. Zabierz parasol!"
    }
}

class Cloudy : Weather {
    override fun wyswietl(): String {
        return "Dzień będzie pochmurny. Może padać deszcz."
    }
}


data class City(val name: String, val weather: Weather)


val cities = listOf(
    City("Warszawa", Sunny()),
    City("Gdańsk", Rainy()),
    City("Kraków", Cloudy())
)


fun pobierzPrognozęPogody(cityName: String) {
    val city = cities.find { it.name == cityName }

    if (city != null) {
        println("Prognoza pogody dla miasta ${city.name}: ${city.weather.wyswietl()}")
    } else {
        println("Miasto nie zostało znalezione!")
    }
}


fun displayCities() {
    println("Dostępne miasta:")
    cities.forEach { println("- ${it.name}") }
}


fun weatherApp() {
    displayCities()

    println("Wybierz miasto, aby zobaczyć prognozę pogody:")
    val cityName = readLine() ?: ""
    pobierzPrognozęPogody(cityName)
}


fun main() {
    weatherApp()
}