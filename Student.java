package qldssv_arraylist;

import java.util.Objects;

/*
	1. Them sinh vien
	2. Kiem tra rong
	3. Lay so luong sv
	4. Lam rong dssv
	5. Xoa 1 sv theo MSSV
	6. Kiem tra co ton tai sv theo mssv
	7. Tim kiem sv theo ten
	8. Xuat dssv theo thu tu diem cao den thap
*/

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private int year;
    private float avg;

    public Student(String id, String name, int year, float avg) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.avg = avg;
    }

    public Student(String id) {
        this.id = id;
    }

    public Student() {
        id = "A00000";
        name = "Nguyen Van A";
        year = 2000;
        avg = 0.0f;
    }

    public float getAvg() {
        return avg;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setAvg(float avg) {
        if(avg >= 0 && avg <= 10)
            this.avg = avg;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return " " + id + "\t" + name + "\t\t" + year + "\t" + avg;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avg, name, id, year);
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return Objects.equals(id, other.id);
    }
    
}
