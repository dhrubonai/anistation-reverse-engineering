package com.anistation.model;

import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
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
public final /* synthetic */ class CoverImage$$serializer implements wd2 {
    public static final CoverImage$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        CoverImage$$serializer coverImage$$serializer = new CoverImage$$serializer();
        INSTANCE = coverImage$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.CoverImage", coverImage$$serializer, 2);
        kq4Var.j("extraLarge", false);
        kq4Var.j("large", false);
        descriptor = kq4Var;
    }

    private CoverImage$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        return new x73[]{jb0.a(mz5Var), jb0.a(mz5Var)};
    }

    @Override // defpackage.ne1
    public final CoverImage deserialize(l61 l61Var) {
        String str;
        int i;
        String str2;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        kj5 kj5Var = null;
        if (c.decodeSequentially()) {
            mz5 mz5Var = mz5.a;
            str2 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5Var, null);
            str = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5Var, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            String str3 = null;
            while (z) {
                int i3 = c.i(aj5Var);
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            str = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5.a, str);
                            i2 |= 2;
                        } else {
                            qi2.f(i3);
                            return null;
                        }
                    } else {
                        str3 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5.a, str3);
                        i2 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            i = i2;
            str2 = str3;
        }
        c.a(aj5Var);
        return new CoverImage(i, str2, str, kj5Var);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, CoverImage coverImage) {
        wt1Var.getClass();
        coverImage.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        CoverImage.write$Self$AniStation_core_model(coverImage, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
