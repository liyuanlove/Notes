package com.eric.chapter02;

/**
 * 原书第二章 【通过行为参数传递代码】
 *
 *  编写一个程序帮助农民了解自己的库存，这位农民可能想有一个查找库存中所有绿色苹果的功能，但是第二天，
 *  他可能告诉你：“其实我还想找出所有重量超过150g的苹果。”又过了两天，农民又跑过来补充到：“要是我
 *  可以找出即是绿色，重量也超过150g苹果就好了”
 *
 */

import com.eric.chapter02.dto.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * 第一次尝试
 * 编写一个少选绿色苹果的方法发
 */
public class Try01 {

    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result= new ArrayList<>();
        for (Apple apple : inventory){
            if ("green".equals(apple.getColor()))
                result.add(apple);
        }
        return result;
    }



}
