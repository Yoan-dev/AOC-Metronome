package command;

import controller.Controller;

/**
 * Created by yoan on 16/11/16.
 */
public abstract class CommandImpl implements Command {

    protected Controller controller;

    public void setController (Controller controller) {
        this.controller = controller;
    }

    public void execute () {}
}
