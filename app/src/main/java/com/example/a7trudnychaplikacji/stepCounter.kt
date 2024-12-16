package com.example.a7trudnychaplikacji


class Krokomierz{
    companion object
    {
        var kroki=0
        var iloscKrokow="Ilosc krokow: ${kroki}"
        fun zrobKrok(){
            kroki+=1
            println("Ilosc krokow: ${kroki}")
        }
        fun reset(){
            kroki=0
            println("Ilosc krokow: ${kroki}")
        }


        fun StepCounter(){
            while(true) {
                println("Czy chcesz zrobic krok lub zresetowac ilosc twoich krokow? krok/reset")
                println("Jesli chcesz zakonczyc wpisz 'koniec'")
                var uzytkownik: String? = readLine()
                if (uzytkownik != null) {
                    if (uzytkownik.lowercase() == "krok") {
                        zrobKrok()
                    } else if (uzytkownik.lowercase() == "reset") {
                        reset()
                    } else if (uzytkownik.lowercase() == "koniec") {
                        break
                    } else {
                        println("Wystapil blad")
                    }
                }
            }
        }
    }
}

fun main(){
    Krokomierz.StepCounter()

}