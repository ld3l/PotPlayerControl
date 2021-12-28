# Java library for control PotPlayer

PotPlayerControl is an open source Java library for controlling PotPlayer. It provides an object-oriented abstraction over JNA.

## Installation

Simply add the dependency to gradle/maven to the latest release:

```
        <dependency>
            <groupId>com.ld3l</groupId>
            <artifactId>potplayercontrol</artifactId>
            <version>1.0.1-SNAPSHOT</version>
        </dependency>
```

## Usage

### Create PotPlayer instanse

Find all PotPlayer windows:
```
List<Window> allPotPlayerWindows = JNAPotPlayerHelper.getAllPlayerWindows();
```

by default it returns a list of windows whose titles contain "PotPlayer", but you can provide your own filter option

```
Predicate<Window> filter = window -> window.getWindowText().startsWith("PotPlayer");
List<Window> allPotPlayerWindows = JNAPotPlayerHelper.getAllPlayerWindows(filter);
```

Select the necessary and create PotPlayer instanse:
```
Window window = allPotPlayerWindows.get(0);
PotPlayer player = new JNAPotPlayer(window);
```

### Usage

```
        p.pause();
        p.play();
        p.stop();
        p.next();
        p.previous();
        p.playPause();
        p.playPause();
        p.volumeUp();
        p.volumeDown();
        p.mute();
        p.toggleSub();
        p.toggleOsd();
        p.fiveSecForward();
        p.fiveSecBack();
        p.thirtySecForward();
        p.thirtySecBack();
        p.oneMinuteForward();
        p.oneMinuteBack();
        p.fiveMinuteForward();
        p.fiveMinuteBack();
        p.speedUp();
        p.speedDown();
        p.speedNormal();
        p.fullscreen();
        p.setVolume(6);
        System.out.println(p.getVolume());
        System.out.println(p.getTotalTime());
        System.out.println(p.getCurrentTime());
        System.out.println(p.getProgressTime());
        p.setCurrentTime(5522255);
        System.out.println(p.getPlayStatus());
        p.sendVirtualKey(Win32VK.VK_SPACE.code);
```

