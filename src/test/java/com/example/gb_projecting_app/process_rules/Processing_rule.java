package com.example.gb_projecting_app.process_rules;

import com.example.gb_projecting_app.Library_document;

public abstract class Processing_rule {
    private String Rule_Label;
    private Library_document library_documentdoc;

    public abstract Library_document Process();
}
