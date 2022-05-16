package com.example.networking;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain() {
        name = "saknar namn";
        location = "saknar plats";
        height = -1;
    }
    public String info()
    {
        String tmp = new String();
        tmp+=name+ "is located in mountain range" +location+" and reaches"+height+"m above sea level.";
        return tmp;
    }
    public void setName(String n)
    {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    @Override
    public String toString(){
        return name;
    }
}

