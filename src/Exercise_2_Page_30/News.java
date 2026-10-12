package Exercise_2_Page_30;

import Exercise_4_Page_49.Searchable;

public class News implements Searchable {
    //Part of ex2 and ex4 on Page 49
    private String title;
    private String description;
    private String source;
    private String url;

    private String author;
    private String publisher;
    private String language;
    private String coverImage;

    public News(String title, String description, String source, String url,
                String author, String publisher, String language, String coverImage) {
        if(title == null || title.isBlank()) { throw new IllegalArgumentException("Title is required."); }
        if(description == null || description.isBlank()) { throw new IllegalArgumentException("Description is required."); }
        if(source == null || source.isBlank()) { throw new IllegalArgumentException("Source is required."); }
        if(url == null || url.isBlank()) { throw new IllegalArgumentException("URL is required."); }
        if(author == null || author.isBlank()) { throw new IllegalArgumentException("Author is required."); }
        if(publisher == null || publisher.isBlank()) { throw new IllegalArgumentException("Publisher is required."); }
        if(language == null || language.isBlank()) { throw new IllegalArgumentException("Language is required."); }
        if(coverImage == null || coverImage.isBlank()) { throw new IllegalArgumentException("Cover image is required."); }

        this.title = title;
        this.description = description;
        this.source = source;
        this.url = url;
        this.author = author;
        this.publisher = publisher;
        this.language = language;
        this.coverImage = coverImage;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getSource() { return source; }
    public String getURL() { return url; }
    public String getAuthor() { return author; }
    public String gePublisher() { return publisher; }
    public String getLanguage() { return language; }
    public String getCoverImage() { return coverImage; }

    public boolean matches(String text) {
        if(!title.contains(text)) { return false; }
        if(!description.contains(text)) { return false; }

        return true;
    }
}
