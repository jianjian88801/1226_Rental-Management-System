package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZukepingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZukepingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZukepingjiaView;


/**
 * 租客评价
 *
 * @author 
 * @email 
 * @date 2021-05-02 12:00:50
 */
public interface ZukepingjiaService extends IService<ZukepingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZukepingjiaVO> selectListVO(Wrapper<ZukepingjiaEntity> wrapper);
   	
   	ZukepingjiaVO selectVO(@Param("ew") Wrapper<ZukepingjiaEntity> wrapper);
   	
   	List<ZukepingjiaView> selectListView(Wrapper<ZukepingjiaEntity> wrapper);
   	
   	ZukepingjiaView selectView(@Param("ew") Wrapper<ZukepingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZukepingjiaEntity> wrapper);
   	
}

