package com.example.a7trudnychaplikacji

data class DaneZMeczy(val nazwaDruzyny: String,val iloscPuntkow: Int,val przeciwnik: String)

var mecze = mutableListOf<DaneZMeczy>(
    DaneZMeczy("Drużyna A", 80, "Drużyna B"),
    DaneZMeczy("Drużyna D", 60, "Drużyna C"),
    DaneZMeczy("Drużyna A", 90, "Drużyna D"),
    DaneZMeczy("Drużyna B", 70, "Drużyna E")
)
class Mecz{
    fun dodajMecz(mecz:DaneZMeczy){
        mecze.add(mecz)
        //println("Podaj nazwe druzyny,ilosc punktow i przeciwnika")
    }
}




fun main(){

}