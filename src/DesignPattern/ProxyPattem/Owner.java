package DesignPattern.ProxyPattem;

/**
 * @author cqf
 * @date 2022/7/19 -21:56
 */
public class Owner implements People{
    @Override
    public void getMoney(int money) {
        System.out.println("房东收到"+money+"房租");
    }
}
