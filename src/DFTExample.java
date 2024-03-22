import discreteFourierTransform.DFT;

/**
 * Demonstrates the discreteFourierTransform, discreteFourierTransformWithSteps, printDiscreteFourierTransformWithSteps, absoluteValueOfDiscreteFourierTransform, and printAbsoluteValueOfDiscreteFourierTransform methods of the DFT class using the set of numbers 1.1, 2.2, 3.3, 4.4, 5.5.
 * @author Jasminder Garcha
 */
public class DFTExample {
	public static void main(String[] args) {
		double[] sampledDataPoints = {1.1, 2.2, 3.3, 4.4, 5.5};
		double[] realTerms = new double[sampledDataPoints.length];
		double[] imaginaryTerms = new double[sampledDataPoints.length];
		double[] absoluteValue;
		
		DFT dft = new DFT();
		
		dft.discreteFourierTransform(sampledDataPoints, realTerms, imaginaryTerms);	
		
		String[][] steps = new String[sampledDataPoints.length][8];
		dft.discreteFourierTransformWithSteps(sampledDataPoints, realTerms, imaginaryTerms, steps);
        for (String[] step : steps)
            for (String s : step)
				System.out.println(s);
		System.out.println();

		dft.printDiscreteFourierTransformWithSteps(sampledDataPoints);
		
		absoluteValue = dft.absoluteValueOfDiscreteFourierTransform(realTerms, imaginaryTerms);
        for (double d : absoluteValue)
			System.out.println(d);
		System.out.println();

		dft.printAbsoluteValueOfDiscreteFourierTransform(realTerms, imaginaryTerms);
	}
}