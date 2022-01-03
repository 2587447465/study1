package org.study.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.entity.C;
import org.study.entity.PageResult;
import org.study.entity.QueryPageBean;
import org.study.service.CService;
import org.study.utils.Result;
import java.util.List;
@RestController
public class CController{
    @Autowired
    private CService cService;

    /*增加C*/
    @RequestMapping("/add")
    public Result add(@RequestBody C c){
        try {
            cService.add(c);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"失败");
        }
        return new Result(true,"成功");
    }
    /*分页查询*/
    @RequestMapping("/findPage")
    public PageResult findPage(@RequestBody QueryPageBean queryPageBean){
        PageResult pageResult = cService.pageQuery(queryPageBean);
        return pageResult;

    }
    //删除
    @RequestMapping("/delete")
    public Result delete(Integer id){
        try {
                cService.delete(id);
        }catch (Exception e){
            return new Result(false,"失败");
        }
        return new Result(true,"成功");

    }


}
