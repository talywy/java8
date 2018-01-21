package tech.yuwang.lambda;

import java.util.Arrays;

/**
 * @author: yuwang@iflytek.com
 * @date: 2018/1/21 20:52
 */
public class LambdaTest {


    public static void main(String args[])  {
        Arrays.asList("a", "b", "d").forEach( e -> System.out.println( e ) );

        String[] strArray = new String[]{"A","B","C"};
        for (String aStrArray : strArray) {
            System.out.println(aStrArray + ",");
        }
    }


}
