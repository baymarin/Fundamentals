package Fundamentals.ObjectAndClassesExercise.Article_04;

public class Article {
    //Title – a string
    //· Content – a string
    //· Author – a string
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String toString() {
        String result = String.format("%s - %s: %s", this.title, this.content, this.author);
        return result;
    }
}

