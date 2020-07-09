    import java.util.Scanner;
    public class Ex14_1 {
        public static void main(String[] args) {
            //code below here
            Scanner scanner = new Scanner(System.in);
            boolean isRun = true;
            while (isRun){
                System.out.print("Enter the width:");
                double width = scanner.nextDouble();
                System.out.print("Enter the height:");
                double height = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(width, height);
                System.out.println("Your Rectangle \n"+ rectangle.display());
                System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
                System.out.println("Area of the Rectangle: "+ rectangle.getArea());
                System.out.println("Ấn 1 để chạy tiếp, 2 để dừng");
                int c = scanner.nextInt();
                switch (c){
                    case 1:{
                        isRun= true;
                        break;
                    }
                    case 2:{
                        isRun = false;
                    }
                }
            }
        }
    }

