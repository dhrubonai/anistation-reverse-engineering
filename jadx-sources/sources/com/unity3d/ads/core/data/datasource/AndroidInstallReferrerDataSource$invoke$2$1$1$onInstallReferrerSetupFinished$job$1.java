package com.unity3d.ads.core.data.datasource;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import com.google.protobuf.ByteString;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pg0;
import defpackage.pn6;
import defpackage.t36;
import defpackage.v11;
import defpackage.vz0;
import defpackage.w51;
import defpackage.y45;
import defpackage.ze0;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.InstallReferrerKt;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1", f = "AndroidInstallReferrerDataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1 extends t36 implements ic2 {
    final /* synthetic */ pg0 $continuation;
    final /* synthetic */ InstallReferrerClient $referrerClient;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidInstallReferrerDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1(InstallReferrerClient installReferrerClient, AndroidInstallReferrerDataSource androidInstallReferrerDataSource, pg0 pg0Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.$referrerClient = installReferrerClient;
        this.this$0 = androidInstallReferrerDataSource;
        this.$continuation = pg0Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1 androidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1 = new AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1(this.$referrerClient, this.this$0, this.$continuation, vz0Var);
        androidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1.L$0 = obj;
        return androidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1;
    }

    @Override // defpackage.ic2
    public final Object invoke(v11 v11Var, vz0 vz0Var) {
        return ((AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1) create(v11Var, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object y45Var;
        SendDiagnosticEvent sendDiagnosticEvent;
        Object obj2 = pn6.a;
        if (this.label == 0) {
            m37.N(obj);
            try {
                try {
                    ReferrerDetails installReferrer = this.$referrerClient.getInstallReferrer();
                    pg0 pg0Var = this.$continuation;
                    try {
                        InstallReferrerKt.Dsl.Companion companion = InstallReferrerKt.Dsl.Companion;
                        InitializationRequestOuterClass.InstallReferrer.Builder newBuilder = InitializationRequestOuterClass.InstallReferrer.newBuilder();
                        newBuilder.getClass();
                        InstallReferrerKt.Dsl _create = companion._create(newBuilder);
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 != null) {
                            _create.setUrl(installReferrer2);
                        }
                        _create.setClickTime(installReferrer.getReferrerClickTimestampSeconds());
                        _create.setInstallTime(installReferrer.getInstallBeginTimestampServerSeconds());
                        _create.setInstantExperienceLunch(installReferrer.getGooglePlayInstantParam());
                        pg0Var.resumeWith(_create._build());
                        y45Var = obj2;
                    } catch (Throwable th) {
                        y45Var = new y45(th);
                    }
                    if (!(y45Var instanceof y45)) {
                        sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "install_referral_fetch_completed", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, (MediationInfo) null, 254, (Object) null);
                    }
                } finally {
                }
            } catch (RemoteException unused) {
                this.this$0.onError(this.$continuation);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused2) {
                this.this$0.onError(this.$continuation);
            }
            try {
                this.$referrerClient.endConnection();
            } catch (Throwable unused3) {
                return obj2;
            }
        } else {
            ze0.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }
}
