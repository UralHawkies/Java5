public class BmiService {

    public double index(int m, double h) {
        double index;
        double height;
        height = h * h;
        index = m / height;
        return index;

    }
}
