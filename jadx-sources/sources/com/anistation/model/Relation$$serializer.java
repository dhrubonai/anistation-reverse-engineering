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
public final /* synthetic */ class Relation$$serializer implements wd2 {
    public static final Relation$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Relation$$serializer relation$$serializer = new Relation$$serializer();
        INSTANCE = relation$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.Relation", relation$$serializer, 11);
        kq4Var.j("id", true);
        kq4Var.j("anilistId", false);
        kq4Var.j("title", false);
        kq4Var.j("relationType", false);
        kq4Var.j("coverImage", false);
        kq4Var.j("color", false);
        kq4Var.j("format", false);
        kq4Var.j("status", false);
        kq4Var.j("seasonYear", true);
        kq4Var.j("genres", true);
        kq4Var.j("adult", false);
        descriptor = kq4Var;
    }

    private Relation$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = Relation.$childSerializers;
        mz5 mz5Var = mz5.a;
        i13 i13Var = i13.a;
        return new x73[]{jb0.a(mz5Var), i13Var, Title$$serializer.INSTANCE, jb0.a(mz5Var), CoverImage$$serializer.INSTANCE, jb0.a(mz5Var), rb3VarArr[6].getValue(), rb3VarArr[7].getValue(), jb0.a(i13Var), jb0.a((x73) rb3VarArr[9].getValue()), l70.a};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00ba. Please report as an issue. */
    @Override // defpackage.ne1
    public final Relation deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        List list;
        int i;
        Integer num;
        CoverImage coverImage;
        MediaStatus mediaStatus;
        String str;
        String str2;
        MediaFormat mediaFormat;
        Title title;
        String str3;
        boolean z;
        int i2;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = Relation.$childSerializers;
        int i3 = 8;
        int i4 = 9;
        int i5 = 7;
        String str4 = null;
        if (c.decodeSequentially()) {
            mz5 mz5Var = mz5.a;
            String str5 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5Var, null);
            int r = c.r(aj5Var, 1);
            Title title2 = (Title) c.p(aj5Var, 2, Title$$serializer.INSTANCE, null);
            String str6 = (String) c.decodeNullableSerializableElement(aj5Var, 3, mz5Var, null);
            CoverImage coverImage2 = (CoverImage) c.p(aj5Var, 4, CoverImage$$serializer.INSTANCE, null);
            String str7 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5Var, null);
            MediaFormat mediaFormat2 = (MediaFormat) c.p(aj5Var, 6, (ne1) rb3VarArr[6].getValue(), null);
            MediaStatus mediaStatus2 = (MediaStatus) c.p(aj5Var, 7, (ne1) rb3VarArr[7].getValue(), null);
            Integer num2 = (Integer) c.decodeNullableSerializableElement(aj5Var, 8, i13.a, null);
            list = (List) c.decodeNullableSerializableElement(aj5Var, 9, (ne1) rb3VarArr[9].getValue(), null);
            str3 = str7;
            title = title2;
            mediaFormat = mediaFormat2;
            str = str6;
            num = num2;
            coverImage = coverImage2;
            mediaStatus = mediaStatus2;
            z = c.w(aj5Var, 10);
            i = 2047;
            i2 = r;
            str2 = str5;
        } else {
            int i6 = 10;
            boolean z2 = true;
            int i7 = 0;
            boolean z3 = false;
            int i8 = 0;
            List list2 = null;
            Integer num3 = null;
            MediaStatus mediaStatus3 = null;
            String str8 = null;
            MediaFormat mediaFormat3 = null;
            Title title3 = null;
            CoverImage coverImage3 = null;
            String str9 = null;
            while (z2) {
                int i9 = c.i(aj5Var);
                switch (i9) {
                    case -1:
                        z2 = false;
                        i3 = 8;
                        i4 = 9;
                        i5 = 7;
                    case 0:
                        str9 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5.a, str9);
                        i7 |= 1;
                        i6 = 10;
                        i3 = 8;
                        i4 = 9;
                        i5 = 7;
                    case 1:
                        i8 = c.r(aj5Var, 1);
                        i7 |= 2;
                        i6 = 10;
                        i3 = 8;
                        i4 = 9;
                    case 2:
                        title3 = (Title) c.p(aj5Var, 2, Title$$serializer.INSTANCE, title3);
                        i7 |= 4;
                        i6 = 10;
                        i3 = 8;
                        i4 = 9;
                    case 3:
                        str8 = (String) c.decodeNullableSerializableElement(aj5Var, 3, mz5.a, str8);
                        i7 |= 8;
                        i6 = 10;
                        i3 = 8;
                        i4 = 9;
                    case 4:
                        i7 |= 16;
                        coverImage3 = (CoverImage) c.p(aj5Var, 4, CoverImage$$serializer.INSTANCE, coverImage3);
                        i6 = 10;
                        i3 = 8;
                        i4 = 9;
                    case 5:
                        str4 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5.a, str4);
                        i7 |= 32;
                        i6 = 10;
                        i3 = 8;
                    case 6:
                        mediaFormat3 = (MediaFormat) c.p(aj5Var, 6, (ne1) rb3VarArr[6].getValue(), mediaFormat3);
                        i7 |= 64;
                        i6 = 10;
                    case 7:
                        mediaStatus3 = (MediaStatus) c.p(aj5Var, i5, (ne1) rb3VarArr[i5].getValue(), mediaStatus3);
                        i7 |= 128;
                        i6 = 10;
                    case 8:
                        num3 = (Integer) c.decodeNullableSerializableElement(aj5Var, i3, i13.a, num3);
                        i7 |= 256;
                        i6 = 10;
                    case 9:
                        list2 = (List) c.decodeNullableSerializableElement(aj5Var, i4, (ne1) rb3VarArr[i4].getValue(), list2);
                        i7 |= 512;
                        i6 = 10;
                    case 10:
                        z3 = c.w(aj5Var, i6);
                        i7 |= 1024;
                    default:
                        qi2.f(i9);
                        return null;
                }
            }
            list = list2;
            i = i7;
            num = num3;
            coverImage = coverImage3;
            mediaStatus = mediaStatus3;
            str = str8;
            str2 = str9;
            mediaFormat = mediaFormat3;
            title = title3;
            str3 = str4;
            z = z3;
            i2 = i8;
        }
        c.a(aj5Var);
        return new Relation(i, str2, i2, title, str, coverImage, str3, mediaFormat, mediaStatus, num, list, z, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Relation relation) {
        wt1Var.getClass();
        relation.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Relation.write$Self$AniStation_core_model(relation, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
