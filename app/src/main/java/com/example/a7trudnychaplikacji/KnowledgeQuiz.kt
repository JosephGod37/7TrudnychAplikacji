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
    val Prawda:String,
    val Falsz:String,
    val poprawnaOdpowiedzPF:String
)
val pytaniaPF = listOf(
    PytaniePrawdaFalsz(
        "Słońce jest gwiazdą.",
        "Prawda",
        "Falsz",
        "prawda"
    ),
    PytaniePrawdaFalsz(
        "Woda wrze w temperaturze 50°C na poziomie morza.",
        "Prawda",
        "Falsz",
        "falsz"
    ),
    PytaniePrawdaFalsz(
        "Australia jest większa od Europy.",
        "Prawda",
        "Falsz",
        "falsz"
    ),
    PytaniePrawdaFalsz(
        "Najmniejszą kością w ludzkim ciele jest strzemiączko.",
        "Prawda",
        "Falsz",
        "prawda"
    ),
    PytaniePrawdaFalsz(
        "Albert Einstein otrzymał Nagrodę Nobla za teorię względności.",
        "Prawda",
        "Falsz",
        "falsz"
    )
)
class PrawdaFalsz(): pytanie {
    override fun zadawaniePytania() {
        pytaniaPF.forEachIndexed{index, pytanie ->
            println("Pytanie ${index+1}:${pytanie.pytanie}")
            println("Prawda")
            println("Falsz ")
        }
        sprawdzanieOdp()
    }


    override fun sprawdzanieOdp() {
        var poprawnaOdpowiedz = 0
        pytaniaPF.forEachIndexed{index, pytanie ->
            println("Podaj poprawne odpowiedzi do tego pytania ${index+1}:")
            var odpowiedz = readLine()
            if (odpowiedz==pytanie.poprawnaOdpowiedzPF) {
                println("Poprawna odpowiedz")
                poprawnaOdpowiedz++
            } else {
                println("zla odpowiedz\nPoprawna odpowiedz to: ${pytanie.poprawnaOdpowiedzPF}")
            }

        }
        println("Ilosc punktow to: ${poprawnaOdpowiedz}")
    }
}

fun main(){
    val osoba1= wielokrotnegoWyboru()
    //osoba1.zadawaniePytania()
    val osoba2=PrawdaFalsz()
    osoba2.zadawaniePytania()
}