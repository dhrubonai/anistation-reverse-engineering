package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import r6.h0;
import w6.f;

/* loaded from: classes.dex */
public abstract class zzce implements InvocationHandler {
    private final Object zza;

    public zzce(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        int i10;
        if (h0.g(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (h0.g(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (h0.g(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z9 = false;
            if (objArr != null && objArr.length != 0) {
                Object obj3 = objArr[0];
                if (obj3 != null) {
                    i10 = obj3.hashCode();
                } else {
                    i10 = 0;
                }
                if (i10 == obj.hashCode()) {
                    z9 = true;
                }
            }
            return Boolean.valueOf(z9);
        }
        boolean zza = zza(obj, method, objArr);
        f fVar = f.f11019a;
        if (!zza) {
            return fVar;
        }
        if ((this.zza == null && h0.g(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && h0.g(zzgd.zza(obj2.getClass()), zzgd.zza(method.getReturnType())))) {
            Object obj4 = this.zza;
            if (obj4 == null) {
                return fVar;
            }
            return obj4;
        }
        throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
