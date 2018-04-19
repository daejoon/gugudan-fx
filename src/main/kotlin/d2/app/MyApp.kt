package d2.app

import d2.view.MainView
import javafx.stage.Stage
import tornadofx.*

class MyApp : App() {
    override val primaryView = MainView::class

    override fun start(stage: Stage) {
        stage.isResizable = false

        super.start(stage)
    }
}