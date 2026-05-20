/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darki.mathutil.main;

import com.darki.mathutil.core.MathUtility;

/**
 *
 * @author MSI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //test case #1 - run 
        int n = 0;
        long expected = 1; // ta kì vọng 0! phải là 1
        long actual;           // thực tế hàm chạy là mấy = ?;

        actual = MathUtility.getFactorial(0);
        //so sánh giữa expected == actual
        System.out.println(n + "!  | Expected value: " + expected + " | Actual value: " + actual);
        
        //test case #2: check getF(n = 1)
        System.out.println("1!  | Expected value: 1" + " | Actual value: " + MathUtility.getFactorial(1));
        
        //test case #3: check getF(n = 2)
        System.out.println("2!  | Expected value: 2" + " | Actual value: " + MathUtility.getFactorial(2));
        
        //test case #4: check getF(n = 3)
        System.out.println("3!  | Expected value: 6" + " | Actual value: " + MathUtility.getFactorial(3));
        
        //test case #5: check getF(n = 5)
        System.out.println("5!  | Expected value: 120" + " | Actual value: " + MathUtility.getFactorial(5));
        
        //test case cho tình huống âm giai thừa
        //test case #5: check getF(n = -1)
        System.out.println("-1!  | Expected value: NGOẠI LỆ VẢ VÀO MẶT" + " | Actual value: "); 
        MathUtility.getFactorial(-1);
    }

}

//KĨ THUẬT TDD - TEST DRIVEN DEVELOPMENT
//Kĩ thuật lập trình đặc biệt đc ưa dùng trong Agile
//Agile chia hoàn thành app thành các chặng ngắn đều nhau,
//trung bình 2W gọi là 1 SPRINT - bước chạy nước rút
//2W xong 1 module hoàn chỉnh: UI + Code + DB chạy đc
//Code ra liên tục, code đc sửa liên tục sau mỗi lần feedback của k/h
//đảm bảo code tốt (trả về đúng như kì vọng) bàng cách nào
//TDD hóa giải
//TDD: viết code và viết các test case đan xen, song hành, và thực
//thi test case liên tục luôn
//code có khả năng chạy đúng, sai. Đúng quy ước màu xanh, sai quy ước
//màu đỏ (y chang đèn đường)
//Test case: là 1 bộ data (input + expected) để mô phỏng 1 tình huống
//xài app của user mà QC đc quyền xài trước, để xem app chạy dúng hay
//sai, so với expected value
//Nó gồm: input data,expected reult, steps các bước để run test
//các bước nhập input data, click, verify kết quả trả về
//Test case có thể viết theo 2 cách: viết tự do và viết theo template
//Viết tự do: getF() có những tet case cơ bản sau:
//0! -> 1; 1! -> 1; 2! -> 2; 4! -> 24; 5! -> 120
//-1! chửi, 21! chửi -5! chửi
//Viết test case theo template như sau
//Test case #1 (mục đích test case) - check getF() with n = 0; 0!?
//Steps/Procedures (các bước tiến hành)
//              Liệt kê các bước nhập liệu, nhấn chuột...
//              1. Given n = 0;
//              2. Call getF(n=0)
//              //click...
//Expected result:
//              getF() must return 1
//Test case #2 (mục đích test case) - check getF() with n = 0; 0!?
//Steps/Procedures (các bước tiến hành)
//              Liệt kê các bước nhập liệu, nhấn chuột...
//              1. Given n = 1;
//              2. Call getF(n=1)
//              //click...
//Expected result:
//              getF() must return 1
//Test case #3 (mục đích test case) - check getF() with n = 0; 0!?
//Steps/Procedures (các bước tiến hành)
//              Liệt kê các bước nhập liệu, nhấn chuột...
//              1. Given n = 2;
//              2. Call getF(n=2)
//              //click...
//Expected result:
//              getF() must return 2
//...
//QC và Dev vừa giống nhau cà khác nhau ở công việc của mình
//Giống: đều phải thiết kế, tạo ra các test case như cấu trúc ở trên
//            đều phải run các test case, chạy thử app/hàm với data đưa vào
//            đều kiểm tra đúng sai
//Khác: QC test app, setup.exe, www...com, .apk
//          Dev: viết code/làm app, việc nặng nề
//          QC: viết code 
