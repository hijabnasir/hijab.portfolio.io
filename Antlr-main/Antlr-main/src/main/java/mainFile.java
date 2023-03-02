import AstNodes.Language;
import grammar.Interpreter;
import grammar.languageLexer;
import grammar.languageParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class mainFile {
    public static void main(String[] args) {
        try {
            String source = "test.txt"; //test dokument 
            CharStream cs = fromFileName(source); //finder alle vores tegn 
            languageLexer lexer = new languageLexer(cs); //bruger char regle for at se hvilken lexer regler i text.fil like forever snd print
            CommonTokenStream token = new CommonTokenStream(lexer); //kigger på tokens i text.file like print, +
            languageParser parser = new languageParser(token); //parser det sammen 
            ParseTree tree = parser.language(); //laver parsetree efter 

            CstToLanguageAst visitor = new CstToLanguageAst(); //visit our langauge in CstToLanguage
            Language lang = visitor.visit(tree); //calling result from CstToLanguage 

            JFrame frame = new JFrame("Antlr AST");
            JPanel panel = new JPanel();
            TreeViewer viewer = new TreeViewer(Arrays.asList(
                    parser.getRuleNames()), tree);
            viewer.setScale(1.5); // Scale a little


            if (visitor.semanticErrors.isEmpty() && visitor.typeErrors.isEmpty()) {
                panel.add(viewer);
                frame.add(panel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                Interpreter ep = new Interpreter(lang.astNodes);
                System.out.println(ep.getEvaluationResults());
                for (String evaluation : ep.getEvaluationResults()) {
                    System.out.println(evaluation);
                }
            } else {
                for (String err : visitor.semanticErrors) {
                    System.out.println(err);
                }
                for (String err : visitor.typeErrors) {
                    System.out.println(err);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
