package maven.pojo;

public class Teacherinfo {
    private int id;
    private String username;
    private double price;
    private String content;

    public Teacherinfo(int id, String username, double price, String content) {
        this.id = id;
        this.username = username;
        this.price = price;
        this.content = content;
    }

    public Teacherinfo() {
    }

    @Override
    public String toString() {
        return "Teacherinfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", price='" + price + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
