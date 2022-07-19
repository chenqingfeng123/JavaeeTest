package DesignPattern.ProxyPattem;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author cqf
 * @date 2022/7/19 -22:03
 */
public class Handle implements InvocationHandler {
    private People owner;

    public Handle(People owner){
        this.owner = owner;
    }

    // proxy为代理对象
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始");
        method.invoke(owner,args);
        System.out.println("结束");
        return null;
    }
}
