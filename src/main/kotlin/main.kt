
import java.util.*
public var Input = Scanner(System.`in`)

fun main () {
    val reader = Scanner(System.`in`)

    println("I---Masukan Identitas---I")
    print("Masukan nama Anda: ")
    reader.nextLine()
    print("Masukan Absen: ")
    reader.nextLine()
    print("Masukan Kelas Anda: ")
    reader.nextLine()

    println("I---Mengihitung Bangun Ruang---I")
    println("1. Volume Balok")
    println("2. Volume Bola")
    print("pilih Menu: ")
    val pilih = readLine()

    when (pilih) {
        "1" -> {
            println("---Menghitung Balok---")
            print("Masukan Panjang: ")
            val pb : Double = Input.nextDouble()
            print("Masukan Lebar: ")
            val lb : Double = Input.nextDouble()
            print("Masukan tinggi: ")
            val tb : Double = Input.nextDouble()

            val vt = pb * lb * tb

            print("Volume Balok = $vt")
        }
        "2" -> {
            println("---Volume Bola---")
            print("Masukan Jari-Jari: ")
            val r : Double = Input.nextDouble()

            val vb = 4/3 * Math.PI * r * r * r

            print("Volume Bola = $vb")
        }
    }

}

