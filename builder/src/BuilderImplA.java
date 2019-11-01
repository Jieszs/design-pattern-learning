/**
 * @Author: zj
 * @Description:
 * @Date: 2019/11/1
 */
public class BuilderImplA extends AbstractBuilder {
    private Product product;

    public BuilderImplA() {
        product =new Product();
    }

    @Override
    public void buildPartA() {
        product.addPart("部件：A");
    }

    @Override
    public void buildPartB() {
        product.addPart("部件：B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
