package controller;

import engine.Engine;
import ihm.IHM;

/**
 * Created by yoan on 09/11/16.
 */
public interface Controller {

    void setTempo ();

    void timeUp ();

    void timeDown ();

    void start ();

    void stop ();

    void updateTempo ();

    void updateTime ();

    void updateStarted ();

}
