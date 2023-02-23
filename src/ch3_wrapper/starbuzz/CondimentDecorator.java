package ch3_wrapper.starbuzz;

public abstract class CondimentDecorator extends Beverage{
    //装饰器类型，内部持有一个饮料实例，通过wrap，给此饮料实例添加额外的功能
    //（在本例中包括了价格的计算，以及描述的增加）
    public Beverage wrapped;

    //通过传入wrapped，构造自己
    public CondimentDecorator(Beverage beverage) {
        this.wrapped = beverage;
    }

    @Override
    public float getCondimentAdditionalPrice() {
        //这里千万千万要小心，作为一个装饰者（wrapper），我们需要返回的是
        //wrapped的属性！因为继承关系，我们自己同样也有size属性，但是
        //这个属性是无效的！！应该使用的是wrapped.Size()。
        //之前没有override本方法，只是在调料实例类，例如Milk中的cost()方法中使用了
        //wrapped.getCondimentAdditionalPrice(),导致了错误。因为wrapped可能wrapped
        //了多层，而Milk直接wrap的如果是一个调料实例类，那么该调料实例类中的size属性是无效的！！
        //这里千万要留意！
        return wrapped.getCondimentAdditionalPrice();
    }
}
