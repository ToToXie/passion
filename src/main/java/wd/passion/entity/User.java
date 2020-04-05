package wd.passion.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author WangDong
 * @since 2019-09-26
 */
@Data
@TableName("user")
@ApiModel
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.INPUT)
    @ApiModelProperty(value = "code",notes = "code")
    private String code;
    @TableId(type = IdType.INPUT)
    @ApiModelProperty(value = "id",notes = "id")
    private Integer id;
    @ApiModelProperty(value = "用户名",notes = "用户名")
    private String userName;
    @ApiModelProperty(value = "密码",notes = "密码")
    private String passWord;



}
