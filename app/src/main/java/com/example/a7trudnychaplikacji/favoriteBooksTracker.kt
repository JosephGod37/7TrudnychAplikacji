package com.example.a7trudnychaplikacji

class  Books(val autor:String,val rokWydania:Int,val tytul:String)
{
    constructor(): this("",0,"")

    var listOfBook= mutableListOf<Books>()

    fun addBook(book: Books){
        listOfBook.add(book)

    }
    fun filtrujPoAutorze(autor: String){
        val posortowane=listOfBook.filter {it.autor == autor}
        posortowane.forEach { println("Autor: ${it.autor} Tytuł: ${it.tytul}, Rok wydania: ${it.rokWydania}") }
    }
    fun filtrujPoRokuWydania(rokWydania: Int){
        val posortowane=listOfBook.filter {it.rokWydania == rokWydania}
        posortowane.forEach { println("Autor: ${it.autor} Tytuł: ${it.tytul}, Rok wydania: ${it.rokWydania}") }
    }
    fun sortowaniePoTytule(){
        val posortowane=listOfBook.sortedBy{ it.tytul }
        posortowane.forEach { println("Autor: ${it.autor} Tytuł: ${it.tytul}, Rok wydania: ${it.rokWydania}") }
    }
    fun wyswietlanie(){
        listOfBook.forEach { println("Autor: ${it.autor} Tytuł: ${it.tytul}, Rok wydania: ${it.rokWydania}") }
    }
}


fun main() {
    val book1 = Books("George Orwell", 1945, "Folwark zwierzęcy")
    val book2 = Books("Fiodor Dostojewski", 1866, "Zbrodnia i kara")
    val book3 = Books("Fiodor Dostojewski", 1879, "Bracia Karamazow")
    val book4 = Books("Jane Austen", 1813, "Duma i uprzedzenie")
    val book5 = Books("Jane Austen", 1815, "Emma")

    val osoba1 = Books()
    osoba1.addBook(book1)
    osoba1.addBook(book2)
    osoba1.addBook(book3)
    osoba1.addBook(book4)
    osoba1.addBook(book5)

//    osoba1.filtrujPoAutorze("Fiodor Dostojewski")
//    osoba1.filtrujPoRokuWydania(1945)
//   osoba1.sortowaniePoTytule()
    osoba1.wyswietlanie()
}
