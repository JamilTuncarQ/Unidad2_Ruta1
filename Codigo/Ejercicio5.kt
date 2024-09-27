class Song(
    val title: String,
    val artist: String,
    val year: Int,
    var playCount: Int
) {

    // Propiedad que indica si la canción es popular
    val isPopular: Boolean
        get() = playCount >= 1000

    // Método para imprimir la descripción de la canción
    fun printDescription() {
        println("\"$title\", interpretada por $artist, se lanzo en $year")
    }
}

fun main() {
    // Ejemplos de canciones
    val song1 = Song("Paracaidas", "Paulo Londra", 2024, 9150)
    val song2 = Song("BOOMBAYAH", "Black Pink", 2016, 1500)

    // Imprimir la descripción de las canciones
    song1.printDescription()
    song2.printDescription()
}
