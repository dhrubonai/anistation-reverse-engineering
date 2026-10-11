package com.anistation.model.watch;

import defpackage.aj1;
import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
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
public final /* synthetic */ class SkipRange$$serializer implements wd2 {
    public static final SkipRange$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        SkipRange$$serializer skipRange$$serializer = new SkipRange$$serializer();
        INSTANCE = skipRange$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.watch.SkipRange", skipRange$$serializer, 2);
        kq4Var.j("start", false);
        kq4Var.j("end", false);
        descriptor = kq4Var;
    }

    private SkipRange$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        aj1 aj1Var = aj1.a;
        return new x73[]{aj1Var, aj1Var};
    }

    @Override // defpackage.ne1
    public final SkipRange deserialize(l61 l61Var) {
        int i;
        double d;
        double d2;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        if (c.decodeSequentially()) {
            double y = c.y(aj5Var, 0);
            d = c.y(aj5Var, 1);
            d2 = y;
            i = 3;
        } else {
            double d3 = 0.0d;
            boolean z = true;
            int i2 = 0;
            double d4 = 0.0d;
            while (z) {
                int i3 = c.i(aj5Var);
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            d3 = c.y(aj5Var, 1);
                            i2 |= 2;
                        } else {
                            qi2.f(i3);
                            return null;
                        }
                    } else {
                        d4 = c.y(aj5Var, 0);
                        i2 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            i = i2;
            d = d3;
            d2 = d4;
        }
        c.a(aj5Var);
        return new SkipRange(i, d2, d, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, SkipRange skipRange) {
        wt1Var.getClass();
        skipRange.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        SkipRange.write$Self$AniStation_core_model(skipRange, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
