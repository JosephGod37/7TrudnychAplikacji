package com.example.a7trudnychaplikacji
import kotlin.random.Random

object Quote{
    var listaCytatow= mutableListOf(
        "Nie bój się, że twoje życie się zakończy. Bój się, że nigdy się nie zacznie. - Grace Hansen",
        "To, co robisz, ma znaczenie. Zawsze ma. - Ghandi",
        "Najlepszy sposób przewidywania przyszłości to jej tworzenie. - Abraham Lincoln",
        "Wszystko, co sobie wyobrażamy, jest prawdziwe. - Pablo Picasso",
        "Zawsze warto dążyć do doskonałości, bo doskonałość jest jak nieosiągalna gwiazda na niebie – im bardziej jej szukamy, tym bliżej jesteśmy. - John F. Kennedy",
        "Jest tylko jedna rzecz, która sprawia, że marzenie staje się niemożliwe do zrealizowania: strach przed porażką. - Paulo Coelho",
        "Człowiek, który nie popełnia błędów, nigdy nie próbował niczego nowego. - Albert Einstein",
        "To, co mamy, to tylko moment. - Charles Dickens",
        "Życie jest tym, co się dzieje, kiedy jesteś zajęty robieniem innych planów. - John Lennon",
        "W życiu nie chodzi o czekanie, aż burza minie, ale o to, by nauczyć się tańczyć w deszczu. - Vivian Greene"
    )

    fun getRandomQuote(){
        val random= listaCytatow.random()
        println("Losowy cytat dzis to: ${random}")
    }
}
