package com.example.authentification

class Person() {
    var name : String=""
    var surname: String=""
    var age: Int=0
    var email: String =""

    fun maxasiateblebi(){
    println(name)
    println(surname)
    println(age)
    println(email)


}

    override fun toString(): String {
        return maxasiateblebi().toString()
    }
}


fun main(){
    var person1 = Person()
    person1.name="Giorgi"
    person1.surname="Beridze"
    person1.age=18
    person1.email="giorgi.beridze@btu.edu.ge"

    println(person1)



}


