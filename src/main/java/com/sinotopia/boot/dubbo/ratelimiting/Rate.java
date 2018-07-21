package com.sinotopia.boot.dubbo.ratelimiting;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author walkman
 * @date 2017/4/19
 */
public class Rate implements Serializable {

    private static final long serialVersionUID = 1927816293512124L;

    private String timeUnit;

    private Date time;

    private AtomicLong atomicLong = new AtomicLong(0);

    public Date getTime() {
        return time;
    }

    public Rate setTime(Date time) {
        this.time = time;
        return this;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public Rate setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    public AtomicLong getAtomicLong() {
        return atomicLong;
    }

    public Rate setAtomicLong(AtomicLong atomicLong) {
        this.atomicLong = atomicLong;
        return this;
    }
}
