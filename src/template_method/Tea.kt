package template_method

class Tea: CaffeineBeverage() {
    override fun brew() {
        steepTeaBag()
    }

    override fun addCondiments() {
        addLemon()
    }

    fun steepTeaBag(){
        println("차를 우려내는 중")
    }

    fun addLemon() {
        println("레몬을 추가하는 중")
    }
}