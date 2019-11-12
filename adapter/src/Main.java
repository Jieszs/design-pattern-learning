import java.util.Arrays;

/**
 * 适配器模式
 * 定义：将已存在的接口转换成客户端需要的接口
 * 作用：使原本不兼容的接口能够兼容，一起工作
 * 适用于：系统的功能和数据都正确，但接口不符时
 * 注意：适配器模式，是亡羊补牢，最好的方法是重构，统一接口。双方都不太容易修改时，才使用。
 * 示例：Arrays.asList()
 * @author zj
 * @date 2019/11/12
 */
public class Main {

    public static void main(String[] args) {
        ITarget target = new Adapter(new SourceImpl());
        target.request();
    }
}
