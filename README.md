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

### Create PotPlayer instance

Find all PotPlayer windows:
```
List<Window> allPotPlayerWindows = JNAPotPlayerHelper.getAllPlayerWindows();
```

by default it returns a list of windows whose titles contain "PotPlayer", but you can provide your own filter option

```
Predicate<Window> filter = window -> window.getWindowText().startsWith("PotPlayer");
List<Window> allPotPlayerWindows = JNAPotPlayerHelper.getAllPlayerWindows(filter);
```

Select the necessary and create PotPlayer instance:
```
Window window = allPotPlayerWindows.get(0);
PotPlayer player = new JNAPotPlayer(window);
```

## Player commands examples

```
        player.pause();
        player.play();
        player.stop();
        player.next();
        player.previous();
        player.playPause();
        player.playPause();
        player.volumeUp();
        player.volumeDown();
        player.mute();
        player.toggleSub();
        player.toggleOsd();
        player.fiveSecForward();
        player.fiveSecBack();
        player.thirtySecForward();
        player.thirtySecBack();
        player.oneMinuteForward();
        player.oneMinuteBack();
        player.fiveMinuteForward();
        player.fiveMinuteBack();
        player.speedUp();
        player.speedDown();
        player.speedNormal();
        player.fullscreen();
        player.setVolume(6);
        System.out.println(p.getVolume());
        System.out.println(p.getTotalTime());
        System.out.println(p.getCurrentTime());
        System.out.println(p.getProgressTime());
        player.setCurrentTime(5522255);
        System.out.println(p.getPlayStatus());
        player.sendVirtualKey(Win32VK.VK_SPACE.code);
```

