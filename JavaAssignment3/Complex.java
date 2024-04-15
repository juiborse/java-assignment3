package java_assignment_3;
import java.util.Scanner;
public class Complex {
	
	    private double real;
	    private double imaginary;

	    // Constructor
	    public Complex(double real, double imaginary) {
	        this.real = real;
	        this.imaginary = imaginary;
	    }

	    // Method to print the complex number
	    public void print() {
	        if (imaginary >= 0) {
	            System.out.println(real + " + " + imaginary + "i");
	        } else {
	            System.out.println(real + " - " + Math.abs(imaginary) + "i");
	        }
	    }

	    
	    public static Complex add(Complex c1, Complex c2) {
	        double realSum = c1.real + c2.real;
	        double imaginarySum = c1.imaginary + c2.imaginary;
	        return new Complex(realSum, imaginarySum);
	    }

	   
	    public static Complex subtract(Complex c1, Complex c2) {
	        double realDiff = c1.real - c2.real;
	        double imaginaryDiff = c1.imaginary - c2.imaginary;
	        return new Complex(realDiff, imaginaryDiff);
	    }

	   
	    public static Complex multiply(Complex c1, Complex c2) {
	        double realProduct = c1.real * c2.real - c1.imaginary * c2.imaginary;
	        double imaginaryProduct = c1.real * c2.imaginary + c1.imaginary * c2.real;
	        return new Complex(realProduct, imaginaryProduct);
	    }

	    public static void main(String[] args) {
	      

	        Complex complex1 = new Complex(10, 20);
	        Complex complex2 = new Complex(20, 30);

	   
	        Complex sum = Complex.add(complex1, complex2);
	        System.out.println("Sum of the two complex numbers:");
	        sum.print();

	        Complex difference = Complex.subtract(complex1, complex2);
	        System.out.println("Difference of the two complex numbers:");
	        difference.print();

	        Complex product = Complex.multiply(complex1, complex2);
	        System.out.println("Product of the two complex numbers:");
	        product.print();

	       
	    }
	}



