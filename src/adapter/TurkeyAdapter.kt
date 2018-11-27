package adapter

class TurkeyAdapter(val turkey: Turkey): Duck {
    override fun fly() {
        for(i in 0..5) {
            turkey.fly()
        }
    }

    override fun quack() {
        turkey.gobble()
    }

}