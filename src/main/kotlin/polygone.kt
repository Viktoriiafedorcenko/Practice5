class polygone(var vertices: Array<Point>) {
    fun moveX(distance:Double){
        for (point in vertices){
            point.moveX(distance)
        }
}
    fun moveY(distance:Double){
        for (point in vertices){
            point.moveY(distance)
        }
    }
    fun moveXY(distanceX: Double,distanceY: Double){
        for (point in vertices){
            point.moveXY(distanceX,distanceY)
        }
    }
   open  fun printInfo(){
       println("Polygon-количество вершин :${vertices.size}")
       for (i in 0 until vertices.size){
           println("Вершины $i: (${vertices[i].x},${vertices[i].y}")

       }
   }

}