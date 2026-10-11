package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.LifecycleEvent;
import com.unity3d.ads.core.log.Logger;
import defpackage.db;
import defpackage.iv;
import defpackage.iv5;
import defpackage.k52;
import defpackage.n11;
import defpackage.o11;
import defpackage.p11;
import defpackage.pn6;
import defpackage.qx5;
import defpackage.sx5;
import defpackage.tl7;
import defpackage.tx5;
import defpackage.v73;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.w51;
import defpackage.x42;
import defpackage.x44;
import defpackage.xv4;
import defpackage.xz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class OrientationRepository {
    private final x44 _resumedActivityOrientation;
    private final p11 coroutineExceptionHandler;
    private final n11 defaultDispatcher;
    private final AndroidGetLifecycleFlow getLifecycleFlow;
    private final x44 isRunning;
    private final Logger logger;
    private final qx5 resumedActivityOrientation;

    public OrientationRepository(AndroidGetLifecycleFlow androidGetLifecycleFlow, n11 n11Var, Logger logger) {
        androidGetLifecycleFlow.getClass();
        n11Var.getClass();
        logger.getClass();
        this.getLifecycleFlow = androidGetLifecycleFlow;
        this.defaultDispatcher = n11Var;
        this.logger = logger;
        this.isRunning = tx5.a(Boolean.FALSE);
        this.coroutineExceptionHandler = new OrientationRepository$special$$inlined$CoroutineExceptionHandler$1(o11.x, this);
        sx5 a = tx5.a(-1);
        this._resumedActivityOrientation = a;
        this.resumedActivityOrientation = a;
    }

    public final qx5 getResumedActivityOrientation() {
        return this.resumedActivityOrientation;
    }

    public final void invoke() {
        sx5 sx5Var;
        Object value;
        Boolean bool;
        x44 x44Var = this.isRunning;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!sx5Var.j(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        final w42 invoke = this.getLifecycleFlow.invoke();
        final w42 w42Var = new w42() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;

                @w51(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2", f = "OrientationRepository.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(vz0 vz0Var) {
                        super(vz0Var);
                    }

                    @Override // defpackage.h30
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(x42 x42Var) {
                    this.$this_unsafeFlow = x42Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // defpackage.x42
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.vz0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1 r0 = (com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1 r0 = new com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L40
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r4 = r4.$this_unsafeFlow
                        boolean r6 = r5 instanceof com.unity3d.ads.core.domain.LifecycleEvent.Resumed
                        if (r6 == 0) goto L40
                        r0.label = r2
                        java.lang.Object r4 = r4.emit(r5, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L40
                        return r5
                    L40:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
                }
            }

            @Override // defpackage.w42
            public Object collect(x42 x42Var, vz0 vz0Var) {
                Object collect = w42.this.collect(new AnonymousClass2(x42Var), vz0Var);
                if (collect == w11.x) {
                    return collect;
                }
                return pn6.a;
            }
        };
        final OrientationRepository$invoke$3 orientationRepository$invoke$3 = new xv4() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$3
            @Override // defpackage.xv4, defpackage.v73
            public Object get(Object obj) {
                return ((LifecycleEvent) obj).getActivity();
            }
        };
        iv.G(new k52(new w42() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1

            /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
            /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements x42 {
                final /* synthetic */ x42 $this_unsafeFlow;
                final /* synthetic */ v73 receiver$inlined;

                @w51(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2", f = "OrientationRepository.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends xz0 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(vz0 vz0Var) {
                        super(vz0Var);
                    }

                    @Override // defpackage.h30
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(x42 x42Var, v73 v73Var) {
                    this.$this_unsafeFlow = x42Var;
                    this.receiver$inlined = v73Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // defpackage.x42
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.vz0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1 r0 = (com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1 r0 = new com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2c
                        if (r1 != r2) goto L25
                        defpackage.m37.N(r6)
                        goto L44
                    L25:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ze0.m(r4)
                        r4 = 0
                        return r4
                    L2c:
                        defpackage.m37.N(r6)
                        x42 r6 = r4.$this_unsafeFlow
                        com.unity3d.ads.core.domain.LifecycleEvent r5 = (com.unity3d.ads.core.domain.LifecycleEvent) r5
                        v73 r4 = r4.receiver$inlined
                        java.lang.Object r4 = r4.get(r5)
                        r0.label = r2
                        java.lang.Object r4 = r6.emit(r4, r0)
                        w11 r5 = defpackage.w11.x
                        if (r4 != r5) goto L44
                        return r5
                    L44:
                        pn6 r4 = defpackage.pn6.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
                }
            }

            @Override // defpackage.w42
            public Object collect(x42 x42Var, vz0 vz0Var) {
                Object collect = w42.this.collect(new AnonymousClass2(x42Var, orientationRepository$invoke$3), vz0Var);
                if (collect == w11.x) {
                    return collect;
                }
                return pn6.a;
            }
        }, new OrientationRepository$invoke$4(this, null), (byte) 2), db.b(tl7.L(iv5.a(), this.defaultDispatcher).plus(this.coroutineExceptionHandler)));
    }
}
