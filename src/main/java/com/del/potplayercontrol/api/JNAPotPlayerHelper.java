package com.del.potplayercontrol.api;

import com.del.potplayercontrol.impl.Window;
import com.del.potplayercontrol.utils.JNAUtils;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JNAPotPlayerHelper {
    public static final Predicate<Window> filter = window -> window.getWindowText().contains("PotPlayer");


    public static List<Window> getAllPlayerWindows() {
        return JNAUtils.getAllWindows().stream().filter(filter).collect(Collectors.toList());
    }


    public static List<Window> getAllPlayerWindows(Predicate<Window> filter) {
        return JNAUtils.getAllWindows().stream().filter(filter).collect(Collectors.toList());
    }
}
