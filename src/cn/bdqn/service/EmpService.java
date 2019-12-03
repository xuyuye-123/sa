package cn.bdqn.service;

import cn.bdqn.entity.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpService {
    Emp getEmpList( String ename,String epwd);
}
