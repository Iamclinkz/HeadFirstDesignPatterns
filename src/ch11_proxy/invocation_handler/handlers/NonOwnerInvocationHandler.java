package ch11_proxy.invocation_handler.handlers;

import ch11_proxy.invocation_handler.person.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//自己访问别人所用的handler
public class NonOwnerInvocationHandler implements InvocationHandler {
    Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //自己可以访问其他人的get方法
        //自己可以访问其他人的setGeekRating方法
        if(method.getName().startsWith("get") || method.getName().equals("setGeekRating"))
        {
            return method.invoke(person,args);
        }

        //其他人的其他方法，本人均不可以访问
        throw new Exception("illegal call");
    }
}
