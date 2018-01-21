package tech.yuwang.stream;

import tech.yuwang.State;
import tech.yuwang.function.DefaultFactory;
import tech.yuwang.function.Defaultable;
import tech.yuwang.function.DefaultableImpl;
import tech.yuwang.function.OverrideImpl;

import java.util.Arrays;

/**
 * @author: yuwang@iflytek.com
 * @date: 2018/1/21 21:21
 */
public class StreamTest {

    public static void main(String args[]) {

        Defaultable a = DefaultFactory.create(DefaultableImpl::new);
        Defaultable b = DefaultFactory.create(OverrideImpl::new);
        Defaultable c  = DefaultFactory.create(OverrideImpl::new);

        long totalOpenClassNum = Arrays.asList(a, b,c )
                .stream()                                   // 把list流化
                .filter(e -> e.getState() == State.Open)    // 过滤掉状态不为open的对象
                .mapToInt(Defaultable::getNum)              // 把对象流map成int流
                .sum();                                     // 调用int流的sum方法计算总和

        System.out.println(totalOpenClassNum);
    }
}