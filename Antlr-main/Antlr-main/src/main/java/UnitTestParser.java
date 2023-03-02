import grammar.languageLexer;
import grammar.languageParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.BitSet;
import java.util.List;

import static org.junit.Assert.fail;

public class UnitTestParser {
    BaseErrorListener NoErrorListener = new BaseErrorListener() {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
            fail();
        }

        @Override
        public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
            fail();
        }

        @Override
        public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {
        }

        @Override
        public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
        }
    };

    private languageParser CreateParser(List<TestToken> tokens) {
        ListTokenSource ts = new ListTokenSource(tokens);
        CommonTokenStream c = new CommonTokenStream(ts);
        languageParser parser = new languageParser(c);
        parser.addErrorListener(NoErrorListener);
        return parser;
    }

    @Test
    public void testPrint() {
        TestToken[] array = {new TestToken("print", languageLexer.PRINT), new TestToken("(", languageLexer.LPAR), new TestToken("hello", languageLexer.TXT), new TestToken(")", languageLexer.RPAR)};
        languageParser parser = CreateParser(List.of(array));
        Assertions.assertEquals("print(hello)", parser.print().getText());
    }

    @Test
    public void testForever() {
        TestToken[] array = {new TestToken("forever", languageLexer.FOREVER), new TestToken("{", languageLexer.LCBRAC), new TestToken("print", languageLexer.PRINT), new TestToken("(", languageLexer.LPAR), new TestToken("hello", languageLexer.TXT), new TestToken(")", languageLexer.RPAR), new TestToken("}", languageLexer.RCBRAC)};
        languageParser parser = CreateParser(List.of(array));
        Assertions.assertEquals("forever{print(hello)}", parser.forever_loop().getText());
    }


}