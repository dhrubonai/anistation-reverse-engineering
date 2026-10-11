package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.qg0;
import defpackage.t36;
import defpackage.tl7;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.wc7;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2", f = "AndroidInstallReferrerDataSource.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidInstallReferrerDataSource$invoke$2 extends t36 implements ic2 {
    Object L$0;
    int label;
    final /* synthetic */ AndroidInstallReferrerDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInstallReferrerDataSource$invoke$2(AndroidInstallReferrerDataSource androidInstallReferrerDataSource, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidInstallReferrerDataSource;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new AndroidInstallReferrerDataSource$invoke$2(this.this$0, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidInstallReferrerDataSource$invoke$2) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Context context;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                m37.N(obj);
                return obj;
            }
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m37.N(obj);
        final AndroidInstallReferrerDataSource androidInstallReferrerDataSource = this.this$0;
        this.L$0 = androidInstallReferrerDataSource;
        this.label = 1;
        final qg0 qg0Var = new qg0(1, wc7.z(this));
        qg0Var.t();
        try {
            context = androidInstallReferrerDataSource.appContext;
            final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
            build.startConnection(new InstallReferrerStateListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1
                public void onInstallReferrerServiceDisconnected() {
                    AndroidInstallReferrerDataSource.this.onError(qg0Var);
                }

                public void onInstallReferrerSetupFinished(int i2) {
                    v11 v11Var;
                    if (i2 == 0) {
                        v11Var = AndroidInstallReferrerDataSource.this.scope;
                        if (!tl7.z(v11Var, null, null, new AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1(build, AndroidInstallReferrerDataSource.this, qg0Var, null), 3).isActive()) {
                            try {
                                build.endConnection();
                            } catch (Throwable unused) {
                            }
                            AndroidInstallReferrerDataSource.this.onError(qg0Var);
                            return;
                        }
                        return;
                    }
                    try {
                        build.endConnection();
                    } catch (Throwable unused2) {
                    }
                    AndroidInstallReferrerDataSource.this.onError(qg0Var);
                }
            });
        } catch (Throwable unused) {
            androidInstallReferrerDataSource.onError(qg0Var);
        }
        Object r = qg0Var.r();
        w11 w11Var = w11.x;
        if (r == w11Var) {
            return w11Var;
        }
        return r;
    }
}
