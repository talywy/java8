package tech.yuwang.function;

import java.util.Arrays;
import java.util.List;

/**
 * @author: yuwang@iflytek.com
 * @date: 2018/1/21 21:06
 */
public class FunctionTest {

    public static void main(String args[]) {
        Defaultable a = DefaultFactory.create(DefaultableImpl::new);
        a.method();
        a.defaultMethod();

        Defaultable b = DefaultFactory.create(OverrideImpl::new);
        b.method();
        b.defaultMethod();

        // 方法引用
        List<Defaultable> lists = Arrays.asList(a, b);
        lists.forEach(Defaultable::method);
        lists.forEach(Defaultable::defaultMethod);
    }
}
