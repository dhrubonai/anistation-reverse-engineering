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
import defpackage.ql3;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class ShiroSegmentTransform$$serializer implements wd2 {
    public static final ShiroSegmentTransform$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        ShiroSegmentTransform$$serializer shiroSegmentTransform$$serializer = new ShiroSegmentTransform$$serializer();
        INSTANCE = shiroSegmentTransform$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.watch.shiro.ShiroSegmentTransform", shiroSegmentTransform$$serializer, 6);
        kq4Var.j(HandleInvocationsFromAdViewer.KEY_AD_TYPE, false);
        kq4Var.j("key", false);
        kq4Var.j("pngHeaderBytes", false);
        kq4Var.j("webpHeaderBytes", false);
        kq4Var.j("clearSyncByte", false);
        kq4Var.j("maxBytes", false);
        descriptor = kq4Var;
    }

    private ShiroSegmentTransform$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        i13 i13Var = i13.a;
        return new x73[]{mz5Var, mz5Var, i13Var, i13Var, i13Var, ql3.a};
    }

    @Override // defpackage.ne1
    public final ShiroSegmentTransform deserialize(l61 l61Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        String str2;
        long j;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        if (c.decodeSequentially()) {
            String m = c.m(aj5Var, 0);
            String m2 = c.m(aj5Var, 1);
            int r = c.r(aj5Var, 2);
            str = m;
            i = 63;
            i2 = c.r(aj5Var, 3);
            i3 = c.r(aj5Var, 4);
            i4 = r;
            str2 = m2;
            j = c.B(aj5Var, 5);
        } else {
            String str3 = null;
            boolean z = true;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            long j2 = 0;
            String str4 = null;
            int i8 = 0;
            while (z) {
                int i9 = c.i(aj5Var);
                switch (i9) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str4 = c.m(aj5Var, 0);
                        i8 |= 1;
                        break;
                    case 1:
                        str3 = c.m(aj5Var, 1);
                        i8 |= 2;
                        break;
                    case 2:
                        i7 = c.r(aj5Var, 2);
                        i8 |= 4;
                        break;
                    case 3:
                        i5 = c.r(aj5Var, 3);
                        i8 |= 8;
                        break;
                    case 4:
                        i6 = c.r(aj5Var, 4);
                        i8 |= 16;
                        break;
                    case 5:
                        j2 = c.B(aj5Var, 5);
                        i8 |= 32;
                        break;
                    default:
                        qi2.f(i9);
                        return null;
                }
            }
            str = str4;
            i = i8;
            i2 = i5;
            i3 = i6;
            i4 = i7;
            str2 = str3;
            j = j2;
        }
        c.a(aj5Var);
        return new ShiroSegmentTransform(i, str, str2, i4, i2, i3, j, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, ShiroSegmentTransform shiroSegmentTransform) {
        wt1Var.getClass();
        shiroSegmentTransform.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        ShiroSegmentTransform.write$Self$AniStation_core_model(shiroSegmentTransform, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
