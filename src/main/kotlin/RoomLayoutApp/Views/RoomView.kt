package RoomLayoutApp.Views
import javafx.scene.Parent
import javafx.scene.layout.Priority
import tornadofx.*

class RoomView : View() {
    override val root = vbox {
        label("Room:")
        menubar() {

        }
        anchorpane() {
           pane {


            }
        }
        vboxConstraints {
            vGrow = Priority.ALWAYS
        }
    }
}