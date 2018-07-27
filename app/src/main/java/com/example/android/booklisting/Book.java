package com.example.android.booklisting;

public class Book {

    private String mTitle;
    private String mAuthors;

    public Book (String title, String authors){
        mTitle = title;
        mAuthors = authors;
    }

    public String getTitle() { return mTitle; }
    public String getAuthors() { return mAuthors; }

}
