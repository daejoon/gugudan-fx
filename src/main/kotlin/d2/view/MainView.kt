package d2.view

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.layout.VBox
import tornadofx.*

class MainView : View() {
    override val root: VBox by fxml()
    @FXML
    lateinit var btnStart: Button

    init {
        title = "구구단"

        btnStart.setOnMouseClicked {
            println("click!!")
            this.replaceWith<OperationView>(transition = ViewTransition.Fade(300.millis))
        }
    }
}