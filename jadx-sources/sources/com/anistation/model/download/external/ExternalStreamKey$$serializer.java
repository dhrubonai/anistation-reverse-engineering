package com.anistation.model.download.external;

import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.i13;
import defpackage.kq4;
import defpackage.l61;
import defpackage.qi2;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class ExternalStreamKey$$serializer implements wd2 {
    public static final ExternalStreamKey$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        ExternalStreamKey$$serializer externalStreamKey$$serializer = new ExternalStreamKey$$serializer();
        INSTANCE = externalStreamKey$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.download.external.ExternalStreamKey", externalStreamKey$$serializer, 3);
        kq4Var.j("periodIndex", false);
        kq4Var.j("groupIndex", false);
        kq4Var.j("streamIndex", false);
        descriptor = kq4Var;
    }

    private ExternalStreamKey$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        i13 i13Var = i13.a;
        return new x73[]{i13Var, i13Var, i13Var};
    }

    @Override // defpackage.ne1
    public final ExternalStreamKey deserialize(l61 l61Var) {
        int i;
        int i2;
        int i3;
        int i4;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        if (c.decodeSequentially()) {
            i = c.r(aj5Var, 0);
            int r = c.r(aj5Var, 1);
            i2 = c.r(aj5Var, 2);
            i3 = r;
            i4 = 7;
        } else {
            boolean z = true;
            i = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (z) {
                int i8 = c.i(aj5Var);
                if (i8 != -1) {
                    if (i8 != 0) {
                        if (i8 != 1) {
                            if (i8 == 2) {
                                i5 = c.r(aj5Var, 2);
                                i7 |= 4;
                            } else {
                                qi2.f(i8);
                                return null;
                            }
                        } else {
                            i6 = c.r(aj5Var, 1);
                            i7 |= 2;
                        }
                    } else {
                        i = c.r(aj5Var, 0);
                        i7 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            i2 = i5;
            i3 = i6;
            i4 = i7;
        }
        int i9 = i;
        c.a(aj5Var);
        return new ExternalStreamKey(i4, i9, i3, i2, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, ExternalStreamKey externalStreamKey) {
        wt1Var.getClass();
        externalStreamKey.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        ExternalStreamKey.write$Self$AniStation_core_model(externalStreamKey, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
