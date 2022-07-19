package DesignPattern.ProxyPattem;

import java.lang.reflect.Proxy;

/**
 * @author cqf
 * @date 2022/7/19 -22:02
 */
public class StudentTest {
    public static void main(String[] args) {
        int money = 2000;
        People people = new Owner();
        Handle handle = new Handle(people);
        People proxyPeople = (People) Proxy.newProxyInstance(People.class.getClassLoader(),new Class[]{People.class},handle);
        proxyPeople.getMoney(money);
    }
}
