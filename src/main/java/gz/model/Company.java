package gz.model;

public class Company {
    private String name;
    private String catchPhrase;
    private String bs;

    public Company() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", catchPhrase='" + catchPhrase + '\'' +
                ", bs='" + bs + '\'' +
                '}';
    }
}
