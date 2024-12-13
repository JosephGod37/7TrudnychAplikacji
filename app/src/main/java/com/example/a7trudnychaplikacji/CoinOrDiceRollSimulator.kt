package com.example.a7trudnychaplikacji
import kotlin.random.Random

interface RollingTool{
    fun roll()
}

class Coin: RollingTool{
    override fun roll(){
        val random= Random.nextInt(2)
        val wyborKomputera=when(random){
            0->"Heads"
            1->"Tails"
            else->"Bład"
        }
        println("Dokonaj wyboru(Heads or Tails):")
        var wybor= readLine()?.trim()

        println("Komputer wybral: ${wyborKomputera}")
        if (wybor != "Heads" && wybor != "Tails") {
            println("Błędny wybór. Proszę wybrać Heads lub Tails.")
            return
        }
        val wynik= when{
            wybor=="Heads" && wyborKomputera=="Tails"->"Wygrales"
            wybor=="Tails" && wyborKomputera=="Heads"->"przegrales"
            else->"Zostala wybrana ta sama wartosc"
        }
        println(wynik)
    }
}
class Dice:RollingTool{
    override fun roll() {
        val random= Random.nextInt(7)+1
        println("Wylosowalo: ${random}")
    }
}


fun main(){
    val Coin=Coin()
    Coin.roll()

    val Dice=Dice()
    Dice.roll()
}