package com.bw.controller;

import com.bw.bean.Disease;
import com.bw.bean.Patient;
import com.bw.service.PatientService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {
    @Resource
    private PatientService service;
    @RequestMapping("list")
    public String select(Model model,String name,@RequestParam(defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum,2);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name",name);
        List<Patient> list = service.select(map);
        PageInfo<Patient> plist = new PageInfo<Patient>(list);
        model.addAttribute("plist",plist);
        return "list";
    }
    @RequestMapping("add")
    public String insert(Patient patient){
        service.insert(patient);
        return "redirect:list";
    }
    @RequestMapping("query")
    @ResponseBody
    public List<Disease> query(){
        List<Disease> list = service.query();
        return list;
    }

    @RequestMapping("find")
    public String find(int id,Model model){
        Patient patient = service.find(id);
        model.addAttribute("patient",patient);
        return "update";
    }
    @RequestMapping("update")
    public String update(Patient patient){
        int i = service.update(patient);
        return "redirect:list";
    }
}
