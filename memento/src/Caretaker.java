/**
 * 负责保存备忘录，不能操作和检查
 * @author zj
 * @date 2019/11/18
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
