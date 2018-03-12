package d2.view

import java.io.FileReader

enum class OPER(val code: String) {
    PLUS("+"),
    MINUS("-"),
    MULTI("x"),
    DIVISION("÷"),
    NA("");

    companion object {
        fun codeToEnum(code: String): OPER {
            var filterList = OPER.values().filter { it.code == code }

            return if (filterList.size == 1) {
                filterList[0]
            } else {
                OPER.NA
            }
        }
    }
}