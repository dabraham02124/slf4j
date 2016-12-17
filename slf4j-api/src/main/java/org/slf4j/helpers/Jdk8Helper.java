package org.slf4j.helpers;

import org.slf4j.jdk8classes.Supplier;

public class Jdk8Helper {

    public static Object[] suppliersToObjects(Supplier<Object>... arguments) {
    	if (null == arguments || 0 == arguments.length) {
    		return new Object[0];
    	}
    	
    	Object[] argsOut = new Object[arguments.length];
    	
    	for (int i = 0; i < arguments.length; i++) {
    		argsOut[i] = arguments[i].get();
    	}
    	
    	return argsOut;
    }

}
