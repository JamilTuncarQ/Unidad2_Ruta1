fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        // Imprimir nombre y edad
        print("Name: $name\nAge: $age\n")

        // Verificar si la persona tiene un hobby
        if (hobby != null) {
            print("Likes to $hobby. ")
        } else {
            print("Doesn't have a hobby. ")
        }

        // Verificar si tiene una persona referida
        if (referrer != null) {
            val referrerHobby = referrer.hobby ?: "doesn't have a hobby"
            println("Has a referrer named ${referrer.name}, who likes to $referrerHobby.")
        } else {
            println("Doesn't have a referrer.")
        }
    }
}
