package parser

import lexer.ILexer
import lexer.Token

/**
 * Parser for testing purposes
 */
class ParserWithoutBuiltins(l: ILexer) : Parser(l) {
    override fun generateAbstractSyntaxTree() = AbstractSyntaxTree().apply {
        // Parse

        while (hasNext()) {
            if (current.token != Token.SpecialChar.EndOfLine) {
                children.add(parseCommand())
            }
        }
    }
}
