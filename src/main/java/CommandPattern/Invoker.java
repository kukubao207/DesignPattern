package CommandPattern;

public class Invoker {
    Command slot;
    public Invoker(){}
    public void setCommand(Command command){
        this.slot = command;
    }
    public void invoke(){
        slot.execute();
    }
}
