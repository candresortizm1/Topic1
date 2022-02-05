package com.globant.exercise1;

public class MusicPlayerConfig {
    public static MusicPlayer configurePlayer(String type) {

        MusicPlayer musicPlayer = null;
        MusicPlayerFactory factory = null;
        if (type.equalsIgnoreCase("8GB8HrAzul")) {
            factory = new MPlayer8GB8HrBlue();
        } else if (type.equalsIgnoreCase("8GB8HrVerde")) {
            factory = new MPlayer8GB8HrGreen();
        } else if (type.equalsIgnoreCase("8GB5HrAzul")) {
            factory = new MPlayer8GB5HrBlue();
        } else if (type.equalsIgnoreCase("8GB5HrVerde")) {
            factory = new MPlayer8GB5HrGreen();
        } else if (type.equalsIgnoreCase("16GB8HrAzul")) {
            factory = new MPlayer16GB8HrBlue();
        } else if (type.equalsIgnoreCase("16GB8HrVerde")) {
            factory = new MPlayer16GB8HrGreen();
        } else if (type.equalsIgnoreCase("16GB5HrAzul")) {
            factory = new MPlayer16GB5HrBlue();
        } else if (type.equalsIgnoreCase("16GB5HrVerde")) {
            factory = new MPlayer16GB5HrGreen();
        }
        musicPlayer = new MusicPlayer(factory);
        return musicPlayer;
    }
}
