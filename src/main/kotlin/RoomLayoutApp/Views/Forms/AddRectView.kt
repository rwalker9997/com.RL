package RoomLayoutApp.Views.Forms

import tornadofx.*

class AddRectView : View(){
    override val root = form{
        fieldset {
            field{
                textfield()
            }
        }
    }
}