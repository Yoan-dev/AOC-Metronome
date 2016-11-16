package engine;

import command.Command;

import java.util.HashMap;

/**
 * Created by yoan on 09/11/16.
 */
public class EngineImpl implements Engine, EngineEvent {

    private HashMap <TypeEvent, Command> commands = new HashMap<>();

    private float tempo;
    private int time;
    private boolean started;

    public EngineImpl () {
        tempo = 0;
        time = 0;
        started = false;
    }

    @Override
    public void setCommand (Command command, TypeEvent type) {
        commands.put(type, command);
    }

    @Override
    public void setTempo (float value) {
        tempo = value;
        commands.get(TypeEvent.UPDATE_TEMPO).execute();
    }

    @Override
    public void timeUp () {
        time++;
        commands.get(TypeEvent.UPDATE_TIME).execute();
    }

    @Override
    public void timeDown () {
        time--;
        commands.get(TypeEvent.UPDATE_TIME).execute();
    }

    @Override
    public void start () {
        started = true;
        commands.get(TypeEvent.UPDATE_STARTED).execute();
    }

    @Override
    public void stop () {
        started = false;
        commands.get(TypeEvent.UPDATE_STARTED).execute();
    }

    @Override
    public float getTempo () {
        return tempo;
    }

    @Override
    public int getTime () {
        return time;
    }

    @Override
    public boolean isStarted () {
        return started;
    }
}
