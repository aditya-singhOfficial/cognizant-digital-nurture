public class RemoteControl {

    private Command currentCommand;

    public void setCommand(Command currentCommand) {
        this.currentCommand = currentCommand;
    }

    public void pressButton() {
        currentCommand.execute();
    }
}