package app.entity;

public record User(String name, String email) {
    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Email: " + email;
    }
}