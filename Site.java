public class Site {
    private int id;

    private String Topic;
    private String Domen;
    private int Quantity;

    private static int numberOfSites = 0;

    public Site(String Domen, String Topic, int Quantity) {
        this.Topic = Topic;
        this.Domen = Domen;
        this.Quantity = Quantity;
        id = ++numberOfSites;
    }

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String topic) {
        this.Topic = topic;
    }

    public String getDomen() {
        return Domen;
    }

    public void setDomen(String domen) {
        this.Domen = domen;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        this.Quantity = quantity;
    }

    public int getID() {
        return id;
    }

    public String toString() {
        return "Site{" +
                "Domen='" + Domen + '\'' +
                ", Topic='" + Topic + '\'' +
                ", Quantity=" + Quantity + '\'' +
                "id=" + id +
                '}';
    }
}