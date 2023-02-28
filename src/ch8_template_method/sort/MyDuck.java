package ch8_template_method.sort;

//数组的元素需要实现Comparable<MyDuck>接口，才可以作为Arrays.sort()的参数。
//Arrays.sort()内部有对数组中元素的类似golang断言一样的转换。如果元素没有实现Comparable接口，
//则会抛出异常。
public class MyDuck implements Comparable<MyDuck>{
    int weight;
    String name;

    public MyDuck(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int compareTo(MyDuck other) {
        return Integer.compare(this.weight, other.weight);
    }
}
