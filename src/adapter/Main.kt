package adapter

fun main(args: Array<String>) {
    val duck: MallardDuck = MallardDuck()
    val turkey: WildTurkey = WildTurkey()
    val turkeyAdapter: Duck = TurkeyAdapter(turkey)

    println("The Turkey says...")
    turkey.gobble()
    turkey.fly()

    println("The Duck says...")
    testDuck(duck)

    println("The TurkeyAdapter says")
    testDuck(turkeyAdapter)
}

fun testDuck(duck: Duck) {
    duck.quack()
    duck.fly()
}