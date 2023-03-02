import grammar.languageLexer;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UnitTestLexer {
    ANTLRErrorListener errorListener = new ANTLRErrorListener() {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
            System.err.format("Syntax Error at line " + i + " " + s + " " + o);
        }

        @Override
        public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
            System.err.format("Amiguity: " + dfa.toLexerString() + " " + parser.getCurrentToken().getText());
        }

        @Override
        public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) { }

        @Override
        public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) { }
    };

    private List<Token> getTokensFromText(String txt){
        try {
            CharStream cs = fromFileName(txt);
            languageLexer lexer = new languageLexer(cs);
            lexer.addErrorListener(errorListener);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            tokenStream.fill();
            return tokenStream.getTokens();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        return null;
    }

    @Test
    public void testLexer(){
        List<Token> tokens = getTokensFromText("eofTest.txt");
        assert tokens != null;
        Assertions.assertTrue(tokens.stream().anyMatch(p -> p.getType() == languageLexer.EOF));
    }

    @Test
    public void testTokenSize(){
        List<Token> tokens = getTokensFromText("sizeTest.txt");
        assert tokens != null;
        Assertions.assertEquals(21, tokens.size());
    }

    @Test
    public void testCorrectToken(){
        List<Token> tokens = getTokensFromText("sizeTest.txt");
        assert tokens != null;
        Assertions.assertEquals(languageLexer.TYPE, tokens.get(0).getType());
        Assertions.assertEquals(languageLexer.ID, tokens.get(2).getType());
        Assertions.assertEquals(languageLexer.INT, tokens.get(6).getType());
    }
}

