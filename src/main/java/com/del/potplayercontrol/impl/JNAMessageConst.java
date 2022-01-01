package com.del.potplayercontrol.impl;

public class JNAMessageConst {
   //Released features
   public static final int PLAY = 20001;
   public static final int PAUSE = 20000;
   public static final int STOP = 20002;
   public static final int PREVIOUS = 10123;
   public static final int NEXT = 10124;
   public static final int PLAY_PAUSE = 10014;
   public static final int VOLUME_UP = 10035;
   public static final int VOLUME_DOWN = 10036;
   public static final int TOGGLE_MUTE = 10037;
   public static final int TOGGLE_SUBS = 10126;
   public static final int TOGGLE_OSD = 10351;
   public static final int FIVE_SEC_BACK = 10059;
   public static final int FIVE_SEC_FORWARD = 10060;
   public static final int THIRTY_SEC_BACK = 10061;
   public static final int THIRTY_SEC_FORWARD = 10062;
   public static final int ONE_MIN_BACK = 10063;
   public static final int ONE_MIN_FORWARD = 10064;
   public static final int FIVE_MIN_BACK = 10065;
   public static final int FIVE_MIN_FORWARD = 10066;
   public static final int SPEED_NORMAL = 10246;
   public static final int SPEED_DOWN = 10247;
   public static final int SPEED_UP = 10248;
   public static final int FULLSCREEN = 10013;
   public static final int GET_VOLUME = 20480;
   public static final int SET_VOLUME = 20481;
   public static final int GET_TOTAL_TIME = 20482;
   public static final int GET_PROGRESS_TIME = 20483;
   public static final int GET_CURRENT_TIME = 20484;
   public static final int SET_CURRENT_TIME = 20485;
   public static final int GET_PLAY_STATUS = 20486;
   public static final int SEND_VIRTUAL_KEY = 20496;

   //Not released features with request type
   public static final int GET_CURRENT_VIDEO_WIDTH = 24624;//Work only if video playing
   public static final int GET_CURRENT_VIDEO_HEIGHT = 24625;//Work only if video playing
   public static final int GET_CURRENT_VIDEO_FPS= 24626;//Work only if video playing
   public static final int SET_PLAY_STATUS = 20487;
   public static final int SET_PLAY_ORDER = 20488;
   public static final int SET_PLAY_CLOSE = 20489;


