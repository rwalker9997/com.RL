package RoomLayoutApp.Views

import javafx.geometry.Pos
import javafx.scene.paint.Color
import tornadofx.*

class ToolBoxView  :View(){
    override val root = vbox {
        vbox {
            label("Tools:")
            menubar() {
                menu("+") {}
                menu("-") {}
                menu("Recent Furniture:")
            }
        }
        add(rectangle(height = 100.0, width = 100.0){
            padding = insets(10.0)
            spacing = 10.0
        })
        add(rectangle(height = 100.0, width = 100.0){
            fill = Color.GREEN
            padding = insets(10.0)
            spacing = 10.0
        })
        add(rectangle(height = 100.0, width = 100.0){
            padding = insets(10.0)
            spacing = 10.0
            fill = Color.BLUE
        })
        add(circle(radius = 50.0){
            padding = insets(10.0)
            spacing = 10.0
            fill = Color.RED
        })
    }

}