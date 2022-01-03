package org.study.service;

import org.study.entity.C;
import org.study.entity.PageResult;
import org.study.entity.QueryPageBean;

public interface CService {
   void add(C c);
    PageResult pageQuery(QueryPageBean queryPageBean);
    void delete(Integer id);
}
