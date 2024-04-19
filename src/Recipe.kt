data class Recipe(val title: String,
                  val mainIngredient: String,
                  val isVegeterian: Boolean = false,
                  val difficulty: String = "Easy") {
}

class Mushroom(val size: Int, val isMagic: Boolean) {
    constructor(isMagic_param: Boolean) : this(0, isMagic_param) {
    }
}

fun findRecipes(title: String = "",
                ingredient: String = "",
                isVegeterian: Boolean = false,
                difficulty: String = "") : Array<Recipe> {
    //Cod poiska receptov
    return arrayOf(Recipe(title, ingredient, isVegeterian, difficulty))
}

fun addNumber(a: Int, b: Int) : Int {
    return a + b
}

fun addNumber(a: Double, b: Double) : Double {
    return a + b
}

fun main() {
    val r1 = Recipe("Thai Curry", "Chiken")
    val r2 = Recipe(title = "Thai Curry", mainIngredient = "Chiken")
    val r3 = r1.copy(title = "Chiken Bhuna")
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")
    println("r1 toString: ${r1.toString()}")
    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r3}")
    println("r1 == r3? ${r1 == r3}")
    val (title, mainIngredient, vegeterian, difficulty) = r1
    println("title is $title and vegeterian is $vegeterian")

    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
    val m2 = Mushroom(true)

    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")

    println(addNumber(2, 5))
    println(addNumber(1.6, 7.3))

}