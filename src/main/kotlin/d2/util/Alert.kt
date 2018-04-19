package d2.util

import javafx.scene.control.Alert
import javafx.scene.control.ButtonType

fun createAlert(alertType: Alert.AlertType,
                title: String = "",
                headerText: String = "",
                contentText: String = "") = Alert(alertType).apply {

    this.title = title
    this.headerText = headerText
    this.contentText = contentText
    when (alertType) {
        Alert.AlertType.CONFIRMATION -> this.buttonTypes.setAll(ButtonType.CANCEL, ButtonType.OK)
        else -> this.buttonTypes.setAll(ButtonType.OK)
    }

}