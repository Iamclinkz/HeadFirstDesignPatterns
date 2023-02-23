package ch3_wrapper.starbuzz;

public abstract class Beverage {
    //Size这部分是P99的例题额外加上的。
    public enum Size
    {
        TALL,
        GRANDE,
        VENTI,
    }

    Size size = Size.TALL;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public float getCondimentAdditionalPrice()
    {
        if(size == Size.TALL)
            return 1;
        if(size == Size.GRANDE)
            return 1.5f;
        else
            return 2;
    }

    //每个正常的饮料，都应该有description字段，用于表示饮料的类型
    public String description = "Unknown";

    public String getDescription()
    {
        return description;
    }

    public abstract double cost();
}
