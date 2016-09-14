package com.blogspot.toppersdaily.technosolz.cvresumemaker.Model;

import com.orm.SugarRecord;

import java.sql.Blob;

/**
 * Created by omoshiroi on 9/14/16.
 */
public class About extends SugarRecord{
    public Blob Cv_Image;

    public String First_Name;
    public String Last_Name;

    public String Official_Email;
    public String Personal_Email;

    public String Official_Phone;
    public String Personal_Phone;

    public String Street_Address;
    public String City;
    public String State;
    public String Country;

    public String Website;
    public String Blog;

    public String Personal_Statement;
}
