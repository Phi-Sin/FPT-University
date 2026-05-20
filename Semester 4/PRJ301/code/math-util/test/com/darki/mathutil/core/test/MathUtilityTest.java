/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darki.mathutil.core.test;

import com.darki.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;


public class MathUtilityTest {
    
    //ta bắt ngoại lệ, kiểm tra xem hàm có trả về ngoại lệ như thiết
    //kế hay ko
    //ngoại lệ xh, về logic app sụp đổ, sụp đổ LÀ MÀU ĐỎ
    
    //riêng cho UnitTest, chỉ quan tâm
    //expected == actual -> xanh
    //expected != actual -> đỏ
    
    //actual là gì ko cần biết, miễn khớp/ko khớp với expected để k/l
    //đúng sai
    
    //nếu đưa vào -1, THÌ HY VỌNG NGOẠI LỆ ILLEGALARGUENTEXCEPTION
    //sẽ hiện
    //NẾU ĐƯA VÀO -1 VÀ NGOẠI LỆ IllegalArgumentEx mà xuất hiện
    //JUNIT ƠI, MÀU XANH ĐI MÀU
    //MÀU XANH VÌ: KÌ VỌNG NL XUẤT HIỆN, VÀ THỰC TẾ LÀ CÓ NL
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenRightArgumentThrowsExpection(){
        //chờ ngoại lệ xuất hiện, đo có đúng NL dự kiến hay ko
        //có -> xanh
        //ko xh như dự kiến, đỏ
        MathUtility.getFactorial(-1);
    }
    
    @Test
    public void testFactorialGivenRightArgument0ReturnsWell(){
        //Assert.assertEquals(10, 10);
        Assert.assertEquals(1, MathUtility.getFactorial(1));
    }
    
    @Test
    public void testFactorialGivenRightArgument2ReturnsWell(){
        //Assert.assertEquals(10, 10);
        Assert.assertEquals(2, MathUtility.getFactorial(2));
    }
    
    @Test
    public void testFactorialGivenRightArgument3ReturnsWell(){
        //Assert.assertEquals(10, 10);
        Assert.assertEquals(6, MathUtility.getFactorial(3));
    }
    
    @Test
    public void testFactorialGivenRightArgument4ReturnsWell(){
        //Assert.assertEquals(10, 10);
        Assert.assertEquals(2, MathUtility.getFactorial(2));
        Assert.assertEquals(6, MathUtility.getFactorial(3));
        Assert.assertEquals(24, MathUtility.getFactorial(4));
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        Assert.assertEquals(720, MathUtility.getFactorial(6));
    }
    
}

//QUY ƯỚC XANH ĐỎ
//XANH: KHI TẤT CẢ CÙNG XANH, NGHĨA LÀ: TẤT CẢ CÁC TEST CASE PHẢI
//THỎA MÃN EXPECTED == ACTUAL, NGHĨA LÀ HÀM XỬ LÍ ĐÚNG CHO CÁC CASE

//ĐỎ: CHỈ 1 THẰNG ĐỎ, COI NHƯ HÀM ĐỎ, HÀM SAI
//LÍ THUYẾT ĐẰNG SAU: HÀM ĐÃ ĐÚNG THI PHẢI ĐÚNG HẾT CHO CÁC CASE
//                                      DÙ KO THỂ LIỆT KÊ HẾT CÁC CASE
//                                      NHƯNG ĐÃ CÓ CASE NÀO THÌ CASE ĐÓ PHẢI ĐÚNG

//1 THẰNG ĐỎ, CHỨNG MINH HÀM XỬ LÍ ĐANG SAI, DÙ CHỈ LÀ 1 CASE SAI
//MỌI THỨ SAI
