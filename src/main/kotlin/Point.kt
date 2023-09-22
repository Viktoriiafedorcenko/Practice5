open class Point( var x:Double, var y:Double) // открыли  базовы класс с параметрами 
{
    // свойства
    open fun moveX(distance:Double)//перемещение по оси х
    {
        x+=distance //увеличили значение 
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
