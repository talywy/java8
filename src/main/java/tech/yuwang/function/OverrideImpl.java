package tech.yuwang.function;

import tech.yuwang.State;

/**
 * @author: yuwang@iflytek.com
 * @date: 2018/1/21 21:10
 */
public class OverrideImpl implements Defaultable {
    @Override
    public void method() {
        System.out.println("normal method has been executed...");
    }

    @Override
    public State getState() {
        return State.Open;
    }

    @Override
    public void defaultMethod() {
        System.out.println("override default method has been executed from implement class...");
    }
}
