import second_class.Vehicle
import second_class.Vet

fun main(args: Array<String>) {
    val animals = arrayOf(Hippo(), wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val Wolf = wolf()
    val hippo = Hippo()
    vet.giveShot(Wolf)
    vet.giveShot(hippo)

    val vehicle = Vehicle()
    vehicle.roam()

}