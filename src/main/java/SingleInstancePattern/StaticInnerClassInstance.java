package SingleInstancePattern;

public class StaticInnerClassInstance {
    private StaticInnerClassInstance(){

    }
    public StaticInnerClassInstance getInstance(){
        return Holder.instance;
    }
    private static class Holder{
        public static StaticInnerClassInstance instance;
    }
}
