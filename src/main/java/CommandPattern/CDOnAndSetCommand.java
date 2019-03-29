package CommandPattern;

public class CDOnAndSetCommand implements Command {
    CD cd;
    CDOnAndSetCommand(CD cd){
        this.cd =cd;
    }
    public void execute(){
        cd.on();
        cd.setCD();
        cd.setVolumn(11);
    }
    public void undo(){
        cd.stop();
    }
}
