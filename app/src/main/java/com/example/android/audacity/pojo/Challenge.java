package com.example.android.audacity.pojo;


public class Challenge {

    private Boolean approved;
    private String challengeDescription;
    private String challengeName;
    private String emailAddress;
    private String endDate;
    private String imageLink;
    private String moderatorName;
    private String profileImage;
    private String referenceUrl;
    private String slackId;
    private String startDate;
    private String timestamp;
    private String videoLink;

    /**
     * No args constructor for use in serialization
     */
    public Challenge() {
    }

    /**
     * @param timestamp
     * @param startDate
     * @param referenceUrl
     * @param approved
     * @param profileImage
     * @param challengeName
     * @param moderatorName
     * @param imageLink
     * @param videoLink
     * @param emailAddress
     * @param endDate
     * @param slackId
     * @param challengeDescription
     */
    public Challenge(Boolean approved, String challengeDescription, String challengeName, String emailAddress, String endDate, String imageLink, String moderatorName, String profileImage, String referenceUrl, String slackId, String startDate, String timestamp, String videoLink) {
        super();
        this.approved = approved;
        this.challengeDescription = challengeDescription;
        this.challengeName = challengeName;
        this.emailAddress = emailAddress;
        this.endDate = endDate;
        this.imageLink = imageLink;
        this.moderatorName = moderatorName;
        this.profileImage = profileImage;
        this.referenceUrl = referenceUrl;
        this.slackId = slackId;
        this.startDate = startDate;
        this.timestamp = timestamp;
        this.videoLink = videoLink;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getChallengeDescription() {
        return challengeDescription;
    }

    public void setChallengeDescription(String challengeDescription) {
        this.challengeDescription = challengeDescription;
    }

    public String getChallengeName() {
        return challengeName;
    }

    public void setChallengeName(String challengeName) {
        this.challengeName = challengeName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getModeratorName() {
        return moderatorName;
    }

    public void setModeratorName(String moderatorName) {
        this.moderatorName = moderatorName;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getReferenceUrl() {
        return referenceUrl;
    }

    public void setReferenceUrl(String referenceUrl) {
        this.referenceUrl = referenceUrl;
    }

    public String getSlackId() {
        return slackId;
    }

    public void setSlackId(String slackId) {
        this.slackId = slackId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
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

}