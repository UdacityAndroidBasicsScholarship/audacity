package com.example.android.audacity.pojo;

/**
 * POJO class for the {@link com.example.android.audacity.fragments.ChallengesFragment}
 */

public class Challenge {
    // Time stamp for the challenge
    private String timestamp;
    // Moderator name
    private String moderator_name;
    // Moderator email address
    private String email_address;
    // Moderator slack id
    private String slack_id;
    // Variable to store the challenge name
    private String challenge_name;
    // Variable to store the challenge description
    private String challenge_description;
    // Reference Url
    private String reference_url;
    // Image link
    private String image_link;
    // Video link
    private String video_link;
    // starting date of the challenge
    private String start_date;
    // ending date of the challenge
    private String end_date;
    // check if the project is approved
    private boolean approved;
    // profile image url
    private String profile_image;

    public Challenge() {
    }

    /**
     * Constructor
     *
     * @param timeStamp            time and date of upload
     * @param moderatorName        name of the moderator
     * @param email                email of the moderator
     * @param slackId              slack Id of the moderator
     * @param challengeName        name of the challenge
     * @param challengeDescription description of the challenge
     * @param referenceUrl         reference url for the challenge
     * @param imageUrl             image url of the challenge
     * @param videoUrl             video url of the challenge
     * @param startDate            start date of the challenge
     * @param endDate              end date of the challenge
     * @param isApproved           is the project approved
     * @param profileImage         url of the profile image
     */
    public Challenge(String timeStamp, String moderatorName, String email, String slackId,
                     String challengeName, String challengeDescription, String referenceUrl,
                     String imageUrl, String videoUrl, String startDate, String endDate,
                     boolean isApproved, String profileImage) {
        timestamp = timeStamp;
        moderator_name = moderatorName;
        email_address = email;
        slack_id = slackId;
        challenge_name = challengeName;
        challenge_description = challengeDescription;
        reference_url = referenceUrl;
        image_link = imageUrl;
        video_link = videoUrl;
        start_date = startDate;
        end_date = endDate;
        approved = isApproved;
        profile_image = profileImage;
    }

    /**
     * @return the time stamp of the challenge
     */
    public String getTimeStamp() {
        return timestamp;
    }

    /**
     * Set the timestamp
     *
     * @param timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the moderator name
     */
    public String getModerator_name() {
        return moderator_name;
    }

    /**
     * Set the moderator name
     *
     * @param moderator_name
     */
    public void setModerator_name(String moderator_name) {
        this.moderator_name = moderator_name;
    }

    /**
     * @return the email id of the moderator
     */
    public String getEmail_address() {
        return email_address;
    }

    /**
     * @return the slack id of the challenge
     */
    public String getSlack_id() {
        return slack_id;
    }

    /**
     * set the slack id
     *
     * @param slackId
     */
    public void setSlack_id(String slackId) {
        slack_id = slackId;
    }

    /**
     * @return the challenge name
     */
    public String getChallenge_name() {
        return challenge_name;
    }

    /**
     * set the challenge name
     *
     * @param challengeName
     */
    public void setChallenge_name(String challengeName) {
        challenge_name = challengeName;
    }

    /**
     * @return the challenge description
     */
    public String getChallenge_description() {
        return challenge_description;
    }

    /**
     * set the challenge description
     *
     * @param challengeDescription
     */
    public void setChallenge_description(String challengeDescription) {
        challenge_description = challengeDescription;
    }

    /**
     * @return the reference url for the challenge
     */
    public String getReference_url() {
        return reference_url;
    }

    /**
     * set the reference url
     *
     * @param referenceUrl
     */
    public void setReference_url(String referenceUrl) {
        reference_url = referenceUrl;
    }

    /**
     * @return the image url of the challenge
     */
    public String getImage_link() {
        return image_link;
    }

    /**
     * @return the video url of the challenge
     */
    public String getVideo_link() {
        return video_link;
    }

    /**
     * @return the start date of the challenge
     */
    public String getStart_date() {
        return start_date;
    }

    /**
     * set the start date
     *
     * @param startDate
     */
    public void setStart_date(String startDate) {
        start_date = startDate;
    }

    /**
     * @return the end date of the challenge
     */
    public String getEnd_date() {
        return end_date;
    }

    /**
     * set the end date
     *
     * @param endDate
     */
    public void setEnd_date(String endDate) {
        end_date = endDate;
    }

    /**
     * @return if the project is approved or not
     */
    public boolean isApproved() {
        return approved;
    }

    /**
     * set the approval status
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
     * set the email address
     *
     * @param emailAddress
     */
    public void setEmail_address(String emailAddress) {
        email_address = emailAddress;
    }

    /**
     * set the image link
     *
     * @param imageLink
     */
    public void setImage_link(String imageLink) {
        image_link = imageLink;
    }

    /**
     * set the video link
     *
     * @param videoLink
     */
    public void setVideo_link(String videoLink) {
        video_link = videoLink;
    }

    /**
     *
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }


}
