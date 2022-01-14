/*
fun main(args: Array<String>) {
    val set = setOf(Duck(), Duck(17))
    println(set)

    var mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
    println("mShoppingList original: $mShoppingList")
    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added: $mShoppingList")
    if (mShoppingList.contains("Tea")) {
        mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
    }

    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")
    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")
    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")
    val moreShopping = setOf("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")
    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")
}

class Duck (val size: Int = 17) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other is Duck && size == other.size) return true
        return false
    }

    override fun hashCode(): Int {
        return size
    }
}

 */


fun main() {
    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")
    var pets: MutableList<String> = mutableListOf()
    pets.addAll(petsLiam)
    pets.addAll(petsSophia)
    pets.addAll(petsNoah)
    pets.addAll(petsEmily)
    println(pets)
    println(pets.size)
    println(pets.toSet().size)
    println(pets.toSet().sorted())
    //
    /*
    val r1 = "Chicken Soup"
    val r2 = "Quinoa Salad"
    val r3 = "Thai Curry"

    val recipeMap = mapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe 3" to r3)
    recipeMap.containsKey("Recipe1")
    val recipeToCheck = "Chicken Soup"
    if (recipeMap.containsValue(recipeToCheck)) {
        //
    }
    if (recipeMap.containsKey("Recipe1")) {
        val recipe = recipeMap.getValue("Recipe1")
        println(recipe) //
    }

    for ((key, value) in recipeMap) {
        println("Key is $key, value is $value")
    }

     */
    val r1 = "Chicken Soup"
    val r2 = "Quinoa Salad"
    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2)
    val r3 = "Thai Curry"
    mRecipeMap.put("Recipe3", r3)
    val r4 = "Spaghetti"
    val r5 = "Chupapi"
    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)
    mRecipeMap.remove("Recipe2")

    val recipeToRemove = "Quinoa Salad"
    mRecipeMap.remove("Recipe2", recipeToRemove)
    val recipeEntries = mRecipeMap.entries
    println(recipeEntries)
    mRecipeMap.clear()
}


