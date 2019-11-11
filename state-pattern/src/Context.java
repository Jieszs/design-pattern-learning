/**
 * 上下文实例对象
 * @author zj
 * @date 2019/11/7
 */
public class Context {
    private IState state;

    public Context(IState state) {
        this.state = state;
    }
    public void request(){
        System.out.println("Context request ——>"+state.getClass().getSimpleName());
        state.handle();
        state.control(this);
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
}
