import java.io.Serializable;

// Define a custom serializable class
public class Message implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for Serializable classes

    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
