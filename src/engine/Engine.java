package engine;

/**
 * Created by yoan on 09/11/16.
 */
public interface Engine {

    void setTempo (float value);

    void start ();

    void stop ();

    void timeUp ();

    void timeDown ();

    float getTempo ();

    int getTime ();

    boolean isStarted ();
}
