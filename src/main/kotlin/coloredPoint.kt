class coloredPoint(x: Double,y: Double): Point( x, y   ) {
    var color :String="Black" // значение по умолчанию
        private set //установлени видимости   только для чтения  извне
    constructor(x:Double,y: Double,color:String):this(x,y) //конструктор для  изменения цвета цвета
    {
        this.color = color
    }
     fun printlInfo() {
        println(" Цвет : $color")
    }
}