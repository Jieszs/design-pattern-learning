public class Main {
    /**
     * 策略模式加简单工厂
     * */
    public static void main(String[] args) {
        ContextFactory.create("A").contextInterface();
        ContextFactory.create("B").contextInterface();
    }
}
