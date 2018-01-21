package tech.yuwang.function;

import tech.yuwang.State;

import java.util.Date;
import java.util.Random;

/**
 * @author: yuwang@iflytek.com
 * @date: 2018/1/21 21:01
 */
public class DefaultableImpl implements Defaultable {

    @Override
    public void method() {
        System.out.println("normal method has been executed...");
    }

    @Override
    public State getState() {
        return State.Close;
    }


}
