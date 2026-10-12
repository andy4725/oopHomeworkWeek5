package Exercise_3_Page_31;

import java.sql.Timestamp;

public class Event {
    private String title;
    private String description;
    private String language;

    private String dateText;
    private Timestamp eventDateTime;
    private String location;

    public Event(String title, String description, String language,
                 String dateText, Timestamp eventDateTime, String location) {
        if(title == null || title.isEmpty()) { throw new IllegalArgumentException("Title can't be empty."); }
        if(description == null || description.isEmpty()) { throw new IllegalArgumentException("Description can't be empty."); }
        if(language == null || language.isEmpty()) { throw new IllegalArgumentException("Language can't be empty."); }
        if(dateText == null || dateText.isEmpty()) { throw new IllegalArgumentException("Date text can't be empty."); }
        if(location == null || location.isEmpty()) { throw new IllegalArgumentException("Location can't be empty."); }

        this.title = title;
        this.description = description;
        this.language = language;
        this.location = location;

        try {
            this.eventDateTime = Timestamp.valueOf(dateText);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid event date. Expected yyyy-mm-dd hh:mm:ss", e);
        }

        if(!eventDateTime.after(new Timestamp(System.currentTimeMillis()))) {
            throw new IllegalArgumentException("Event date must be in the future.");
        }
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getLanguage() { return language; }
    public String getDateText() { return dateText; }
    public Timestamp getEventDateTime() { return eventDateTime; }
    public String getLocation() { return location; }
}