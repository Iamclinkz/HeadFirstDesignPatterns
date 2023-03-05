package ch11_proxy.invocation_handler.person;

public interface Person {
 
	String getName();
	String getGender();
	String getInterests();
	int getGeekRating();
 
    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    //设置Rating，只允许非自己的对象设置
    void setGeekRating(int rating); 
 
}
