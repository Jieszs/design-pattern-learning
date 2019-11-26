/**
 * 组合模式
 * 将对象组合成树形结构以表示 部分-整体 的层次结构。组合使得用户，对单个对象进行的操作，
 * 和对组织进行的操作，是一样的 具有一致性
 *
 * 透明方式：Leaf拥有add,和remove接口，使得叶节点和树枝节点对于外界来说没有区别，具备完全一致的接口
 * 安全方式:Leaf没有add,和remove接口，而树枝节点有，但是客户端调用时，需要进行判断，带来不便
 *
 * 使用场景：希望用户忽略组合对象和单个对象的不同，统一使用组合结构中的所有对象，就考虑用组合模式。
 * @author zj
 * @date 2019/11/25
 */
public class Main {

    public static void main(String[] args) {
        Composite root =new Composite("根");
        root.add(new Leaf("叶子A"));
        root.add(new Leaf("叶子B"));

        Composite compositeA =new Composite("树枝A");
        compositeA.add(new Leaf("叶子AA"));
        compositeA.add(new Leaf("叶子AB"));
        root.add(compositeA);

        Composite compositeAA =new Composite("树枝AA");
        compositeAA.add(new Leaf("叶子AAA"));
        compositeAA.add(new Leaf("叶子AAB"));
        compositeA.add(compositeAA);

        Composite compositeB =new Composite("树枝B");
        compositeB.add(new Leaf("叶子BB"));
        root.add(compositeB);

        root.display(0);

        compositeA.display(0);
    }
}
