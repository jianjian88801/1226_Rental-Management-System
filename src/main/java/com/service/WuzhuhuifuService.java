package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzhuhuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzhuhuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzhuhuifuView;


/**
 * 屋主回复
 *
 * @author 
 * @email 
 * @date 2021-05-02 12:00:50
 */
public interface WuzhuhuifuService extends IService<WuzhuhuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzhuhuifuVO> selectListVO(Wrapper<WuzhuhuifuEntity> wrapper);
   	
   	WuzhuhuifuVO selectVO(@Param("ew") Wrapper<WuzhuhuifuEntity> wrapper);
   	
   	List<WuzhuhuifuView> selectListView(Wrapper<WuzhuhuifuEntity> wrapper);
   	
   	WuzhuhuifuView selectView(@Param("ew") Wrapper<WuzhuhuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzhuhuifuEntity> wrapper);
   	
}

