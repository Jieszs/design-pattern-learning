/**
 * 现有接口的实现类
 *
 * @author zj
 * @date 2019/11/12
 */
public class SourceImpl implements ISource {
    @Override
    public void specialRequire() {
        System.out.println("specialRequire...");
    }
}
