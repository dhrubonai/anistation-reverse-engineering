package com.unity3d.ads.core.data.datasource;

import defpackage.db;
import defpackage.ic2;
import defpackage.ke0;
import defpackage.l0;
import defpackage.m37;
import defpackage.n11;
import defpackage.o11;
import defpackage.pn6;
import defpackage.t36;
import defpackage.tl7;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.ze0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class CachedFIdDataSource implements FIdDataSource {
    private final FIdDataSource dataSource;
    private AtomicBoolean loaded;
    private v11 scope;
    private volatile String value;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @w51(c = "com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1", f = "CachedFIdDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends t36 implements ic2 {
        int label;

        public AnonymousClass1(vz0 vz0Var) {
            super(2, vz0Var);
        }

        @Override // defpackage.h30
        public final vz0 create(Object obj, vz0 vz0Var) {
            return new AnonymousClass1(vz0Var);
        }

        @Override // defpackage.ic2
        public final Object invoke(v11 v11Var, vz0 vz0Var) {
            return ((AnonymousClass1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
        }

        @Override // defpackage.h30
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                m37.N(obj);
                CachedFIdDataSource cachedFIdDataSource = CachedFIdDataSource.this;
                cachedFIdDataSource.value = cachedFIdDataSource.dataSource.invoke();
                return pn6.a;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    public CachedFIdDataSource(n11 n11Var, FIdDataSource fIdDataSource) {
        n11Var.getClass();
        fIdDataSource.getClass();
        this.dataSource = fIdDataSource;
        this.loaded = new AtomicBoolean(false);
        ke0 g0 = db.g0(db.b(n11Var), new CachedFIdDataSource$special$$inlined$CoroutineExceptionHandler$1(o11.x));
        this.scope = g0;
        tl7.z(g0, null, null, new AnonymousClass1(null), 3).l0(new l0(this, (byte) 24));
    }

    public static final pn6 _init_$lambda$1(CachedFIdDataSource cachedFIdDataSource, Throwable th) {
        db.t(cachedFIdDataSource.scope, null);
        cachedFIdDataSource.loaded.set(true);
        return pn6.a;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdDataSource
    public String invoke() {
        if (this.loaded.get()) {
            return this.value;
        }
        return null;
    }
}
