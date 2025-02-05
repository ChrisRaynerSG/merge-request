package com.carnasa.cr.mergerequestbackend.models;

public class ProgrammingLanguageDTO {

    private final String name;
    private final String logo;

    public ProgrammingLanguageDTO(String name, String logo) {
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }
}
