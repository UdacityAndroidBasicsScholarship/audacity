package com.example.android.audacity.pojo;


public class HottestApp {

    private String appDescription;
    private String appTitle;
    private boolean approved;
    private String emailAddress;
    private String githubUrl;
    private String image;
    private String postedDate;
    private String profileImage;
    private String slackId;
    private String studentName;
    private String timestamp;
    private String videoLink;

    /**
     * No args constructor for use in serialization
     */
    public HottestApp() {
    }

    /**
     * @param timestamp
     * @param approved
     * @param postedDate
     * @param profileImage
     * @param githubUrl
     * @param videoLink
     * @param studentName
     * @param image
     * @param emailAddress
     * @param appTitle
     * @param slackId
     * @param appDescription
     */
    public HottestApp(String appDescription, String appTitle, boolean approved, String emailAddress, String githubUrl, String image, String postedDate, String profileImage, String slackId, String studentName, String timestamp, String videoLink) {
        super();
        this.appDescription = appDescription;
        this.appTitle = appTitle;
        this.approved = approved;
        this.emailAddress = emailAddress;
        this.githubUrl = githubUrl;
        this.image = image;
        this.postedDate = postedDate;
        this.profileImage = profileImage;
        this.slackId = slackId;
        this.studentName = studentName;
        this.timestamp = timestamp;
        this.videoLink = videoLink;
    }

    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public String getAppTitle() {
        return appTitle;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getSlackId() {
        return slackId;
    }

    public void setSlackId(String slackId) {
        this.slackId = slackId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    @Override
    public String toString() {
        return new StringBuffer()
                .append("appDescription " + appDescription)
                .append("appTitle " + appTitle)
                .append("approved " + approved)
                .append("emailAddress "+ emailAddress)
                .append("githubUrl "+ githubUrl)
                .append("image " +image)
                .append("postedDate "+ postedDate)
                .append("profileImage "+ profileImage)
                .append("slackId "+ slackId)
                .append("studentName " + studentName)
                .append("timestamp "+ timestamp)
                .append("videoLink "+ videoLink).toString();
    }

}