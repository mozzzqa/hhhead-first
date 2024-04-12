package second_class

import AnimalS_class

interface Roamable {
    fun roam()
}

class Vehicle : Roamable {
    override fun roam() {
        println("Cucu moi malchick")
    }
}

class Vet {
    fun giveShot(animal: AnimalS_class) {
        animal.makeNoise()
    }
}