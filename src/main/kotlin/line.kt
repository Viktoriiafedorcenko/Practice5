 open class line(x1:Double,y1:Double,x2:Double,y2:Double) {
     var startPoint:Point=Point(x1,y1) // начальная линия
     var endPoint:Point=Point(x2,y2) //  конец линии
     constructor(startPoint: Point,endPoint:Point): this (startPoint.x,startPoint.y,endPoint.x,endPoint.y)
      // конструктор принимающий обьекты класса 
     open fun printlnInfo(){
         println("Line-точка1 : (${startPoint.x},${startPoint.y}) точка 2: (${endPoint.x},${endPoint.y})")

     }
}