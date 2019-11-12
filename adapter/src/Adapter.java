/**
 * 适配器
 *
 * @author zj
 * @date 2019/11/12
 */
public class Adapter implements ITarget{
    private ISource source;

    public Adapter(ISource source) {
        this.source = source;
    }

    @Override
    public void request() {
        source.specialRequire();
    }
}
