package facade

fun main(args: Array<String>) {

}

fun afterFacade(){
    val homeTheaterFacade: HomeTheaterFacade = HomeTheaterFacade(Amplifier(), Tuner(), DvdPlayer(), CdPlayer(), Projector(), Screen(), TheaterLights(), PopcornPopper())
    homeTheaterFacade.watchMovie("haha")
    homeTheaterFacade.endMovie()
}

fun beforeFacade(){
    val amp = Amplifier()
    val dvd =  DvdPlayer()
    val projector = Projector()
    val screen = Screen()
    val lights = TheaterLights()
    val popper = PopcornPopper()
    val movie = "해리포터"
    println("Get ready to watch a movie ...")
    popper.on()
    popper.pop()
    lights.dim(10)
    screen.down()
    projector.on()
    projector.wideScreenMode()
    amp.on()
    amp.dvdPlayer = dvd
    amp.setSurroundSound()
    amp.setVolume(5)
    dvd.on()
    dvd.play(movie)


}