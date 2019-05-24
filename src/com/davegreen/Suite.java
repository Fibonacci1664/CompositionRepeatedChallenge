package com.davegreen;

/**
 * Created by daveg on 22/06/2017.
 */
public class Suite
{
    private String type;
    private boolean cushions;

    public Suite(String type, boolean cushions)
    {
        this.type = type;
        this.cushions = cushions;
    }

    public int foundTvRemote()
    {
        System.out.println("Congratulations you have found the TV remote");
        return 1;
    }

    public String getType()
    {
        return type;
    }

    public boolean isCushions()
    {
        return cushions;
    }
}
