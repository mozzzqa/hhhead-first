open class AnimalS_class() {
    open val image = ""
    open val food = ""
    open val habibat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The ANIMAL IS MAKing a noise")
    }

    open fun eat() {
        println("The ANImal is eating")
    }

    open fun roam() {
        println("The aniMAL is roaming")
    }

    fun sleep() {
        println("thE aniMAL is sleeping")
    }
}

class Hippo : AnimalS_class() {

}