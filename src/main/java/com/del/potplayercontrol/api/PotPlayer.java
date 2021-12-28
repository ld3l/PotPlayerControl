package com.del.potplayercontrol.api;

import com.del.potplayercontrol.impl.Window;

public interface PotPlayer {
    Window getWindow();
    void pause();
    void stop();
    void play();
    void previous();
    void next();
    void playPause();
    void volumeUp();
    void volumeDown();
    void mute();
    void toggleSub();
    void toggleOsd();
    void fiveSecBack();
    void fiveSecForward();
    void thirtySecForward();
    void thirtySecBack();
    void oneMinuteBack();
    void oneMinuteForward();
    void fiveMinuteBack();
    void fiveMinuteForward();
    void speedUp();
    void speedDown();
    void speedNormal();
    void fullscreen();
    /**
     * @return current volume 0-100
     */
    int getVolume();
    /**
     * @param volume volume 0-100
     */
    void setVolume(int volume);
    /**
     * @return total time in ms
     */
    long getTotalTime();
    /**
     * @return progress time in ms
     */
    long getProgressTime();
    /**
     * @return current time in ms
     */
    long getCurrentTime();

    /**
     * Set current time value
     *
     * @param  time in ms
     */
    void setCurrentTime(long time);
    PlayStatus getPlayStatus();
    /**
     * Send key press by KeyCode
     *
     * @param  key key code
     */
    void sendVirtualKey(int key);
}
