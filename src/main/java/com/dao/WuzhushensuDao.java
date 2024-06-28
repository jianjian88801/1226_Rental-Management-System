package com.dao;

import com.entity.WuzhushensuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzhushensuVO;
import com.entity.view.WuzhushensuView;


/**
 * 屋主申诉
 * 
 * @author 
 * @email 
 * @date 2021-05-02 12:00:50
 */
public interface WuzhushensuDao extends BaseMapper<WuzhushensuEntity> {
	
	List<WuzhushensuVO> selectListVO(@Param("ew") Wrapper<WuzhushensuEntity> wrapper);
	
	WuzhushensuVO selectVO(@Param("ew") Wrapper<WuzhushensuEntity> wrapper);
	
	List<WuzhushensuView> selectListView(@Param("ew") Wrapper<WuzhushensuEntity> wrapper);

	List<WuzhushensuView> selectListView(Pagination page,@Param("ew") Wrapper<WuzhushensuEntity> wrapper);
	
	WuzhushensuView selectView(@Param("ew") Wrapper<WuzhushensuEntity> wrapper);
	
}
