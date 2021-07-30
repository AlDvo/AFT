package main.java.Task3;

import java.util.Arrays;
import java.util.List;

public class Companies {
    public Companies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Company> companies;

    public Companies() {
    }
}
