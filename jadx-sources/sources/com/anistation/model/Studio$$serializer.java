package com.anistation.model;

import com.unity3d.ads.metadata.MediationMetaData;
import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.i13;
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
public final /* synthetic */ class Studio$$serializer implements wd2 {
    public static final Studio$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Studio$$serializer studio$$serializer = new Studio$$serializer();
        INSTANCE = studio$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.Studio", studio$$serializer, 3);
        kq4Var.j("id", false);
        kq4Var.j(MediationMetaData.KEY_NAME, false);
        kq4Var.j("main", false);
        descriptor = kq4Var;
    }

    private Studio$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        return new x73[]{i13.a, mz5.a, l70.a};
    }

    @Override // defpackage.ne1
    public final Studio deserialize(l61 l61Var) {
        int i;
        boolean z;
        String str;
        int i2;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        if (c.decodeSequentially()) {
            int r = c.r(aj5Var, 0);
            String m = c.m(aj5Var, 1);
            i = r;
            z = c.w(aj5Var, 2);
            str = m;
            i2 = 7;
        } else {
            String str2 = null;
            boolean z2 = true;
            int i3 = 0;
            boolean z3 = false;
            int i4 = 0;
            while (z2) {
                int i5 = c.i(aj5Var);
                if (i5 != -1) {
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 == 2) {
                                z3 = c.w(aj5Var, 2);
                                i4 |= 4;
                            } else {
                                qi2.f(i5);
                                return null;
                            }
                        } else {
                            str2 = c.m(aj5Var, 1);
                            i4 |= 2;
                        }
                    } else {
                        i3 = c.r(aj5Var, 0);
                        i4 |= 1;
                    }
                } else {
                    z2 = false;
                }
            }
            i = i3;
            z = z3;
            str = str2;
            i2 = i4;
        }
        c.a(aj5Var);
        return new Studio(i2, i, str, z, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Studio studio) {
        wt1Var.getClass();
        studio.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Studio.write$Self$AniStation_core_model(studio, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
