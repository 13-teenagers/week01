package com.bw.mapper;

import com.bw.bean.Disease;
import com.bw.bean.Patient;

import java.util.List;
import java.util.Map;

public interface PatientMapper {
    //查询
    List<Patient> select(Map<String, Object> map);
    //添加
    int insert(Patient patient);
    //
    List<Disease> query();
    //回显
    Patient find(int id);
    //修改
    int update(Patient patient);
}
