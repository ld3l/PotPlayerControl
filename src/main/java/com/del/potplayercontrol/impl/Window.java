package com.del.potplayercontrol.impl;

import com.sun.jna.platform.win32.WinDef.HWND;

import java.util.Objects;

public class Window {
   private final HWND hwnd;
   private String windowText;

    public Window(HWND hwnd) {
        this.hwnd = hwnd;
    }

    public HWND getHwnd() {
        return hwnd;
    }

    public String getWindowText() {
        return windowText;
    }

    public void setWindowText(String windowText) {
        this.windowText = windowText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return hwnd.equals(window.hwnd) && Objects.equals(windowText, window.windowText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hwnd, windowText);
    }
}
