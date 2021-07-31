package main.java.Task3;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Companies {
    @Override
    public String toString() {
        return "Companies{" +
                "companies=" + Arrays.toString(companies) +
                '}';
    }

    @JsonProperty(value = "companies")
    private Company[] companies;

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }

    public Company[] getCompanies() {
        return companies;
    }
}
