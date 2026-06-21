public class LightOnCommand implements Command {

    private Light roomLight;

    public LightOnCommand(Light roomLight) {
        this.roomLight = roomLight;
    }

    @Override
    public void execute() {
        roomLight.switchOn();
    }
}