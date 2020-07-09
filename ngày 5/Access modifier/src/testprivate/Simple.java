package testprivate;


public class Simple extends A{

    public static void main(String args[]){

        Simple obj=new Simple();

        System.out.println(obj.data);//Compile Time Error

        obj.msg();//Compile Time Error

    }

}
