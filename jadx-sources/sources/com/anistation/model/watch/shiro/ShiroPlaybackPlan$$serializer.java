package com.anistation.model.watch.shiro;

import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.kq4;
import defpackage.l61;
import defpackage.mz5;
import defpackage.ne1;
import defpackage.qi2;
import defpackage.ql3;
import defpackage.rb3;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class ShiroPlaybackPlan$$serializer implements wd2 {
    public static final ShiroPlaybackPlan$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        ShiroPlaybackPlan$$serializer shiroPlaybackPlan$$serializer = new ShiroPlaybackPlan$$serializer();
        INSTANCE = shiroPlaybackPlan$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.watch.shiro.ShiroPlaybackPlan", shiroPlaybackPlan$$serializer, 7);
        kq4Var.j("protocol", false);
        kq4Var.j("issuedAtEpochSeconds", false);
        kq4Var.j("expiresAtEpochSeconds", false);
        kq4Var.j("playlist", false);
        kq4Var.j("segment", false);
        kq4Var.j("allowedHostSuffixes", false);
        kq4Var.j("fallbackUrl", false);
        descriptor = kq4Var;
    }

    private ShiroPlaybackPlan$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = ShiroPlaybackPlan.$childSerializers;
        mz5 mz5Var = mz5.a;
        ql3 ql3Var = ql3.a;
        return new x73[]{mz5Var, ql3Var, ql3Var, ShiroPlaylistTransform$$serializer.INSTANCE, ShiroSegmentTransform$$serializer.INSTANCE, rb3VarArr[5].getValue(), mz5Var};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0074. Please report as an issue. */
    @Override // defpackage.ne1
    public final ShiroPlaybackPlan deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        List list;
        String str;
        String str2;
        ShiroPlaylistTransform shiroPlaylistTransform;
        ShiroSegmentTransform shiroSegmentTransform;
        int i;
        long j;
        long j2;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = ShiroPlaybackPlan.$childSerializers;
        int i2 = 6;
        if (c.decodeSequentially()) {
            String m = c.m(aj5Var, 0);
            long B = c.B(aj5Var, 1);
            long B2 = c.B(aj5Var, 2);
            ShiroPlaylistTransform shiroPlaylistTransform2 = (ShiroPlaylistTransform) c.p(aj5Var, 3, ShiroPlaylistTransform$$serializer.INSTANCE, null);
            ShiroSegmentTransform shiroSegmentTransform2 = (ShiroSegmentTransform) c.p(aj5Var, 4, ShiroSegmentTransform$$serializer.INSTANCE, null);
            list = (List) c.p(aj5Var, 5, (ne1) rb3VarArr[5].getValue(), null);
            str = m;
            str2 = c.m(aj5Var, 6);
            shiroPlaylistTransform = shiroPlaylistTransform2;
            shiroSegmentTransform = shiroSegmentTransform2;
            i = 127;
            j = B;
            j2 = B2;
        } else {
            boolean z = true;
            int i3 = 0;
            List list2 = null;
            ShiroPlaylistTransform shiroPlaylistTransform3 = null;
            ShiroSegmentTransform shiroSegmentTransform3 = null;
            long j3 = 0;
            long j4 = 0;
            String str3 = null;
            String str4 = null;
            while (z) {
                int i4 = c.i(aj5Var);
                switch (i4) {
                    case -1:
                        z = false;
                    case 0:
                        str3 = c.m(aj5Var, 0);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        j3 = c.B(aj5Var, 1);
                        i3 |= 2;
                        i2 = 6;
                    case 2:
                        j4 = c.B(aj5Var, 2);
                        i3 |= 4;
                        i2 = 6;
                    case 3:
                        shiroPlaylistTransform3 = (ShiroPlaylistTransform) c.p(aj5Var, 3, ShiroPlaylistTransform$$serializer.INSTANCE, shiroPlaylistTransform3);
                        i3 |= 8;
                        i2 = 6;
                    case 4:
                        shiroSegmentTransform3 = (ShiroSegmentTransform) c.p(aj5Var, 4, ShiroSegmentTransform$$serializer.INSTANCE, shiroSegmentTransform3);
                        i3 |= 16;
                        i2 = 6;
                    case 5:
                        list2 = (List) c.p(aj5Var, 5, (ne1) rb3VarArr[5].getValue(), list2);
                        i3 |= 32;
                        i2 = 6;
                    case 6:
                        str4 = c.m(aj5Var, i2);
                        i3 |= 64;
                    default:
                        qi2.f(i4);
                        return null;
                }
            }
            list = list2;
            str = str3;
            str2 = str4;
            shiroPlaylistTransform = shiroPlaylistTransform3;
            shiroSegmentTransform = shiroSegmentTransform3;
            i = i3;
            j = j3;
            j2 = j4;
        }
        c.a(aj5Var);
        return new ShiroPlaybackPlan(i, str, j, j2, shiroPlaylistTransform, shiroSegmentTransform, list, str2, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, ShiroPlaybackPlan shiroPlaybackPlan) {
        wt1Var.getClass();
        shiroPlaybackPlan.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        ShiroPlaybackPlan.write$Self$AniStation_core_model(shiroPlaybackPlan, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
