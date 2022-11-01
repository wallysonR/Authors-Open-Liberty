package br.com.authors.rest;

public class Author {
    private String name;
    private String blog;

    public Author(String name, String blog, String twitter) {
        this.name = name;
        this.blog = blog;
        this.twitter = twitter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    private String twitter;
}
