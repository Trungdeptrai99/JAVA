public class Run2 {
    public static void main(String[] args) {
        Shape[] shapes = {new Square(6),new Rectangle(6,4),new Circle(10)};
        for (Shape a:shapes
             ) {
            System.out.println("Diện tích là "+ a.getArea()+" đơn vị diện tích");
            if(a instanceof Square){
               Colorable hinh = new Square();
               hinh.howToColor();
            }
        }
        
    }
}
