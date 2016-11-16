package ihm;

/**
 * Created by yoan on 09/11/16.
 */
public interface IHM {

    float getCursorPosition ();

    void updateTempo (float value);

    void updateTime (int value);

    void updateStarted (boolean value);

}
