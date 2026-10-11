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
import defpackage.mz5;
import defpackage.ne1;
import defpackage.qi2;
import defpackage.rb3;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class AnimeWatchOrderItem$$serializer implements wd2 {
    public static final AnimeWatchOrderItem$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        AnimeWatchOrderItem$$serializer animeWatchOrderItem$$serializer = new AnimeWatchOrderItem$$serializer();
        INSTANCE = animeWatchOrderItem$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.AnimeWatchOrderItem", animeWatchOrderItem$$serializer, 9);
        kq4Var.j("id", true);
        kq4Var.j("anilistId", false);
        kq4Var.j("malId", false);
        kq4Var.j("title", false);
        kq4Var.j("coverImage", false);
        kq4Var.j("startDate", false);
        kq4Var.j("format", false);
        kq4Var.j("totalEpisodes", false);
        kq4Var.j("duration", false);
        descriptor = kq4Var;
    }

    private AnimeWatchOrderItem$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = AnimeWatchOrderItem.$childSerializers;
        mz5 mz5Var = mz5.a;
        i13 i13Var = i13.a;
        return new x73[]{jb0.a(mz5Var), i13Var, i13Var, Title$$serializer.INSTANCE, CoverImage$$serializer.INSTANCE, jb0.a(mz5Var), rb3VarArr[6].getValue(), jb0.a(i13Var), jb0.a(i13Var)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0091. Please report as an issue. */
    @Override // defpackage.ne1
    public final AnimeWatchOrderItem deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        MediaFormat mediaFormat;
        String str;
        CoverImage coverImage;
        int i;
        Title title;
        Integer num;
        String str2;
        Integer num2;
        int i2;
        int i3;
        char c;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c2 = l61Var.c(aj5Var);
        rb3VarArr = AnimeWatchOrderItem.$childSerializers;
        int i4 = 7;
        int i5 = 5;
        char c3 = 3;
        Integer num3 = null;
        if (c2.decodeSequentially()) {
            mz5 mz5Var = mz5.a;
            String str3 = (String) c2.decodeNullableSerializableElement(aj5Var, 0, mz5Var, null);
            int r = c2.r(aj5Var, 1);
            int r2 = c2.r(aj5Var, 2);
            Title title2 = (Title) c2.p(aj5Var, 3, Title$$serializer.INSTANCE, null);
            CoverImage coverImage2 = (CoverImage) c2.p(aj5Var, 4, CoverImage$$serializer.INSTANCE, null);
            String str4 = (String) c2.decodeNullableSerializableElement(aj5Var, 5, mz5Var, null);
            MediaFormat mediaFormat2 = (MediaFormat) c2.p(aj5Var, 6, (ne1) rb3VarArr[6].getValue(), null);
            i13 i13Var = i13.a;
            mediaFormat = mediaFormat2;
            str2 = str4;
            num2 = (Integer) c2.decodeNullableSerializableElement(aj5Var, 7, i13Var, null);
            num = (Integer) c2.decodeNullableSerializableElement(aj5Var, 8, i13Var, null);
            title = title2;
            i = 511;
            coverImage = coverImage2;
            i2 = r2;
            i3 = r;
            str = str3;
        } else {
            boolean z = true;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            MediaFormat mediaFormat3 = null;
            CoverImage coverImage3 = null;
            Title title3 = null;
            String str5 = null;
            Integer num4 = null;
            String str6 = null;
            while (z) {
                int i9 = c2.i(aj5Var);
                switch (i9) {
                    case -1:
                        z = false;
                        i5 = 5;
                        c3 = 3;
                    case 0:
                        i6 |= 1;
                        str6 = (String) c2.decodeNullableSerializableElement(aj5Var, 0, mz5.a, str6);
                        i4 = 7;
                        i5 = 5;
                        c3 = 3;
                    case 1:
                        i8 = c2.r(aj5Var, 1);
                        i6 |= 2;
                        i4 = 7;
                        c3 = 3;
                    case 2:
                        c = c3;
                        i7 = c2.r(aj5Var, 2);
                        i6 |= 4;
                        c3 = c;
                        i4 = 7;
                    case 3:
                        c = 3;
                        title3 = (Title) c2.p(aj5Var, 3, Title$$serializer.INSTANCE, title3);
                        i6 |= 8;
                        c3 = c;
                        i4 = 7;
                    case 4:
                        coverImage3 = (CoverImage) c2.p(aj5Var, 4, CoverImage$$serializer.INSTANCE, coverImage3);
                        i6 |= 16;
                        c3 = 3;
                    case 5:
                        str5 = (String) c2.decodeNullableSerializableElement(aj5Var, i5, mz5.a, str5);
                        i6 |= 32;
                        c3 = 3;
                    case 6:
                        mediaFormat3 = (MediaFormat) c2.p(aj5Var, 6, (ne1) rb3VarArr[6].getValue(), mediaFormat3);
                        i6 |= 64;
                        c3 = 3;
                    case 7:
                        num4 = (Integer) c2.decodeNullableSerializableElement(aj5Var, i4, i13.a, num4);
                        i6 |= 128;
                        c3 = 3;
                    case 8:
                        num3 = (Integer) c2.decodeNullableSerializableElement(aj5Var, 8, i13.a, num3);
                        i6 |= 256;
                        c3 = 3;
                    default:
                        qi2.f(i9);
                        return null;
                }
            }
            mediaFormat = mediaFormat3;
            str = str6;
            coverImage = coverImage3;
            i = i6;
            title = title3;
            num = num3;
            str2 = str5;
            num2 = num4;
            i2 = i7;
            i3 = i8;
        }
        c2.a(aj5Var);
        return new AnimeWatchOrderItem(i, str, i3, i2, title, coverImage, str2, mediaFormat, num2, num, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, AnimeWatchOrderItem animeWatchOrderItem) {
        wt1Var.getClass();
        animeWatchOrderItem.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        AnimeWatchOrderItem.write$Self$AniStation_core_model(animeWatchOrderItem, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
