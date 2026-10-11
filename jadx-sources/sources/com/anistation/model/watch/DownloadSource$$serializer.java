package com.anistation.model.watch;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.kq4;
import defpackage.l61;
import defpackage.mz5;
import defpackage.qi2;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class DownloadSource$$serializer implements wd2 {
    public static final DownloadSource$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        DownloadSource$$serializer downloadSource$$serializer = new DownloadSource$$serializer();
        INSTANCE = downloadSource$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.watch.DownloadSource", downloadSource$$serializer, 3);
        kq4Var.j("server", false);
        kq4Var.j(HandleInvocationsFromAdViewer.KEY_AD_TYPE, false);
        kq4Var.j("url", false);
        descriptor = kq4Var;
    }

    private DownloadSource$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        return new x73[]{mz5Var, mz5Var, mz5Var};
    }

    @Override // defpackage.ne1
    public final DownloadSource deserialize(l61 l61Var) {
        String str;
        String str2;
        String str3;
        int i;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        if (c.decodeSequentially()) {
            String m = c.m(aj5Var, 0);
            String m2 = c.m(aj5Var, 1);
            str = m;
            str2 = c.m(aj5Var, 2);
            str3 = m2;
            i = 7;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int i3 = c.i(aj5Var);
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                str5 = c.m(aj5Var, 2);
                                i2 |= 4;
                            } else {
                                qi2.f(i3);
                                return null;
                            }
                        } else {
                            str6 = c.m(aj5Var, 1);
                            i2 |= 2;
                        }
                    } else {
                        str4 = c.m(aj5Var, 0);
                        i2 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            str = str4;
            str2 = str5;
            str3 = str6;
            i = i2;
        }
        c.a(aj5Var);
        return new DownloadSource(i, str, str3, str2, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, DownloadSource downloadSource) {
        wt1Var.getClass();
        downloadSource.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        DownloadSource.write$Self$AniStation_core_model(downloadSource, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
