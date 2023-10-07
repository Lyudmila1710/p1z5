import kotlin.math.log

fun main() {
    println("Введите целолое число n, чтобы узнать существует ли целочисленный показатель степени для которого выполняется равенство x^y=n: ")
    val n= readln().toInt()
    println("Введите  основание степени х:")
    val x= readln().toDouble()
    var y = log(n.toDouble(), x )
    if(y%1 == 0.0){
        println("у= ${y.toInt()}")
    } else {
        println("Целочисленный показатель не существует")
    }
}