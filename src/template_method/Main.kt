package template_method

fun main(args: Array<String>) {
    val coffee: CaffeineBeverage = Coffee()
    val tea: CaffeineBeverage = Tea()

    coffee.prepareRecipe()
    tea.prepareRecipe()
}