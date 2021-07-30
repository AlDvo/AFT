package main.java.Task3;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class Company {

    private Integer id;
    private String name;
    private String address;
    private String phoneNumber;
    @JsonProperty(value = "INN")
    private String INN;
    private String founded;
    private Securities[] securities;

    public Company(Integer id, String name, String address, String phoneNumber, String INN, String founded, Securities[] securities) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.INN = INN;
        this.founded = founded;
        this.securities = securities;
    }

    public Company() {
    }


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
    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", inn='" + INN + '\'' +
                ", founded='" + founded + '\'' +
                ", securities=" + Arrays.toString(securities) +
                '}';
    }

    class Securities {
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

        public Securities(String name, CURRENCY[] currency, String code, String date) {
            this.name = name;
            this.currency = currency;
            this.code = code;
            this.date = date;
        }

        public Securities() {
        }

        @Override
        public String toString() {
            return "Securities{" +
                    "name='" + name + '\'' +
                    ", currency=" + Arrays.toString(currency) +
                    ", code='" + code + '\'' +
                    ", date='" + date + '\'' +
                    '}';
        }

        private String name;
        private CURRENCY[] currency;
        private String code;
        private String date;
    }

    enum CURRENCY {
        RUB,
        USD,
        EU
    }


}
