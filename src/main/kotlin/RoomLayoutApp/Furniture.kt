package RoomLayoutApp

import javafx.scene.paint.Color
import javafx.scene.shape.Circle
import javafx.scene.shape.Rectangle
import tornadofx.*




abstract class Furniture(
        val shapeType :  ShapeType,
        val color  : Color,
        var isPlaced : Boolean = false
            )

class SquareFurniture(var length  : Double,
             var orientation: Double,
             shapeType: ShapeType,
             color: Color,
             isPlaced: Boolean) : Furniture(shapeType, color, isPlaced){

    private fun calcArea( length: Double) = length*length
    private fun calcPerim(length: Double) = 4*length
    private fun createSquare(length: Double, color: Color) = Rectangle(length, length, color)

    init{
        var area = calcArea(length)
        var perimeter = calcPerim(length)
    }
}


class RectFurniture(var width :  Double,
                    var height  : Double,
                    var orientation: Double,
                    shapeType: ShapeType,
                    color: Color,
                    isPlaced: Boolean) :
                    Furniture(shapeType, color, isPlaced){
    private fun calcArea(width: Double,height: Double) = height * width
    private fun calcPerim(width: Double,height: Double) = (2*height + 2*width)
    private fun createRectangle(height: Double,width: Double, color: Color) = Rectangle(width,height,color)

    init {
        var area = calcArea(height,width)
        var perimeter = calcPerim(width,height)
    }
}
class CircleFurniture(
        var radius : Double,
        shapeType: ShapeType,
        color: Color,
        isPlaced: Boolean
)
    : Furniture(shapeType, color, isPlaced){
    private fun calcArea(radius: Double) = Math.PI*radius*radius
    private fun calcPerim(radius: Double) = Math.PI*2*radius
    private fun createCircle(radius : Double, color: Color) = Circle(radius,color)

    init {
        var area = calcArea(radius)
        var perimeter = calcPerim(radius)
    }
}
enum class ShapeType{
        SQUARE,
        RECTANGLE,
        CIRCLE
}