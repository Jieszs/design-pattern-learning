/**
 * 负责创建备忘录，将当前的状态保存到备忘录，根据备忘录恢复之前的状态
 *
 * @author zj
 * @date 2019/11/18
 */
public class Originator {
    private String stateA;
    private String stateB;


    public Memento createMemento() {
        return new Memento(stateA, stateB);
    }

    public void setByMemento(Memento memento) {
        stateA = memento.getStateA();
        stateB = memento.getStateB();
    }

    public void show() {
        System.out.println("stateA --> " + stateA + "   stateB --> " + stateB);
    }

    public String getStateA() {
        return stateA;
    }

    public void setStateA(String stateA) {
        this.stateA = stateA;
    }

    public String getStateB() {
        return stateB;
    }

    public void setStateB(String stateB) {
        this.stateB = stateB;
    }
}
