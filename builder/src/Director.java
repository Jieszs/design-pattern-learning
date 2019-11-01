/**
 * @Author: zj
 * @Description:指挥者，构建一个builder接口的使用对象，确定构造的顺序
 * 控制建造过程，隔离用户和建造过程的关联
 * @Date: 2019/11/1
 */
public class Director {
    public void construct(AbstractBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
