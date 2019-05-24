package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        Walls walls = new Walls("North", "South", "East", "West", "Cream");     // These are all the parts that comprise my living room.
        Ceiling ceiling = new Ceiling("White", true);
        TV tv = new TV(60, 1080);
        Suite suite = new Suite("Leather", true);

        LivingRoom livingRoom = new LivingRoom(walls, ceiling, tv, suite);                                      // This is me building by living room from all the parts above.

        livingRoom.turnOnTvUsingGetter();                                                                       // This is me accessing my tv to switch it on by way of a getter.

        livingRoom.sitOnSuite();                                                                                // This is me accessing my tv to switch it of directly, no getters!.
    }
}
