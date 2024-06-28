package com.dao;

import com.entity.ZukepingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZukepingjiaVO;
import com.entity.view.ZukepingjiaView;


/**
 * 租客评价
 * 
 * @author 
 * @email 
 * @date 2021-05-02 12:00:50
 */
public interface ZukepingjiaDao extends BaseMapper<ZukepingjiaEntity> {
	
	List<ZukepingjiaVO> selectListVO(@Param("ew") Wrapper<ZukepingjiaEntity> wrapper);
	
	ZukepingjiaVO selectVO(@Param("ew") Wrapper<ZukepingjiaEntity> wrapper);
	
	List<ZukepingjiaView> selectListView(@Param("ew") Wrapper<ZukepingjiaEntity> wrapper);

	List<ZukepingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<ZukepingjiaEntity> wrapper);
	
	ZukepingjiaView selectView(@Param("ew") Wrapper<ZukepingjiaEntity> wrapper);
	
}
