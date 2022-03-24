package ma.aop.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;


public class TraceInvocation implements Ordered {

Logger logger = Logger.getLogger(TraceInvocation.class);


    public Object afficherTrace( ProceedingJoinPoint joinpoint) throws Throwable {
        String nomMethode = joinpoint.getTarget().getClass().getSimpleName() + "."
                + joinpoint.getSignature().getName();

        Object obj =joinpoint.proceed();
        logger.info(nomMethode);
        return obj;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
