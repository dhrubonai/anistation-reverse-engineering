package com.anistation.navigation;

import com.anistation.navigation.Route;
import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.i13;
import defpackage.jb0;
import defpackage.kj5;
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
public final /* synthetic */ class Route$DownloadList$$serializer implements wd2 {
    public static final int $stable = 0;
    public static final Route$DownloadList$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Route$DownloadList$$serializer route$DownloadList$$serializer = new Route$DownloadList$$serializer();
        INSTANCE = route$DownloadList$$serializer;
        kq4 kq4Var = new kq4("com.anistation.navigation.Route.DownloadList", route$DownloadList$$serializer, 2);
        kq4Var.j("animeId", false);
        kq4Var.j("anilistId", true);
        descriptor = kq4Var;
    }

    private Route$DownloadList$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        return new x73[]{mz5.a, jb0.a(i13.a)};
    }

    @Override // defpackage.ne1
    public final Route.DownloadList deserialize(l61 l61Var) {
        String str;
        Integer num;
        int i;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        if (c.decodeSequentially()) {
            str = c.m(aj5Var, 0);
            num = (Integer) c.decodeNullableSerializableElement(aj5Var, 1, i13.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            Integer num2 = null;
            while (z) {
                int i3 = c.i(aj5Var);
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            num2 = (Integer) c.decodeNullableSerializableElement(aj5Var, 1, i13.a, num2);
                            i2 |= 2;
                        } else {
                            qi2.f(i3);
                            return null;
                        }
                    } else {
                        str = c.m(aj5Var, 0);
                        i2 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            num = num2;
            i = i2;
        }
        c.a(aj5Var);
        return new Route.DownloadList(i, str, num, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Route.DownloadList downloadList) {
        wt1Var.getClass();
        downloadList.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Route.DownloadList.write$Self$navigation(downloadList, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
