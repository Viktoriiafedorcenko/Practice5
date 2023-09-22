class coloredLine(startPoint: Point,endPoint: Point,var color :String): line(startPoint,endPoint) {
    override fun printlnInfo() //переопределение функции
    {
        super.printlnInf()     //Обращение к реализации из базового классa
        println("Цвет : $color")
    }
}
