package com.labtv.labtvapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.labtv.labtvapi.model.Evidenza;
import com.labtv.labtvapi.service.EvidenzaService;

@RestController
@RequestMapping("/api/evidenze")
public class EvidenzaController {

    @Autowired
    private EvidenzaService evidenzaService;

    @GetMapping
    public List<Evidenza> listEvidenze() {
        return evidenzaService.getEvidenze();
    }

}
