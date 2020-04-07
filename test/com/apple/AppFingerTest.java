package com.apple;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AppFingerTest {
    AppFinger appFinger = new AppFinger();
    @Test
    /**
     * 苹果树为1，即左边界值
     */
    public void show1() {
        List<Integer> list1 = appFinger.show(1);
        List<Integer> list2 = Arrays.asList(1);
        //第二个参数是期望的结果，第三个参数是实际的结果，当两者不相等，返回第一个参数
        Assert.assertEquals("结果错误",list2,list1);
    }

    /**
     * 苹果树为10
     */
    @Test
    public void show2() {
        List<Integer> list1 = appFinger.show(10);
        List<Integer> list2 = Arrays.asList(2,4);
        Assert.assertEquals("结果错误",list2,list1);
    }
    /**
     * 苹果树为499
     */
    @Test
    public void show3() {
        List<Integer> list1 =  appFinger.show(499);
        //错误示例，正确的为1,2,5,6,7,8,9；改为了1,2,4,6,7,8,9，结果会提示结果错误
        List<Integer> list2 = Arrays.asList(1,2,4,6,7,8,9);
        Assert.assertEquals("结果错误",list2,list1);

    }
    @Test
    /**
     * 苹果树为888
     */
    public void show4() {
        List<Integer> list1 = appFinger.show(888);
        List<Integer> list2 = Arrays.asList(1,2,3,4,8,9,10);
        Assert.assertEquals("结果错误",list2,list1);
    }
    @Test
    /**
     * 苹果树为1000,最右边界值
     */
    public void show5() {
        List<Integer> list1 =  appFinger.show(1000);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Assert.assertEquals("结果错误",list2,list1);
    }

}