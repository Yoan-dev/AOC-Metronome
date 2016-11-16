package controller;

import engine.Engine;
import ihm.IHM;

/**
 * Created by yoan on 09/11/16.
 */
public class ControllerImpl implements Controller {

    private IHM ihm;
    private Engine engine;

    public ControllerImpl (IHM ihm, Engine engine) {
        this.ihm = ihm;
        this.engine = engine;
    }

    @Override
    public void setTempo () {
        engine.setTempo(ihm.getCursorPosition());
    }

    @Override
    public void timeUp () {
        engine.timeUp();
    }

    @Override
    public void timeDown () {
        engine.timeDown();
    }

    @Override
    public void start () {
        engine.start();
    }

    @Override
    public void stop () {
        engine.stop();
    }

    @Override
    public void updateTempo () {
        ihm.updateTempo(engine.getTempo());
    }

    @Override
    public void updateTime () {
        ihm.updateTime(engine.getTime());
    }

    @Override
    public void updateStarted () {
        ihm.updateStarted(engine.isStarted());
    }

}
