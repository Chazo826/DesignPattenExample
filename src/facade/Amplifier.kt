package facade

class Amplifier {
    lateinit var tuner: Tuner
    lateinit var dvdPlayer: Player
    lateinit var cdPlayer: Player

    fun on(){}
    fun off(){}
    fun setSurroundSound(){}
    fun setVolume(volume: Int){}

}