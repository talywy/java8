package tech.yuwang.function;

import tech.yuwang.State;

import java.util.Random;

/**
 * @author: yuwang@iflytek.com
 * @date: 2018/1/21 20:59
 */
public interface Defaultable {

    /**
     * normal method define
     */
    void method();

    /**
     * 获取状态
     * @return
     */
    State getState();

    /**
     * default method define
     */
    default void  defaultMethod(){
        System.out.println("default method has been executed...");
    }

    /**
     * 获取数字
     *
     * @return
     */
    default int getNum() {
        Integer i = new Random().nextInt(10);
        System.out.println("num is:" + i);
        return i;
    }
}
