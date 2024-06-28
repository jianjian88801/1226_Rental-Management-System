package com.dao;

import com.entity.WuzhuhuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzhuhuifuVO;
import com.entity.view.WuzhuhuifuView;


/**
 * 屋主回复
 * 
 * @author 
 * @email 
 * @date 2021-05-02 12:00:50
 */
public interface WuzhuhuifuDao extends BaseMapper<WuzhuhuifuEntity> {
	
	List<WuzhuhuifuVO> selectListVO(@Param("ew") Wrapper<WuzhuhuifuEntity> wrapper);
	
	WuzhuhuifuVO selectVO(@Param("ew") Wrapper<WuzhuhuifuEntity> wrapper);
	
	List<WuzhuhuifuView> selectListView(@Param("ew") Wrapper<WuzhuhuifuEntity> wrapper);

	List<WuzhuhuifuView> selectListView(Pagination page,@Param("ew") Wrapper<WuzhuhuifuEntity> wrapper);
	
	WuzhuhuifuView selectView(@Param("ew") Wrapper<WuzhuhuifuEntity> wrapper);
	
}
