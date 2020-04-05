package wd.passion.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import wd.passion.enums.GenderEnum;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author WangDong
 * @since 2019-10-03
 */
@Data
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "id",notes = "id")
    private Integer id;
    @ApiModelProperty(value = "用户名",notes = "用户名")
    private String name;
    @ApiModelProperty(value = "性别",notes = "性别")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private GenderEnum sex;


}
