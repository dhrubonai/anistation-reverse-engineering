package com.unity3d.ads.core.data.datasource;

import android.database.ContentObserver;
import android.provider.Settings;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import defpackage.ic2;
import defpackage.m37;
import defpackage.n77;
import defpackage.pn6;
import defpackage.s05;
import defpackage.sb2;
import defpackage.t36;
import defpackage.tu4;
import defpackage.u05;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w51;
import defpackage.ze0;
import defpackage.zz;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", l = {642}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends t36 implements ic2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pn6 invokeSuspend$lambda$0(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1) {
        androidDynamicDeviceInfoDataSource.getContext().getContentResolver().unregisterContentObserver(androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1);
        return pn6.a;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, vz0Var);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    @Override // defpackage.ic2
    public final Object invoke(tu4 tu4Var, vz0 vz0Var) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(tu4Var, vz0Var)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [s05, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, u05] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1, android.database.ContentObserver] */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        double streamVolume;
        boolean z;
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
            final tu4 tu4Var = (tu4) this.L$0;
            final ?? obj2 = new Object();
            streamVolume = this.this$0.getStreamVolume(3);
            obj2.x = streamVolume;
            zz.f0(tu4Var, new VolumeSettingsChange.VolumeChange(streamVolume));
            final ?? obj3 = new Object();
            int ringerMode = this.this$0.getRingerMode();
            obj3.x = ringerMode;
            if (ringerMode == 0) {
                z = true;
            } else {
                z = false;
            }
            zz.f0(tu4Var, new VolumeSettingsChange.MuteChange(z));
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            final ?? r3 = new ContentObserver() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean z2) {
                    double streamVolume2;
                    boolean z3;
                    super.onChange(z2);
                    streamVolume2 = AndroidDynamicDeviceInfoDataSource.this.getStreamVolume(3);
                    s05 s05Var = obj2;
                    if (streamVolume2 != s05Var.x) {
                        s05Var.x = streamVolume2;
                        zz.f0(tu4Var, new VolumeSettingsChange.VolumeChange(streamVolume2));
                    }
                    int ringerMode2 = AndroidDynamicDeviceInfoDataSource.this.getRingerMode();
                    u05 u05Var = obj3;
                    if (ringerMode2 != u05Var.x) {
                        u05Var.x = ringerMode2;
                        tu4 tu4Var2 = tu4Var;
                        if (ringerMode2 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zz.f0(tu4Var2, new VolumeSettingsChange.MuteChange(z3));
                    }
                }
            };
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, r3);
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource2 = this.this$0;
            sb2 sb2Var = new sb2() { // from class: com.unity3d.ads.core.data.datasource.a
                @Override // defpackage.sb2
                public final Object invoke() {
                    pn6 invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1.invokeSuspend$lambda$0(AndroidDynamicDeviceInfoDataSource.this, r3);
                    return invokeSuspend$lambda$0;
                }
            };
            this.label = 1;
            Object s = n77.s(tu4Var, sb2Var, this);
            w11 w11Var = w11.x;
            if (s == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }
}
