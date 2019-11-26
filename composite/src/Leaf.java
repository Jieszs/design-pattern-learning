/**
 * 在组合中表示叶子节点
 *
 * @author zj
 * @date 2019/11/25
 */
public class Leaf extends AbstractComponent {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(AbstractComponent component) {
        System.out.println("Leaf can't add...");
    }

    @Override
    public void remove(AbstractComponent component) {
        System.out.println("Leaf can't remove...");
    }

    @Override
    public void display(Integer depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
