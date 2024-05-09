package com.example;
fun main(){
    val arrX = arrayListOf (1,2,3,4)
    println(arrX)
    println("cac phan tu trong mang: ")
//    cach 1
    for(x in arrX){
        println(x)
    }
//    mang listX
    val listX = listOf(1,2,3,4)
    // cach 2
    for (i in listX.indices){
        println("Phan tu thu $i trong mang: "+listX[i])
    }
    val listY = mutableListOf(1,2,3,4)
    //add phan tu 5 vao vi tri dau tien trong mang listY
    listY.add(0,5)
    //xoa phan tu cuoi cung trong mang listY
    listY.removeAt(listY.size-1)
    println("listY: $listY")



//    //nhap ten sv:
//    println("Nhap ten sv: ")
//    var s = readLine()
//    if(s !=null){
//        println(getMssv(s))
//    }
}




//
////cu phap when trong kotlin( thay the switch case trong java)
//private val Map_Dssv : Map<String, String> = mutableMapOf(
//    "PH123" to "Nguyen tri toan",
//    "PH1234" to "Nguyen van a",
//    "PH333" to "nguyen van b"
//)
//fun getMssv (tenSv: String) : String ? {
//    when (tenSv) {
//        "Nguyen Van Long" -> {
//            return Map_Dssv.get(tenSv)
//        }
//
//        "Le the anh" -> {
//            return Map_Dssv.get(tenSv)
//        }
//
//            "Khong co du lieu"
//    }
//}

class testarr {
}