package cn.bdqn.service.impl;

import cn.bdqn.dao.EmpMapper;
import cn.bdqn.entity.Emp;
import cn.bdqn.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;
    @Override
    public Emp getEmpList(String ename, String epwd) {
        Emp e=empMapper.getEmpList(ename);
        if (e != null) {
            if (epwd.equals(e.getEpwd())){
                return e;
            }else {
                return  null;
            }
        }else {
            return null;
        }

    }
}
