package com.example.gb_projecting_app.process_rules;

import com.example.gb_projecting_app.Library_document;

public class Process_rule_extract_size extends Processing_rule{

    @Override
    public Library_document Process(Library_document library_document) {
        System.out.println("Извлечение размера документа");
        System.out.println(library_document.getLabel());
        return null;
    }

}
