package com.yyzy.ondriveweb.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName
public class OneDriveUser {

    @TableId
    private Long id;
    @TableField
    private String name;
    @TableField
    private String clientId;
    @TableField
    private String clientSecret;
    @TableField
    private String tenantId;
    @TableField
    private String mail;
}
