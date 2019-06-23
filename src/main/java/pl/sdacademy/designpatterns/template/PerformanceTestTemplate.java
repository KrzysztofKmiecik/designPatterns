package pl.sdacademy.designpatterns.template;

import pl.sdacademy.designpatterns.adapter.systemd.SystemDUser;

public abstract class PerformanceTestTemplate {

    public abstract int getWarmupIterationNum();
    public abstract int getIterationNum();
    public abstract void testIteration();
    public void run(){
        for (int idx=0; idx<getWarmupIterationNum();idx++){
            testIteration();
        }

        final long start= System.currentTimeMillis();
        for (int idx=0; idx<getIterationNum();idx++){
            testIteration();
        }
        final long end=System.currentTimeMillis();
        System.out.println("Average time of a iteration took"+((double)(end-start))/getIterationNum()+ " ms");
    }
}
