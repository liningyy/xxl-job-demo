package com.ming.xxljob.demo.task;

import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 贺春明
 * @date 2023/3/15
 */

@Service
@Slf4j
public class DemoTask {

    /**
     * 使用 @XxlJob来标识一个任务，value属性指定一个任务名称，
     *  这个名称与调度平台中的 JobHandler对应
     */
    @XxlJob("myTask")
    public void task(){
        log.info("执行定时任务........");
    }
}
