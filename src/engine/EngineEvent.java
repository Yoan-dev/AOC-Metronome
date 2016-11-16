package engine;

import command.Command;

/**
 * Created by yoan on 09/11/16.
 */
public interface EngineEvent {

    void setCommand (Command command, TypeEvent type);
}
