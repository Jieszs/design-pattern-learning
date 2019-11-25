/**
 * 备忘录，负责保存Originator的状态，并防止其他对象访问
 *
 * @author zj
 * @date 2019/11/18
 */
public class Memento {
    private String stateA;
    private String stateB;
    public Memento() {
    }

    public Memento(String stateA, String stateB) {
        this.stateA = stateA;
        this.stateB = stateB;
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
