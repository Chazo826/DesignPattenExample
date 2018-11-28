package template_method

abstract class CaffeineBeverage {
    abstract fun prepareRecipe()
    fun boilWater() {
        println("물 끓이는 중")
    }
    fun pourInCup() {
        println("컵에 따르는 중")
    }
}