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
    int getVolume();
    void setVolume(int volume);
    long getTotalTime();
    long getProgressTime();
    long getCurrentTime();
    void setCurrentTime(long time);
    PlayStatus getPlayStatus();
    void sendVirtualKey(int key);
}
