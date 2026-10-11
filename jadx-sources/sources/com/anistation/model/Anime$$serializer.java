package com.anistation.model;

import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
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
public final /* synthetic */ class Anime$$serializer implements wd2 {
    public static final Anime$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Anime$$serializer anime$$serializer = new Anime$$serializer();
        INSTANCE = anime$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.Anime", anime$$serializer, 17);
        kq4Var.j("id", true);
        kq4Var.j("anilistId", false);
        kq4Var.j("malId", false);
        kq4Var.j("title", false);
        kq4Var.j("coverImage", false);
        kq4Var.j("color", false);
        kq4Var.j("format", false);
        kq4Var.j("status", false);
        kq4Var.j("totalEpisodes", false);
        kq4Var.j("duration", false);
        kq4Var.j("averageScore", false);
        kq4Var.j("popularity", false);
        kq4Var.j("trending", false);
        kq4Var.j("season", false);
        kq4Var.j("seasonYear", false);
        kq4Var.j("genres", false);
        kq4Var.j("adult", false);
        descriptor = kq4Var;
    }

    private Anime$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = Anime.$childSerializers;
        mz5 mz5Var = mz5.a;
        i13 i13Var = i13.a;
        return new x73[]{jb0.a(mz5Var), i13Var, jb0.a(i13Var), Title$$serializer.INSTANCE, CoverImage$$serializer.INSTANCE, jb0.a(mz5Var), rb3VarArr[6].getValue(), rb3VarArr[7].getValue(), jb0.a(i13Var), jb0.a(i13Var), jb0.a(i13Var), jb0.a(i13Var), jb0.a(i13Var), jb0.a(mz5Var), jb0.a(i13Var), jb0.a((x73) rb3VarArr[15].getValue()), l70.a};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0112. Please report as an issue. */
    @Override // defpackage.ne1
    public final Anime deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        Integer num;
        Integer num2;
        List list;
        String str;
        CoverImage coverImage;
        Integer num3;
        MediaStatus mediaStatus;
        int i;
        Integer num4;
        String str2;
        String str3;
        MediaFormat mediaFormat;
        Integer num5;
        Title title;
        int i2;
        boolean z;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = Anime.$childSerializers;
        char c2 = '\b';
        String str4 = null;
        if (c.decodeSequentially()) {
            mz5 mz5Var = mz5.a;
            String str5 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5Var, null);
            int r = c.r(aj5Var, 1);
            i13 i13Var = i13.a;
            Integer num10 = (Integer) c.decodeNullableSerializableElement(aj5Var, 2, i13Var, null);
            Title title2 = (Title) c.p(aj5Var, 3, Title$$serializer.INSTANCE, null);
            CoverImage coverImage2 = (CoverImage) c.p(aj5Var, 4, CoverImage$$serializer.INSTANCE, null);
            String str6 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5Var, null);
            MediaFormat mediaFormat2 = (MediaFormat) c.p(aj5Var, 6, (ne1) rb3VarArr[6].getValue(), null);
            MediaStatus mediaStatus2 = (MediaStatus) c.p(aj5Var, 7, (ne1) rb3VarArr[7].getValue(), null);
            Integer num11 = (Integer) c.decodeNullableSerializableElement(aj5Var, 8, i13Var, null);
            Integer num12 = (Integer) c.decodeNullableSerializableElement(aj5Var, 9, i13Var, null);
            Integer num13 = (Integer) c.decodeNullableSerializableElement(aj5Var, 10, i13Var, null);
            Integer num14 = (Integer) c.decodeNullableSerializableElement(aj5Var, 11, i13Var, null);
            Integer num15 = (Integer) c.decodeNullableSerializableElement(aj5Var, 12, i13Var, null);
            String str7 = (String) c.decodeNullableSerializableElement(aj5Var, 13, mz5Var, null);
            Integer num16 = (Integer) c.decodeNullableSerializableElement(aj5Var, 14, i13Var, null);
            list = (List) c.decodeNullableSerializableElement(aj5Var, 15, (ne1) rb3VarArr[15].getValue(), null);
            num2 = num16;
            mediaFormat = mediaFormat2;
            i2 = r;
            str2 = str5;
            z = c.w(aj5Var, 16);
            i = 131071;
            title = title2;
            str3 = str6;
            coverImage = coverImage2;
            mediaStatus = mediaStatus2;
            num = num11;
            num4 = num12;
            num5 = num10;
            str = str7;
            num3 = num15;
            num6 = num14;
            num7 = num13;
        } else {
            int i3 = 16;
            int i4 = 6;
            boolean z2 = true;
            int i5 = 0;
            int i6 = 0;
            boolean z3 = false;
            Integer num17 = null;
            Integer num18 = null;
            Integer num19 = null;
            Integer num20 = null;
            List list2 = null;
            Integer num21 = null;
            MediaStatus mediaStatus3 = null;
            String str8 = null;
            MediaFormat mediaFormat3 = null;
            String str9 = null;
            Title title3 = null;
            CoverImage coverImage3 = null;
            Integer num22 = null;
            int i7 = 7;
            Integer num23 = null;
            while (z2) {
                int i8 = c.i(aj5Var);
                switch (i8) {
                    case -1:
                        z2 = false;
                        num18 = num18;
                        i3 = 16;
                        c2 = '\b';
                        i4 = 6;
                        i7 = 7;
                    case 0:
                        num8 = num17;
                        num9 = num18;
                        str9 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5.a, str9);
                        i5 |= 1;
                        num22 = num22;
                        num18 = num9;
                        num17 = num8;
                        i3 = 16;
                        c2 = '\b';
                        i4 = 6;
                        i7 = 7;
                    case 1:
                        num8 = num17;
                        num9 = num18;
                        i6 = c.r(aj5Var, 1);
                        i5 |= 2;
                        num18 = num9;
                        num17 = num8;
                        i3 = 16;
                        c2 = '\b';
                        i4 = 6;
                        i7 = 7;
                    case 2:
                        num8 = num17;
                        num9 = num18;
                        num22 = (Integer) c.decodeNullableSerializableElement(aj5Var, 2, i13.a, num22);
                        i5 |= 4;
                        title3 = title3;
                        num18 = num9;
                        num17 = num8;
                        i3 = 16;
                        c2 = '\b';
                        i4 = 6;
                        i7 = 7;
                    case 3:
                        num8 = num17;
                        num9 = num18;
                        title3 = (Title) c.p(aj5Var, 3, Title$$serializer.INSTANCE, title3);
                        i5 |= 8;
                        num18 = num9;
                        num17 = num8;
                        i3 = 16;
                        c2 = '\b';
                        i4 = 6;
                        i7 = 7;
                    case 4:
                        num8 = num17;
                        coverImage3 = (CoverImage) c.p(aj5Var, 4, CoverImage$$serializer.INSTANCE, coverImage3);
                        i5 |= 16;
                        num17 = num8;
                        i3 = 16;
                        c2 = '\b';
                        i4 = 6;
                        i7 = 7;
                    case 5:
                        str8 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5.a, str8);
                        i5 |= 32;
                        i3 = 16;
                        c2 = '\b';
                        i4 = 6;
                        i7 = 7;
                    case 6:
                        mediaFormat3 = (MediaFormat) c.p(aj5Var, i4, (ne1) rb3VarArr[i4].getValue(), mediaFormat3);
                        i5 |= 64;
                        i3 = 16;
                        c2 = '\b';
                        i7 = 7;
                    case 7:
                        mediaStatus3 = (MediaStatus) c.p(aj5Var, i7, (ne1) rb3VarArr[i7].getValue(), mediaStatus3);
                        i5 |= 128;
                        i3 = 16;
                        c2 = '\b';
                    case 8:
                        num19 = (Integer) c.decodeNullableSerializableElement(aj5Var, 8, i13.a, num19);
                        i5 |= 256;
                        c2 = '\b';
                        i3 = 16;
                    case 9:
                        num23 = (Integer) c.decodeNullableSerializableElement(aj5Var, 9, i13.a, num23);
                        i5 |= 512;
                        i3 = 16;
                        c2 = '\b';
                    case 10:
                        num17 = (Integer) c.decodeNullableSerializableElement(aj5Var, 10, i13.a, num17);
                        i5 |= 1024;
                        i3 = 16;
                        c2 = '\b';
                    case 11:
                        num18 = (Integer) c.decodeNullableSerializableElement(aj5Var, 11, i13.a, num18);
                        i5 |= 2048;
                        i3 = 16;
                        c2 = '\b';
                    case 12:
                        num21 = (Integer) c.decodeNullableSerializableElement(aj5Var, 12, i13.a, num21);
                        i5 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                        i3 = 16;
                        c2 = '\b';
                    case 13:
                        str4 = (String) c.decodeNullableSerializableElement(aj5Var, 13, mz5.a, str4);
                        i5 |= 8192;
                        i3 = 16;
                        c2 = '\b';
                    case 14:
                        num20 = (Integer) c.decodeNullableSerializableElement(aj5Var, 14, i13.a, num20);
                        i5 |= 16384;
                        i3 = 16;
                        c2 = '\b';
                    case 15:
                        list2 = (List) c.decodeNullableSerializableElement(aj5Var, 15, (ne1) rb3VarArr[15].getValue(), list2);
                        i5 |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        i3 = 16;
                        c2 = '\b';
                    case 16:
                        z3 = c.w(aj5Var, i3);
                        i5 |= 65536;
                    default:
                        qi2.f(i8);
                        return null;
                }
            }
            num = num19;
            num2 = num20;
            list = list2;
            str = str4;
            coverImage = coverImage3;
            num3 = num21;
            mediaStatus = mediaStatus3;
            i = i5;
            num4 = num23;
            str2 = str9;
            str3 = str8;
            mediaFormat = mediaFormat3;
            num5 = num22;
            title = title3;
            i2 = i6;
            z = z3;
            num6 = num18;
            num7 = num17;
        }
        c.a(aj5Var);
        return new Anime(i, str2, i2, num5, title, coverImage, str3, mediaFormat, mediaStatus, num, num4, num7, num6, num3, str, num2, list, z, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Anime anime) {
        wt1Var.getClass();
        anime.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Anime.write$Self$AniStation_core_model(anime, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
