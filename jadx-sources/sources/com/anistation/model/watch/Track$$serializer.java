package com.anistation.model.watch;

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
public final /* synthetic */ class Track$$serializer implements wd2 {
    public static final Track$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Track$$serializer track$$serializer = new Track$$serializer();
        INSTANCE = track$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.watch.Track", track$$serializer, 5);
        kq4Var.j("id", false);
        kq4Var.j("url", false);
        kq4Var.j("lang", false);
        kq4Var.j("label", false);
        kq4Var.j(BuildConfig.FLAVOR, false);
        descriptor = kq4Var;
    }

    private Track$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        return new x73[]{mz5Var, mz5Var, jb0.a(mz5Var), jb0.a(mz5Var), l70.a};
    }

    @Override // defpackage.ne1
    public final Track deserialize(l61 l61Var) {
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        int i;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        Track track = null;
        if (c.decodeSequentially()) {
            str = c.m(aj5Var, 0);
            String m = c.m(aj5Var, 1);
            mz5 mz5Var = mz5.a;
            String str5 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5Var, null);
            str2 = (String) c.decodeNullableSerializableElement(aj5Var, 3, mz5Var, null);
            z = c.w(aj5Var, 4);
            str3 = str5;
            str4 = m;
            i = 31;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            int i2 = 0;
            str = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (z2) {
                int i3 = c.i(aj5Var);
                Track track2 = track;
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 == 4) {
                                        z3 = c.w(aj5Var, 4);
                                        i2 |= 16;
                                    } else {
                                        qi2.f(i3);
                                        return track2;
                                    }
                                } else {
                                    str6 = (String) c.decodeNullableSerializableElement(aj5Var, 3, mz5.a, str6);
                                    i2 |= 8;
                                }
                            } else {
                                str7 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5.a, str7);
                                i2 |= 4;
                            }
                        } else {
                            str8 = c.m(aj5Var, 1);
                            i2 |= 2;
                        }
                    } else {
                        str = c.m(aj5Var, 0);
                        i2 |= 1;
                    }
                    track = track2;
                } else {
                    track = track2;
                    z2 = false;
                }
            }
            str2 = str6;
            z = z3;
            str3 = str7;
            str4 = str8;
            i = i2;
        }
        String str9 = str;
        c.a(aj5Var);
        return new Track(i, str9, str4, str3, str2, z, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Track track) {
        wt1Var.getClass();
        track.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Track.write$Self$AniStation_core_model(track, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
