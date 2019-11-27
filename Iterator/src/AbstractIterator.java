/**
 * 迭代抽象类
 * @author zj
 * @date 2019/11/26
 */
abstract class AbstractIterator {
    abstract Object first();
    abstract Object next();
    abstract Boolean isDone();
    abstract Object currentItem();
}
