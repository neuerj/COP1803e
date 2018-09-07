package com.example.android.cop1803;

public class CopLayoutViews {
    private String rname;
    private int x;
    private int y;
    private float midxx;
    private float midyy;
    private int width;
    private int len;

    public CopLayoutViews(String rname,int x, int y, float midxx, float midyy, int width, int len) {
        this.rname=rname;
        this.x = x;
        this.y = y;
        this.midxx = midxx;
        this.midyy = midyy;
        this.width = width;
        this.len = len;
    }
    public String getRname(){return rname;}
    public int getX(){return x;}
    public int getY(){return y;}
    public float getmidXx(){return midxx;}
    public float getmidYy(){return midyy;}
    public int getWidth(){return width;}
    public int getLen(){return getLen();}


}
