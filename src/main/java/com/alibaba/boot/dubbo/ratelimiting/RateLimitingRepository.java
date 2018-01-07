package com.alibaba.boot.dubbo.ratelimiting;

import java.util.Date;

/**
 * Repository storing data used by the gateway's rate limiting filter.
 *
 * @author walkman
 * @date 2017/4/19
 */
public interface RateLimitingRepository {

    void incrementCounter(String id, String timeUnit, Date time);

    long getCounter(String id, String timeUnit, Date time);

}
