package com.axvm.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import androidx.annotation.Keep;

import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Keep
@Inherited
@Target({TYPE, METHOD})
public @interface AxVMProtected {

}
