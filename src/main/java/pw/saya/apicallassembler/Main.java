package pw.saya.apicallassembler;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.resolution.types.ResolvedType;
import com.github.javaparser.symbolsolver.JavaSymbolSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver;

import java.io.File;

public class Main {

    private static final String FILE_PATH = "D:\\proj\\wonders\\ding_wei_jian_guan\\back\\positioning-supervision-web-panel-backend\\src\\main\\java\\com\\wonders\\possupv\\webpanel\\controller\\AttachmentController.java";

    public static void main(String[] args) throws Exception {
        CompilationUnit cu = StaticJavaParser.parse(new File(FILE_PATH));
        System.out.println(cu.toString());
    }
}
