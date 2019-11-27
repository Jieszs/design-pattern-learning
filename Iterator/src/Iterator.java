/**
 * @author zj
 * @date 2019/11/26
 */
public class Iterator extends AbstractIterator {
    private Aggregate aggregate;
    private Integer current = 0;

    public Iterator(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    Object first() {
        return aggregate.get(0);
    }

    @Override
    Object next() {
        if (isDone()) {
            return null;
        }
        current++;
        if (current < aggregate.count()) {
            return aggregate.get(current);
        }
        return null;
    }

    @Override
    Boolean isDone() {
        return current >= aggregate.count();
    }

    @Override
    Object currentItem() {
        return aggregate.get(current);
    }
}
