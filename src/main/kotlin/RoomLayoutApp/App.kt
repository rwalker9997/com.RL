package RoomLayoutApp

import tornadofx.*
import RoomLayoutApp.Workspaces.*
import RoomLayoutApp.Views.*
import javafx.application.Application.launch
import javafx.scene.Scene

class RoomLayoutApp :App(MainWorkspace::class){
    override fun onBeforeShow(view: UIComponent) {
        workspace.dock<MainView>()
    }
    override fun createPrimaryScene(view: UIComponent) = Scene(view.root, 1700.0,1000.0)

}

fun main(args: Array<String>) {
    launch<RoomLayoutApp>(args)

}
