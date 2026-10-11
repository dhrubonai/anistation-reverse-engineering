package com.unity3d.ads.core.extensions;

import defpackage.ic2;
import defpackage.m37;
import defpackage.n6;
import defpackage.nj0;
import defpackage.pn6;
import defpackage.sb2;
import defpackage.t36;
import defpackage.tu4;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;
import defpackage.w51;
import defpackage.x42;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", l = {15, 17}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FlowExtensionsKt$timeoutAfter$1 extends t36 implements ic2 {
    final /* synthetic */ boolean $active;
    final /* synthetic */ ic2 $block;
    final /* synthetic */ w42 $this_timeoutAfter;
    final /* synthetic */ long $timeoutMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", l = {10}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ic2 {
        final /* synthetic */ tu4 $$this$channelFlow;
        final /* synthetic */ w42 $this_timeoutAfter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(w42 w42Var, tu4 tu4Var, vz0 vz0Var) {
            super(2, vz0Var);
            this.$this_timeoutAfter = w42Var;
            this.$$this$channelFlow = tu4Var;
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            return new AnonymousClass1(this.$this_timeoutAfter, this.$$this$channelFlow, vz0Var);
        }

        @Override // defpackage.ic2
        public final Object invoke(v11 v11Var, vz0 vz0Var) {
            return ((AnonymousClass1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    m37.N(obj);
                } else {
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                m37.N(obj);
                w42 w42Var = this.$this_timeoutAfter;
                final tu4 tu4Var = this.$$this$channelFlow;
                x42 x42Var = new x42() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                    @Override // defpackage.x42
                    public final Object emit(T t, vz0 vz0Var) {
                        Object b = ((nj0) tu4.this).B.b(vz0Var, t);
                        if (b == w11.x) {
                            return b;
                        }
                        return pn6.a;
                    }
                };
                this.label = 1;
                Object collect = w42Var.collect(x42Var, this);
                w11 w11Var = w11.x;
                if (collect == w11Var) {
                    return w11Var;
                }
            }
            ((nj0) this.$$this$channelFlow).f(null);
            return pn6.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$timeoutAfter$1(long j, boolean z, ic2 ic2Var, w42 w42Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.$timeoutMillis = j;
        this.$active = z;
        this.$block = ic2Var;
        this.$this_timeoutAfter = w42Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        FlowExtensionsKt$timeoutAfter$1 flowExtensionsKt$timeoutAfter$1 = new FlowExtensionsKt$timeoutAfter$1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, vz0Var);
        flowExtensionsKt$timeoutAfter$1.L$0 = obj;
        return flowExtensionsKt$timeoutAfter$1;
    }

    @Override // defpackage.ic2
    public final Object invoke(tu4 tu4Var, vz0 vz0Var) {
        return ((FlowExtensionsKt$timeoutAfter$1) create(tu4Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r8.invoke(r3, r7) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (defpackage.x97.u(r5, r7) == r4) goto L17;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 2
            r3 = 1
            w11 r4 = defpackage.w11.x
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.m37.N(r8)
            goto L55
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r1
        L17:
            java.lang.Object r0 = r7.L$0
            tu4 r0 = (defpackage.tu4) r0
            defpackage.m37.N(r8)
            goto L3f
        L1f:
            defpackage.m37.N(r8)
            java.lang.Object r8 = r7.L$0
            r0 = r8
            tu4 r0 = (defpackage.tu4) r0
            com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1 r8 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1
            w42 r5 = r7.$this_timeoutAfter
            r8.<init>(r5, r0, r1)
            r5 = 3
            defpackage.tl7.z(r0, r1, r1, r8, r5)
            long r5 = r7.$timeoutMillis
            r7.L$0 = r0
            r7.label = r3
            java.lang.Object r8 = defpackage.x97.u(r5, r7)
            if (r8 != r4) goto L3f
            goto L54
        L3f:
            boolean r8 = r7.$active
            if (r8 == 0) goto L55
            ic2 r8 = r7.$block
            com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2 r3 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2
            r3.<init>(r0)
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r7 = r8.invoke(r3, r7)
            if (r7 != r4) goto L55
        L54:
            return r4
        L55:
            pn6 r7 = defpackage.pn6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass2 extends n6 implements sb2 {
        public AnonymousClass2(Object obj) {
            super(0, obj, tu4.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m61invoke() {
            ((nj0) ((tu4) this.receiver)).f(null);
        }

        @Override // defpackage.sb2
        public /* bridge */ /* synthetic */ Object invoke() {
            m61invoke();
            return pn6.a;
        }
    }
}
