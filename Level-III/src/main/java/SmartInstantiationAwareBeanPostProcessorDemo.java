import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 对同一个对象反复装饰
 */
@Component
public class SmartInstantiationAwareBeanPostProcessorDemo implements

        SmartInstantiationAwareBeanPostProcessor
{
    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        return bean;
    }


//   /*
//   	protected Object getEarlyBeanReference(String beanName, RootBeanDefinition mbd, Object bean) {
//		Object exposedObject = bean;
//		if (!mbd.isSynthetic() && hasInstantiationAwareBeanPostProcessors()) {
//			for (BeanPostProcessor bp : getBeanPostProcessors()) {
//				if (bp instanceof SmartInstantiationAwareBeanPostProcessor) {
//					SmartInstantiationAwareBeanPostProcessor ibp = (SmartInstantiationAwareBeanPostProcessor) bp;
//					exposedObject = ibp.getEarlyBeanReference(exposedObject, beanName);
//				}
//			}
//		}
//		return exposedObject;
//	}*/
}
