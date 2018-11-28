package facade

class HomeTheaterFacade(
    val amp: Amplifier,
    val tuner: Tuner,
    val dvd: DvdPlayer,
    val CdPlayer: CdPlayer,
    val projector: Projector,
    val screen: Screen,
    val lights: TheaterLights,
    val popper: PopcornPopper
) {
    fun watchMovie(movie: String) {
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

    fun endMovie() {
        println("Shutting movie theater down ... ")
        popper.off()
        lights.on()
        screen.up()
        projector.off()
        amp.off()
        dvd.stop()
        dvd.eject()
        dvd.off()
    }
}