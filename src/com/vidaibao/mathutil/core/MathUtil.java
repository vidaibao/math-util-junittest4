/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vidaibao.mathutil.core;

/**
 *
 * @author Owner
 */
public class MathUtil {
    // class nay cung cap ra ngoai xu ly toan hoc
    // clone class Math cua jdk
    //de dung 1 lan, return values, ko can lưu lại trạng thái
    // > thiết kế là hàm static
    
    //hàm tính giai thừa
    //n! = 1*2*3*....*n
    //quy uoc  0! = 1! = 1
    //đồ thị dốc cao, tăng rất nhanh 20giai thừa > 18 số 0
    //21 giai thừa > tràn kiểu long
    //trong bài này tạm qui ước tính giai thừa từ 1--20
//    public static long getF(int n){
//        if (n < 0 || n> 20) 
//            throw new IllegalArgumentException("Invalid argument! n must be between 1-20");//avoid return
//        if (n == 0 || n == 1)
//            return 1; //stop if get special input value
//        
//        long product = 1;
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//        
//        return product;
//    }
    
    //Refector: tối ưu, chỉnh sửa code
    public static long getFactorial(int n){
        if (n < 0 || n> 20) 
            throw new IllegalArgumentException("Invalid argument! n must be between 1-20");//avoid return
        if (n == 0 || n == 1)
            return 1; //stop if get special input value
        
        return n * getFactorial(n - 1); //Recursion
    }
    
    
    
    
    
    
    
    
    
}
