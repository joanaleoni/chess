package chess;

/**
 *
 * @author joana
 */
public enum Color {
    BLACK("Black"), 
    WHITE("White");
    
    private String description;

    private Color(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}