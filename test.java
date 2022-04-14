package qldssv_arraylist;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        list_Student dssv = new list_Student();
        int chon;
        do {
            System.out.println("\n\t\t---------MENU-----------");
            System.out.println("\t1. Them sinh vien moi vao danh sach");
            System.out.println("\t2. In danh sach sinh vien");
            System.out.println("\t3. Kiem tra danh sach co rong khong");
            System.out.println("\t4. Lay ra so luong sinh vien trong danh sach");
            System.out.println("\t5. Lam rong danh sach sinh vien");
            System.out.println("\t6. Kiem tra sinh vien co trong danh sach theo MSSV");
            System.out.println("\t7. Xoa 1 sinh vien dua tren MSSV");
            System.out.println("\t8. Tim kiem tat ca sinh vien dua theo ten cua sinh vien do");
            System.out.println("\t9. In danh sach sinh vien co diem tu cao den thap");
            System.out.println("\t0. Thoat");
            System.out.println("\t\t-----------------------\n");
            
            System.out.print(" Vui long lua chon: ");
            chon = sc.nextInt();

            sc.nextLine();

            switch (chon) {
                case 1:
                {
                    System.out.print(" Nhap ma sinh vien: ");
                    String mssv = sc.nextLine();

                    System.out.print(" Nhap ho ten: ");
                    String name = sc.nextLine();

                    System.out.print(" Nhap nam sinh: ");
                    int year = sc.nextInt();

                    System.out.print(" Nhap diem trung binh: ");
                    float dtb = sc.nextFloat();

                    Student sv = new Student(mssv, name, year, dtb);
                    dssv.addSV(sv);
                }
                break;
                
                case 2:
                {
                    dssv.output();
                }
                break;

                case 3:
                {
                    if(dssv.Ktra_Rong() == true) {
                        System.out.println(" -> Danh sach rong");
                    }
                    else
                    {
                        System.out.println(" -> Danh sach co chua sinh vien");
                    }
                }
                break;

                case 4:
                {
                    System.out.println(" -> So luong sinh vien trong danh sach: " + dssv.soLuong());
                }
                break;

                case 5:
                {
                    dssv.lamRong_DS();
                    System.out.println("    DA XOA");
                }
                break;

                case 6:
                {
                    System.out.print(" - Nhap ma so sinh vien: ");
                    String mssv = sc.nextLine();

                    Student sv = new Student(mssv);
                    if(dssv.Ktra_SV_MSSV(sv) == true) {
                        System.out.println(" -> Co sinh vien ma " + mssv + " trong danh sach");
                    }
                    else
                        System.out.println(" -> Khong ton tai sinh vien do");
                }
                break;

                case 7:
                {
                    System.out.println("\tXOA SINH VIEN THEO MSSV");
                    System.out.print(" - Nhap ma so sinh vien muon xoa: ");
                    String mssv = sc.nextLine();

                    Student sv = new Student(mssv);
                    dssv.Xoa_MSSV(sv);
                }
                break;

                case 8:
                {
                    System.out.println("\tTIM KIEM SINH VIEN THEO TEN");
                    System.out.println(" - Nhap ten sinh vien muon tim: ");
                    String name = sc.nextLine();
                    dssv.timSV_Ten(name);
                }
                break;

                case 9:
                {
                    System.out.println("\tIN DANH SACH SINH VIEN THEO DIEM TU CAO XUONG THAP");
                    dssv.sapXep_Diem_giamDan();
                    dssv.output();
                }
                break;
                
                default:
                    System.out.println("Lua chon khong hop le!");
                break;
            }
        } while (chon != 0);
    }
}
