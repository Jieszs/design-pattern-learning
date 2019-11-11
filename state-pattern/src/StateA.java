/**
 * @author zj
 * @date 2019/11/7
 */
public class StateA implements IState {

    @Override
    public void handle() {
        System.out.println("我太难了！");
    }

    @Override
    public void control(Context context) {
        context.setState(new StateB());
        System.out.println(context.getState().getClass().getSimpleName() + " has been set");
    }
}
