/**
 * 组合中对象的声明接口，在适当情况下，实现所有类共同的默认行为
 * @author zj
 * @date 2019/11/25
 */
abstract class AbstractComponent {
    protected String name;

    public AbstractComponent(String name) {
        this.name = name;
    }
    public abstract void add(AbstractComponent component);
    public abstract void remove(AbstractComponent component);
    public abstract void display(Integer depth);
}
