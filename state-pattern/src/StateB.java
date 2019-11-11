/**
 * @author zj
 * @date 2019/11/7
 */
public class StateB implements IState {

    @Override
    public void handle() {
        System.out.println("我最近压力真的很大！");
    }

    @Override
    public void control(Context context) {
        context.setState(new StateC());
        System.out.println(context.getState().getClass().getSimpleName() + " has been set");
    }
}
