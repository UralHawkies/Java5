public class BmiService {

    public double calculate(int m, double h) {
        double index;
        double height;
        height = h * h;
        index = m / height;
        return index;

    }
}
