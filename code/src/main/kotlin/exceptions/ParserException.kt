package exceptions

class ParserException(errorMessage: String,
                      lineNumber: Int,
                      lineIndex: Int,
                      lineText: String): CompilationException(errorMessage, lineNumber, lineIndex, lineText)
