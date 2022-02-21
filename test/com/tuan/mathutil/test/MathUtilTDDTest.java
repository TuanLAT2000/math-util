/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuan.mathutil.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import static com.tuan.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.runners.Parameterized.Parameters;
/**
 *
 * @author Tuan
 */

@RunWith(value = Parameterized.class)
public class MathUtilTDDTest {
    
    //0
    @Parameters
    public static Object[][] initData(){
        //int a[] = {1,2,3,4,5};
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
            
        };
    }
    
    @Parameter(value = 0)
    public int n;
    
    @Parameter(value = 1)
    public long expected;
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell(){
       assertEquals(expected, getFactorial(n));
    }
}
