package RoomLayoutApp.Views.Forms

import tornadofx.*

class AddCircleView  :View(){
    override val root = form{
        fieldset{
            field{
                textfield()
            }
        }
    }
}