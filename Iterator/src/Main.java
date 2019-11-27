/**
 * 迭代模式
 * 分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以不暴露集合的内部结构，又可让
 * 外部透明的访问集合的数据
 * @author zj
 * @date 2019/11/26
 */
public class Main {

    public static void main(String[] args) {
        Aggregate aggregate = new Aggregate();
        aggregate.add("大鸟0");
        aggregate.add("大鸟1");
        aggregate.add("大鸟2");
        aggregate.add("大鸟3");
        aggregate.add("大鸟4");
        aggregate.add("大鸟5");
        AbstractIterator iterator = new Iterator(aggregate);
        System.out.println("天上飞来一只鸟 "+iterator.first());
        while (!iterator.isDone()) {
            System.out.println("天上飞过几只鸟？" + iterator.currentItem());
            iterator.next();
        }
    }
}
