package command.events;

import command.CommandImpl;

/**
 * Created by yoan on 09/11/16.
 */
public class TimeUp extends CommandImpl {

    @Override
    public void execute () {
        controller.timeUp();
    }
}
