package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 屋主申诉
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-02 12:00:50
 */
@TableName("wuzhushensu")
public class WuzhushensuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WuzhushensuEntity() {
		
	}
	
	public WuzhushensuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 租客账号
	 */
					
	private String zukezhanghao;
	
	/**
	 * 租客姓名
	 */
					
	private String zukexingming;
	
	/**
	 * 房屋编号
	 */
					
	private String fangwubianhao;
	
	/**
	 * 房屋名称
	 */
					
	private String fangwumingcheng;
	
	/**
	 * 申诉内容
	 */
					
	private String shensuneirong;
	
	/**
	 * 申诉状态
	 */
					
	private String shensuzhuangtai;
	
	/**
	 * 申诉时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shensushijian;
	
	/**
	 * 屋主账号
	 */
					
	private String wuzhuzhanghao;
	
	/**
	 * 屋主姓名
	 */
					
	private String wuzhuxingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：租客账号
	 */
	public void setZukezhanghao(String zukezhanghao) {
		this.zukezhanghao = zukezhanghao;
	}
	/**
	 * 获取：租客账号
	 */
	public String getZukezhanghao() {
		return zukezhanghao;
	}
	/**
	 * 设置：租客姓名
	 */
	public void setZukexingming(String zukexingming) {
		this.zukexingming = zukexingming;
	}
	/**
	 * 获取：租客姓名
	 */
	public String getZukexingming() {
		return zukexingming;
	}
	/**
	 * 设置：房屋编号
	 */
	public void setFangwubianhao(String fangwubianhao) {
		this.fangwubianhao = fangwubianhao;
	}
	/**
	 * 获取：房屋编号
	 */
	public String getFangwubianhao() {
		return fangwubianhao;
	}
	/**
	 * 设置：房屋名称
	 */
	public void setFangwumingcheng(String fangwumingcheng) {
		this.fangwumingcheng = fangwumingcheng;
	}
	/**
	 * 获取：房屋名称
	 */
	public String getFangwumingcheng() {
		return fangwumingcheng;
	}
	/**
	 * 设置：申诉内容
	 */
	public void setShensuneirong(String shensuneirong) {
		this.shensuneirong = shensuneirong;
	}
	/**
	 * 获取：申诉内容
	 */
	public String getShensuneirong() {
		return shensuneirong;
	}
	/**
	 * 设置：申诉状态
	 */
	public void setShensuzhuangtai(String shensuzhuangtai) {
		this.shensuzhuangtai = shensuzhuangtai;
	}
	/**
	 * 获取：申诉状态
	 */
	public String getShensuzhuangtai() {
		return shensuzhuangtai;
	}
	/**
	 * 设置：申诉时间
	 */
	public void setShensushijian(Date shensushijian) {
		this.shensushijian = shensushijian;
	}
	/**
	 * 获取：申诉时间
	 */
	public Date getShensushijian() {
		return shensushijian;
	}
	/**
	 * 设置：屋主账号
	 */
	public void setWuzhuzhanghao(String wuzhuzhanghao) {
		this.wuzhuzhanghao = wuzhuzhanghao;
	}
	/**
	 * 获取：屋主账号
	 */
	public String getWuzhuzhanghao() {
		return wuzhuzhanghao;
	}
	/**
	 * 设置：屋主姓名
	 */
	public void setWuzhuxingming(String wuzhuxingming) {
		this.wuzhuxingming = wuzhuxingming;
	}
	/**
	 * 获取：屋主姓名
	 */
	public String getWuzhuxingming() {
		return wuzhuxingming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
