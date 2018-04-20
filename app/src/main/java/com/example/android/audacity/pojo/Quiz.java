package com.example.android.audacity.pojo;

/**
 * POJO class for the {@link com.example.android.audacity.fragments.QuizzesFragment}
 */

public class Quiz {
    // Name of the quiz
    private String mQuizName;
    // URL of the google form for the quiz
    private String mUrl;

    /**
     * @param quizName name of the quiz
     * @param url      of the google form for the quiz
     */
    public Quiz(String quizName, String url) {
        mQuizName = quizName;
        mUrl = url;
    }

    /**
     * @return the name of the quiz
     */
    public String getQuizName() {
        return mQuizName;
    }

    /**
     * @return the url of the google form for the quiz
     */
    public String getUrl() {
        return mUrl;
    }
}
