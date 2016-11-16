package command.events;

import command.CommandImpl;

/**
 * Created by yoan on 09/11/16.
 */
public class Start extends CommandImpl {

    @Override
    public void execute () {
        controller.start();
    }
}
