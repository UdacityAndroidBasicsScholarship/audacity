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
    public String getTimeStamp() {
        return timestamp;
    }

    /**
     * @return the email id of the student
     */
    public String getEmail() {
        return email_address;
    }

    /**
     * @return the name of the student
     */
    public String getName() {
        return student_name;
    }

    /**
     * @return the slack id of the student
     */
    public String getSlackId() {
        return slack_id;
    }

    /**
     * set the slack ID
     *
     * @param slackId
     */
    public void setSlackId(String slackId) {
        slack_id = slackId;
    }

    /**
     * @return the name of the hottest app
     */
    public String getHottestAppName() {
        return app_title;
    }

    /**
     * @return the description of the hottest app
     */
    public String getHottestAppDescription() {
        return app_description;
    }

    /**
     * @return the image url of the app
     */
    public String getImageUrl() {
        return image;
    }

    /**
     * @return the video url of the app
     */
    public String getVideoUrl() {
        return video_link;
    }

    /**
     * @return github url of the hottest app
     */
    public String getUrl() {
        return github_url;
    }

    /**
     * @return the date of the app upload
     */
    public String getDate() {
        return posted_date;
    }

    /**
     * @return if the app is approved or not
     */
    public boolean isApproved() {
        return approved;
    }

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
    public String getProfileImage() {
        return profile_image;
    }

    /**
     * set the profile image url
     *
     * @param profileImage
     */
    public void setProfileImage(String profileImage) {
        profile_image = profileImage;
    }

    /**
     * set the time stamp of the app
     *
     * @param timeStamp
     */
    public void setTimestamp(String timeStamp) {
        this.timestamp = timestamp;
    }

    /**
     * set the email address
     *
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        email_address = emailAddress;
    }

    /**
     * set the student name
     *
     * @param studentName
     */
    public void setStudentName(String studentName) {
        student_name = studentName;
    }

    /**
     * set the app title
     *
     * @param appTitle
     */
    public void setAppTitle(String appTitle) {
        app_title = appTitle;
    }

    /**
     * set the app descrption
     *
     * @param appDescription
     */
    public void setAppDescription(String appDescription) {
        app_description = appDescription;
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
     * @param videoLink
     */
    public void setVideoLink(String videoLink) {
        video_link = videoLink;
    }

    /**
     * set the github url
     *
     * @param githubUrl
     */
    public void setGithubUrl(String githubUrl) {
        github_url = githubUrl;
    }

    /**
     * set the posted date
     *
     * @param postedDate
     */
    public void setPostedDate(String postedDate) {
        posted_date = postedDate;
    }
}
