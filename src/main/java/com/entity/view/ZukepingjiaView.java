package com.entity.view;

import com.entity.ZukepingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 租客评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-02 12:00:50
 */
@TableName("zukepingjia")
public class ZukepingjiaView  extends ZukepingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZukepingjiaView(){
	}
 
 	public ZukepingjiaView(ZukepingjiaEntity zukepingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, zukepingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
