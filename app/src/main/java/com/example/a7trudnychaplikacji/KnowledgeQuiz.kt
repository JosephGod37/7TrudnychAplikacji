package com.example.a7trudnychaplikacji

interface pytanie{
    fun zadawaniePytania()
    fun sprawdzanieOdp()
}

data class PytaniaDoWielokrotnegoWyboru(
    val pytanie: String,
    val a: String,
    val b:String,
    val c:String,
    val d:String,
    val poprawnaOdpowiedz:String
)

val pytaniaWkw= listOf(
    PytaniaDoWielokrotnegoWyboru(
        "Co jest największą planetą w Układzie Słonecznym?",
        "Mars",
        "Ziemia",
        "Jowisz",
        "Wenus",
         "c"
    ),
    PytaniaDoWielokrotnegoWyboru(
         "Który język programowania jest oficjalny dla Androida?",
         "Java",
         "Kotlin",
         "Python",
        "C++",
         "b"
    ),
    PytaniaDoWielokrotnegoWyboru(
         "Ile wynosi pierwiastek kwadratowy z 16?",
        "2",
         "4",
         "8",
         "16",
         "b"
    ),
    PytaniaDoWielokrotnegoWyboru(
         "Który kraj ma najwięcej ludności na świecie?",
         "Indie",
         "Chiny",
         "USA",
         "Indonezja",
         "b"
    ),
    PytaniaDoWielokrotnegoWyboru(
         "Który pierwiastek chemiczny ma symbol 'O'?",
         "Tlen",
         "Wodór",
         "Azot",
         "Hel",
         "a"
    )
)
class wielokrotnegoWyboru(): pytanie {
    override fun zadawaniePytania() {
        pytaniaWkw.forEachIndexed{index, pytanie ->
            println("Pytanie ${index+1}:${pytanie.pytanie}")
            println("a) ${pytanie.a}")
            println("b) ${pytanie.b}")
            println("c) ${pytanie.c}")
            println("d) ${pytanie.d}")
        }
        sprawdzanieOdp()
    }


    override fun sprawdzanieOdp() {
        var poprawnaOdpowiedz = 0
        pytaniaWkw.forEachIndexed{index, pytanie ->
            pytanie.pytanie

            println("Podaj poprawne odpowiedzi do tego pytania ${index+1}:")
            var odpowiedz = readLine()
            if (odpowiedz == pytanie.poprawnaOdpowiedz) {
                println("Poprawna odpowiedz")
                poprawnaOdpowiedz++
            } else {
                println("zla odpowiedz\nPoprawna odpowiedz to: ${pytanie.poprawnaOdpowiedz}")
            }

        }
        println("Ilosc punktow to: ${poprawnaOdpowiedz}")
    }
}

data class PytaniePrawdaFalsz(
    val pytanie: String,
    val poprawnaOdpowiedz:Boolean
)
val pytaniaPF = listOf(
    PytaniePrawdaFalsz(
        "Słońce jest gwiazdą.",
        true
    ),
    PytaniePrawdaFalsz(
        "Woda wrze w temperaturze 50°C na poziomie morza.",
        false
    ),
    PytaniePrawdaFalsz(
        "Australia jest większa od Europy.",
        false
    ),
    PytaniePrawdaFalsz(
        "Najmniejszą kością w ludzkim ciele jest strzemiączko.",
        true
    ),
    PytaniePrawdaFalsz(
        "Albert Einstein otrzymał Nagrodę Nobla za teorię względności.",
        false // Za wyjaśnienie efektu fotoelektrycznego
    )
)


fun main(){
    val osoba1= wielokrotnegoWyboru()
    osoba1.zadawaniePytania()
}