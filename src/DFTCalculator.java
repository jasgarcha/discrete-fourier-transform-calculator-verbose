import discreteFourierTransform.DFT;
import java.util.Scanner;

/**
 * DFTCalculator
 * Calculates the Discrete Fourier transform of a set of real numbers. 
 * @author Jasminder Garcha
 *
 */
public class DFTCalculator {
	/**
	 * 
	 * @param args Comma seperated real numbers without white space. Options: -steps prints the Discrete Fourier transform with intermediate calculations. -abs prints the absolute value of the Discrete Fourier transform.  
	 * If no arguments are provided, the program runs as an input of numbers. 
	 */
	public static void main(String[] args) {
		DFT dft = new DFT();
		if(args.length > 0) {
			String[] numbers = args[0].split(",");
			
			double[] data = new double[numbers.length];
			
			for(int i = 0; i < numbers.length; i++) {
				try {
					data[i] = Double.parseDouble(numbers[i]);
				}
				catch(Exception e) {
					System.out.println("Input is not a real number.");
					System.exit(-1);
				}
			}					

			double[] real = new double[data.length];
			double[] imaginary = new double[data.length];		
			
			if(args.length == 1) {		
				dft.discreteFourierTransform(data, real, imaginary);
				System.out.println("k, S(k)");
				for(int i = 0; i < data.length; i++) {
					System.out.println(data[i]+", "+real[i]+"+"+imaginary[i]+"j");
				}
			}
			
			if(args.length == 2) {
				if(args[1].equals("-steps")) {
					dft.printDiscreteFourierTransformWithSteps(data);
				}
				if(args[1].equals("-abs")) {
					dft.discreteFourierTransform(data, real, imaginary);
					System.out.println("k, S(k)");
					for(int i = 0; i < data.length; i++) {
						System.out.println(data[i]+", "+real[i]+"+"+imaginary[i]+"j");
					}
					System.out.println();
					dft.printAbsoluteValueOfDiscreteFourierTransform(real, imaginary);
				}
				if(!args[1].equals("-steps") && !args[1].equals("-abs")) {
					System.out.println("The argument "+args[1]+" is invalid. Valid arguments: -steps -abs");
				}
			}
			
			if(args.length == 3) {
				if(!args[1].equals("-steps") && !args[1].equals("-abs")) {
					System.out.println("The argument "+args[1]+" is invalid. Valid arguments: -steps -abs");
				}
				else if(!args[2].equals("-abs") && !args[2].equals("-steps")) {
					System.out.println("The argument "+args[2]+" is invalid. Valid arguments: -steps -abs");
				}
				else {
					dft.discreteFourierTransform(data, real, imaginary);
					dft.printDiscreteFourierTransformWithSteps(data);
					System.out.println();
					dft.printAbsoluteValueOfDiscreteFourierTransform(real, imaginary);
				}				
			}
			System.exit(0);
		}		
		else {
			String[] arguments = null;
			String[] numbers = null;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter comma seperated real numbers without white space: ");
			
			String in = input.nextLine();
			
			if(in.contains(" ")) {
				arguments = in.split(" ");
				numbers = arguments[0].split(",");
			}
			else {
				numbers = in.split(",");
			}
			
			double[] data = new double[numbers.length];
			
			for(int i = 0; i < numbers.length; i++) {
				try {
					data[i] = Double.parseDouble(numbers[i]);
				}
				catch(Exception e) {
					System.out.println("Input is not a real number.");
					System.exit(-1);
				}
			}
						
			double[] real = new double[data.length];
			double[] imaginary = new double[data.length];		
			
			if(arguments == null) {
				dft.discreteFourierTransform(data, real, imaginary);
				System.out.println("k, S(k)");
				for(int i = 0; i < data.length; i++) {
					System.out.println(data[i]+", "+real[i]+"+"+imaginary[i]+"j");
				}
			}
			
			if(arguments != null && arguments.length == 2) {
				if(arguments[1].equals("-steps")) {
					dft.printDiscreteFourierTransformWithSteps(data);
				}
				if(arguments[1].equals("-abs")) {
					dft.discreteFourierTransform(data, real, imaginary);
					System.out.println("k, S(k)");
					for(int i = 0; i < data.length; i++) {
						System.out.println(data[i]+", "+real[i]+"+"+imaginary[i]+"j");
					}
					System.out.println();
					dft.printAbsoluteValueOfDiscreteFourierTransform(real, imaginary);
				}
				if(!arguments[1].equals("-steps") && !arguments[1].equals("-abs")) {
					System.out.println("The argument "+arguments[1]+" is invalid. Valid arguments: -steps -abs");
				}
			}
			
			if(arguments != null && arguments.length == 3) {
				if(!arguments[1].equals("-steps") && !arguments[1].equals("-abs")) {
					System.out.println("The argument "+arguments[1]+" is invalid. Valid arguments: -steps -abs");
				}
				else if(!arguments[2].equals("-abs") && !arguments[2].equals("-steps")) {
					System.out.println("The argument "+arguments[2]+" is invalid. Valid arguments: -steps -abs");
				}
				else {
					dft.discreteFourierTransform(data, real, imaginary);
					dft.printDiscreteFourierTransformWithSteps(data);
					System.out.println();
					dft.printAbsoluteValueOfDiscreteFourierTransform(real, imaginary);
				}				
			}
			
			input.close();
			System.exit(0);
		}
	}
}