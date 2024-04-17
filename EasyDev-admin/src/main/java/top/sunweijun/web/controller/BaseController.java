package top.sunweijun.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import top.sunweijun.web.bean.AjaxResult;

import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 * @BelongsProject: EasyDev-Vue
 * @BelongsPackage: top.sunweijun.web.controller
 * @Author: sunweijun
 * @CreateTime: 2024-04-16  11:44
 * @Description: web层 通用数据处理
 * @Version: 1.0
 */
public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(BaseController.class);

    /**
     * 前台传递过来的日期格式字符串，自动转化成为Date类型
     * */
    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport(){
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                // setValue(DateUtils.parseDate(text));
            }
        });
    }

    /**
     * 响应返回结果
     *
     * @param rows 影响行数
     * @return 操作结果
     */
    protected AjaxResult toAjax(int rows)
    {
        return rows > 0 ? AjaxResult.success() : AjaxResult.error();
    }

}
