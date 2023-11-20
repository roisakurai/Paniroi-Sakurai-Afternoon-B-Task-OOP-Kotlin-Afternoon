package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

        /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

try {
    // Meminta pengguna memasukkan sebuah angka
    print("Masukkan angka: ")
    val userInput = readLine()

    // Mengonversi input menjadi bilangan bulat
    val number = userInput?.toInt()

    // Menampilkan hasil konversi jika berhasil
    println("Angka yang dimasukkan: $number")
} catch (e: NumberFormatException) {
    // Menangani exception jika input tidak dapat dikonversi menjadi bilangan bulat
    println("Error: Masukkan tidak valid. Pastikan Anda memasukkan angka.")
}

}



