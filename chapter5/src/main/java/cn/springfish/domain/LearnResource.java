package cn.springfish.domain;

import java.io.Serializable;

/**
 * @author quanyu
 * @date 2018/11/26 19:15
 */
public class LearnResource implements Serializable {
    private static final long serialVersionUID = 2353685154791627576L;

    private String author;
    private String title;
    private String url;

    public LearnResource(String author, String title, String url) {
        this.author = author;
        this.title = title;
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "LearnResource{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
