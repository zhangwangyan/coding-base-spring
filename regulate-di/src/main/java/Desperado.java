import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class Desperado implements InstantiationAwareBeanPostProcessor {
//    //这里很有意思，写接口可以让所有类都不能依赖注入
//		if (!mbd.isSynthetic() && hasInstantiationAwareBeanPostProcessors()) {
//        for (BeanPostProcessor bp : getBeanPostProcessors()) {
//            if (bp instanceof InstantiationAwareBeanPostProcessor) {
//                InstantiationAwareBeanPostProcessor ibp = (InstantiationAwareBeanPostProcessor) bp;
//                if (!ibp.postProcessAfterInstantiation(bw.getWrappedInstance(), beanName)) {
//                    return;
//                }
//            }
//        }
//    }


    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
       // return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
        return  false;
    }
}
