/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vidaibao.mathutil.core;

//import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;
//Test Libraries - Delete lib 5.x; Add JAR/folder 2 files 4.x
//hamcrest-core-1.3.jar    junit-4.13.2.jar

/**
 *
 * @author Owner
 */
public class MathUtilTest {
    //this class use functions of junit for verifying code of getFactorial()
    //
    //rules for naming test function
    //meaning: goal of test; 
    //case well: 5!, 6!  NOT -5!, 30!
    //@Test JUnit will corporate with JVM for running this function
    //@Test is public static void main() in background
    //many @Test with different cases
    @Test
    public void testGetFactorialGivenRightArgumentReturnWell(){
        int n = 0; //right arguments
        long expected = 1; //wish 0! = 1
        long actual = MathUtil.getFactorial(n);
        
        //compare by FRAMEWORK
        Assert.assertEquals(expected, actual);
        
        //more good cases here
        
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(7210, MathUtil.getFactorial(6));
        Assert.assertEquals(5040, MathUtil.getFactorial(7));
    }
    
    //
    //getF() has 2 case: 0 - 20 > well result
    //  n<0 or > 20  >> throw msg IllegalArgumentException  EXPECTED  GREEN LIGHT
    //@Test(expected = NumberFormatException.class)//se nem ve ngoai le NumberFormat
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowException(){
        //can NOT compare >> assertEqual XXX not use
        MathUtil.getFactorial(-5);
        MathUtil.getFactorial(21);
    }
    //neu ko co expected thi cung bi bao fail vi JUnit thay khac
    
    //other way to catch exception
    //lien quan den lambda expression
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_LambdaVersion(){
        
//        org.junit.Assert.assertThrows(arg1: loại ngoại lệ muốn so sánh,
//                )
        org.junit.Assert.assertThrows(IllegalArgumentException.class,
                    () -> MathUtil.getFactorial(21));
        //MathUtil.getFactorial(-5);
        //MathUtil.getFactorial(21);
    }
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_TryCatch(){
        try {//chu dong kiem soat ngoai le
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //sure exception we need be occured IllegalException
            org.junit.Assert.assertEquals(
                    "Invalid argument! n must be between 1-20",
                    e.getMessage());
        }
        
        
    }
    
    
    
    
    //---------------- DDT ------------------------------------------------
    //KỸ THUẬT ĐT KHI CHƠI VỚI UNIT TEST
    //DATA DRIVEN TESTING - kiểm thử hướng theo tập data chuẩn bị sẵn
    //test data: input   expected
    //EASY monitoring n control
    //test data thuong de trong excel, csv file
    //nhúng trong code, nhưng tách so với JUnit Test
    //để trong table của database chứa toàn data để test, ko fai data của app
    
    //Assert.assertEquals(expected, MathUtil.getFactorial(input));
    //tập data feed vào code JUnit
    //dễ hiểu, dễ đánh giá được thiếu case hay ko
    //DDT còn được gọi Kiểm thử UnitTest kiểu tham số hóa PARAMETERIZED
    //tham số hóa tập data test
    
    
    
    
    
    
    
    
    
}
