package facade

interface Player {
    fun on()
    fun off()
    fun eject()
    fun pause()
    fun play(movie: String)
    fun stop()
}