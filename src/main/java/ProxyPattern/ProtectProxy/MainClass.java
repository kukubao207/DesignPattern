package ProxyPattern.ProtectProxy;

import java.lang.reflect.Proxy;

public class MainClass {
    PersonBean p1;

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.drive();
    }

    public MainClass() {
        this.p1 = new PersonBeanImpl("wjq", "男", "swim", 5);
    }

    public void drive() {

        //作为p1本人访问p1对象
        PersonBean ownerProxy = getOwnerProxy(p1);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        try {
            ownerProxy.setHotOrNotRating(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        //作为其他人访问p1对象
        PersonBean nonOwnerProxy = getNonOwnerProxy(p1);

        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");

        } catch (Exception e) {
            e.printStackTrace();
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

    }

    PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }

    PersonBean getNonOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
    }
}
