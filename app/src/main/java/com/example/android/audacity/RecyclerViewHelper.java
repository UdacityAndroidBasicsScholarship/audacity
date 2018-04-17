package com.example.android.audacity;

/**
 * Created by acer on 17-04-2018.
 */

///This class is for the Model of data which we will use in recycler view
    ///this class will e used to fetch from database in future
public class RecyclerViewHelper {

    private int profileIcon;
    private String mHeader, mStudentName, mDateCreated;


    //Constructor for setting
    public RecyclerViewHelper(int profileIcon, String header, String studentName, String dateCreated){

        this.profileIcon = profileIcon;
        mHeader = header;
        mStudentName = studentName;
        mDateCreated = dateCreated;
    }

//some getters
    //i have considered integer value for image because image id is integer
    public int getProfileIcon(){return profileIcon;}
    public String getmHeader(){return mHeader;}
    public String getmStudentName(){return mStudentName;}
    public String getmDateCreated(){return mDateCreated;}

    //setters
    public void setProfileIcon(int profileIcon){this.profileIcon = profileIcon;}
    public void setmHeader(String header){mHeader = header;}
    public void setmStudentName(String studentName){mStudentName = studentName;}
    public void setmDateCreated(String dateCreated){mDateCreated = dateCreated;}

}
