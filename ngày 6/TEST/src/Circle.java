public class Circle extends Geometric {
    public double getThuNhap() {
        double thunhap = 200000;
        return thunhap;
    }

    public static void main(String[] args) {
        Geometric nv1 = new Circle();
        System.out.println(nv1.getThuNhap());
    }
}

