package com.example.crs_java.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("CarDetail")
public class CarDetail {
    private int id;
    @TableField(value = "SpeadTime")
    private String SpeadTime;
    @TableField(value = "MostSpead")
    private String MostSpead;
    @TableField(value = "WLTC")
    private String WLTC;
    @TableField(value = "EnginType")
    private String EnginType;
    @TableField(value = "KW")
    private String KW;
    @TableField(value = "NM")
    private String NM;
    @TableField(value = "LongMM")
    private String LongMM;
    @TableField(value = "ZhouMM")
    private String ZhouMM;
    @TableField(value = "L")
    private String L;
    @TableField(value = "Oil")
    private String Oil;
    @TableField(value = "KG")
    private String KG;
    @TableField(value = "zhengKG")
    private String zhengKG;
    @TableField(value = "allowKG")
    private String allowKG;
    @TableField(value = "zm")
    private String zm;
    @TableField(value = "jianximm")
    private String jianximm;
    @TableField(value = "equip_qilang")
    private String equip_qilang;
    @TableField(value = "equip_taiya")
    private String equip_taiya;
    @TableField(value = "equip_LED")
    private String equip_LED;
    @TableField(value = "equip_weideng")
    private String equip_weideng;
    @TableField(value = "equip_zhinengyaoshi")
    private String equip_zhinengyaoshi;
    @TableField(value = "equip_gereboli")
    private String equip_gereboli;
    @TableField(value = "equip_diandongwei")
    private String equip_diandongwei;
    @TableField(value = "equip_yuying")
    private String equip_yuying;
}
