package com.example.checkbookservice.controller;

import com.example.checkbookservice.model.RemotePropertyField;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/checkBookService")
public class CheckBookServiceController {
    private RemotePropertyField field;

    public CheckBookServiceController(RemotePropertyField field) {
        this.field = field;
    }

    @GetMapping(value = "/getRemoteField")
    public String getRemotePropertyField() {
        return "Data: " + field.getField();
    }
}

