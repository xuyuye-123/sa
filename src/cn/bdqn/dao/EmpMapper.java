package cn.bdqn.dao;

import cn.bdqn.entity.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    Emp getEmpList(@Param("ename") String ename);
}
