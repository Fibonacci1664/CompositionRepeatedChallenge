package com.davegreen;

/**
 * Created by daveg on 22/06/2017.
 */
public class LivingRoom
{
    private Walls walls;

    private Ceiling ceiling;

    private TV tv;

    private Suite suite;

    public LivingRoom(Walls walls, Ceiling theCeiling, TV theTv, Suite theSuite)
    {
        this.walls = walls;
        this.ceiling = theCeiling;
        this.tv = theTv;
        this.suite = theSuite;
    }

    public void turnOnTvUsingGetter()
    {
        System.out.println("You are using a getter!");
        getTv().powerOnTv();
    }

    public void sitOnSuite()
    {
        System.out.println("You are not using a getter!");
        suite.foundTvRemote();
        tv.powerOffTv();
    }

    public Walls getWalls()
    {
        return walls;
    }

    public Ceiling getCeiling()
    {
        return ceiling;
    }

    public TV getTv()
    {
        return tv;
    }

    public Suite getSuite()
    {
        return suite;
    }
}
