package com.anistation.model.watch.shiro;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.i13;
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
public final /* synthetic */ class ShiroPlaylistTransform$$serializer implements wd2 {
    public static final ShiroPlaylistTransform$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        ShiroPlaylistTransform$$serializer shiroPlaylistTransform$$serializer = new ShiroPlaylistTransform$$serializer();
        INSTANCE = shiroPlaylistTransform$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.watch.shiro.ShiroPlaylistTransform", shiroPlaylistTransform$$serializer, 3);
        kq4Var.j(HandleInvocationsFromAdViewer.KEY_AD_TYPE, false);
        kq4Var.j("key", false);
        kq4Var.j("maxBytes", false);
        descriptor = kq4Var;
    }

    private ShiroPlaylistTransform$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        return new x73[]{mz5Var, mz5Var, i13.a};
    }

    @Override // defpackage.ne1
    public final ShiroPlaylistTransform deserialize(l61 l61Var) {
        String str;
        int i;
        String str2;
        int i2;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        if (c.decodeSequentially()) {
            String m = c.m(aj5Var, 0);
            String m2 = c.m(aj5Var, 1);
            str = m;
            i = c.r(aj5Var, 2);
            str2 = m2;
            i2 = 7;
        } else {
            String str3 = null;
            String str4 = null;
            boolean z = true;
            int i3 = 0;
            int i4 = 0;
            while (z) {
                int i5 = c.i(aj5Var);
                if (i5 != -1) {
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 == 2) {
                                i3 = c.r(aj5Var, 2);
                                i4 |= 4;
                            } else {
                                qi2.f(i5);
                                return null;
                            }
                        } else {
                            str4 = c.m(aj5Var, 1);
                            i4 |= 2;
                        }
                    } else {
                        str3 = c.m(aj5Var, 0);
                        i4 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            str = str3;
            i = i3;
            str2 = str4;
            i2 = i4;
        }
        c.a(aj5Var);
        return new ShiroPlaylistTransform(i2, str, str2, i, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, ShiroPlaylistTransform shiroPlaylistTransform) {
        wt1Var.getClass();
        shiroPlaylistTransform.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        ShiroPlaylistTransform.write$Self$AniStation_core_model(shiroPlaylistTransform, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
