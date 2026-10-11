package com.anistation.navigation;

import com.anistation.navigation.Route;
import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.kq4;
import defpackage.l61;
import defpackage.mz5;
import defpackage.qi2;
import defpackage.t80;
import defpackage.v0;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class Route$Details$$serializer implements wd2 {
    public static final int $stable = 0;
    public static final Route$Details$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Route$Details$$serializer route$Details$$serializer = new Route$Details$$serializer();
        INSTANCE = route$Details$$serializer;
        kq4 kq4Var = new kq4("com.anistation.navigation.Route.Details", route$Details$$serializer, 1);
        kq4Var.j("animeId", false);
        descriptor = kq4Var;
    }

    private Route$Details$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        return new x73[]{mz5.a};
    }

    @Override // defpackage.ne1
    public final Route.Details deserialize(l61 l61Var) {
        String str;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        int i = 1;
        if (c.decodeSequentially()) {
            str = c.m(aj5Var, 0);
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            while (z) {
                int i3 = c.i(aj5Var);
                if (i3 != -1) {
                    if (i3 == 0) {
                        str = c.m(aj5Var, 0);
                        i2 = 1;
                    } else {
                        qi2.f(i3);
                        return null;
                    }
                } else {
                    z = false;
                }
            }
            i = i2;
        }
        c.a(aj5Var);
        return new Route.Details(i, str, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Route.Details details) {
        wt1Var.getClass();
        details.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        ((v0) c).w(aj5Var, 0, details.animeId);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
