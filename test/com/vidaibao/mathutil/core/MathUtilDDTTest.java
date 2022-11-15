/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.vidaibao.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Owner
 */
@RunWith(value = Parameterized.class)//loop set data input/expected
public class MathUtilDDTTest {
    //2dim array  input - expected
    @Parameterized.Parameters //JUnit background loop array for get pair data
    public static Object[][] initData(){//static: 1 cho co dinh tren RAM
        
        return new Integer[][]{
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
                                {6, 720},
                                {7, 5040}
        };
    }
    @Parameterized.Parameter(value = 0)//=0 map col 0
    public int n;//value col 0 of array
    @Parameterized.Parameter(value = 1)//=1 map col 1
    public long expected;   //expected return of getF()
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
    
    //build-impl.xml 1204  compi le,test,
    
    
    
    
    
    
    
    
}
