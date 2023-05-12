

fun main(){
    println(testSimple(3, 10))
    println(testString(10))
    testNamedArguments(y = 4, z = 2, x = 5)
    testDefaultArguments();
    testDefaultArguments(y = 1);
    testDefaultArguments(3,5);

}

//fun testSimple(): Int {
//    return 5 + 5
//}

//fun testSimple(x: Int, y: Int): Int = x + y


fun testSimple(x: Int, y: Int) = x + y

fun testString(x: Int): String{
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int>{
    return listOf(x,y,z)
}
//void //значения по умолчанию
fun testDefaultArguments(x: Int = 1, y: Int = 2){
    println(x + y)
}