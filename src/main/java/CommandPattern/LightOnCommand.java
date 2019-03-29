package CommandPattern;

public class LightOnCommand implements Command {
    Light light;
    LightOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.LightOn();
    }
    public void undo(){
        light.LightOff();
    }
}
