package comp5111.assignment.cut;
import java.util.*;

public class Counter {
    private static int numStaticInvocations = 0;
    private static int numInstanceInvocations = 0;

    private static int numTestPassed = 0;
    private static int numTestFailed = 0;

    private static int[] passedLineArray = new int[1930];
    private static int[] failedLineArray = new int[1930];
    private static int[] lineNumberWorkArray = new int[1930];
    // private static List<Integer> lineNumberWorkArray = new ArrayList<>();

    // private static List<String> methodSignatureList = new ArrayList<>();
    private static String[] methodSignatureArray = new String[1930];
    // private static List<String> statementList = new ArrayList<>();
    private static String[] statementArray = new String[1930];

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


    public static void addNumTestPassed(int n) {
        numTestPassed += n;
    }

    public static void addNumTestFailed(int n) {
        numTestFailed += n;
    }

    public static int getNumTestPassed() {
        return numTestPassed;
    }

    public static int getNumTestFailed() {
        return numTestFailed;
    }

    public static void addToLineNumberWorkArray(int lineNumber) {
        if(lineNumber > 0) {
            lineNumberWorkArray[lineNumber] = 1; // mark as executed line i
            // lineNumberWorkArray.add(lineNumber);
        }
    }

    public static void addToLineArraysPassed(){
        for(int i=0; i<lineNumberWorkArray.length; i++){
            if(lineNumberWorkArray[i] == 1){
                passedLineArray[i] += 1;
                lineNumberWorkArray[i] = 0;
            }
        }
        // for(Integer l : lineNumberWorkArray){
        //     passedLineArray[l] += 1;
        // }
        // lineNumberWorkArray.clear();
    }

    public static void addToLineArraysFailed(){
        for(int i=0; i<lineNumberWorkArray.length; i++){
            if(lineNumberWorkArray[i] == 1){
                failedLineArray[i] += 1; lineNumberWorkArray[i] = 0;
            }
        }
        // for(Integer l : lineNumberWorkArray){
        //     failedLineArray[l] += 1;
        // }
        // lineNumberWorkArray.clear();
    }

    public static int[] getPassedLineArray(){
        return passedLineArray;
    }

    public static int[] getFailedLineArray(){
        return failedLineArray;
    }

    // public static void addMethodSignature(String item){
    //     methodSignatureList.add(item);
    // }
    public static void addMethodSignature(int lineNumber, String methodSignature){
        methodSignatureArray[lineNumber] = methodSignature;
    }

    // public static void addStatement(String item){
    //     statementList.add(item);
    // }

    public static void addStatement(int lineNumber, String stmtStr){
        statementArray[lineNumber] = stmtStr;
    }

    // public static List<String> getMethodSignatureList(){
    public static String[] getMethodSignatureList(){
        // return methodSignatureList;
        return methodSignatureArray;
    }

    // public static List<String> getStatementList(){
    public static String[] getStatementList(){
        // return statementList;
        return statementArray;
    }

    public static void changeIfTestFailed(boolean flag){
        ifTestFailed = flag;
    }

}
