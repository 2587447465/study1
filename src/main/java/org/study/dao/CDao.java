package org.study.dao;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.study.entity.C;

@Mapper
public interface CDao {
    /*新增*/
    @Insert("insert into C(name,answer) values(#{name},#{answer})")
    void add(C c);
    /*分页查询*/
    @Select("select * from C")
    Page<C> selectByCondition();
    //删除
    @Delete("delete from C where id = #{id}")
    void delete(Integer id);
}
