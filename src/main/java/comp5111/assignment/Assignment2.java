package comp5111.assignment;
import comp5111.assignment.cut.EntryPoint;
import java.util.Arrays;

public class Assignment2 {
    public static void main(String[] args) {

        /* check the arguments */
        // if (args.length <= 1 || (args[0].compareTo("0") != 0 && args[0].compareTo("1") != 0 && args[0].compareTo("2") != 0)) {
        //     System.err.println("Usage: java Assignment2 classnames ...");
        //     // System.err.println("Usage: java Assignment1 [coverage level] classnames ...");
        //     // System.err.println("Usage: [coverage level] = 0 for statement coverage");
        //     // System.err.println("Usage: [coverage level] = 1 for branch coverage");
        //     // System.err.println("Usage: [coverage level] = 2 for line coverage");
        //     System.exit(0);
        // }

        int testIndex = Integer.parseInt(args[0]);
        // these args will be passed into soot.
        String[] classNames = Arrays.copyOfRange(args, 1, args.length);

				for (int i = 0; i < classNames.length; i++) {
					String newClassName = "comp5111.assignment.cut." + classNames[i];
					classNames[i] = newClassName;

					// System.out.println("### class name ###");
					// System.out.println(newClassName);
				}

				// System.err.println(classNames);


				EntryPoint.main(classNames, testIndex);

        // if (args[0].compareTo("0") == 0) {
        //
				// 		EntryPoint.main(classNames);
        //
        // } else if (args[0].compareTo("1") == 0) {
        //
				// 		EntryPoint1.main(classNames);
        //
        // } else if (args[0].compareTo("2") == 0) {
				//
				// 		EntryPoint2.main(classNames);
        //
        // }
    }
}
