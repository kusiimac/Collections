open class Color(var name:String, var symbol:String, var hexCode:String) {
    open fun colorAttributes() {
        var myColor = Color("White", "W", "#FFFFFF")
        val colorAtt = "${myColor.name} ${myColor.symbol} ${myColor.hexCode}"
        colorAtt

    }
}
class Rainbow:Color("","","") {

    override fun colorAttributes() {
        super.colorAttributes()
        val red = Color("Red", "R", "#FF0000")
        val orange = Color("Orange", "O", "#FFA500")
        val yellow = Color("Yellow", "Y", "#F#FFFF00")
        val green = Color("Green", "G", "#008000")
        val blue = Color("Blue", "B", "#0000FF")
        val indigo = Color("Indigo", "I", "#4B0082")
        val violet = Color("Violet", "V", "#7F00FF")


        println("${red.name} ${red.symbol} ${red.hexCode}")
        println("${orange.name} ${orange.symbol} ${orange.hexCode}")
        println("${yellow.name} ${yellow.symbol} ${yellow.hexCode}")
        println("${green.name} ${green.symbol} ${green.hexCode}")
        println("${blue.name} ${blue.symbol} ${blue.hexCode}")
        println("${indigo.name} ${indigo.symbol} ${indigo.hexCode}")
        println("${violet.name} ${violet.symbol} ${violet.hexCode}")
    }

}
fun main() {
    val output = Rainbow()
    output.colorAttributes()
}