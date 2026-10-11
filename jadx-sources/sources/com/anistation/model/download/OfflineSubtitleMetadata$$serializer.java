package com.anistation.model.download;

import com.unity3d.ads.BuildConfig;
import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.jb0;
import defpackage.kq4;
import defpackage.l61;
import defpackage.l70;
import defpackage.mz5;
import defpackage.qi2;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class OfflineSubtitleMetadata$$serializer implements wd2 {
    public static final OfflineSubtitleMetadata$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        OfflineSubtitleMetadata$$serializer offlineSubtitleMetadata$$serializer = new OfflineSubtitleMetadata$$serializer();
        INSTANCE = offlineSubtitleMetadata$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.download.OfflineSubtitleMetadata", offlineSubtitleMetadata$$serializer, 4);
        kq4Var.j("fileName", false);
        kq4Var.j("lang", false);
        kq4Var.j("label", false);
        kq4Var.j(BuildConfig.FLAVOR, false);
        descriptor = kq4Var;
    }

    private OfflineSubtitleMetadata$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        return new x73[]{mz5Var, jb0.a(mz5Var), jb0.a(mz5Var), l70.a};
    }

    @Override // defpackage.ne1
    public final OfflineSubtitleMetadata deserialize(l61 l61Var) {
        String str;
        boolean z;
        String str2;
        String str3;
        int i;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        if (c.decodeSequentially()) {
            str = c.m(aj5Var, 0);
            mz5 mz5Var = mz5.a;
            String str4 = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5Var, null);
            String str5 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5Var, null);
            z = c.w(aj5Var, 3);
            str2 = str5;
            str3 = str4;
            i = 15;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            int i2 = 0;
            str = null;
            String str6 = null;
            String str7 = null;
            while (z2) {
                int i3 = c.i(aj5Var);
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    z3 = c.w(aj5Var, 3);
                                    i2 |= 8;
                                } else {
                                    qi2.f(i3);
                                    return null;
                                }
                            } else {
                                str6 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5.a, str6);
                                i2 |= 4;
                            }
                        } else {
                            str7 = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5.a, str7);
                            i2 |= 2;
                        }
                    } else {
                        str = c.m(aj5Var, 0);
                        i2 |= 1;
                    }
                } else {
                    z2 = false;
                }
            }
            z = z3;
            str2 = str6;
            str3 = str7;
            i = i2;
        }
        String str8 = str;
        c.a(aj5Var);
        return new OfflineSubtitleMetadata(i, str8, str3, str2, z, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, OfflineSubtitleMetadata offlineSubtitleMetadata) {
        wt1Var.getClass();
        offlineSubtitleMetadata.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        OfflineSubtitleMetadata.write$Self$AniStation_core_model(offlineSubtitleMetadata, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
