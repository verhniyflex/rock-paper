//typealias DoubleConversion = (Double) -> Double
//
//fun convert(x: Double,
//            converter: DoubleConversion) : Double {
//    val result = converter(x)
//    println("$x is converted to $result")
//    return result
//}
//
//fun getConversionLambda(str: String): DoubleConversion {
//    if (str == "CentigradeToFahrenheit") {
//        return { it * 1.8 + 32 }
//    } else if (str == "KgsToPounds") {
//        return { it * 2.204623 }
//    } else if (str == "PoundsToUSTons") {
//        return { it / 2000.0 }
//    } else {
//        return { it }
//    }
//}
//
//fun combine(lambda1: DoubleConversion,
//            lambda2: DoubleConversion): DoubleConversion {
//    return { x: Double -> lambda2(lambda1(x)) }
//}
//
//fun main(args: Array<String>) {
//    //Преобразовать 2.5 кг в фунты
//    println("Convert 2.5kg to Pounds: ${getConversionLambda("KgsToPounds")(2.5)}")
//
//
////Определить два лямбда-выражения для преобразований
//val kgsToPoundsLambda = getConversionLambda("KgsToPounds")
//val poundsToUSTonsLambda = getConversionLambda("PoundsToUSTons")
//
////Два лямбда-выражения преобразуются в одно новое
//val kgsToUSTonsLambda = combine(kgsToPoundsLambda, poundsToUSTonsLambda)
//
////Использовать новое лямбда-выражение для преобразования
//// 17,4 кг в американские тонны
//val value = 17.4
//println("$value kgs is ${convert(value, kgsToUSTonsLambda)} US tons")
//}

fun search(list: List<Grocery>,
           criteria: (i: Grocery) -> Boolean) {
    for (i in list) {
        if (criteria(i)) {
            println(i.name) }
    }
}
data class Grocery(val name: String, val category: String,
                   val unit: String, val unitPrice: Double)

fun main(args: Array<String>) {
    val groceries = listOf(Grocery("Tomatoes", "Vegetable", "lb", 3.0),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0),
        Grocery("Bagels", "Bakery", "Pack", 1.5),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0),
        Grocery("Ice cream", "Frozen", "Pack", 3.0))
    println("Expensive ingredients:")
    search(groceries) { i: Grocery -> i.unitPrice > 5.0 }
    println("All vegetables:")
    search(groceries) { i: Grocery -> i.category == "Vegetable" }
    println("All packs:")
    search(groceries) { i: Grocery -> i.unit == "Pack" }


}

