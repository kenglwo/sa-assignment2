package comp5111.assignment.cut;

import soot.*;
import soot.jimple.*;
import soot.util.Chain;

import java.util.Iterator;
import java.util.Map;

public class Instrumenter extends BodyTransformer {

    /* some internal fields */
    static SootClass counterClass;
    static SootMethod addNumTest, addNumTestFailed, addToLineNumberWorkArray, addMethodSignature, addStatement;

    static {
        counterClass = Scene.v().loadClassAndSupport("comp5111.assignment.cut.Counter");
        addNumTest = counterClass.getMethod("void addNumTest(int)");
        addNumTestFailed = counterClass.getMethod("void addNumTestFailed(int)");
        addToLineNumberWorkArray = counterClass.getMethod("void addToLineNumberWorkArray(int)");
        // addMethodSignature = counterClass.getMethod("void addMethodSignature(string)");
        addMethodSignature = counterClass.getMethodByName("addMethodSignature");
        // addStatement = counterClass.getMethod("void addStatement(string)");
        addStatement = counterClass.getMethodByName("addStatement");
    }
     /* instructions before method returns
     */
    @Override
    protected void internalTransform(Body body, String phase, Map options) {
        // body's method
        SootMethod method = body.getMethod();
        // we dont instrument constructor (<init>) and static initializer (<clinit>)
        if (method.isConstructor() || method.isStaticInitializer()) {
            return;
        }

        // debugging
        String methodSignature = method.getSignature();
        System.out.println("instrumenting method: " + method.getSignature());

        // get body's unit as a chain
        Chain<Unit> units = body.getUnits();

        // get a snapshot iterator of the unit since we are going to
        // mutate the chain when iterating over it.
        //
        Iterator<?> stmtIt = units.snapshotIterator();

        // typical while loop for iterating over each statement
        while (stmtIt.hasNext()) {

        //     // cast back to a statement.
            Stmt stmt = (Stmt) stmtIt.next();
            int lineNumber = stmt.getJavaSourceStartLineNumber();
            String stmtStr = String.valueOf(stmt);
            // System.out.println(stmtStr);

            if (stmt instanceof Stmt && lineNumber != -1) {

                InvokeExpr invoke1 = null;
                invoke1 = Jimple.v().newStaticInvokeExpr(addMethodSignature.makeRef(), StringConstant.v(methodSignature));
                Stmt methodStmt = Jimple.v().newInvokeStmt(invoke1);
                units.insertBefore(methodStmt, stmt);

                InvokeExpr invoke2 = null;
                invoke2 = Jimple.v().newStaticInvokeExpr(addStatement.makeRef(), StringConstant.v(stmtStr));
                Stmt statementStmt = Jimple.v().newInvokeStmt(invoke2);
                units.insertBefore(statementStmt, stmt);

                InvokeExpr incExpr = null;
                incExpr = Jimple.v().newStaticInvokeExpr(addToLineNumberWorkArray.makeRef(), IntConstant.v(lineNumber));
                Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);
                units.insertBefore(incStmt, stmt);

            }
        }
    }
}
