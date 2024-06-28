package com.entity.view;

import com.entity.WuzhuhuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 屋主回复
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 12:00:50
 */
@TableName("wuzhuhuifu")
public class WuzhuhuifuView  extends WuzhuhuifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WuzhuhuifuView(){
	}
 
 	public WuzhuhuifuView(WuzhuhuifuEntity wuzhuhuifuEntity){
 	try {
			BeanUtils.copyProperties(this, wuzhuhuifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
