import second_class.Roamable

abstract class AnimalS_class : Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habibat: String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The aniMAL is roaming")
    }

    fun sleep() {
        println("thE aniMAL is sleeping")
    }
}

class Hippo : AnimalS_class() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habibat = "water"

    override fun makeNoise() {
        println("Grunt!!!")
    }

    override fun eat() {
        println("The hippo is EAT $food")
    }
}

abstract class Canine : AnimalS_class() {
    override fun roam() {
        println("tHe caninE is roaming")
    }
}

class wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habibat = "forest"

    override fun makeNoise() {
        println("Hooooowl!!!")
    }

    override fun eat() {
        println("THE wolf is aet $food")
    }
}