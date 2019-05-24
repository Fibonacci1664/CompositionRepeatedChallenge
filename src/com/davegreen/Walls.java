package com.davegreen;

/**
 * Created by daveg on 22/06/2017.
 */
public class Walls
{
    private String wall1;
    private String wall2;
    private String wall3;
    private String wall4;

    private String colour;

    public Walls(String wall1, String wall2, String wall3, String wall4, String colour)
    {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.colour = colour;
    }

    public String getWall1()
    {
        return wall1;
    }

    public String getWall2()
    {
        return wall2;
    }

    public String getWall3()
    {
        return wall3;
    }

    public String getWall4()
    {
        return wall4;
    }

    public String getColour()
    {
        return colour;
    }
}
