package com.lrw.service;


import com.lrw.entity.JobAndTrigger;
import com.github.pagehelper.PageInfo;

public interface IJobAndTriggerService {
	/**
	 * 获取定时任务列表
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}
