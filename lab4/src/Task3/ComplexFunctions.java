package Task3;

public class ComplexFunctions {

    public static double exp(double x, double y, double i) {
        return Math.exp(x) * (Math.cos(y) +  i * Math.sin(y));
    }

    public static double sin(double x, double y) {
        return (exp(x,y,1) - exp(x,y,-1)) / 2;
    }

    public static double cos(double x, double y) {
        return (exp(x,y,1) + exp(x,y,-1)) / 2;
    }

    public static double tan(double x, double y) {
        return sin(x, y) / cos(x, y);
    }

    public static double arctan(double x, double y) {
        return cos(x, y) / sin(x, y);
    }

    public static double sh(double x, double y) {
        return ( exp(x,y,1) - exp(x,y,-1) ) /  2;
    }

    public static double ch(double x, double y) {
        return ( exp(x,y,1) + exp(x,y,-1) ) /  2;
    }

    public static double th(double x, double y) {
        return sh(x, y) / ch(x, y);
    }

    public static double cth(double x, double y) {
        return ch(x, y) / sh(x, y);
    }

}

