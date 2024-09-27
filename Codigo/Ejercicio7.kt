open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false, var isFolded: Boolean = true) : Phone(isScreenLightOn) {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        } else {
            println("Can't switch on the screen. The phone is folded.")
        }
    }

    override fun switchOff() {
        super.switchOff()
    }

    fun fold() {
        isFolded = true
        println("The phone is now folded.")
    }

    fun unfold() {
        isFolded = false
        println("The phone is now unfolded.")
    }
}

fun main() {
    val myFoldablePhone = FoldablePhone()

    myFoldablePhone.switchOn()
    myFoldablePhone.checkPhoneScreenLight()

    myFoldablePhone.unfold()
    myFoldablePhone.switchOn()
    myFoldablePhone.checkPhoneScreenLight()
}