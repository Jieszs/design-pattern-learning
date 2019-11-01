/**
 * @Author: zj
 * @Description: 为创建一个product对象各个部件的抽象类
 * @Date: 2019/11/1
 */
public abstract class AbstractBuilder {
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
