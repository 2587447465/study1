package org.study.service.impl;
import com.github.pagehelper.Page;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.dao.CDao;
import org.study.entity.C;
import org.study.entity.PageResult;
import org.study.entity.QueryPageBean;
import org.study.service.CService;
import java.util.List;
@Service
public class CServiceImpl implements CService {
    @Autowired
    private CDao cDao;
    /*增加C题目*/
    @Override
    public void add(C c) {
        cDao.add(c);
    }
    /*分页查询*/
    @Override
    public PageResult pageQuery(QueryPageBean queryPageBean) {
        Integer currentPage = queryPageBean.getCurrentPage();
        Integer pageSize = queryPageBean.getPageSize();
        System.out.println("currentPage="+currentPage);
        System.out.println("pageSize="+pageSize);
        //完成分页查询，基于mybatis框架提供的分页助手插件完成
        PageHelper.startPage(currentPage,pageSize);
        //select * from t_checkitem limit 0,10
        Page<C> page = cDao.selectByCondition();
        long total =page.getTotal();
        List<C> rows = page.getResult();
        System.out.println("total="+total);
        return new PageResult(total,rows);
    }

    @Override
    public void delete(Integer id) {
        cDao.delete(id);
    }
}
