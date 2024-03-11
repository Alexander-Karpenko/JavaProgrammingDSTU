package Task2;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex add(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    public Complex subtract(Complex c) {
        return new Complex(real - c.real, imaginary - c.imaginary);
    }

    public Complex multiply(Complex c) {
        return new Complex(real  *  c.real - imaginary  *  c.imaginary, real  *  c.imaginary + imaginary  *  c.real);
    }

    public Complex divide(Complex c) {
        double denominator = c.real  *  c.real + c.imaginary  *  c.imaginary  *  c.imaginary;
        return new Complex((real  *  c.real + imaginary  *  c.imaginary) / denominator, (c.real  * imaginary  - real  *  c.imaginary) / denominator);
    }

    public Complex conjugate() {
        return new Complex(real, -imaginary);
    }

    public boolean equals(Complex c) {
        return real == c.real && imaginary == c.imaginary;
    }

    public String toAlgebraicForm() {
        return real + " + " + "i*" +  imaginary;
    }

    public String toTrigonometricForm() {
        double r = Math.abs(Math.sqrt(real  *  real + imaginary  *  imaginary));
        double theta = Math.atan(imaginary / real);
        return r + " * (cos(" + theta +") + i * sin(" + theta + "))";
    }
}
