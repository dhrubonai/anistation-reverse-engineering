package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.log.Logger;
import defpackage.db;
import defpackage.fn5;
import defpackage.h41;
import defpackage.iv5;
import defpackage.jn5;
import defpackage.n11;
import defpackage.o11;
import defpackage.pn6;
import defpackage.tl7;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.w51;
import defpackage.x42;
import defpackage.xz0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class FocusRepository {
    private final fn5 focusState;
    private final Logger logger;

    public FocusRepository(AndroidGetLifecycleFlow androidGetLifecycleFlow, n11 n11Var, Logger logger) {
        fn5 b;
        androidGetLifecycleFlow.getClass();
        n11Var.getClass();
        logger.getClass();
        this.logger = logger;
        try {
            final w42 invoke = androidGetLifecycleFlow.invoke();
            final w42 w42Var = new w42() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1

                /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
                /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass2<T> implements x42 {
                    final /* synthetic */ x42 $this_unsafeFlow;

                    @w51(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2", f = "FocusRepository.kt", l = {50}, m = "emit")
                    /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
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
                            boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            int r1 = r0.label
                            r2 = 1
                            if (r1 == 0) goto L2c
                            if (r1 != r2) goto L25
                            defpackage.m37.N(r6)
                            goto L47
                        L25:
                            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                            defpackage.ze0.m(r4)
                            r4 = 0
                            return r4
                        L2c:
                            defpackage.m37.N(r6)
                            x42 r4 = r4.$this_unsafeFlow
                            r6 = r5
                            com.unity3d.ads.core.domain.LifecycleEvent r6 = (com.unity3d.ads.core.domain.LifecycleEvent) r6
                            boolean r1 = r6 instanceof com.unity3d.ads.core.domain.LifecycleEvent.Paused
                            if (r1 != 0) goto L3c
                            boolean r6 = r6 instanceof com.unity3d.ads.core.domain.LifecycleEvent.Resumed
                            if (r6 == 0) goto L47
                        L3c:
                            r0.label = r2
                            java.lang.Object r4 = r4.emit(r5, r0)
                            w11 r5 = defpackage.w11.x
                            if (r4 != r5) goto L47
                            return r5
                        L47:
                            pn6 r4 = defpackage.pn6.a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
            b = h41.Z(new w42() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1

                /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
                /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass2<T> implements x42 {
                    final /* synthetic */ x42 $this_unsafeFlow;

                    @w51(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2", f = "FocusRepository.kt", l = {50}, m = "emit")
                    /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1, reason: invalid class name */
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
                            boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            int r1 = r0.label
                            r2 = 1
                            if (r1 == 0) goto L2c
                            if (r1 != r2) goto L25
                            defpackage.m37.N(r6)
                            goto L57
                        L25:
                            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                            defpackage.ze0.m(r4)
                            r4 = 0
                            return r4
                        L2c:
                            defpackage.m37.N(r6)
                            x42 r4 = r4.$this_unsafeFlow
                            com.unity3d.ads.core.domain.LifecycleEvent r5 = (com.unity3d.ads.core.domain.LifecycleEvent) r5
                            boolean r6 = r5 instanceof com.unity3d.ads.core.domain.LifecycleEvent.Resumed
                            if (r6 == 0) goto L43
                            com.unity3d.ads.core.data.repository.FocusState$Focused r6 = new com.unity3d.ads.core.data.repository.FocusState$Focused
                            com.unity3d.ads.core.domain.LifecycleEvent$Resumed r5 = (com.unity3d.ads.core.domain.LifecycleEvent.Resumed) r5
                            java.lang.ref.WeakReference r5 = r5.getActivity()
                            r6.<init>(r5)
                            goto L4c
                        L43:
                            com.unity3d.ads.core.data.repository.FocusState$Unfocused r6 = new com.unity3d.ads.core.data.repository.FocusState$Unfocused
                            java.lang.ref.WeakReference r5 = r5.getActivity()
                            r6.<init>(r5)
                        L4c:
                            r0.label = r2
                            java.lang.Object r4 = r4.emit(r6, r0)
                            w11 r5 = defpackage.w11.x
                            if (r4 != r5) goto L57
                            return r5
                        L57:
                            pn6 r4 = defpackage.pn6.a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, vz0):java.lang.Object");
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
            }, db.b(tl7.L(iv5.a(), n11Var).plus(new FocusRepository$special$$inlined$CoroutineExceptionHandler$1(o11.x, this))), 1);
        } catch (Exception e) {
            this.logger.error("Could not subscribe to lifecycle flow", e);
            b = jn5.b(0, 0, null, 7);
        }
        this.focusState = b;
    }

    public final fn5 getFocusState() {
        return this.focusState;
    }
}
