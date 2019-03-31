package SingleInstancePattern;

public class EagerInstance {
    public static EagerInstance instance;
    private EagerInstance(){

    }
    public static EagerInstance getInstance(){
        return instance;
    }
}
