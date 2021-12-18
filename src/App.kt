interface Roamable {
    fun roam()
}

abstract class Animal : Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10
    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The Animal is roaming")
    }
    fun sleep() {
        println("The Animal is sleeping")
    }
}
class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"
    override fun makeNoise() {
        println("Grunt! Grunt!")
    }
    override fun eat() {
        println("The Hippo is eating $food")
    }
}
abstract class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooowl!")
    }
    override fun eat() {
        println("The Wolf is eating $food")
    }
}

class Vehicle : Roamable {
    override fun roam() {
        println("The Vehicle is roaming")
    }
}


class Vet {
    fun giveShot(animal: Animal) {
        animal.makeNoise()
    }
}
fun main(args: Array<String>) {
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }

    val f = arrayOf(Bird(), Plane(), Superhero())
    var x = 0
    while (x in 0..2) {
        val y = when (f[x]) {
            is Bird -> false
            else -> true
        }
        if (y) {f[x].fly()}
        x++
    }

}

abstract class Appliance {
    var pluggedIn = true
    abstract val color: String
    abstract fun consumePower()
}

class CoffeMaker : Appliance() {
    override val color = ""
    var coffeeLeft = false

    override fun consumePower() {
        println("Consuming power")
    }

    fun fillWithWater() {
        println("Fill with water")
    }
    fun makeCoffee() {
        println("Make the coffee")
    }
}

//class X : A, B { // класс Х реализует интерфейсы А и В
//    }
//class Y : C(), A // реализует интерфейс А и наследуется от класса С

interface Flyable {
    val x: String

    fun fly() {
        println("$x is flying")
    }
}

class Bird : Flyable {
    override val x = "Bird"
}

class Plane : Flyable {
    override val x = "Plane"
}

class Superhero : Flyable {
    override val x = "Superhero"
}









