package command.updates;

import command.CommandImpl;

/**
 * Created by yoan on 09/11/16.
 */
public class UpdateTime extends CommandImpl {

    @Override
    public void execute () {
        controller.updateTime();
    }
}
