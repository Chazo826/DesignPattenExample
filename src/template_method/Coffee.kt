package template_method

class Coffee: CaffeineBeverage(){
    override fun prepareRecipe(){
        boilWater()
        brewCoffeeGrinds()
        pourInCup()
        addSugarAndMilk()
    }

    fun brewCoffeeGrinds(){
        println("필터를 통해서 커피를 우려내는 중")
    }

    fun addSugarAndMilk() {
        println("설탕과 우유를 추가하는 중")
    }
}