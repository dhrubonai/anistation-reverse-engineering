package com.anistation.model;

import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.jb0;
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
public final /* synthetic */ class Title$$serializer implements wd2 {
    public static final Title$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Title$$serializer title$$serializer = new Title$$serializer();
        INSTANCE = title$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.Title", title$$serializer, 4);
        kq4Var.j("romaji", false);
        kq4Var.j("english", false);
        kq4Var.j("native", false);
        kq4Var.j("userPreferred", false);
        descriptor = kq4Var;
    }

    private Title$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        return new x73[]{jb0.a(mz5Var), jb0.a(mz5Var), jb0.a(mz5Var), jb0.a(mz5Var)};
    }

    @Override // defpackage.ne1
    public final Title deserialize(l61 l61Var) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        if (c.decodeSequentially()) {
            mz5 mz5Var = mz5.a;
            String str5 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5Var, null);
            String str6 = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5Var, null);
            String str7 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5Var, null);
            str = (String) c.decodeNullableSerializableElement(aj5Var, 3, mz5Var, null);
            i = 15;
            str2 = str7;
            str3 = str6;
            str4 = str5;
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            while (z) {
                int i3 = c.i(aj5Var);
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    str = (String) c.decodeNullableSerializableElement(aj5Var, 3, mz5.a, str);
                                    i2 |= 8;
                                } else {
                                    qi2.f(i3);
                                    return null;
                                }
                            } else {
                                str8 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5.a, str8);
                                i2 |= 4;
                            }
                        } else {
                            str9 = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5.a, str9);
                            i2 |= 2;
                        }
                    } else {
                        str10 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5.a, str10);
                        i2 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            i = i2;
            str2 = str8;
            str3 = str9;
            str4 = str10;
        }
        String str11 = str;
        c.a(aj5Var);
        return new Title(i, str4, str3, str2, str11, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Title title) {
        wt1Var.getClass();
        title.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Title.write$Self$AniStation_core_model(title, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
