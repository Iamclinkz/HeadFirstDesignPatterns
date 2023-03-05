package ch11_proxy.invocation_handler;

import ch11_proxy.invocation_handler.person.Person;
import ch11_proxy.invocation_handler.person.PersonImpl;

import java.util.HashMap;

public class Main {
    static HashMap<String, Person> datingDB = new HashMap<String, Person>();

    static void initializeDatabase() {
        Person joe = new PersonImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setGeekRating(7);
        datingDB.put(joe.getName(), joe);

        Person kelly = new PersonImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setGeekRating(6);
        datingDB.put(kelly.getName(), kelly);
    }

    static Person getPersonFromDatabase(String name) {
        return (Person)datingDB.get(name);
    }

    public static void main(String[] args) {
        initializeDatabase();

        Person joe = getPersonFromDatabase("Joe Javabean");
        Person joeOwnerProxy = ProxyFactory.getOwnerProxy(joe);
        Person joeNonOwnerProxy = ProxyFactory.getNonOwnerProxy(joe);

        joeOwnerProxy.setName("joe joe");       //ok
        joeOwnerProxy.setGender("mile");        //ok
        joeNonOwnerProxy.setGeekRating(100);    //ok
        try{
            joeNonOwnerProxy.setGender("mile");
        }catch (Exception e) {
            e.printStackTrace();
        }

        try{
            joeOwnerProxy.setGeekRating(100);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
