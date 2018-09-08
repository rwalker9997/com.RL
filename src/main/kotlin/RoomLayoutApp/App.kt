package RoomLayoutApp

import tornadofx.*
import RoomLayoutApp.Views.MainView

class RoomLayoutApp :App(MainView::class)

fun main(args: Array<String>) {
    launch<RoomLayoutApp>(args)
}
