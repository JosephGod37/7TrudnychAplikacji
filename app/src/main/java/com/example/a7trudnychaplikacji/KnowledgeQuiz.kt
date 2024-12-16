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
