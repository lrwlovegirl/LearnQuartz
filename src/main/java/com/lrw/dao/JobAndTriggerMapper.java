package com.lrw.dao;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.lrw.entity.JobAndTrigger;
@Mapper
public interface JobAndTriggerMapper {
	
	public List<JobAndTrigger> getJobAndTriggerDetails();
}
