package gz.model;

public class User {

    private float id;
    private String name;
    private String username;
    private String email;
    private Address AddressObject;
    private String phone;
    private String website;
    private Company CompanyObject;

    public User() {
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddressObject(Address addressObject) {
        AddressObject = addressObject;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setCompanyObject(Company companyObject) {
        CompanyObject = companyObject;
    }

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddressObject() {
        return AddressObject;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public Company getCompanyObject() {
        return CompanyObject;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", AddressObject=" + AddressObject +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", CompanyObject=" + CompanyObject +
                '}';
    }
}


