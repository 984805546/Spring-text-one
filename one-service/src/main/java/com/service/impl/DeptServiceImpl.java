package com.service.impl;/**
 * @author: fs
 * @create: 2019/11/24 19:42
 */

import com.dao.DeptDao;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @program spring-text-one 
 * @description:
 * @author: fs
 * @create: 2019/11/24 19:42 
 */
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public int delete(Integer id) {
        return deptDao.delete(id);
    }
}
