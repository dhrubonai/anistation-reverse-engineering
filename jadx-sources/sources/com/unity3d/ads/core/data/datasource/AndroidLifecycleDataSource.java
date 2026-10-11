package com.unity3d.ads.core.data.datasource;

import defpackage.db;
import defpackage.dg3;
import defpackage.h41;
import defpackage.lg3;
import defpackage.og3;
import defpackage.qx5;
import defpackage.sx5;
import defpackage.tl7;
import defpackage.tx5;
import defpackage.x44;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidLifecycleDataSource implements LifecycleDataSource, lg3 {
    private final x44 _appActive;
    private final qx5 appActive;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[dg3.values().length];
            try {
                iArr[dg3.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dg3.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidLifecycleDataSource() {
        sx5 a = tx5.a(Boolean.TRUE);
        this._appActive = a;
        this.appActive = h41.d(a);
        registerAppLifecycle();
    }

    private final void registerAppLifecycle() {
        tl7.z(db.j(), null, null, new AndroidLifecycleDataSource$registerAppLifecycle$1(this, null), 3);
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return ((Boolean) getAppActive().getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public qx5 getAppActive() {
        return this.appActive;
    }

    @Override // defpackage.lg3
    public void onStateChanged(og3 og3Var, dg3 dg3Var) {
        og3Var.getClass();
        dg3Var.getClass();
        x44 x44Var = this._appActive;
        int i = WhenMappings.$EnumSwitchMapping$0[dg3Var.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                z = ((Boolean) getAppActive().getValue()).booleanValue();
            }
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        sx5 sx5Var = (sx5) x44Var;
        sx5Var.getClass();
        sx5Var.l(null, valueOf);
    }
}
