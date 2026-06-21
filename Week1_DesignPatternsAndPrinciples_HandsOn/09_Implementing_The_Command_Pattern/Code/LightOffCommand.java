public class LightOffCommand implements Command {

    private Light roomLight;

    public LightOffCommand(Light roomLight) {
        this.roomLight = roomLight;
    }

    @Override
    public void execute() {
        roomLight.switchOff();
    }
}