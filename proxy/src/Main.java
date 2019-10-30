public class Main {
    /***
     * 代理模式
     *
     * 代理模式内部创建实体并隐藏实体，装饰模式外部存在实体
     */
    public static void main(String[] args) {
        Proxy proxy =new Proxy();
        proxy.require();
    }
}
