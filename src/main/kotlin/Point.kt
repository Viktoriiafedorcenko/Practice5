open class Point( var x:Double, var y:Double) // базовы класс
{
    // свойства
    open fun moveX(distance:Double)//перемещение по оси х
    {
        x+=distance
    }
open fun moveY(distance: Double){
    y+=distance
}
    open fun moveXY(distanceX: Double,distanceY: Double)//по двум осям
    {
        x+=distanceX
        y+=distanceY
    }

    //метод для вывода  инфы об точке
    fun prinlnInfo() {
        println(" Координаты : ($x,$y)")

    }}