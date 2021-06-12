package com.example.newsapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Article {

    @SerializedName("urlToImage")
    @Expose
    private String urlToImage;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("author")
    @Expose
    private String author;

    @SerializedName("publishedAt")
    @Expose
    private String publishedAt;

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    @Override
    public String toString() {
        return "BashboardNews{" +
                "urlToImage='" + urlToImage + '\'' +
                ",description='" +description+'\''+
                ",title='"+title+'\''+
                ",author='"+author+'\''+
                ",publishedAt='"+publishedAt+'\''+
                '}';
    }
}