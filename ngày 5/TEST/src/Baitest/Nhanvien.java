package Baitest;

import java.sql.Struct;

public class Nhanvien {
    public void Nhanvien(){
    }
    private int maNv;
    private String name;
    private String phongban;

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public String getName() {
        return name;
    }

    public String getPhongban() {
        return phongban;
    }

    public int getMaNv() {
        return maNv;
    }
}
