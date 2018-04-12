package com.androiddesdecero.a004daggerjava.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME) public @interface PerFragment {
}
