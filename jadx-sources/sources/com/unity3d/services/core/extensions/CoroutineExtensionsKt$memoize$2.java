package com.unity3d.services.core.extensions;

import defpackage.ic2;
import defpackage.k54;
import defpackage.m37;
import defpackage.nc1;
import defpackage.pn6;
import defpackage.t36;
import defpackage.tl7;
import defpackage.ub2;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CoroutineExtensionsKt$memoize$2 extends t36 implements ic2 {
    final /* synthetic */ ub2 $action;
    final /* synthetic */ Object $key;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineExtensionsKt$memoize$2(Object obj, ub2 ub2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.$key = obj;
        this.$action = ub2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        CoroutineExtensionsKt$memoize$2 coroutineExtensionsKt$memoize$2 = new CoroutineExtensionsKt$memoize$2(this.$key, this.$action, vz0Var);
        coroutineExtensionsKt$memoize$2.L$0 = obj;
        return coroutineExtensionsKt$memoize$2;
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((CoroutineExtensionsKt$memoize$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        v11 v11Var;
        k54 mutex;
        ub2 ub2Var;
        Object obj2;
        int i = this.label;
        w11 w11Var = w11.x;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ub2Var = (ub2) this.L$3;
                obj2 = this.L$2;
                mutex = (k54) this.L$1;
                v11Var = (v11) this.L$0;
                m37.N(obj);
            } else {
                m37.N(obj);
                v11Var = (v11) this.L$0;
                mutex = CoroutineExtensionsKt.getMutex();
                Object obj3 = this.$key;
                ub2Var = this.$action;
                this.L$0 = v11Var;
                this.L$1 = mutex;
                this.L$2 = obj3;
                this.L$3 = ub2Var;
                this.label = 1;
                if (mutex.a(this) != w11Var) {
                    obj2 = obj3;
                }
                return w11Var;
            }
            LinkedHashMap<Object, nc1> deferreds = CoroutineExtensionsKt.getDeferreds();
            nc1 nc1Var = deferreds.get(obj2);
            if (nc1Var == null) {
                nc1Var = tl7.i(v11Var, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(ub2Var, null), 3);
                deferreds.put(obj2, nc1Var);
            }
            nc1 nc1Var2 = nc1Var;
            mutex.l(null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            Object p = nc1Var2.p(this);
            if (p == w11Var) {
                return w11Var;
            }
            return p;
        } catch (Throwable th) {
            mutex.l(null);
            throw th;
        }
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        v11 v11Var = (v11) this.L$0;
        k54 mutex = CoroutineExtensionsKt.getMutex();
        Object obj2 = this.$key;
        ub2 ub2Var = this.$action;
        mutex.a(this);
        try {
            LinkedHashMap<Object, nc1> deferreds = CoroutineExtensionsKt.getDeferreds();
            nc1 nc1Var = deferreds.get(obj2);
            if (nc1Var == null) {
                nc1Var = tl7.i(v11Var, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(ub2Var, null), 3);
                deferreds.put(obj2, nc1Var);
            }
            nc1 nc1Var2 = nc1Var;
            mutex.l(null);
            return nc1Var2.p(this);
        } catch (Throwable th) {
            mutex.l(null);
            throw th;
        }
    }
}
