package objects;

public class Account {
    private String accountName;
    private String website;
    private String type;
    private String industry;
    private String button;
    private String description;
    private String phone;

    public Account(String accountName,
                   String website,
                   String type,
                   String industry,
                   String button,
                   String description,
                   String phone) {
        this.accountName = accountName;
        this.website = website;
        this.type = type;
        this.industry = industry;
        this.button = button;
        this.description = description;
        this.phone = phone;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
