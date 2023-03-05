package ch11_proxy.invocation_handler;

import ch11_proxy.invocation_handler.handlers.NonOwnerInvocationHandler;
import ch11_proxy.invocation_handler.handlers.OwnerInvocationHandler;
import ch11_proxy.invocation_handler.person.Person;

import java.lang.reflect.Proxy;

//为handlers创建代理。大概的层级关系为：
//1.用户通过proxyFactory拿到wrap的person的proxy
//2.调用proxy的某个方法
//3.proxy调用创建proxy时传入的InvocationHandler的invoke方法，并将用户请求的方法的元数据传入
//4.invoke方法通过对用户调用方法的元数据进行校验，看是否符合规定
//5.如果不符合规定，抛异常，否则转发给proxy持有的person，执行实际的请求，并返回
public class ProxyFactory {
    public static Person getOwnerProxy(Person person)
    {
        //使用java的反射包中的Proxy.newProxyInstance，为person创建一个wrapper（aka代理），
        //通过这个wrapper调用Person的api，会调用到OwnerInvocationHandler的invoke方法，
        //通过这个方法进行例如身份的鉴定等操作。

        //注意，这个通过Proxy.newProxyInstance创建的，才是是真正的Person的代理
        //是java的反射包帮忙生成的。而我们的handlers包中的几个handler，相当于是帮助代理进行请求过滤/转发的，
        //类似于http handler的类，http框架接受请求，然后把请求转发给他们处理。
        //同样注意 proxy设计模式中的代理类，是需要同被代理的类具有相同的接口的。
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    public static Person getNonOwnerProxy(Person person)
    {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
}
