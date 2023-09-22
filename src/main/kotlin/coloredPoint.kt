class coloredPoint(x: Double,y: Double): Point( x, y   ) //наследование базового класса точка 
{
    var color :String="Black" // значение по умолчанию
        private set //установлени видимости   только для чтения  извне пр  помощи сеттера
    constructor(x:Double,y: Double,color:String):this(x,y) //конструктор для  изменения цвета цвета
    {
        this.color = color //вызов  первичного конструктора при помощи ключ слова  
    }
     fun printlInfo() {
        println(" Цвет : $color")
    }
}
