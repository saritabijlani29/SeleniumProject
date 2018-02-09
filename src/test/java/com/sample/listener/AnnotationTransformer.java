package com.sample.listener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

@SuppressWarnings("all")
public class AnnotationTransformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		if (testMethod.getName().equals("test1")) {
			System.out.println("Disable " + testMethod.getName());
			 annotation.setEnabled(false);
		}
	}

}
