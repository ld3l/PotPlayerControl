package com.del.potplayercontrol.utils;

import com.del.potplayercontrol.impl.Window;
import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef.HWND;
import java.util.LinkedList;
import java.util.List;

public class JNAUtils {

    public static int WINDOW_TEXT_SIZE = 512;

    public static List<Window> getAllWindows() {
        List<Window> windows = new LinkedList<>();
        User32.INSTANCE.EnumWindows((hWnd, pointer) -> windows.add(createWindow(hWnd)), null);
        return windows;
    }

    public static Window createWindow(HWND hwnd) {
        Window window = new Window(hwnd);
        char[] windowText = new char[WINDOW_TEXT_SIZE];
        User32.INSTANCE.GetWindowText(window.getHwnd(), windowText, WINDOW_TEXT_SIZE);
        window.setWindowText(Native.toString(windowText));
        return window;
    }


}
