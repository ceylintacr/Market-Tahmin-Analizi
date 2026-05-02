package model;

public class UserRecord {
    private String clientCode;
    private String gender;
    private double lineNetTotal;
    private String brand;
    private String category;

    // PDF --> veriler nesne oluşturulurken Constructor aracılığıyla atanmalıdır.
    public UserRecord(String clientCode, String gender, double lineNetTotal, String brand, String category) {
        this.clientCode = clientCode;
        this.gender = gender;
        this.lineNetTotal = lineNetTotal;
        this.brand = brand;
        this.category = category;
    }

    public String getClientCode() {
        return clientCode;
    }

    public String getGender() {
        return gender;
    }

    public double getLineNetTotal() {
        return lineNetTotal;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "UserRecord{" +
                "clientCode='" + clientCode + '\'' +
                ", gender='" + gender + '\'' +
                ", lineNetTotal=" + lineNetTotal +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}