package com.example.android.audacity.pojo;

/**
 * POJO class for the {@link com.example.android.audacity.fragments.HottestAppFragment}
 */

public class HottestApp {
    // Time and date of the upload
    private String timestamp;
    // Email id of the student
    private String email_address;
    // Name of the student
    private String student_name;
    // Slack Id of the student
    private String slack_id;
    // Name of the hottest app
    private String app_title;
    // Description of the hottest app
    private String app_description;
    // Url of the image of the app(Screenshot)
    private String image;
    // Url of the video of the hottest app
    private String video_link;
    // Github URL of the app
    private String github_url;
    // Date of upload of the app
    private String posted_date;
    // is the app approved??
    private boolean approved;
    // profile image url
    private String profile_image;

    //Empty Constructor for Firebase
    public HottestApp(){}
    /**
     * Constructor
     *
     * @param timeStamp             time stamp of the app upload
     * @param email                 email of the student
     * @param name                  name of the student
     * @param slackId               slack id of the student
     * @param hottestAppName        name of the hottest app
     * @param hottestAppDescription description of the hottest app
     * @param imageUrl              image url of the app
     * @param videoUrl              video url of the app
     * @param url                   github link of the hottest app
     * @param date                  date of the app upload
     * @param isApproved            is the app approved by the moderator
     * @param profileImage          profile image url
     */

    public HottestApp(String timeStamp, String email, String name, String slackId, String hottestAppName,
                      String hottestAppDescription, String imageUrl, String videoUrl, String url, String date,
                      boolean isApproved, String profileImage) {
        timestamp = timeStamp;
        email_address = email;
        student_name = name;
        slack_id = slackId;
        app_title = hottestAppName;
        app_description = hottestAppDescription;
        image = imageUrl;
        video_link = videoUrl;
        github_url = url;
        posted_date = date;
        approved = isApproved;
        profile_image = profileImage;
    }

    /**
     * @return the timestamp of the hottest app
     */
    public String getTimestamp() {return timestamp;}

    /**
     * @return the email id of the student
     */
    public String getEmail_address() {return email_address;}

    /**
     * @return the name of the student
     */

    public String getStudent_name() {return student_name;}



    /**
     * @return the slack id of the student
     */
    public String getSlack_id() {return slack_id;}

    /**
     * set the slack ID
     *
     * @param slackId
     */
    public void setSlack_id(String slackId) {this.slack_id = slackId;}


    /**
     * @return the name of the hottest app
     */

    public String getApp_title() {return app_title;}

    /**
     * @return the description of the hottest app
     */
    public String getApp_description() {return app_description;}

    /**
     * @return the image url of the app
     */
    public String getImage() {return image;}

    /**
     * @return the video url of the app
     */
    public String getVideo_link() {return video_link;}

    /**
     * @return github url of the hottest app
     */
    public String getGithub_url() {return github_url;}

    /**
     * @return the date of the app upload
     */
    public String getPosted_date() { return posted_date;}

    /**
     * @return if the app is approved or not
     */
    public boolean isApproved() { return approved; }

    /**
     * set approval state of the app
     *
     * @param approved
     */
    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    /**
     * @return the profile image url
     */
    public String getProfile_image() {
        return profile_image;
    }

    /**
     * set the profile image url
     *
     * @param profileImage
     */
    public void setProfile_image(String profileImage) {
        profile_image = profileImage;
    }

    /**
     * set the time stamp of the app
     *
     * @param timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * set the email address
     *
     * @param email_address
     */
    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    /**
     * set the student name
     *
     * @param student_name
     */
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    /**
     * set the app title
     *
     * @param app_title
     */
    public void setApp_title(String app_title) {
        this.app_title = app_title;
    }

    /**
     * set the app descrption
     *
     * @param app_description
     */
    public void setApp_description(String app_description) {
        this.app_description = app_description;
    }

    /**
     * set the image url
     *
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * set the video link
     *
     * @param video_link
     */
    public void setVideo_link(String video_link) {
        this.video_link = video_link;
    }

    /**
     * set the github url
     *
     * @param github_url
     */
    public void setGithub_url(String github_url) {
        this.github_url = github_url;
    }

    /**
     * set the posted date
     *
     * @param posted_date
     */
    public void setPosted_date(String posted_date) {
        this.posted_date = posted_date;
    }
}
