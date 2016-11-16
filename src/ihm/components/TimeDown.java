package ihm.components;

import command.Command;

/**
 * Created by yoan on 09/11/16.
 */
public class TimeDown implements Component {

    private Command command;

    @Override
    public void setCommand (Command command) {
        this.command = command;
    }
}
