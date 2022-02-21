/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuan.mathutil.main;

import com.tuan.mathutil.core.MathUtil;

/**
 *
 * @author Tuan
 */
public class Main {
    public static void main(String[] args) {
        //test = tay
        System.out.println("0! = 1?" + MathUtil.getFactorial(0));
        System.out.println("1! = 1?" + MathUtil.getFactorial(1));
        System.out.println("5! = 120?" + MathUtil.getFactorial(5));
        
        
        // test thử coi hàm tính giai thừa chạy đúng hay ko???
        // kiểm thử là so sánh giữa expect và actual 
        // ta phải tưởng tượng xem ng  dùng/ ng khác xài app/code
        //như thế nào , ta dùng trc họ
        // ta phải tưởng tượng các tình huống họ xài - TEST CASES
        
        // CASE #1: check the getF() with valid argument (n = 0.20)
        // n = 0 -> expected = 1 0! phải trả về 1, tao kì vọng như thế 
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        // so sánh giữa expected và actual
        System.out.println("Check 0!; expected: " + expected + "; actual: " + actual);
        
        //CASE #2:
        //n = 6 -> expected = 720, 6! = 720 mới là đúng, kì vọng 
        expected = 720;
        actual = MathUtil.getFactorial(6);
         // so sánh giữa expected và actual
        System.out.println("Check 0!; expected: " + expected + "; actual: " + actual);
        
        //CASE #...1,2...20! VALID ARGUMENT
        
        //CASE #x check getF() with invalid argument 
        //expected = ?? cái gì đây khi mình muốn tính -5!
        // hy vọng của ta là thấy đc ngoại lệ, IllegalArgumentException
        //sure -5! phải xuất hiện ngoại lệ, ta mưng roi 
        // nếu getF(-5) ma nem ra ngoai le, ta mừng rơi nước mắt
        MathUtil.getFactorial(-5);
    }
}
