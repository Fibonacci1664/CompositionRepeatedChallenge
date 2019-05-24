package com.davegreen;

/**
 * Created by daveg on 22/06/2017.
 */
public class Ceiling
{
    private String colour;
    private boolean lightFixture;

    public Ceiling(String colour, boolean lightFixture)
    {
        this.colour = colour;
        this.lightFixture = lightFixture;
    }

    public String getColour()
    {
        return colour;
    }

    public boolean isLightFixture()
    {
        return lightFixture;
    }
}
