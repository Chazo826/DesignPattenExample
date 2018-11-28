package template_method

abstract class CaffeineBeverage {
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }

    abstract fun brew()
    abstract fun addCondiments()

    fun boilWater() {
        println("물 끓이는 중")
    }
    fun pourInCup() {
        println("컵에 따르는 중")
    }
}