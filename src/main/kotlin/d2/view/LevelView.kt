package d2.view

import d2.util.createAlert
import javafx.fxml.FXML
import javafx.scene.control.Alert
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import tornadofx.*

class LevelView : View() {
    override val root : VBox by fxml()
    @FXML lateinit var lbTitle: Label
    @FXML lateinit var btnPrev: Button
    lateinit var oper: OPER

    init {
        title = ""
        btnPrev.setOnMouseClicked {
            this.replaceWith<OperationView>(transition = ViewTransition.Fade(300.millis))
        }
    }

    override fun onDock() {
        createAlert(alertType = Alert.AlertType.INFORMATION, contentText = oper.code).show()
        super.onDock()
    }
}