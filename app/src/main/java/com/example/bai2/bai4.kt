package com.example.bai2
import java.util.Scanner

data class SinhVienModel(
    var name: String,
    var mssv: String,
    var diemTB: Float,
    var daTotNghiep: Boolean?,
    var tuoi: Int?
)

class QuanLySinhVien{
    private val sinhviens = mutableListOf<SinhVienModel>()

    fun themSinhVien(sv: SinhVienModel) {
        val existingStudent = sinhviens.find { it.mssv == sv.mssv }
        if (existingStudent == null) {
            sinhviens.add(sv)
            println("Sinh viên ${sv.name} đã được thêm vào danh sách.")
        } else {
            println("Sinh viên với MSSV ${sv.mssv} đã tồn tại trong danh sách.")
        }
    }
    fun xoaSinhVien(mssv: String) {
        val sv = sinhviens.find { it.mssv == mssv }
        if (sv != null) {
            sinhviens.remove(sv)
            println("Sinh viên ${sv.name} đã được xóa khỏi danh sách.")
        } else {
            println("Không tìm thấy sinh viên có MSSV $mssv.")
        }
    }

    fun hienthidanhsach() {
        if (sinhviens.isEmpty()) {
            println("Danh sách sinh viên hiện đang trống.")
        } else {
            println("Danh sách sinh viên:")
            sinhviens.forEachIndexed { index, sv ->
                println("STT: $index, Họ Tên: ${sv.name}, MSSV: ${sv.mssv}, " +
                        "Điểm Trung Bình: ${sv.diemTB},Tốt Nghiệp: ${sv.daTotNghiep}, Tuổi: ${sv.tuoi}")
            }
        }
    }
}

fun main() {
    val qlSinhVien = QuanLySinhVien()
    val scanner = Scanner(System.`in`)

    var trangthai = true

    while (trangthai) {
        println("Chọn chức năng:")
        println("1. Hiển thị danh sách sinh viên")
        println("2. Thêm sinh viên")
        println("3. Xóa sinh viên")
        println("0. Thoát")

        when (scanner.nextInt()) {
            1 ->{
                qlSinhVien.hienthidanhsach()
            }
            2 -> {
                scanner.nextLine()
                var continueAdding = true
                while (continueAdding) {
                    println("Nhập thông tin sinh viên:")
                    print("Họ Tên: ")
                    val name = scanner.nextLine()
                    print("MSSV: ")
                    val mssv = scanner.nextLine()
                    print("Điểm Trung Bình: ")
                    val diemTB = scanner.nextFloat()
                    print("Tốt Nghiệp: ")
                    val daTotNghiep = scanner.nextBoolean()
                    print("Tuổi: ")
                    val tuoi = scanner.nextInt()

                    val student = SinhVienModel(name, mssv, diemTB, daTotNghiep, tuoi)
                    qlSinhVien.themSinhVien(student)

                    println("Bạn có muốn tiếp tục thêm sinh viên không? (yes/no)")
                    val choice = scanner.next()
                    continueAdding = choice.equals("yes", ignoreCase = true)
                    scanner.nextLine() // Consume newline
                }
            }
            3 -> {
                scanner.nextLine() // Consume newline
                println("Nhập MSSV của sinh viên cần xóa:")
                val mssv = scanner.nextLine()
                qlSinhVien.xoaSinhVien(mssv)
            }
            0 -> {
                trangthai = false
                println("Thoát chương trình.")
            }
            else -> {
                println("Chức năng không hợp lệ. Vui lòng chọn lại.")
            }
        }
    }

    scanner.close()
}

class bai4 {
}