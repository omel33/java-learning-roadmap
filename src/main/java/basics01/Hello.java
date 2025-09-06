package basics01;

public class Hello {
    public static String greet(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is required");
        }
        String trimmed = name.trim();
        String normalized = trimmed.substring(0, 1).toUpperCase() + trimmed.substring(1);
        return "Hello, " + normalized + "!";
    }
}
