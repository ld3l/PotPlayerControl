package com.del.potplayercontrol.impl;

import com.del.potplayercontrol.api.PlayStatus;
import com.del.potplayercontrol.api.PotPlayer;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;


public class JNAPotPlayer implements PotPlayer {

    private final Window window;
    int COMMAND_TYPE = 273;
    int REQUEST_TYPE = 1024;

    public static WinDef.LRESULT sendRawCommand(Window window, int winuser, int command, int value){
        return sendRawCommand(window.getHwnd(),winuser,command,value);
    }

    public static WinDef.LRESULT sendRawCommand(WinDef.HWND hwnd, int winuser, int command, int value){
        return User32.INSTANCE.SendMessage(hwnd, winuser, new WinDef.WPARAM(command),
                new WinDef.LPARAM(value));
    }

    public JNAPotPlayer(Window window) {
        this.window = window;
    }

    @Override
    public void pause() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.PAUSE),
                new WinDef.LPARAM(0));
    }

    @Override
    public void stop() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.STOP),
                new WinDef.LPARAM(0));

    }

    @Override
    public void play() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.PLAY),
                new WinDef.LPARAM(0));
    }

    @Override
    public void previous() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.PREVIOUS),
                new WinDef.LPARAM(0));
    }

    @Override
    public void next() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.NEXT),
                new WinDef.LPARAM(0));
    }

    @Override
    public void playPause() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.PLAY_PAUSE),
                new WinDef.LPARAM(0));
    }

    @Override
    public void volumeUp() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.VOLUME_UP),
                new WinDef.LPARAM(0));
    }

    @Override
    public void volumeDown() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.VOLUME_DOWN),
                new WinDef.LPARAM(0));
    }

    @Override
    public void mute() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.TOGGLE_MUTE),
                new WinDef.LPARAM(0));
    }

    @Override
    public void toggleSub() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.TOGGLE_SUBS),
                new WinDef.LPARAM(0));
    }

    @Override
    public void toggleOsd() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.TOGGLE_OSD),
                new WinDef.LPARAM(0));
    }

    @Override
    public void fiveSecBack() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.FIVE_SEC_BACK),
                new WinDef.LPARAM(0));
    }

    @Override
    public void fiveSecForward() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.FIVE_SEC_FORWARD),
                new WinDef.LPARAM(0));
    }

    @Override
    public void thirtySecForward() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.THIRTY_SEC_FORWARD),
                new WinDef.LPARAM(0));
    }

    @Override
    public void thirtySecBack() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.THIRTY_SEC_BACK),
                new WinDef.LPARAM(0));
    }

    @Override
    public void oneMinuteBack() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.ONE_MIN_BACK),
                new WinDef.LPARAM(0));
    }

    @Override
    public void oneMinuteForward() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.ONE_MIN_FORWARD),
                new WinDef.LPARAM(0));
    }

    @Override
    public void fiveMinuteBack() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.FIVE_MIN_BACK),
                new WinDef.LPARAM(0));
    }

    @Override
    public void fiveMinuteForward() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.FIVE_MIN_FORWARD),
                new WinDef.LPARAM(0));
    }

    @Override
    public void speedUp() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.SPEED_UP),
                new WinDef.LPARAM(0));
    }

    @Override
    public void speedDown() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.SPEED_DOWN),
                new WinDef.LPARAM(0));
    }

    @Override
    public void speedNormal() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.SPEED_NORMAL),
                new WinDef.LPARAM(0));
    }

    @Override
    public void fullscreen() {
        User32.INSTANCE.PostMessage(window.getHwnd(), COMMAND_TYPE, new WinDef.WPARAM(JNAMessageConst.FULLSCREEN),
                new WinDef.LPARAM(0));
    }

    @Override
    public int getVolume() {
        return User32.INSTANCE.SendMessage(window.getHwnd(), REQUEST_TYPE, new WinDef.WPARAM(JNAMessageConst.GET_VOLUME),
                new WinDef.LPARAM(0)).intValue();
    }

    @Override
    public void setVolume(int volume) {
        User32.INSTANCE.PostMessage(window.getHwnd(), REQUEST_TYPE, new WinDef.WPARAM(JNAMessageConst.SET_VOLUME),
                new WinDef.LPARAM(volume));
    }

    @Override
    public long getTotalTime() {
        return User32.INSTANCE.SendMessage(window.getHwnd(), REQUEST_TYPE, new WinDef.WPARAM(JNAMessageConst.GET_TOTAL_TIME),
                new WinDef.LPARAM(0)).longValue();
    }

    @Override
    public long getProgressTime() {
        return User32.INSTANCE.SendMessage(window.getHwnd(), REQUEST_TYPE, new WinDef.WPARAM(JNAMessageConst.GET_PROGRESS_TIME),
                new WinDef.LPARAM(0)).longValue();
    }

    @Override
    public long getCurrentTime() {
        return User32.INSTANCE.SendMessage(window.getHwnd(), REQUEST_TYPE, new WinDef.WPARAM(JNAMessageConst.GET_CURRENT_TIME),
                new WinDef.LPARAM(0)).longValue();
    }

    @Override
    public void setCurrentTime(long time) {
        User32.INSTANCE.PostMessage(window.getHwnd(), REQUEST_TYPE, new WinDef.WPARAM(JNAMessageConst.SET_CURRENT_TIME),
                new WinDef.LPARAM(time));
    }

    @Override
    public PlayStatus getPlayStatus() {
        int i = User32.INSTANCE.SendMessage(window.getHwnd(), REQUEST_TYPE, new WinDef.WPARAM(JNAMessageConst.GET_PLAY_STATUS),
                new WinDef.LPARAM(0)).intValue();
        System.out.println(i);
        switch (i) {
            case -1:
                return PlayStatus.Stopped;
            case 1:
                return PlayStatus.Paused;
            case 2:
                return PlayStatus.Running;
        }
        return PlayStatus.Undefined;
    }

    @Override
    public void sendVirtualKey(int key) {
        User32.INSTANCE.PostMessage(window.getHwnd(), REQUEST_TYPE, new WinDef.WPARAM(JNAMessageConst.SEND_VIRTUAL_KEY),
                new WinDef.LPARAM(key));
    }

    public Window getWindow() {
        return window;
    }
}
