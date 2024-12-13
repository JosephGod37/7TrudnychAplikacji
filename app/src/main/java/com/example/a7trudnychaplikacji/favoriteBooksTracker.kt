package com.example.a7trudnychaplikacji

class Books(val autor:String,val rokWydania:Int,val tytul:String)
{
    var listOfBook= mutableListOf<Books>()
    fun addBook(autor: String,rokWydania: Int,tytul: String){
        val newBook=Books(autor,rokWydania,tytul)
        listOfBook.add(newBook)

    }

    fun wybor() {
        println("Wybierz w jaki sposob chcesz filtrowac wedlug autora lub roku wydania mozliwe jest takze sortowanie po tytule i wyswitlenie")
        println("1-autor 2-rok wydania 3-tytul 4-wyswietl")
        val uzytkownik2 = readLine()
        if (uzytkownik2 == "1") {
            sortujPoAutorz()
        } else if (uzytkownik2 == "2") {

        } else if (uzytkownik2 == "3") {

        } else if(uzytkownik2=="4") {

        }
        else{
            println("Blad")
        }
    }
    fun sortujPoAutorz(){

    }
}