   //Not released features with command type
   public static final int CAPTURE = 10224;
   public static final int TOGGLE_PLAYLIST = 10011;
   public static final int TOGGLE_BROWSER = 10011;
   public static final int TOGGLE_CONTROL = 10383;
   public static final int OPEN_FILE = 10158;
   public static final int OPEN_PLAYLIST = 10000;
   public static final int OPEN_PLAYLIST_PARAMETERS = 10002;
   public static final int OPEN_PREFERENCE = 10010;
   public static final int DISPLAY_AR_ASPECT_RATIO = 10015;
   public static final int ORIGINAL_AR_ASPECT_RATIO = 10015;
   public static final int FOUR_THIRD_AR_ASPECT_RATIO = 10015;
//  10018  16:9
//  10019  16:10
//  10020  1.85:1
//  10021  2.35:1
//  10023 cable
//  10024 antenna
//  10038 on top - newer
//  10039 on top - while playing
//  10040 aspect ratio - keep aspect ratio
//  10041 aspect ratio - keep aspect ratio
//  10042 aspect ratio - stretch keeping ar
//  10043 aspect ratio - stretch off
//  10044 aspect ratio - video frame to 0.5 output size
//  10045 aspect ratio - video frame to 2 output size
//  10047 zoom in
//  10048 zoom out
//  10049 increase frame with
//  10050 decrease frame with
//  10051 increase frame height
//  10052 decrease frame height
//  10053 move frame right
//  10054 move frame left
//  10055 move frame up
//  10056 move frame down
//  10057 move frame to actual position
//  10058 set frame size to actual size
//  10067 open first video in playlist
//  10068 next video in playlist
//  10069 off playback shuffling
//  10070 flip vertical
//  10071 flip horizontal
//  10072 screen rotation (horizontal/vertical)
//  10073 video extending
// 10074 - stretching video 4: 3
// 10075 - stretching video 16: 9
// 10076 - stretching the video 16:10
// 10077 - stretching video 1.85: 1
// 10078 - stretching the video 2.35: 1
// 10079 - reduce video 4: 3
// 10080 - video reduction 16: 9
// 10081 - video reduction 16:10
// 10082 - video reduction 1.85: 1
// 10083 - video reduction 2.35: 1
// 10084 - conditional scaling
// 10085 - reset video parameters
// 10086 - decrease brightness by 1%
// 10087 - increase the brightness by 1%
// 10088 - decrease the contrast by 1%
// 10089 - increase the contrast by 1%
// 10090 - decrease saturation by 1%
// 10091 - increase the saturation by 1%
// 10092 - decrease color by 1%
// 10093 - increase the chromaticity by 1%
// 10095 - equalizer on / off
// 10096 - reverb on / off
// 10116 - close the player after playback on / off
// 10118 - turn off the computer after the current track on / off
// 10121 - hide the mouse pointer during playback on / off
// 10122 - screen saver on / off
// 10123 - previous track
// 10124 - next track
// 10126 - display subtitles on / off
// 10127 - shift subtitles to the default position
// 10128 - subtitle shift up + 2%
// 10129 - subtitle shift down + 2%
// 10130 - subtitle left shift + 2%
// 10131 - subtitle shift to the right + 2%
// 10132 - increase the width of the subtitle fields +5
// 10133 - decrease the width of the subtitle fields +5
// 10134 - increase the height of the subtitle fields +5
// 10135 - decrease the height of the subtitle fields +5
// 10136 - enable bold subtitles on / off
// 10137 - increase the subtitle size by 1
// 10138 - decrease the size of subtitles by 1
// 10139 - font selection dialog
// 10140 - subtitle synchronization: advance by 0.5 sec.
// 10141 - subtitle synchronization: delay by 0.5 sec.
// 10142 - default subtitle sync
// 10143 - align subtitles to the left
// 10144 - center alignment of subtitles
// 10145 - align subtitles to the right
// 10146 - dialog: open subtitle file
// 10148 - initial position of the video
// 10149 - shift video to the left
// 10150 - shift video to the right
// 10151 - shift video up
// 10152 - shift video down
// 10158 - "Open file" dialog
// 10159 - "Open addresses" dialog
// 10160 - "Select a folder" dialog
// 10161 - Screen recording
// 10162 - Recording from the camera
// 10164 - Recording with BDA?
// 10165 - DVD playback?
// 10167 - close the file
// 10171 - norms of proportion on / off
// 10172 - subtitle menu
// 10173 - menu of audio streams
// 10181 - "Enter characters" dialog
// 10182 - Save preset equalizer
// 10183 - deleting the preset equalizer
// 10184 - restore the default equalizer
// 10187 - "Enter password .." dialog
// 10191 - the appearance of additional. window
// 10193 - remove additional. window
// 10194 - "Screen recording options" dialog
// 10195 - "Information about the file being played" dialog
// 10196 - "Open" dialog
// 10197 - "Select a folder" dialog
// 10198 - dialog "Address opening"
// 10201 - clear playlist ***
// 10206 - dialog "Save as ..."
// 10207 - dialog: the explorer opens on the track being played
// 10211 - dialog: "Record name changes"
// 10212 - clear playlist
// 10209, 10213 - file deletion dialog
// 10218 - remove color blocks on / off
// 10220 - output subtitles directly to the video
// 10221 - displaying subtitles on the VMR surface | EVR
// 10222 - dialog "Sequential saving of frames"
// 10225 - dialog: explorer with the Capture folder
// 10226 - "Record audio" dialog
// 10228 - dialogue "Subtitle management"
// 10229 - "Presets and video size editor" dialog
// 10230 - minimize / restore player
// 10231 - minimize / return size
// 10232 - window size 0.5x
// 10233 - window size 1x
// 10234 - window size 1.5x
// 10235 - window size 2x
// 10236 - the size of the window to fit the desktop
// 10237 - maximum window size
// 10238 - restore the previous window size
// 10239 - skip playback on / off
// 10240 - dialog "Playback transmission parameters"
// 10241 - go to the next frame
// 10242 - go to the previous frame
// 10243 - go to the beginning of the file (start over)
// 10246 - playback speed 1x
// 10247 - playback speed -0.1x
// 10248 - playback speed + 0.1x
// 10249 - repeat the segment
// 10250 - repeat the segment
// 10251 - segment repeat canceled
// 10252 - segment repeat canceled
// 10256 - sharpness on / off
// 10257 - blur on / off
// 10260 - automatic correction of levels on / off
// 10261 - aspect ratio (output / original)
// 10264 - dialog "Codec and filter management"
// 10265 - transition by key frames on / off
// 10266 - Dialogue "Manual subtitle input"
// 10267 - increase the system volume +5
// 10268 - decrease system volume -5
// 10269 - system volume on / off
// 10270 - increase the volume (Wave) +4
// 10271 - volume decrease (Wave) -4
// 10272 - volume (Wave) on / off
// 10273 - monitor
// 10274 - output to TV 4: 3
// 10275 - output to TV 16: 9
// 10276 - output to TV (automatic selection)
// 10277 - add only selected files to the playlist
// 10278 - Add similar files to the playlist
// 10279 - Add all files in a folder to a playlist
// 10285 - Screen Recording Options Dialog Box
// 10287 - Dialogue "Change the combination of pixel shaders"
// 10288 - Dialogue: File Explorer with PxShader Folder
// 10290 - shaders before playback on / off
// 10291 - audio sync +0.5
// 10292 - audio sync -0.5
// 10293 - audio sync 0
// 10294 - video output device (automatic)
// 10295 - VideoRendeder video output device
// 10296 - overley Mixer video output device
// 10297 - VMR 7 video output device
// 10298 - video output device ...
// 10299 - video output device ...
// 10300 - video output device ...
// 10301 - video output device ...
// 10302 - video output device ...
// 10303 - video output device ...
// 10304 - video output device ...
// 10306 - filters on / off
// 10307 - Dialogue "Channel management"
// 10308 - full screen
// 10309 - stretch to full screen while maintaining aspect ratio
// 10310 - add to favorites of the current track
// 10311 - adding to favorites folder of the current track
// 10312 - "Favorites" dialog
// 10315 - "Playlist Options" dialog
// 10316 - Dialogue "Parameters of visualizations"
// 10321 - "Video resizing options" dialog
// 10323 - "Video scaling options" dialog
// 10324 - "Add Bookmark" menu
// 10325 - Dialogue "Move to position"
// 10326 - adding to bookmarks at mark
// 10329 - Delete All Bookmarks
// 10330 - "Bookmark Editor" dialog
// 10331 - "File Manager" dialog (playlist large)
// 10332 - Subtitle Manager dialog
// 10334 - Dialogue "Select a folder to save records"
// 10335 - Dialogue "Select a folder to save recordings" Capture
// 10336 - close the player after playing a track
// 10337 - always on top of windows
// 10338 - "Device Settings" dialog
// 10339 - Disable standard keyboard shortcuts
// 10340 - video scaling in full screen mode on / off
// 10341 - Maintain aspect ratio when resizing window on / off
// 10342 - bottom margin + 5%
// 10343 - Disable the bottom margin
// 10344 - bottom margin 5%
// 10345 - bottom margin 10%
// 10346 - bottom margin 15%
// 10347 - bottom margin 20%
// 10348 - bottom margin 25%
// 10349 - bottom margin 30%
// 10350 - turn off the bottom margin in the absence of subtitles on / off
// 10351 - Complete Playback Information
// 10352 - on / off level control
// 10353 - Thumbnail Creation Dialogue
// 10354 - saving snapshots in BMP format
// 10355 - Save snapshots in JPEG format
// 10356 - Save snapshots in PNG format
// 10358 - default action when pressing F3 "Open file"
// 10359 - default action when pressing F3 "Open address"
// 10360 - default action when pressing F3 "Open folder"
// 10361 - default action when pressing F3 "Open File Manager"
// 10363 - "Video Processing Options" dialog
// 10364 - Dialogue "Aspect ratio"
// 10365 - menu "Create thumbnail ..."
// 10367 - Scale Handling Menu
// 10369 - Hiding theme when playing video on / off
// 10370 - "Record video" dialog
// 10371 - Window Position: Window Size: Move (Multiple Zoom Modes)
// 10372 - Window position: Window size: Move (multiple zoom out modes)
// 10373 - Window Position: Window Size: Move (Multiple Left Shift Modes)
// 10374 - Window Position: Window Size: Move (Multiple Right Shift Modes)
// 10375 - Window position: Window size: move (multiple upward shift modes)
// 10376 - Window position: Window size: move (multiple modes with shift down)
// 10377 - Window Position: Window Size: Move (in the middle of the screen)
// 10378 - Window Position: Window Size: Move (upper left corner of the screen)
// 10379 - Window Position: Window Size: Move (top right corner of the screen)
// 10380 - Window Position: Window Size: Move (bottom left corner of the screen)
// 10381 - Window Position: Window Size: Move (bottom right corner of the screen)
// 10382 - menu "Channel management ..."
// 10383 - Dialogue "Control Panel | Filters / Audio / Subtitles / View"
// 10384 - Dialogue "Skin Options"
// 10386 - go to the site = "link" target = "_ blank" href = "/go?https://potplayer.daum.net/forum/" title = "https://potplayer.daum.net/forum/" rel = "nofollow"> https://potplayer.daum.net/forum/
// 10389 - clear sound on / off
// 10390 - noise reduction on / off
// 10391 - Dialog "Audio Processing Options"
// 10392 - checking for updates
// 10393 - volume control: built-in volume control
// 10394 - Volume control: system control (Wave)
// 10395 - volume control: system control (Master)
// 10396 - low quality speed processing
// 10397 - high quality speed processing
// 10398 - no processing speed
// 10400 - "Open file" dialog (track name in the header)
// 10402 - launch the player with a theme in video on / off mode
// 10404 - "Window size" dialog
// 10405 - Numeric keypad for entering channels on / off
// 10406  "Window margin parameters" dialog
// 10407 - Advanced Options Dialogue
// 10410 - Dialogue: Explorer with the Playlist folder
// 10412 - "Open ifo file" dialog
// 10413 - visual effects on / off
// 10416 - Dialogue "View scenes"
// 10417 - dialog "Delete file to trash"
// 10418 - dialog "Delete file to trash"
// 10419 - playback from stop on / off
// 10420 - deinterlacing: (multiple modes)
// 10421 - Deinterlacing: automatic detection
// 10422 - deinterlacing: always use
// 10423 - Deinterlacing: Do Not Use
// 10424 - Dialogue "Deinterlacing Options"
// 10425 - volumetric noise reduction on / off
// 10426 - Gradual noise reduction on / off
// 10427 - Real Time Noise Cancellation On / Off
// 10428 - shift of brightness levels on / off
// 10429 - WarpS
// 10430 - "Record video" dialog
// 10431 - sequential saving of frames
// 10435 - multichannel volume control on / off
// 10436 - gain AC3 / DTS on / off
// 10437 - Dialogue "Volume control parameters ..."
// 10438 - voice reduction on / off
// 10439 - voice enhancement on / off
// 10440 - "Logo Options" dialog
// 10441 - time and location information
// 10443 - "File Manager" dialog (playlist large)
// 10445 - closing files after playback on / off
// 10447 - Dialogue "Menu Manager" (large)
// 10448 - temporary display of information about time and location
// 10450 - Always use built-in video processing filters (recommended)
// 10451 - Disable filters if the following conditions are met
// 10452 - Do not use built-in video processing filters
// 10454 - audio processing filters on / off
// 10455 - display of thumbnails of bookmarks on / off
// 10456 - automatic deletion of bookmarks when selected on / off
// 10457 - saving bookmarks in PBF files in the folder with the file being played on / off
// 10458 - displaying a window with parameters when adding bookmarks on / off
// 10479 - computer shutdown on ... on / off
// 10480 - Dialogue "Setting the computer shutdown time"
// 10490 - Dialogue "Enter characters"
// 10495 - repeat play on / off
// 10496 - Repeat Play: Repeat All Files / Off
// 10497 - Repeat Play: Repeat Play One File / Off
// 10500 - Force subtitle field on / off
// 10505 - Dialog "File Information"
// 10514 - translucent on / off controls
// 10515 - Translucent Controls Direct3D 9 Mode
// 10516 - Translucent LayeredWindows Mode Controls
// 10519 - Dialogue "Translucent controls"
// 10527 - Dialogue "Color scheme settings"
// 10529 - Video Processing Dialogue
// 10531 - doubling frames on / off
// 10533 - segment repeat canceled
// 10535 - segment repeat
// 10537 - segment repeat
// 10539 - segment repeat
// 10541 - segment repeat
// 10543 - segment repeat
// 10553 - memorizing the selected action after playback on / off
// 10556 - system date and time
// 10557 - playback time
// 10560 - Video Output Device: Integrated Direct3D9 Video Renderer
// 10561 - Video Output Device: Integrated OpenGL Video Renderer
// 10562 - Video Output Device: Embedded Null Video Renderer (Compressed)
// 10563 - Video Output Device: Null Video Renderer Embedded (Uncompressed)
// 10570 - stereoscopic subtitles: output after scaling
// 10571 - stereoscopic subtitles: output before scaling
// 10578 - use theme only in video on / off mode
// 10583 - "Rename file" dialog
// 10587 - maintain aspect ratio in video recording mode on / off
// 10592 - segment repeat canceled
// 10602 - pause and play (maybe something changes in the interface)
// 10603 - pause and play (maybe something changes in the interface)
// 10604 - pause and play (change slider)
// 10605 - Dialogue "Continuous playback"
// 10612 - rotate to (90/180/270 / original video state)
// 10613 - video initial state
// 10614 - rotate to (90 / original video state)
// 10615 - rotate (180 / original video state)
// 10616 - rotate by (270 / original video state)
// 10619 - jump to the middle of the file
// 10620 - transition to 30 sec. to the end of the file
// 10624 - copy subtitles
// 10625 - do not keep sync
// 10626 - Reestablish sync on exit
// 10627 - Always keep in sync
// 10629 - keep sync for the following files
// 10633 - Stereoscopic subtitles: do not use
// 10634 - Stereoscopic subtitles: side-by-side
// 10635 - Stereoscopic subtitles: vertical stereo pair
// 20004 - hide
// 20005 - full / minimum size
// 20009 - menu "Add to favorites" ...
// 20010 - playback speed 1x
// 20011 - general menu
// 20028 - playlist on / off
// 20030 - full screen on / off
}
