package id.infinitelearning.KotlinSubmission.exercise5
class Hero {

    private var name: String? = "Paniroi Sakurai"
    private var age = 20
    private var height = 174

    private var health = 20

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Anda telah mati $name")
        }
    }

    fun jalan() {
        checkHealth()
        println("$name sedang berjalan...")
        health -= 1
    }



    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */
    
        /** Grup saya adalah Elevens United 
     * 
     * Elevens United -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
     * 
    */

    fun lari() {
        checkHealth()
        println("$name sedang berlari...")
        health -= 2
    }

    fun makan() {
        checkHealth()
        println("$name sedang makan...")
        health += 2
    }

    fun minum() {
        checkHealth()
        println("$name sedang minum...")
        health += 2
    }

    fun lompat() {
        checkHealth()
        println("$name sedang lompat...")
        health -= 2
    }

    fun duduk() {
        checkHealth()
        println("$name sedang duduk...")
        health += 1
    }

}

