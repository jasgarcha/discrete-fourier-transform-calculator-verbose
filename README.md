# discrete-fourier-transform-calculator-verbose
## [Javadocs](https://jasgarcha.github.io/discrete-fourier-transform-calculator-verbose/)
## Usage
`DFTCalculator` is the main program that accepts comma separated real numbers without white space as input.
Additional arguments:
`-steps` prints the Discrete Fourier transform with intermediate calculations. 
`-abs` prints the absolute value of the Discrete Fourier transform.
If no arguments are provided, the program runs as an input of numbers and the output `S(k)` (the Discrete Fourier transform of input `k`) is printed. 

## Logic
The `discreteFourierTransform.DFT` class implements a naive forward Discrete Fourier transform algorithm (complexity of `O(n^2)`).

Core methods of `discreteFourierTransform.DFT`:
`discreteFourierTransform` takes the input `s(n)`, a continuous signal over discrete time, and outputs the real and imaginary terms of the Discrete Fourier transform: `S(k)`. 
`discreteFourierTranformWithSteps` outputs intermediate calculations (substitution and reduction) of the DFT into a two-dimensional array. The developer has the option to grab the computations for a particular step or term in the transformation. 
`printDiscreteFourierTranformWithSteps` prints these intermediate steps to `stdout`. 
`absoluteValueOfComplexNumber` computes the absolute value of a complex number. 
`absoluteValueOfDiscreteFourierTransform` takes the real and imaginary terms of `S(k)` and outputs `|S(k)|` into an array. 
`printAbsoluteValueOfDiscreteFourierTransform` prints |S(k)| for the Discrete Fourier Transform.