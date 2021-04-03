package comp5111.assignment.cut;
import java.util.*;

public class Counter {
    private static int numStaticInvocations = 0;
    private static int numInstanceInvocations = 0;

    private static int numTest = 0;
    private static int numTestFailed = 0;

    private static int[] passedLineArray = new int[1930];
    private static int[] failedLineArray = new int[1930];
    private static int[] lineNumberWorkArray = new int[1930];

    private static List<String> methodSignatureList = new ArrayList<>();
    private static List<String> statementList = new ArrayList<>();

    public static double[] scoreArray = new double[1930];
    public static double[] rankArray = new double[1930];

    public static boolean ifTestFailed = false;

    public static void addStaticInvocation(int n) {
        numStaticInvocations += n;
    }

    public static void addInstanceInvocation(int n) {
        numInstanceInvocations += n;
    }


    public static int getNumInstanceInvocations() {
        return numInstanceInvocations;
    }

    public static int getNumStaticInvocations() {
        return numStaticInvocations;
    }


    public static void addNumTest(int n) {
        numTest += n;
    }

    public static void addNumTestFailed(int n) {
        numTestFailed += n;
    }

    public static int getNumTest() {
        return numTest;
    }

    public static int getNumTestFailed() {
        return numTestFailed;
    }

    public static void addToLineNumberWorkArray(int i) {
        if(i > 0) {
            lineNumberWorkArray[i] = 1; // mark as executed line i
        }
    }

    public static void addToLineArraysPassed(){
        for(int i=0; i<lineNumberWorkArray.length; i++){
            if(lineNumberWorkArray[i] == 1){
                passedLineArray[i] += 1;
                lineNumberWorkArray[i] = 0;
            }
        }
    }

    public static void addToLineArraysFailed(){
        for(int i=0; i<lineNumberWorkArray.length; i++){
            if(lineNumberWorkArray[i] == 1){
                failedLineArray[i] += 1; lineNumberWorkArray[i] = 0;
            }
        }
    }

    public static int[] getPassedLineArray(){
        return passedLineArray;
    }

    public static int[] getFailedLineArray(){
        return failedLineArray;
    }

    public static void addMethodSignature(String item){
        methodSignatureList.add(item);
    }

    public static void addStatement(String item){
        statementList.add(item);
    }

    public static List<String> getMethodSignatureList(){
        return methodSignatureList;
    }

    public static List<String> getStatementList(){
        return statementList;
    }

    public static void chnageIfTestFailed(boolean flag){
        ifTestFailed = flag;
    }

}
