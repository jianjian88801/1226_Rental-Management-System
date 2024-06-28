package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzhushensuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzhushensuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzhushensuView;


/**
 * 屋主申诉
 *
 * @author 
 * @email 
 * @date 2021-05-02 12:00:50
 */
public interface WuzhushensuService extends IService<WuzhushensuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzhushensuVO> selectListVO(Wrapper<WuzhushensuEntity> wrapper);
   	
   	WuzhushensuVO selectVO(@Param("ew") Wrapper<WuzhushensuEntity> wrapper);
   	
   	List<WuzhushensuView> selectListView(Wrapper<WuzhushensuEntity> wrapper);
   	
   	WuzhushensuView selectView(@Param("ew") Wrapper<WuzhushensuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzhushensuEntity> wrapper);
   	
}

