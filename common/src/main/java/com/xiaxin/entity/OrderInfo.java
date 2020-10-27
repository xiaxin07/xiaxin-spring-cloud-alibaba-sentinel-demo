package com.xiaxin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class OrderInfo {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String orderNo;
    private String address;
    private String phone;
}
