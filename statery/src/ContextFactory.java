/**
 * 策略模式加简单工厂
 * */

public class ContextFactory {
    public static Context create(String s) {
        Context context = null;
        switch (s) {
            case "A":
                context = new Context(new StrategyA());
                break;
            case "B":
                context = new Context(new StrategyB());
            default:
                break;
        }
        return context;
    }
}
