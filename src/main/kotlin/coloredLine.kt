class coloredLine(startPoint: Point,endPoint: Point,var color :String): line(startPoint,endPoint) {
    override fun printlnInfo() {
        super.printlnInfo()
        println("Цвет : $color")
    }
}