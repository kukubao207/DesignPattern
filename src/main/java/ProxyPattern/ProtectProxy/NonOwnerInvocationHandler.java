package ProxyPattern.ProtectProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

    //被代理对象
    PersonBean personBean ;
    public NonOwnerInvocationHandler(PersonBean personBean){
        this.personBean=personBean;
    }

    public Object invoke(Object proxy, Method method,Object[] args) throws IllegalAccessException {
        try{
            if(method.getName().startsWith("get")){
                return method.invoke(personBean,args);
            }else if(method.getName().equals("setHotOrNotRating")){
                return method.invoke(personBean,args);
            }else if(method.getName().startsWith("set")){
                throw new IllegalAccessException();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
