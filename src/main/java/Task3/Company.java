package main.java.Task3;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Company extends Companies {
    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", INN='" + INN + '\'' +
                ", founded='" + founded + '\'' +
                ", securities=" + Arrays.toString(securities) +
                '}';
    }
    @JsonProperty(value = "id")
    private Integer id;
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "address")
    private String address;
    @JsonProperty(value = "phoneNumber")
    private String phoneNumber;
    @JsonProperty(value = "INN")
    private String INN;
    @JsonProperty(value = "founded")
    private String founded;
    @JsonProperty(value = "securities")
    private Securities[] securities;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public Securities[] getSecurities() {
        return securities;
    }

    public void setSecurities(Securities[] securities) {
        this.securities = securities;
    }

}

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
class Securities extends Company {
    @Override
    public String toString() {
        return "Securities{" +
                "name='" + name + '\'' +
                ", currency=" + Arrays.toString(currency) +
                ", code='" + code + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CURRENCY[] getCurrency() {
        return currency;
    }

    public void setCurrency(CURRENCY[] currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "currency")
    private CURRENCY[] currency;
    @JsonProperty(value = "code")
    private String code;
    @JsonProperty(value = "date")
    private String date;
}

enum CURRENCY {
    RUB,
    USD,
    EU
}
