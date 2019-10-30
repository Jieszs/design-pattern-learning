public class RealSubject implements Subject{
    @Override
    public void require() {
        System.out.println("请求");
    }
}
