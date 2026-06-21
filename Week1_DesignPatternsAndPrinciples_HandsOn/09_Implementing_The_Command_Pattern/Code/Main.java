public class Main {

    public static void main(String[] args) {

        System.out.println("Command Pattern Demo");
        System.out.println("--------------------");

        Light roomLight = new Light();

        Command switchOnCommand = new LightOnCommand(roomLight);
        Command switchOffCommand = new LightOffCommand(roomLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(switchOnCommand);
        remote.pressButton();

        remote.setCommand(switchOffCommand);
        remote.pressButton();
    }
}