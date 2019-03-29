package CommandPattern;

public class Main {
    public static void main(String[] args){
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        CD cd = new CD();
        CDOnAndSetCommand cdOnAndSetCommand = new CDOnAndSetCommand(cd);
        CDOffCommand cdOffCommand = new CDOffCommand(cd);

        RemoteControl remoteControl =new RemoteControl();
        remoteControl.setCommands(0,lightOnCommand,lightOffCommand);
        remoteControl.setCommands(1,cdOnAndSetCommand,cdOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.onButtonWasUnPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.onButtonWasUnPressed(1);

    }
}
