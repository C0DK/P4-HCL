package exceptions

/**
 * Class used to log uninitialized errors.
 * @param nameOfVar The name of the variable that is uninitialized
 */
class UninitializedError(lineNumber: Int, lineIndex: Int, lineText: String, private val nameOfVar: String)
                        : ParserException(lineNumber, lineIndex, lineText) {
    override val errorMessage = "Use of uninitialized variable '$nameOfVar' found."
    override val helpText = "Try initializing variable before use."
}
