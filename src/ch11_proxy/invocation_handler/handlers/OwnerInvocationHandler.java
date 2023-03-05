package ch11_proxy.invocation_handler.handlers;

import ch11_proxy.invocation_handler.person.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//自己访问自己所用的handler
public class OwnerInvocationHandler implements InvocationHandler {
    Person person;

    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //自己可以访问自己的get方法
        if(method.getName().startsWith("get"))
        {
            return method.invoke(person,args);
        }

        //自己不可以访问自己的setGeekRating方法
        if(method.getName().equals("setGeekRating"))
        {
            throw new Exception("illegal call");
        }

        //自己可以访问除了setGeekRating之外的其他的set方法
        if(method.getName().startsWith("set"))
        {
            return method.invoke(person,args);
        }

        throw new Exception("illegal call");
    }
}
