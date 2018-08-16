package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class SearchValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Nam", "Hiền", "Hoàng", "Mạnh", "Kiên","Tùng", "Phương"};
        String name = "";

        System.out.print("Nhập vào tên sinh viên cần tìm: ");
        name = scanner.next();

        boolean check = false;

        for (int i = 0; i < students.length; i++)
        {
            if(students[i].equals(name)){
                System.out.print("Vị trí của sinh viên "+name+" là "+(i+1));
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println("Không tìm thấy sinh viên!!!");
    }
}
