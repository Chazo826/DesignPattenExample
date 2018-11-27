package factory

abstract class Pizza(private val name: String, private val dough: String, private val sauce: String) {

    fun prepare() {
        println("Preparing $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding topping...")
        println("Adding sauce...")

    }

    fun bake() {
        println("Bake for 25 minutes at 350")
    }

}