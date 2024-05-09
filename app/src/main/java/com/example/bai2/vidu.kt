package com.example.bai2

class SinhVien(var ten: String, var tuoi: Int) {
    fun gioiThieu() {
        println("Xin chào, tôi là $ten và tôi $tuoi tuổi.")
    }
}

open class DongVat(var ten: String) {
    open fun tiengKeu() {
        println("Dong vat keu...")
    }
}

class Meo(ten: String) : DongVat(ten) {
    override fun tiengKeu() {
        println("Meo meo...")
    }
}

fun tinhGiaiThua(n: Int): Long {
    return if (n == 0) 1 else n * tinhGiaiThua(n - 1)
}

fun chia(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Lỗi chia cho số 0: ${e.message}")
        0
    }
}

enum class MauXe(val hexCode: String) {
    TRANG("#FFFFFF"),
    DEN("#000000"),
    DO("#FF0000"),
    XANH("#00FF00")
}

fun main() {
    println("Ví Dụ 1")
    val chuoi = "Xin chào"
    when (chuoi) {
        "Xin chào" -> println("Chào bạn!")
        "Tạm biệt" -> println("Hẹn gặp lại!")
        "Cảm ơn" -> println("Rất vui được giúp đỡ!")
        else -> println("Tôi không hiểu ý của bạn")
    }
    println("Ví Dụ 2")
    val soTiengViet = arrayOf("một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười")

    for (i in 1..10) {
        println(soTiengViet[i - 1])
    }
    println("Ví Dụ 3")
    val sv = SinhVien("Phạm Văn Phong", 20)
    sv.gioiThieu()

    println("Ví Dụ 4")
    val conMeo = Meo("Tom")
    conMeo.tiengKeu()

    println("Ví Dụ 5")
    val n = 5
    val giaiThua = tinhGiaiThua(n)
    println("Giai thừa của $n là $giaiThua")

    println("Ví Dụ 6")
    val mang = intArrayOf(1, 2, 3, 4, 5)
    var tong = 0

    for (so in mang) {
        tong += so
    }
    println("Tổng các phần tử trong mảng là $tong")

    println("Ví Dụ 7")
    val a = 10
    val b = 0
    val ketQua = chia(a, b)
    println("Kết quả chia là $ketQua")

    println("Ví Dụ 8")
    var x = 10

    fun hienThiX() {
        println("Giá trị của x là $x")
    }

    hienThiX()

    x = 20
    hienThiX()
    println("Ví Dụ 9")
    val mauXe = MauXe.DO
    println("Mã hex của màu xe đỏ là: ${mauXe.hexCode}")

    println("Ví Dụ 10")
    print("Nhập tên của bạn: ")
    val ten = readLine()

    if (ten.isNullOrBlank()) {
        println("Tên không được để trống.")
    } else {
        println("Xin chào, $ten!")
    }











}

class vidu {

}