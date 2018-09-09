package RoomLayoutApp.Views

import javafx.geometry.Orientation
import tornadofx.*

class MainView  : View(){
    override val root = hbox{
        add(find<ToolBoxView>())
        separator(orientation = Orientation.VERTICAL)
        add(find<RoomView>())
    }
}