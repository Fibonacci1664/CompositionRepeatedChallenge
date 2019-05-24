package com.davegreen;

/**
 * Created by daveg on 22/06/2017.
 */
public class TV
{
    private int screenSize;
    private int resolution;

    public TV(int screenSize, int resolution)
    {
        this.screenSize = screenSize;
        this.resolution = resolution;
    }

    public void powerOnTv()
    {
        System.out.println("You have turned the TV on!");
    }

    public void powerOffTv()
    {
        System.out.println("You have turned the TV off!");
    }

    public int getScreenSize()
    {
        return screenSize;
    }

    public int getResolution()
    {
        return resolution;
    }
}
