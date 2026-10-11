package com.anistation.model.watch;

import com.unity3d.ads.BuildConfig;
import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.i13;
import defpackage.jb0;
import defpackage.kj5;
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
public final /* synthetic */ class Provider$$serializer implements wd2 {
    public static final Provider$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Provider$$serializer provider$$serializer = new Provider$$serializer();
        INSTANCE = provider$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.watch.Provider", provider$$serializer, 6);
        kq4Var.j("id", false);
        kq4Var.j(BuildConfig.FLAVOR, false);
        kq4Var.j("tip", false);
        kq4Var.j("multiAudio", true);
        kq4Var.j("castCompatible", true);
        kq4Var.j("castPriority", true);
        descriptor = kq4Var;
    }

    private Provider$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        x73 a = jb0.a(mz5Var);
        x73 a2 = jb0.a(i13.a);
        l70 l70Var = l70.a;
        return new x73[]{mz5Var, l70Var, a, l70Var, l70Var, a2};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0059. Please report as an issue. */
    @Override // defpackage.ne1
    public final Provider deserialize(l61 l61Var) {
        String str;
        Integer num;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        int i;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        Provider provider = null;
        if (c.decodeSequentially()) {
            str = c.m(aj5Var, 0);
            boolean w = c.w(aj5Var, 1);
            String str3 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5.a, null);
            boolean w2 = c.w(aj5Var, 3);
            boolean w3 = c.w(aj5Var, 4);
            num = (Integer) c.decodeNullableSerializableElement(aj5Var, 5, i13.a, null);
            z = w2;
            z2 = w3;
            str2 = str3;
            z3 = w;
            i = 63;
        } else {
            boolean z4 = true;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i2 = 0;
            str = null;
            Integer num2 = null;
            String str4 = null;
            while (z4) {
                int i3 = c.i(aj5Var);
                switch (i3) {
                    case -1:
                        z4 = false;
                    case 0:
                        str = c.m(aj5Var, 0);
                        i2 |= 1;
                        provider = null;
                    case 1:
                        z7 = c.w(aj5Var, 1);
                        i2 |= 2;
                        provider = null;
                    case 2:
                        str4 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5.a, str4);
                        i2 |= 4;
                        provider = null;
                    case 3:
                        z5 = c.w(aj5Var, 3);
                        i2 |= 8;
                        provider = null;
                    case 4:
                        z6 = c.w(aj5Var, 4);
                        i2 |= 16;
                        provider = null;
                    case 5:
                        num2 = (Integer) c.decodeNullableSerializableElement(aj5Var, 5, i13.a, num2);
                        i2 |= 32;
                        provider = null;
                    default:
                        qi2.f(i3);
                        return provider;
                }
            }
            num = num2;
            z = z5;
            z2 = z6;
            str2 = str4;
            z3 = z7;
            i = i2;
        }
        String str5 = str;
        c.a(aj5Var);
        return new Provider(i, str5, z3, str2, z, z2, num, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Provider provider) {
        wt1Var.getClass();
        provider.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Provider.write$Self$AniStation_core_model(provider, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
