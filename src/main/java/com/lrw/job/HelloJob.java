package com.lrw.job;

import java.util.Date;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.Trigger;  
 /**
  * 说白了这个接口只是要定义我们要做的事情 
  * @author Administrator
  *
  */
public class HelloJob implements BaseJob {  
  
     
    public HelloJob() {  
          
    }  
     
    public void execute(JobExecutionContext context)  
        throws JobExecutionException {  
    	//获取jobdetails
    	JobKey jobkey = context.getJobDetail().getKey();
    	System.out.println("工作名称： "+jobkey.getName());
    	//获取jobdetails创建时携带的参数(传递的是个map集合)
    	JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
    	
    	jobDataMap.get("");
    	//获取trigger
    	Trigger trigger = context.getTrigger();//获取了触发器
    	//获取jobtrigger创建时携带的参数
    	JobDataMap jobTriggerDataMap = trigger.getJobDataMap();
    	
    	
    	System.err.println("Hello Job执行时间: " + new Date());
          
    }  
}  
