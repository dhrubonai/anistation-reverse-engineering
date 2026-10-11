package com.anistation.model;

import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.i13;
import defpackage.jb0;
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
public final /* synthetic */ class Episode$$serializer implements wd2 {
    public static final Episode$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Episode$$serializer episode$$serializer = new Episode$$serializer();
        INSTANCE = episode$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.Episode", episode$$serializer, 9);
        kq4Var.j("id", false);
        kq4Var.j("number", false);
        kq4Var.j("title", false);
        kq4Var.j("image", false);
        kq4Var.j("filler", false);
        kq4Var.j("description", false);
        kq4Var.j("length", false);
        kq4Var.j("airedAt", false);
        kq4Var.j("syncedAt", false);
        descriptor = kq4Var;
    }

    private Episode$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        i13 i13Var = i13.a;
        return new x73[]{mz5Var, i13Var, jb0.a(mz5Var), jb0.a(mz5Var), jb0.a(l70.a), jb0.a(mz5Var), jb0.a(i13Var), jb0.a(mz5Var), mz5Var};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0080. Please report as an issue. */
    @Override // defpackage.ne1
    public final Episode deserialize(l61 l61Var) {
        String str;
        int i;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        int i2;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        int i3 = 7;
        int i4 = 8;
        String str7 = null;
        if (c.decodeSequentially()) {
            str = c.m(aj5Var, 0);
            int r = c.r(aj5Var, 1);
            mz5 mz5Var = mz5.a;
            String str8 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5Var, null);
            String str9 = (String) c.decodeNullableSerializableElement(aj5Var, 3, mz5Var, null);
            Boolean bool2 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 4, l70.a, null);
            String str10 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5Var, null);
            Integer num2 = (Integer) c.decodeNullableSerializableElement(aj5Var, 6, i13.a, null);
            str4 = (String) c.decodeNullableSerializableElement(aj5Var, 7, mz5Var, null);
            num = num2;
            str5 = str10;
            str3 = str9;
            str6 = c.m(aj5Var, 8);
            bool = bool2;
            str2 = str8;
            i2 = r;
            i = 511;
        } else {
            boolean z = true;
            int i5 = 0;
            int i6 = 0;
            str = null;
            String str11 = null;
            Boolean bool3 = null;
            String str12 = null;
            Integer num3 = null;
            String str13 = null;
            String str14 = null;
            while (z) {
                int i7 = c.i(aj5Var);
                switch (i7) {
                    case -1:
                        z = false;
                        i4 = 8;
                    case 0:
                        i5 |= 1;
                        str = c.m(aj5Var, 0);
                        i3 = 7;
                        i4 = 8;
                    case 1:
                        i6 = c.r(aj5Var, 1);
                        i5 |= 2;
                        i3 = 7;
                        i4 = 8;
                    case 2:
                        str11 = (String) c.decodeNullableSerializableElement(aj5Var, 2, mz5.a, str11);
                        i5 |= 4;
                        i3 = 7;
                        i4 = 8;
                    case 3:
                        str7 = (String) c.decodeNullableSerializableElement(aj5Var, 3, mz5.a, str7);
                        i5 |= 8;
                        i4 = 8;
                    case 4:
                        bool3 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 4, l70.a, bool3);
                        i5 |= 16;
                        i4 = 8;
                    case 5:
                        str13 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5.a, str13);
                        i5 |= 32;
                        i4 = 8;
                    case 6:
                        num3 = (Integer) c.decodeNullableSerializableElement(aj5Var, 6, i13.a, num3);
                        i5 |= 64;
                        i4 = 8;
                    case 7:
                        str12 = (String) c.decodeNullableSerializableElement(aj5Var, i3, mz5.a, str12);
                        i5 |= 128;
                        i4 = 8;
                    case 8:
                        str14 = c.m(aj5Var, i4);
                        i5 |= 256;
                    default:
                        qi2.f(i7);
                        return null;
                }
            }
            i = i5;
            str2 = str11;
            bool = bool3;
            str3 = str7;
            str4 = str12;
            num = num3;
            str5 = str13;
            str6 = str14;
            i2 = i6;
        }
        String str15 = str;
        c.a(aj5Var);
        return new Episode(i, str15, i2, str2, str3, bool, str5, num, str4, str6, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Episode episode) {
        wt1Var.getClass();
        episode.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Episode.write$Self$AniStation_core_model(episode, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
