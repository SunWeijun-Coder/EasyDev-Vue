package top.sunweijun.system.domain.base;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author sunweijun
 * @date 2024/4/15
 * @apiNote 实体类基类
 */
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 创建者
     * */
    private String createBy;
    /**
     * 创建时间
     * */
    private Date createTime;

    /**
     * 更新者
     * */
    private String updateBy;

    /**
    * 更新时间
    * */
    private Date updateTime;

    /**
     * 备注
     * */
    private String remark;
}
