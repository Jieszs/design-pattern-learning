/**
 * @Author: zj
 * @Description:
 * @Date: 2019/11/1
 */
public class BuilderImplB extends AbstractBuilder {
    private Product product;

    public BuilderImplB() {
        product =new Product();
    }

    @Override
    public void buildPartA() {
        product.addPart("部件：X");
    }

    @Override
    public void buildPartB() {
        product.addPart("部件：Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
