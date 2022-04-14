package qldssv_arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class list_Student {
    private ArrayList<Student> dssv;

    public list_Student(ArrayList<Student> dssv) {
        this.dssv = dssv;
    }
    
    //Khai bao constructor rong
    public list_Student() {
        this.dssv = new ArrayList<Student>();
    }

    //Them sinh vien vao cuoi danh sach
    public void addSV(Student sv) {
        this.dssv.add(sv);
    }

    public void Template() {
        System.out.printf("Ma so sinh vien |     Ho ten    |   Nam sinh   |  Diem trung binh\n");
    }
    //In DSSV
    public void output() {
        Template();
        for (Student student : dssv) {
            System.out.println(student);
        }
    }

    //Ktra rong
    public boolean Ktra_Rong() {
        return this.dssv.isEmpty();
    }

    //Lay so luong
    public int soLuong() {
        return this.dssv.size();
    }

    //Lam rong danh sach
    public void lamRong_DS() {
        this.dssv.removeAll(dssv);
    }

    //Kiem tra co ton tai trong ds theo mssv
    public boolean Ktra_SV_MSSV(Student sv) {
        return this.dssv.contains(sv);
    }

    //Xoa 1 sinh vien theo mssv
    public boolean Xoa_MSSV(Student sv) {
        return this.dssv.remove(sv);
    }

    //Tim kiem theo ten
    public void timSV_Ten(String ten) {
        for (Student sv : dssv) {
            if(sv.getName().indexOf(ten) >= 0) {
                System.out.println(sv);
            }
        }
    }

    //Diem cao den thap
    public void sapXep_Diem_giamDan() {
        Collections.sort(this.dssv, new Comparator<Student>() {

            @Override
            public int compare(Student sv1, Student sv2) {
                if(sv1.getAvg() < sv2.getAvg())
                    return 1;
                else if(sv1.getAvg() > sv2.getAvg())
                    return -1;
                else
                    return 0;
            }
        });;
    }
}
