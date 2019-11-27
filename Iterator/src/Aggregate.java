import java.util.ArrayList;
import java.util.List;

/**
 * @author zj
 * @date 2019/11/26
 */
public class Aggregate extends AbstractAggregate {
    private List<Object> items = new ArrayList<>();

    @Override
    public AbstractIterator createIterator() {
        return new Iterator(this);
    }

    Integer count() {
        return items.size();
    }

    Object get(Integer index) {
        return items.get(index);
    }

    void set(Integer index, Object o) {
        items.set(index, o);
    }

    void add(Object o) {
        items.add(o);
    }
}
