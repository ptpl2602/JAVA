package hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
    Set<String> thungPhieuDu = new HashSet<String>();

    public RutThamTrungThuong_HashSet() {
    }

    public boolean addPhieuDu(String gt) {
        return this.thungPhieuDu.add(gt);
    }

    public boolean deletePhieuDu(String gt) {
        return this.thungPhieuDu.remove(gt); 
    }

    public boolean KtraPhieu_TonTai(String gt) {
        return this.thungPhieuDu.contains(gt);
    }

    public void xoaALLPhieu() {
        this.thungPhieuDu.clear();
    }

    public int soLuongPhieu() {
        return this.thungPhieuDu.size();
    }

    public String rut1Phieu() {
        String result = "";
        Random rd = new Random();
        int vitri = rd.nextInt(this.thungPhieuDu.size()-1);
        
        result = (String) this.thungPhieuDu.toArray()[vitri];
        return result;
    }

    public void output() {
        System.out.println(Arrays.toString(this.thungPhieuDu.toArray()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
        int chon = 0;
        while(true) {
            System.out.println("\t---------------------------");
            System.out.println("\t\t=====MENU=====");
            System.out.println("\t1.Them ma so du thuong");
            System.out.println("\t2. Xoa ma so du thuong");
            System.out.println("\t3. Kiem tra ma so du thuong co ton tai hay khong");
            System.out.println("\t4. Xoa tat ca cac phieu du thuong");
            System.out.println("\t5. So luong phieu du thuong");
            System.out.println("\t6. Rut tham trung thuong");
            System.out.println("\t7. In ra tat ca cac phieu");
            System.out.println("\t0. Thoat");
            System.out.println("\t------------------------------\n");

            System.out.print(" ---> Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            if(chon == 0) break;

            switch(chon) {
                case 1:
                {
                    System.out.print("Nhap vao ma phieu du thuong: ");
                    String gt = sc.nextLine();
                    rt.addPhieuDu(gt);
                }
                break;

                case 2:
                {
                    System.out.print("Nhap vao ma phieu du thuong: ");
                    String gt = sc.nextLine();
                    rt.deletePhieuDu(gt);
                }
                break;

                case 3:
                {
                    System.out.print("Nhap vao ma phieu du thuong: ");
                    String gt = sc.nextLine();
                    
                    System.out.println("Ket qua kiem tra: " + rt.KtraPhieu_TonTai(gt));
                }
                break;

                case 4:
                {
                    rt.xoaALLPhieu();
                    System.out.println("\t---Da xoa xong---");
                }
                break;

                case 5:
                {
                    System.out.println("So luong phieu du thuong: " + rt.soLuongPhieu());
                }
                break;

                case 6:
                {
                    System.out.println("--->> Ma so trung thuong: " + rt.rut1Phieu());
                }
                break;

                case 7:
                {
                    System.out.println("\t\tIN RA TAT CA DU LIEU");
                    System.out.println("Cac ma phieu du thuong la: ");
                    rt.output();
                }
                break;

                default:
                    System.out.println("Lua chon khong hop le");
                break;
            }
        }
    }
}
