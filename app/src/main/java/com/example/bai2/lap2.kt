package com.example.bai2

fun main() {
    var a = 0.0
    var b = 0.0
    println("Bai 1: Giải phương trình bậc nhất ax + b = 0")
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0) {
        println("Phương trình vô số nghiệm")
    } else if (a == 0.0 && b != 0.0) {
        println("Phương trình vô nghiệm")
    } else {
        val x = -b / a
        println("No x=" + x)
    }


    println("Bai 2: Kiểm tra tháng thuộc quý mấy")
    var month = 0
    println("Nhập tháng:")
    val y: String? = readLine()
    if (y != null) month = y.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
        4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
        7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
        10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")
        else -> println("Tháng " + month + " không hợp lệ")
    }


    println("Bai 3: ")
    var year = 0
    var t: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        t = readLine()
        while (t == null || t.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            t= readLine()
        }
        year = t.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        t = readLine()
        if (t == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")
}

class lap2 {
}