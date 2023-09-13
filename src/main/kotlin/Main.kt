fun main(args: Array<String>) {
 val point1=Point(2.3,4.7)
    val coloredPoint1=coloredPoint(6.0,6.9,"White")
    point1.moveX(5.0) //точка двигается по оси ох на 5.0
   coloredPoint1.moveY(8.0) //точка двигвется по оси ох на 8.0
    point1.prinlnInfo()
    coloredPoint1.prinlnInfo()
    val line1=line(Point(2.3,4.7),Point(6.0,6.9))
val coloredLine1=coloredLine(Point(5.0,8.0),Point(3.0,4.0),"Yellow")
    line1.printlnInfo()
    coloredLine1.printlnInfo()
    val polygon1=polygone(arrayOf (Point(2.3,4.7),Point(6.0,6.9),Point(5.0,8.0)))
    polygon1.moveXY(2.3,4.7)
polygon1.printInfo()

  }
