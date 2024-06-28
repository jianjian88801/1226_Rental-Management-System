package com.entity.vo;

import com.entity.ZukepingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 租客评价
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-02 12:00:50
 */
public class ZukepingjiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房屋编号
	 */
	
	private String fangwubianhao;
		
	/**
	 * 房屋名称
	 */
	
	private String fangwumingcheng;
		
	/**
	 * 评价类型
	 */
	
	private String pingjialeixing;
		
	/**
	 * 评价内容
	 */
	
	private String pingjianeirong;
		
	/**
	 * 评价时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingjiashijian;
		
	/**
	 * 租客账号
	 */
	
	private String zukezhanghao;
		
	/**
	 * 租客姓名
	 */
	
	private String zukexingming;
				
	
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
	 * 设置：评价类型
	 */
	 
	public void setPingjialeixing(String pingjialeixing) {
		this.pingjialeixing = pingjialeixing;
	}
	
	/**
	 * 获取：评价类型
	 */
	public String getPingjialeixing() {
		return pingjialeixing;
	}
				
	
	/**
	 * 设置：评价内容
	 */
	 
	public void setPingjianeirong(String pingjianeirong) {
		this.pingjianeirong = pingjianeirong;
	}
	
	/**
	 * 获取：评价内容
	 */
	public String getPingjianeirong() {
		return pingjianeirong;
	}
				
	
	/**
	 * 设置：评价时间
	 */
	 
	public void setPingjiashijian(Date pingjiashijian) {
		this.pingjiashijian = pingjiashijian;
	}
	
	/**
	 * 获取：评价时间
	 */
	public Date getPingjiashijian() {
		return pingjiashijian;
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
			
}
