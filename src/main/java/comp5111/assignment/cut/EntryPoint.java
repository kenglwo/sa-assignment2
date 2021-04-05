// package castle.comp5111.example;
package comp5111.assignment.cut;
// package comp5111.assignment.cut.Instrumenter;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

import java.lang.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.runner.JUnitCore;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import soot.Pack;
import soot.PackManager;
import soot.Scene;
import soot.Transform;
import soot.options.Options;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class EntryPoint {
		public static float linenumber = 0;
    public static void main(String[] args, int testIndex) {

				instrumentWithSoot(args);

        // TODO: after instrument, we run Junit tests
        // runJunitTests();
        runJunitTests(testIndex);

        // after junit test running, we have already get the counting in the Counter class
        System.out.println("numTestPassed: " + Counter.getNumTestPassed());
				System.out.println("numTestFailed: " + Counter.getNumTestFailed());

        // System.out.println(Arrays.toString(Counter.getMethodSignatureList()));
        // System.out.println(Arrays.toString(Counter.getStatementList()));

        List<String> methodSignatureList = new ArrayList<>();
        List<String> statementList = new ArrayList<>();
        // System.out.println(Arrays.toString(methodSignatureList.toArray()));
        // System.out.println(Arrays.toString(statementList.toArray()));

        int[] passed = Counter.getPassedLineArray();
        int[] failed = Counter.getFailedLineArray();
        // System.out.println(Arrays.toString(passed));
        // System.out.println("########################");
        // System.out.println(Arrays.toString(failed));

        for(int i=0; i<passed.length; i++){ // index=line number, valule=number of tests
          if(passed[i] > 0 || failed[i] > 0){
            double score = failed[i] / Math.sqrt(Counter.getNumTestFailed() * (failed[i] + passed[i]));
            BigDecimal bd = new BigDecimal(String.valueOf(score));
            BigDecimal bd1 = bd.setScale(2, RoundingMode.HALF_UP);
            score = bd1.doubleValue();
            Counter.scoreArray[i] = score;
          } else {
            Counter.scoreArray[i] = 0;
          }
        }

        // System.out.println("Counter.scoreArray");
        // System.out.println(Arrays.toString(Counter.scoreArray));

        ArrayList<Integer> ranks = new ArrayList<Integer>();
        List<Integer> scoreOfLineNumber = new ArrayList<Integer>();
        List<Double> scoreValues = new ArrayList<Double>();
        List<Double> sortedScoreValues = new ArrayList<Double>();

        for(int i=0; i<Counter.scoreArray.length; i++){ // i=line number
          if(Counter.scoreArray[i] > 0){
            scoreOfLineNumber.add(i);
            scoreValues.add(Counter.scoreArray[i]);
            // methodSignatureList.add(Counter.getMethodSignatureList().get(i));
            methodSignatureList.add(Counter.getMethodSignatureList()[i]);
            // statementList.add(Counter.getStatementList().get(i));
            statementList.add(Counter.getStatementList()[i]);
          }
        }
        // System.out.println("methodSignatureList");
        // System.out.println(Arrays.toString(methodSignatureList.toArray()));
        // System.out.println("statementList");
        // System.out.println(Arrays.toString(statementList.toArray()));


        // sortedScoreValues = scoreValues.clone();
        sortedScoreValues = new ArrayList<Double>(scoreValues);
        Collections.sort(sortedScoreValues);
        // System.out.println(Arrays.toString(sortedScoreValues.toArray()));

        // System.out.println("score values");
        // System.out.println(Arrays.toString(scoreValues.toArray()));
        // System.out.println("sorted score values");
        // System.out.println(Arrays.toString(sortedScoreValues.toArray()));
        
        for(int i=0; i < scoreValues.size(); i++){
          double score = scoreValues.get(i);
          int s = 0;
          int n = 0;
          for (int j=0; j < sortedScoreValues.size(); j++){
            if(score > sortedScoreValues.get(j)){
              //
            } else if(score == sortedScoreValues.get(j)){
              s += 1;
            } else {
              n = sortedScoreValues.size() - j;
              break;
            }
          }
          int m = n + s;
          double temp = ( n+m+1 ) / 2;
          int rank = (int)Math.floor(temp);
          ranks.add(rank);
        }

        // // System.out.println("methodSignatureList");
        // // System.out.println(Arrays.toString(methodSignatureList.toArray()));
        // // System.out.println("statementList");
        // // System.out.println(Arrays.toString(statementList.toArray()));
        // System.out.println("score values");
        // System.out.println(Arrays.toString(scoreValues.toArray()));
        // System.out.println("ranks");
        // System.out.println(Arrays.toString(ranks.toArray()));



        // // get the index array of ranks
        ArrayList<Integer> sortedRanks = (ArrayList<Integer>) ranks.clone();
        Collections.sort(sortedRanks);
        List<Integer> indexList = new ArrayList<Integer>();

        List<String> indexListStr = new ArrayList<>();
        for(int i=0; i<ranks.size(); i++){
          int rank = ranks.get(i);
          String value = rank + ":" + i;
          indexListStr.add(value);
        }

        Collections.sort(indexListStr, new java.util.Comparator<String>(){
          @Override
          public int compare(String s1, String s2){
            int i1 = Integer.parseInt(s1.split(":")[0]);
            int i2 = Integer.parseInt(s2.split(":")[0]);
            return i1 - i2;
          }
        });


        for(int i=0; i<indexListStr.size(); i++){
          String value = indexListStr.get(i);
          int index = Integer.parseInt(value.split(":")[1]);
          indexList.add(index);
        }

        // System.out.println(Arrays.toString(ranks.toArray()));
        // System.out.println(Arrays.toString(indexListStr.toArray()));
        // System.out.println(Arrays.toString(indexList.toArray()));


        String output = "";
        for(int i=0; i<indexList.size(); i++){
          int index = indexList.get(i);
          String out = "";
          out += methodSignatureList.get(index) + "\t";
          out += statementList.get(index) + "\t";
          out += scoreValues.get(index) + "\t";
          out += ranks.get(index) + "\t";
          out += scoreOfLineNumber.get(index) + "\t";
          out += "\n";
          output += out;
          // System.out.println(out);
          }

        System.out.println(output);
        String fileName = "";
        switch(testIndex){
          case 0:
            fileName = "spectrum_fl_ochiai_randoop0.tsv";
            break;
          case 1:
            fileName = "spectrum_fl_ochiai_randoop1.tsv";
            break;
          case 2:
            fileName = "spectrum_fl_ochiai_randoop2.tsv";
            break;
          case 3:
            fileName = "spectrum_fl_ochiai_evosuite0.tsv";
            break;
          case 4:
            fileName = "spectrum_fl_ochiai_evosuite1.tsv";
            break;
          case 5:
            fileName = "spectrum_fl_ochiai_evosuite2.tsv";
            break;
        }
        try {
          FileWriter fw = new FileWriter(fileName);
          fw.write(output);
          fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void instrumentWithSoot(String[] classNames) {
    // private static void instrumentWithSoot(String className) {
        // the path to the compiled Subject class file
        String classUnderTestPath = "./raw-classes";
        String targetPath = "./target/classes";

        // String targetPathTest = "./target/classes/randoop0";
        // String targetPathTest = "./target/classes/randoop0:./target/classes/randoop1:./target/classes/randoop2:./target/classes/randoop3:./target/classes/randoop4";
        String targetPathTest = ".\\src\\test\\fault-revealing-randoop0;.\\src\\test\\fault-revealing-randoop1;.\\src\\test\\fault-revealing-randoop2;.\\src\\test\\fault-revealing-evosuite0;.\\src\\test\\fault-revealing-evosuite1;.\\src\\test\\fault-revealing-evosuite2;";

        String classPathSeparator = ":";
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            classPathSeparator = ";";
        }

        /*Set the soot-classpath to include the helper class and class to analyze*/
        Options.v().set_soot_classpath(Scene.v().defaultClassPath() + classPathSeparator + targetPath + classPathSeparator + classUnderTestPath);
        // Options.v().set_soot_classpath(Scene.v().defaultClassPath() + classPathSeparator + targetPath + classPathSeparator + classUnderTestPath + classPathSeparator + targetPathTest);

        // we set the soot output dir to target/classes so that the instrumented class can override the class file
        Options.v().set_output_dir(targetPath);

        // retain line numbers
        Options.v().set_keep_line_number(true);
        // retain the original variable names
        Options.v().setPhaseOption("jb", "use-original-names:true");

        /* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");

        Instrumenter instrumenter = new Instrumenter();
        jtp.add(new Transform("jtp.instrumenter", instrumenter));

        // pass arguments to soot
        soot.Main.main(classNames);

    }

    private static void runJunitTests(int testIndex) {
      String testArray[] = {"comp5111.assignment.cut.Regression_15_Test0", "comp5111.assignment.cut.Regression_4_Test0","comp5111.assignment.cut.Regression_1_Test0", "comp5111.assignment.cut.ToolBox_FaultRevealing0_ESTest", "comp5111.assignment.cut.ToolBox_FaultRevealing1_ESTest", "comp5111.assignment.cut.ToolBox_FaultRevealing2_ESTest"};
      // String testArray[] = {"comp5111.assignment.cut.Regression_15_Test", "comp5111.assignment.cut.Regression_4_Test","comp5111.assignment.cut.Regression_1_Test", "comp5111.assignment.cut.ToolBox_FaultRevealing0_ESTest", "comp5111.assignment.cut.ToolBox_FaultRevealing1_ESTest", "comp5111.assignment.cut.ToolBox_FaultRevealing2_ESTest"};
      // for (int i=0; i < testArray.length; i++){
        Class<?> testClass = null;
        try {
            // here we programmitically run junit tests
            // testClass = Class.forName(testArray[i]);
            testClass = Class.forName(testArray[testIndex]);
            // testClass = Class.forName("comp5111.assignment.cut.RegressionTest");
            JUnitCore junit = new JUnitCore();

            junit.addListener(new RunListener() {
              public void testAssumptionFailure(Failure failure) {
              }

              public void testFailure(Failure failure) {
                // Counter.addNumTestFailed(1);
                // Counter.addToLineArraysFailed();
                // set flag
                Counter.changeIfTestFailed(true);
              }

              public void testFinished(Description description) {
                // check flag
                if (Counter.ifTestFailed == true){
                  Counter.addNumTestFailed(1);
                  Counter.addToLineArraysFailed();
                } else {
                  Counter.addNumTestPassed(1);
                  Counter.addToLineArraysPassed();
                  // System.out.println(description.getAnnotations());
                }
                Counter.changeIfTestFailed(false);
              }

              public void testIgnored(Description description) {
              }

              public void testRunFinished(Result result) {
              }

              public void testRunStarted(Description description) {
              }

              public void testStarted(Description description) {
              }

            });

            System.out.println("Running junit test: " + testClass.getName());
            junit.run(testClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
      // }
    }
}
