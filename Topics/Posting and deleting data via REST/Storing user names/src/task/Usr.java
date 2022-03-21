package task;

public class Usr {
    private String name;

    @Override
    public String toString() {
        return "Usr{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Usr(String name) {
        this.name = name;
    }
}
