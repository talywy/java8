package tech.yuwang.function;

import java.util.function.Supplier;

/**
 * @author: yuwang@iflytek.com
 * @date: 2018/1/21 21:26
 */
public interface DefaultFactory {

    /**
     * 创建一个Defaultable实例
     *
     * @param supplier
     * @return
     */
    static Defaultable create(Supplier<Defaultable> supplier) {
        return supplier.get();
    }
}
