import java.util.ArrayList;
import java.util.List;

/**
 * 定义为树枝节点
 *
 * @author zj
 * @date 2019/11/25
 */
public class Composite extends AbstractComponent {
    private List<AbstractComponent> componentList = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(AbstractComponent component) {
        componentList.add(component);
    }

    @Override
    public void remove(AbstractComponent component) {
        componentList.remove(component);
    }

    @Override
    public void display(Integer depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (AbstractComponent component : componentList) {
            component.display(depth + 2);
        }
    }
}
