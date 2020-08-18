package com.bw.service;

import com.bw.bean.Disease;
import com.bw.bean.Patient;
import com.bw.mapper.PatientMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public class PatientServiceImpl implements PatientService{
    @Resource
    private PatientMapper patientMapper;

    public List<Patient> select(Map<String, Object> map) {
        return patientMapper.select(map);
    }

    public int insert(Patient patient) {
        return patientMapper.insert(patient);
    }

    public List<Disease> query() {
        return patientMapper.query();
    }

    public Patient find(int id) {
        return patientMapper.find(id);
    }

    public int update(Patient patient) {
        return patientMapper.update(patient);
    }
}
