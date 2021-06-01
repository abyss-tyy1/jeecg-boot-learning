package org.jeecg.modules.cg.teacher.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.cg.teacher.entity.TeacherTestInfo;

import java.util.List;

/**
 * @Description: 教师信息
 * @Author: jeecg-boot
 * @Date:   2021-05-05
 * @Version: V1.0
 */
public interface TeacherTestInfoMapper extends BaseMapper<TeacherTestInfo> {

	public boolean deleteByMainId(@Param("mainId") String mainId);
    
	public List<TeacherTestInfo> selectByMainId(@Param("mainId") String mainId);
}
