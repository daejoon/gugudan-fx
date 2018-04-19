package d2.view

import d2.util.createAlert
import javafx.scene.control.Alert
import javafx.scene.control.Button
import javafx.scene.layout.VBox
import tornadofx.*

class OperationView : View() {
    override val root: VBox by fxml()
    private val levelView: LevelView by inject()

    init {
        title = "덧셈, 뺄셈, 곱셈, 나눗셈 선택"

        root.lookupAll(".button").forEach { button ->
            button.setOnMouseClicked {
                val button1 = button as Button
                this.op(button1.text)
            }
        }
    }

    private fun op(x: String): Unit {
        val oper = OPER.codeToEnum(x)

        when (oper) {
            OPER.PLUS, OPER.MINUS, OPER.MULTI, OPER.DIVISION -> {
                levelView.oper = oper
                this.replaceWith<LevelView>(transition = ViewTransition.Fade(300.millis))
            }
            else -> {
                createAlert(alertType = Alert.AlertType.CONFIRMATION, title = "확인", contentText = x).show()
            }
        }
    }
}