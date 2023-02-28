package ch8_template_method.caffeine_beverage;

public abstract class CaffeineBeverage {
    //做出一杯完整的饮料
    public void prepareRecipe()
    {
        boilWater();
        brew();
        pourInCup();
        addCondiment();
        hook();
    }

    //把水煮沸，这个方法希望子类不要覆盖，使用private或者final修饰均可
    final public void boilWater()
    {
        System.out.println("boilWater");
    }

    //倒入到cup中
    final public void pourInCup()
    {
        System.out.println("pourInCup");
    }

    //放入调料，冲泡
    public abstract void brew();

    //加入其他的调料
    public abstract void addCondiment();

    //子类可以选择override与否，如果不继承，执行默认的方法
    public void hook()
    {

    }
}
