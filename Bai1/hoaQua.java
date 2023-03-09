package chuong4.Bai1;

public class hoaQua {
    public int giaBan;
    public String xuatXu;
    public int soLuong;

    public hoaQua() {
    }
    
    public hoaQua(int giaBan, String xuatXu, int soLuong) {
        this.giaBan = giaBan;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
