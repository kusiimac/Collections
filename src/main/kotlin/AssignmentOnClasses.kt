open class Color(var name:String = "", var symbol:String = "", var hexCode:String = "") {

    open fun colorAttributes(): String {
        return "$name $symbol $hexCode"
    }
}
class Rainbow:Color() {
    override fun colorAttributes():String {
        super.colorAttributes()

        val red = Color("Red", "R", "#FF0000")
        val orange = Color("Orange", "O", "#FFA500")
        val yellow = Color("Yellow", "Y", "#F#FFFF00")
        val green = Color("Green", "G", "#008000")
        val blue = Color("Blue", "B", "#0000FF")
        val indigo = Color("Indigo", "I", "#4B0082")
        val violet = Color("Violet", "V", "#7F00FF")

        return "${red.name} ${orange.name} ${yellow.name} ${green.name} ${blue.name} ${indigo.name} ${violet.name}"
    }
}
fun main() {
    val x = Rainbow()
    val output = x.colorAttributes()
    println(output)

}