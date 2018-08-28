package com.example.ravishankar.tourguide_1;

public class Description {
    private int mImageResourceId;
    private String definition;
    private String name;

    public Description(String name,String mDefinition,int mImageId)
    {
        this.name=name;
        mImageResourceId=mImageId;
        definition=mDefinition;
    }

    public int getImageId(){
        return  mImageResourceId;
    }

    public String getDefinition() {
        return definition;
    }

    public String getName() {
        return name;
    }
}
