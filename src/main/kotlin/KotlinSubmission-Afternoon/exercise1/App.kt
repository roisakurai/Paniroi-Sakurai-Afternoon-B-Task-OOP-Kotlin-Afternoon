package id.infinitelearning.KotlinSubmission.exercise1

/**
 * Latihan 1
 * Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
 * - Variable bertipe data string yang menyimpan nilai nama depan Anda.
 * - Variable bertipe data string yang menyimpan nilai nama belakang Anda.
 * - Variable bertipe data number yang menyimpan nilai umur Anda.
 * - Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
 * Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Paniroi"
    val lastName: String = "Sakurai"
    val age: Int = 20
    val isSingle: Boolean = true

    println("My Profile:")
    println("First Name: $firstName")
    println("Last Name: $lastName")
    println("Age: $age")
    println("Single: $isSingle")
}

/**
 * Latihan 2
 * Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 */
fun myTeam(): List<Any> {
    val teamMembers = listOf("Paniroi Sakurai", "Satriawan", "Muhammad Naufal Hafiz", "Juniar", "Anika Putri", "Christian Simanjuntak", "Muhammad Zikri Arifin", "Habib Zihandri", "Rendi Prasetyo", "Yunika Tri Rezeki","Zaidan Ahmadillah")
    return teamMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 * total mentor + jumlah anggota group
 */
fun totalMember(): Int {
    val mentors = arrayOf("Pupu", "Jessica Aulia")
    val countOfGroup = arrayOf("Paniroi Sakurai", "Satriawan", "Muhammad Naufal Hafiz", "Juniar", "Anika Putri", "Christian Simanjuntak", "Muhammad Zikri Arifin", "Habib Zihandri", "Rendi Prasetyo", "Yunika Tri Rezeki","Zaidan Ahmadillah")

    return mentors.size + countOfGroup.size
}

fun main() {
    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     * Latihan 5
     * Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     */
    groupDetail("Elevens United", listOf("Paniroi Sakurai", "Satriawan", "Muhammad Naufal Hafiz", "Juniar", "Anika Putri", "Christian Simanjuntak", "Muhammad Zikri Arifin", "Habib Zihandri", "Rendi Prasetyo", "Yunika Tri Rezeki","Zaidan Ahmadillah"), "Afternoon")
}
