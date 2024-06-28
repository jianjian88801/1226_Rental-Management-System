package com.entity.view;

import com.entity.WuzhushensuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 屋主申诉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 12:00:50
 */
@TableName("wuzhushensu")
public class WuzhushensuView  extends WuzhushensuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuzhushensuView(){
	}
 
 	public WuzhushensuView(WuzhushensuEntity wuzhushensuEntity){
 	try {
			BeanUtils.copyProperties(this, wuzhushensuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
