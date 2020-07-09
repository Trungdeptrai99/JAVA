package Baitest;

public class DemoNV {
    public static void main(String[] args) {
        Nhanvien nhanvien = new Nhanvien();
        nhanvien.setMaNv(6996);
        nhanvien.setName("Trung Đẹp Trai");
        nhanvien.setPhongban("Giám dốc");
        System.out.println(nhanvien.getMaNv()+" "+nhanvien.getName()+" "+nhanvien.getPhongban());
    }
}
