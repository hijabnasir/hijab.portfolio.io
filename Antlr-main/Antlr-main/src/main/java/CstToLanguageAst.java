import AstNodes.Language;
import grammar.languageBaseVisitor;
import grammar.languageParser;

import java.util.ArrayList;
import java.util.List;

public class CstToLanguageAst extends languageBaseVisitor<Language> {
    public List<String> semanticErrors;
    public List<String> typeErrors;
    @Override public Language visitLanguage(languageParser.LanguageContext ctx) {
       Language language = new Language();
       semanticErrors = new ArrayList<>();
       typeErrors = new ArrayList<>();

       CstToAst exprVisitor = new CstToAst(semanticErrors, typeErrors);
       for (int i = 0; i < ctx.getChild(0).getChildCount(); i++){
            if (i == ctx.getChild(0).getChildCount()){
                System.out.println("\n EOF");
            }
            else{
                language.addExpression(exprVisitor.visit(ctx.getChild(0).getChild(i)));
            }

        }

       return language;
    }
}
