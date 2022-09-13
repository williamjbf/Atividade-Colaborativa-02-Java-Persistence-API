package com.github.williamjbf.jsfstudy.util;

import javax.persistence.Persistence;

public class CreateTable {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("jsf-db");

    }
}
