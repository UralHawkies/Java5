public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myIndex = service.index(75, 1.75);
        System.out.println(myIndex);

    }
}
