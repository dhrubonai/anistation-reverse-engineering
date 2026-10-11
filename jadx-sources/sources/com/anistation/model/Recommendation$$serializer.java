package com.anistation.model;

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
import defpackage.ne1;
import defpackage.qi2;
import defpackage.rb3;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class Recommendation$$serializer implements wd2 {
    public static final Recommendation$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Recommendation$$serializer recommendation$$serializer = new Recommendation$$serializer();
        INSTANCE = recommendation$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.Recommendation", recommendation$$serializer, 10);
        kq4Var.j("id", true);
        kq4Var.j("anilistId", false);
        kq4Var.j("title", false);
        kq4Var.j("coverImage", false);
        kq4Var.j("color", false);
        kq4Var.j("format", false);
        kq4Var.j("status", false);
        kq4Var.j("seasonYear", true);
        kq4Var.j("genres", true);
        kq4Var.j("adult", false);
        descriptor = kq4Var;
    }

    private Recommendation$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = Recommendation.$childSerializers;
        mz5 mz5Var = mz5.a;
        i13 i13Var = i13.a;
        return new x73[]{jb0.a(mz5Var), i13Var, Title$$serializer.INSTANCE, CoverImage$$serializer.INSTANCE, jb0.a(mz5Var), rb3VarArr[5].getValue(), rb3VarArr[6].getValue(), jb0.a(i13Var), jb0.a((x73) rb3VarArr[8].getValue()), l70.a};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00ad. Please report as an issue. */
    @Override // defpackage.ne1
    public final Recommendation deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        List list;
        Title title;
        int i;
        String str;
        MediaStatus mediaStatus;
        MediaFormat mediaFormat;
        CoverImage coverImage;
        Integer num;
        String str2;
        boolean z;
        int i2;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = Recommendation.$childSerializers;
        int i3 = 9;
        int i4 = 7;
        int i5 = 4;
        int i6 = 6;
        Integer num2 = null;
        if (c.decodeSequentially()) {
            mz5 mz5Var = mz5.a;
            String str3 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5Var, null);
            int r = c.r(aj5Var, 1);
            Title title2 = (Title) c.p(aj5Var, 2, Title$$serializer.INSTANCE, null);
            CoverImage coverImage2 = (CoverImage) c.p(aj5Var, 3, CoverImage$$serializer.INSTANCE, null);
            String str4 = (String) c.decodeNullableSerializableElement(aj5Var, 4, mz5Var, null);
            MediaFormat mediaFormat2 = (MediaFormat) c.p(aj5Var, 5, (ne1) rb3VarArr[5].getValue(), null);
            MediaStatus mediaStatus2 = (MediaStatus) c.p(aj5Var, 6, (ne1) rb3VarArr[6].getValue(), null);
            Integer num3 = (Integer) c.decodeNullableSerializableElement(aj5Var, 7, i13.a, null);
            list = (List) c.decodeNullableSerializableElement(aj5Var, 8, (ne1) rb3VarArr[8].getValue(), null);
            str2 = str4;
            z = c.w(aj5Var, 9);
            num = num3;
            coverImage = coverImage2;
            mediaFormat = mediaFormat2;
            title = title2;
            mediaStatus = mediaStatus2;
            i = 1023;
            i2 = r;
            str = str3;
        } else {
            boolean z2 = true;
            int i7 = 0;
            boolean z3 = false;
            int i8 = 0;
            List list2 = null;
            MediaStatus mediaStatus3 = null;
            MediaFormat mediaFormat3 = null;
            CoverImage coverImage3 = null;
            String str5 = null;
            Title title3 = null;
            String str6 = null;
            while (z2) {
                int i9 = c.i(aj5Var);
                switch (i9) {
                    case -1:
                        z2 = false;
                        i4 = 7;
                        i5 = 4;
                        i6 = 6;
                    case 0:
                        str6 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5.a, str6);
                        i7 |= 1;
                        i3 = 9;
                        i4 = 7;
                        i5 = 4;
                        i6 = 6;
                    case 1:
                        i8 = c.r(aj5Var, 1);
                        i7 |= 2;
                        i3 = 9;
                        i4 = 7;
                        i5 = 4;
                    case 2:
                        i7 |= 4;
                        title3 = (Title) c.p(aj5Var, 2, Title$$serializer.INSTANCE, title3);
                        i3 = 9;
                        i4 = 7;
                        i5 = 4;
                    case 3:
                        coverImage3 = (CoverImage) c.p(aj5Var, 3, CoverImage$$serializer.INSTANCE, coverImage3);
                        i7 |= 8;
                        i3 = 9;
                        i4 = 7;
                    case 4:
                        str5 = (String) c.decodeNullableSerializableElement(aj5Var, i5, mz5.a, str5);
                        i7 |= 16;
                        i3 = 9;
                    case 5:
                        mediaFormat3 = (MediaFormat) c.p(aj5Var, 5, (ne1) rb3VarArr[5].getValue(), mediaFormat3);
                        i7 |= 32;
                        i3 = 9;
                    case 6:
                        mediaStatus3 = (MediaStatus) c.p(aj5Var, i6, (ne1) rb3VarArr[i6].getValue(), mediaStatus3);
                        i7 |= 64;
                        i3 = 9;
                    case 7:
                        num2 = (Integer) c.decodeNullableSerializableElement(aj5Var, i4, i13.a, num2);
                        i7 |= 128;
                        i3 = 9;
                    case 8:
                        list2 = (List) c.decodeNullableSerializableElement(aj5Var, 8, (ne1) rb3VarArr[8].getValue(), list2);
                        i7 |= 256;
                        i3 = 9;
                    case 9:
                        z3 = c.w(aj5Var, i3);
                        i7 |= 512;
                    default:
                        qi2.f(i9);
                        return null;
                }
            }
            list = list2;
            title = title3;
            i = i7;
            str = str6;
            mediaStatus = mediaStatus3;
            mediaFormat = mediaFormat3;
            coverImage = coverImage3;
            num = num2;
            str2 = str5;
            z = z3;
            i2 = i8;
        }
        c.a(aj5Var);
        return new Recommendation(i, str, i2, title, coverImage, str2, mediaFormat, mediaStatus, num, list, z, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Recommendation recommendation) {
        wt1Var.getClass();
        recommendation.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Recommendation.write$Self$AniStation_core_model(recommendation, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
