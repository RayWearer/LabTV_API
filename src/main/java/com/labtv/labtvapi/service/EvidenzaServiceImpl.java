package com.labtv.labtvapi.service;

import com.labtv.labtvapi.dao.EvidenzaDao;
import com.labtv.labtvapi.model.Evidenza;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class EvidenzaServiceImpl implements EvidenzaService {

	@Autowired
    private EvidenzaDao evidenzaDao;

    @Override
    public List<Evidenza> getEvidenze() {
        return (List<Evidenza>) evidenzaDao.findAll();
    }

}
