package ProxyPattern.ProtectProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

    //被代理对象
    PersonBean personBean;
    public OwnerInvocationHandler(PersonBean personBean){
        this.personBean = personBean;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException{
        try{
            if(method.getName().startsWith("get")){
                return method.invoke(personBean,args);
            }else if(method.getName().equals("setHotOrNotRating")){
                throw new IllegalAccessException();
            }else if(method.getName().startsWith("set")){
                return method.invoke(personBean,args);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
