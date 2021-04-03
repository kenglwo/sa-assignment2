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
        int numTest = Counter.getNumTest();
        int numTestFailed = Counter.getNumTestFailed();
        System.out.println("numTest: " + numTest);
				System.out.println("numTestFailed: " + numTestFailed);

        List<String> methodSignatureList = Counter.getMethodSignatureList();
        List<String> statementList = Counter.getStatementList();
        System.out.println(Arrays.toString(methodSignatureList.toArray()));
        System.out.println(Arrays.toString(statementList.toArray()));

        int[] passed = Counter.getPassedLineArray();
        int[] failed = Counter.getFailedLineArray();
        // System.out.println(Arrays.toString(passed));
        // System.out.println(Arrays.toString(failed));

        for(int i=0; i<passed.length; i++){
          if(passed[i] > 0 || failed[i] > 0){
            double score = failed[i] / Math.sqrt(numTestFailed * (failed[i] + passed[i]));
            BigDecimal bd = new BigDecimal(String.valueOf(score));
            BigDecimal bd1 = bd.setScale(2, RoundingMode.HALF_UP);
            score = bd1.doubleValue();
            Counter.scoreArray[i] = score;
          } else {
            Counter.scoreArray[i] = 0;
          }
        }

        List<Integer> ranks = new ArrayList<Integer>();
        List<Integer> scoreOfLineNumber = new ArrayList<Integer>();
        List<Double> scoreValues = new ArrayList<Double>();
        List<Double> sortedScoreValues = new ArrayList<Double>();

        for(int i=0; i<Counter.scoreArray.length; i++){
          if(Counter.scoreArray[i] > 0){
            scoreOfLineNumber.add(i);
            scoreValues.add(Counter.scoreArray[i]);
          }
        }


        // sortedScoreValues = scoreValues.clone();
        sortedScoreValues = new ArrayList<Double>(scoreValues);
        Collections.sort(sortedScoreValues);

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
              n = sortedScoreValues.size() - j + 1;
              break;
            }
          }
          int m = n + s;
          double temp = ( n+m+1 ) / 2;
          int rank = (int)Math.floor(temp);
          ranks.add(rank);
        }

        // System.out.println(Arrays.toString(scoreOfLineNumber.toArray()));
        // System.out.println("################################");
        // System.out.println(Arrays.toString(ranks.toArray()));

        Map<Integer, Integer> lineScore = new HashMap<>();
        for (int i=0; i < scoreOfLineNumber.size(); i++){
          lineScore.put(scoreOfLineNumber.get(i), ranks.get(i));
        }

        List<Entry<Integer, Integer>> list = new ArrayList<>(lineScore.entrySet());
        list.sort(Entry.comparingByValue());
        // list.forEach(System.out::println);

        String output = "";
        for(int i=0; i<list.size(); i++){
          System.out.println(list.get(i));
          output += list.get(i) + "\n";
        }

        String fileName = "";
        switch(testIndex){
          case 0:
            fileName = "spectrum_fl_ochiai_randoop0.csv";
            break;
          case 1:
            fileName = "spectrum_fl_ochiai_randoop1.csv";
            break;
          case 2:
            fileName = "spectrum_fl_ochiai_randoop2.csv";
            break;
          case 3:
            fileName = "spectrum_fl_ochiai_evosuite0.csv";
            break;
          case 4:
            fileName = "spectrum_fl_ochiai_evosuite1.csv";
            break;
          case 5:
            fileName = "spectrum_fl_ochiai_evosuite2.csv";
            break;
        }
        try {
          FileWriter fw = new FileWriter(fileName);
          fw.write(output);
          fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // double[] sortedScoreArray = Counter.scoreArray.clone();
        // Arrays.sort(sortedScoreArray);

        // for(int i=0; i<Counter.scoreArray.length; i++){
        //   double score = Counter.scoreArray[i];
        //   int s = 0;
        //   int n = 0;   // # of statements higher than a
        //   for (int j=0; j<sortedScoreArray.length; j++){
        //     if(Counter.scoreArray[i] < sortedScoreArray[j]){
        //       // contitue;
        //     } else if(Counter.scoreArray[i] == sortedScoreArray[j]) {
        //       s += 1; // # of the same ones
        //     } else {
        //       n = sortedScoreArray.length - j + 1;
        //       break;
        //     }
        //   }
        //   int m = n + s;   // # of statements higher or equal to a
        //   Counter.rankArray[i] = (n+m+1) / 2;
        // }

        // System.out.println(Arrays.toString(Counter.scoreArray));
        // System.out.println("################################");
        // System.out.println(Arrays.toString(Counter.rankArray));
    }

    private static void instrumentWithSoot(String[] classNames) {
    // private static void instrumentWithSoot(String className) {
        // the path to the compiled Subject class file
        String classUnderTestPath = "./raw-classes";
        String targetPath = "./target/classes";

        // String targetPathTest = "./target/classes/randoop0";
        // String targetPathTest = "./target/classes/randoop0:./target/classes/randoop1:./target/classes/randoop2:./target/classes/randoop3:./target/classes/randoop4";
        String targetPathTest = ".\\src\\test\\fault-revealing-randoop0;.\\src\\test\\fault-revealing-randoop1;.\\src\\test\\fault-revealing-randoop1;src\\test\\fault-revealing-randoop2;";

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
                Counter.addNumTestFailed(1);
                Counter.addToLineArraysFailed();
              }

              public void testFinished(Description description) {
                Counter.addNumTest(1);
                Counter.addToLineArraysPassed();
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
