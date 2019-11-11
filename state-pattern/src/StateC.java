/**
 * @author zj
 * @date 2019/11/7
 */
public class StateC implements IState {

    @Override
    public void handle() {
        System.out.println("李雪琴，你好，我是吴亦凡！");
    }

    @Override
    public void control(Context context) {
        context.setState(new StateA());
        System.out.println(context.getState().getClass().getSimpleName() + " has been set");
    }
}
