package in.problem.array;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import in.wrapper.vector.AccessPrivateMethod;

public class Fun {
	
		public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
			
			Class c = Class.forName("in.wrapper.vector.AccessPrivateMethod");
			
			AccessPrivateMethod obj1 = (AccessPrivateMethod) c.newInstance();
			
			obj1.printFun();
			
			Method m = c.getDeclaredMethod("workClass", null);
			m.setAccessible(true);
			m.invoke(obj1, null);
		}		
}
