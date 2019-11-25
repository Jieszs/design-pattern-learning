/**
 * 备忘录模式
 * 在不破坏封装的前提下，捕获对象的内在状态，并在对象外部保存，之后就可以讲对象恢复到原先保存的状态
 *
 * @author zj
 * @date 2019/11/18
 */
public class Main {

    public static void main(String[] args) {
        Originator originator =new Originator();
        originator.setStateA("A");
        originator.setStateB("B");
        originator.show();

        Caretaker caretaker =new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setStateA("B");
        originator.show();
        originator.setByMemento(caretaker.getMemento());
        originator.show();


    }
}
