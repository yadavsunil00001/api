package biodiv;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

import org.aopalliance.intercept.ConstructorInterceptor;
import org.aopalliance.intercept.MethodInterceptor;
import org.glassfish.hk2.api.Descriptor;
import org.glassfish.hk2.api.Filter;
import org.jvnet.hk2.annotations.Service;


@Service
public class MyInterceptionService implements org.glassfish.hk2.api.InterceptionService {

    private static final ResourceInterceptor RESOURCE_INTERCEPTOR = new ResourceInterceptor();

    private static final List<MethodInterceptor> RESOURCE_METHOD_INTERCEPTORS =
            Collections.<MethodInterceptor>singletonList(RESOURCE_INTERCEPTOR);

    @Override
    public Filter getDescriptorFilter() {
        // We're only interested in classes (resources, providers) from this applications packages.
        return new Filter() {
            @Override
            public boolean matches(final Descriptor d) {
                final String clazz = d.getImplementation();
                return  clazz.startsWith("biodiv") || clazz.startsWith("biodiv.common");
            }
        };
    }

    @Override
    public List<MethodInterceptor> getMethodInterceptors(final Method method) {
        // Apply interceptors only to methods annotated with @Intercept.
        if (method.isAnnotationPresent(Intercept.class)) {
//            final Class<?> clazz = method.getDeclaringClass();
//            System.out.println("Checkinggggggggggggggggggggg");
//            System.out.println(method.getDeclaringClass());
//            System.out.println("Checkinggggggggggggggggggggg");
//            if(clazz == ObservationService.class)
//            	return RESOURCE_METHOD_INTERCEPTORS;
        	return RESOURCE_METHOD_INTERCEPTORS;
        }
        return null;
    }

	@Override
	public List<ConstructorInterceptor> getConstructorInterceptors(Constructor<?> constructor) {
		// TODO Auto-generated method stub
		return null;
	}

}

