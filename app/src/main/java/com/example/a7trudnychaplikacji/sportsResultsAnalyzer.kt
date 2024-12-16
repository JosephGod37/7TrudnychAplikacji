package com.example.a7trudnychaplikacji

data class DaneZMeczy(val nazwaDruzyny: String,var iloscPuntkow: Int,val przeciwnik: String)

var mecze = mutableListOf<DaneZMeczy>(
    DaneZMeczy("Drużyna A", 80, "Drużyna B"),
    DaneZMeczy("Drużyna D", 60, "Drużyna C"),
    DaneZMeczy("Drużyna A", 90, "Drużyna D"),
    DaneZMeczy("Drużyna B", 70, "Drużyna E")
)
class Mecz {
    fun dodajMecz(mecz: DaneZMeczy) {
        mecze.add(mecz)
        println("Mecz dodany: ${mecz}")
    }

    fun filter(mecze: List<DaneZMeczy>, iloscPuntkow: Int): List<DaneZMeczy> {
        var filterMeczy = mecze.filter { it.iloscPuntkow >= iloscPuntkow }
        return filterMeczy
    }

    fun dodajBonus(mecze: List<DaneZMeczy>, bonus: Int): List<DaneZMeczy> {
        return mecze.map { mecz ->
            DaneZMeczy(mecz.nazwaDruzyny, mecz.iloscPuntkow + bonus, mecz.przeciwnik)
        }
    }

    fun sumowanieWynikow(mecze: List<DaneZMeczy>): Int {
        return mecze.sumOf { it.iloscPuntkow }
    }

    fun maksymalnyWynik(mecze: List<DaneZMeczy>): Int? {
        return mecze.maxOfOrNull { it.iloscPuntkow }
    }

    fun roznica(mecze: List<DaneZMeczy>): Int {
        return mecze.maxOf { it.iloscPuntkow } - mecze.minOf { it.iloscPuntkow }
    }

    fun zliczanie(mecze: List<DaneZMeczy>, kryteria: Int): Int {
        return mecze.count { it.iloscPuntkow > kryteria }
    }

    fun sportsResultsAnalyzer() {
        while (true) {
            println("1-dodaj mecz\n2-filtruj wyniki\n3-dodaj bonus\n4-sumowanie wynikow\n5-maksmalny wynik roznica miedzy najwyzszym a najnizszym wynikiem\n6-zliczanie liczby meczow ktore spelniaja kryteria\n7-zakonczenie programu")
            var uzytkownik = readLine()
            when (uzytkownik) {
                "1" -> {
                    println("Podaj nazwę drużyny:")
                    val nazwaDruzyny = readLine()!!
                    println("Podaj liczbę punktów:")
                    val punkty = readLine()!!.toInt()
                    println("Podaj nazwę przeciwnika:")
                    val przeciwnik = readLine()!!
                    dodajMecz(DaneZMeczy(nazwaDruzyny, punkty, przeciwnik))
                }

                "2" -> {
                    println("Podaj prog punktów do filtracji:")
                    val iloscPunktow = readLine()!!.toInt()
                    val filtrowaneMecze = filter(mecze, iloscPunktow)
                    println("Wyniki meczów powyżej $iloscPunktow punktów:")
                    filtrowaneMecze.forEach { println(it) }
                }

                "3" -> {
                    println("Podaj bonus do dodania:")
                    val bonus = readLine()!!.toInt()
                    val meczeZBonusem = dodajBonus(mecze, bonus)
                    println("Mecze z dodanym bonusem:")
                    meczeZBonusem.forEach { println(it) }
                }

                "4" -> {
                    val suma = sumowanieWynikow(mecze)
                    println("Suma punktów z wszystkich meczów: $suma")
                }

                "5" -> {
                    val maxWynik = maksymalnyWynik(mecze)
                    val roznicaWynikow = roznica(mecze)
                    println("Maksymalny wynik: $maxWynik")
                    println("Różnica między najwyższym a najniższym wynikiem: $roznicaWynikow")
                }

                "6" -> {
                    println("Podaj próg punktowy:")
                    val kryteria = readLine()!!.toInt()
                    val liczbaMeczy = zliczanie(mecze, kryteria)
                    println("Liczba meczów spełniających kryterium: $liczbaMeczy")
                }

                "7" -> {
                    println("Zakończenie programu.")
                    break
                }

                else -> println("Nieprawidłowa opcja. Spróbuj ponownie.")

            }

        }
    }
}


fun main(){
    var osoba1= Mecz()
    osoba1.sportsResultsAnalyzer()
}