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
public final /* synthetic */ class Recent$$serializer implements wd2 {
    public static final Recent$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Recent$$serializer recent$$serializer = new Recent$$serializer();
        INSTANCE = recent$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.Recent", recent$$serializer, 19);
        kq4Var.j("id", true);
        kq4Var.j("anilistId", false);
        kq4Var.j("malId", false);
        kq4Var.j("title", false);
        kq4Var.j("coverImage", false);
        kq4Var.j("thumbnailImage", false);
        kq4Var.j("logo", false);
        kq4Var.j("color", false);
        kq4Var.j("format", false);
        kq4Var.j("status", false);
        kq4Var.j("averageScore", false);
        kq4Var.j("popularity", false);
        kq4Var.j("trending", false);
        kq4Var.j("season", false);
        kq4Var.j("seasonYear", false);
        kq4Var.j("genres", false);
        kq4Var.j("adult", false);
        kq4Var.j("episodeNumber", false);
        kq4Var.j("airedAt", false);
        descriptor = kq4Var;
    }

    private Recent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = Recent.$childSerializers;
        mz5 mz5Var = mz5.a;
        i13 i13Var = i13.a;
        return new x73[]{jb0.a(mz5Var), i13Var, jb0.a(i13Var), Title$$serializer.INSTANCE, CoverImage$$serializer.INSTANCE, jb0.a(mz5Var), jb0.a(mz5Var), jb0.a(mz5Var), rb3VarArr[8].getValue(), rb3VarArr[9].getValue(), jb0.a(i13Var), jb0.a(i13Var), jb0.a(i13Var), jb0.a(mz5Var), jb0.a(i13Var), jb0.a((x73) rb3VarArr[15].getValue()), l70.a, i13Var, ql3.a};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0129. Please report as an issue. */
    @Override // defpackage.ne1
    public final Recent deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        int i;
        CoverImage coverImage;
        String str;
        Integer num;
        String str2;
        String str3;
        Integer num2;
        String str4;
        Integer num3;
        String str5;
        MediaFormat mediaFormat;
        Integer num4;
        Integer num5;
        Title title;
        MediaStatus mediaStatus;
        int i2;
        boolean z;
        int i3;
        List list;
        long j;
        List list2;
        MediaStatus mediaStatus2;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = Recent.$childSerializers;
        char c2 = 7;
        int i4 = 8;
        String str6 = null;
        if (c.decodeSequentially()) {
            mz5 mz5Var = mz5.a;
            String str7 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5Var, null);
            int r = c.r(aj5Var, 1);
            i13 i13Var = i13.a;
            Integer num6 = (Integer) c.decodeNullableSerializableElement(aj5Var, 2, i13Var, null);
            Title title2 = (Title) c.p(aj5Var, 3, Title$$serializer.INSTANCE, null);
            CoverImage coverImage2 = (CoverImage) c.p(aj5Var, 4, CoverImage$$serializer.INSTANCE, null);
            String str8 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5Var, null);
            String str9 = (String) c.decodeNullableSerializableElement(aj5Var, 6, mz5Var, null);
            String str10 = (String) c.decodeNullableSerializableElement(aj5Var, 7, mz5Var, null);
            MediaFormat mediaFormat2 = (MediaFormat) c.p(aj5Var, 8, (ne1) rb3VarArr[8].getValue(), null);
            MediaStatus mediaStatus3 = (MediaStatus) c.p(aj5Var, 9, (ne1) rb3VarArr[9].getValue(), null);
            Integer num7 = (Integer) c.decodeNullableSerializableElement(aj5Var, 10, i13Var, null);
            Integer num8 = (Integer) c.decodeNullableSerializableElement(aj5Var, 11, i13Var, null);
            Integer num9 = (Integer) c.decodeNullableSerializableElement(aj5Var, 12, i13Var, null);
            String str11 = (String) c.decodeNullableSerializableElement(aj5Var, 13, mz5Var, null);
            Integer num10 = (Integer) c.decodeNullableSerializableElement(aj5Var, 14, i13Var, null);
            List list3 = (List) c.decodeNullableSerializableElement(aj5Var, 15, (ne1) rb3VarArr[15].getValue(), null);
            str2 = str7;
            list = list3;
            num = num10;
            coverImage = coverImage2;
            num5 = num6;
            mediaFormat = mediaFormat2;
            i2 = r;
            i = 524287;
            z = c.w(aj5Var, 16);
            i3 = c.r(aj5Var, 17);
            str5 = str10;
            str = str9;
            str4 = str8;
            title = title2;
            num3 = num7;
            j = c.B(aj5Var, 18);
            str3 = str11;
            num4 = num9;
            num2 = num8;
            mediaStatus = mediaStatus3;
        } else {
            int i5 = 18;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = false;
            int i8 = 0;
            boolean z3 = true;
            List list4 = null;
            MediaStatus mediaStatus4 = null;
            CoverImage coverImage3 = null;
            Integer num11 = null;
            Integer num12 = null;
            Integer num13 = null;
            String str12 = null;
            MediaFormat mediaFormat3 = null;
            Integer num14 = null;
            Integer num15 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            Title title3 = null;
            long j2 = 0;
            while (z3) {
                int i9 = c.i(aj5Var);
                switch (i9) {
                    case -1:
                        z3 = false;
                        mediaStatus4 = mediaStatus4;
                        i4 = 8;
                        i5 = 18;
                        c2 = 7;
                    case 0:
                        list2 = list4;
                        mediaStatus2 = mediaStatus4;
                        str13 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5.a, str13);
                        i6 |= 1;
                        num15 = num15;
                        mediaStatus4 = mediaStatus2;
                        list4 = list2;
                        i4 = 8;
                        i5 = 18;
                        c2 = 7;
                    case 1:
                        list2 = list4;
                        mediaStatus2 = mediaStatus4;
                        i7 = c.r(aj5Var, 1);
                        i6 |= 2;
                        mediaStatus4 = mediaStatus2;
                        list4 = list2;
                        i4 = 8;
                        i5 = 18;
                        c2 = 7;
                    case 2:
                        list2 = list4;
                        mediaStatus2 = mediaStatus4;
                        num15 = (Integer) c.decodeNullableSerializableElement(aj5Var, 2, i13.a, num15);
                        i6 |= 4;
                        title3 = title3;
                        mediaStatus4 = mediaStatus2;
                        list4 = list2;
                        i4 = 8;
                        i5 = 18;
                        c2 = 7;
                    case 3:
                        list2 = list4;
                        mediaStatus2 = mediaStatus4;
                        title3 = (Title) c.p(aj5Var, 3, Title$$serializer.INSTANCE, title3);
                        i6 |= 8;
                        mediaStatus4 = mediaStatus2;
                        list4 = list2;
                        i4 = 8;
                        i5 = 18;
                        c2 = 7;
                    case 4:
                        list2 = list4;
                        coverImage3 = (CoverImage) c.p(aj5Var, 4, CoverImage$$serializer.INSTANCE, coverImage3);
                        i6 |= 16;
                        list4 = list2;
                        i4 = 8;
                        i5 = 18;
                        c2 = 7;
                    case 5:
                        list2 = list4;
                        str15 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5.a, str15);
                        i6 |= 32;
                        list4 = list2;
                        i4 = 8;
                        i5 = 18;
                        c2 = 7;
                    case 6:
                        i6 |= 64;
                        str14 = (String) c.decodeNullableSerializableElement(aj5Var, 6, mz5.a, str14);
                        i4 = 8;
                        i5 = 18;
                        c2 = 7;
                    case 7:
                        str12 = (String) c.decodeNullableSerializableElement(aj5Var, 7, mz5.a, str12);
                        i6 |= 128;
                        c2 = 7;
                        i4 = 8;
                        i5 = 18;
                    case 8:
                        mediaFormat3 = (MediaFormat) c.p(aj5Var, i4, (ne1) rb3VarArr[i4].getValue(), mediaFormat3);
                        i6 |= 256;
                        i5 = 18;
                        c2 = 7;
                    case 9:
                        mediaStatus4 = (MediaStatus) c.p(aj5Var, 9, (ne1) rb3VarArr[9].getValue(), mediaStatus4);
                        i6 |= 512;
                        i5 = 18;
                        c2 = 7;
                    case 10:
                        num13 = (Integer) c.decodeNullableSerializableElement(aj5Var, 10, i13.a, num13);
                        i6 |= 1024;
                        i5 = 18;
                        c2 = 7;
                    case 11:
                        num12 = (Integer) c.decodeNullableSerializableElement(aj5Var, 11, i13.a, num12);
                        i6 |= 2048;
                        i5 = 18;
                        c2 = 7;
                    case 12:
                        num14 = (Integer) c.decodeNullableSerializableElement(aj5Var, 12, i13.a, num14);
                        i6 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                        i5 = 18;
                        c2 = 7;
                    case 13:
                        str6 = (String) c.decodeNullableSerializableElement(aj5Var, 13, mz5.a, str6);
                        i6 |= 8192;
                        i5 = 18;
                        c2 = 7;
                    case 14:
                        num11 = (Integer) c.decodeNullableSerializableElement(aj5Var, 14, i13.a, num11);
                        i6 |= 16384;
                        i5 = 18;
                        c2 = 7;
                    case 15:
                        list4 = (List) c.decodeNullableSerializableElement(aj5Var, 15, (ne1) rb3VarArr[15].getValue(), list4);
                        i6 |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        i5 = 18;
                        c2 = 7;
                    case 16:
                        z2 = c.w(aj5Var, 16);
                        i6 |= 65536;
                        i5 = 18;
                    case 17:
                        i8 = c.r(aj5Var, 17);
                        i6 |= 131072;
                        i5 = 18;
                    case 18:
                        j2 = c.B(aj5Var, i5);
                        i6 |= 262144;
                    default:
                        qi2.f(i9);
                        return null;
                }
            }
            i = i6;
            coverImage = coverImage3;
            str = str14;
            num = num11;
            str2 = str13;
            str3 = str6;
            num2 = num12;
            str4 = str15;
            num3 = num13;
            str5 = str12;
            mediaFormat = mediaFormat3;
            num4 = num14;
            num5 = num15;
            title = title3;
            mediaStatus = mediaStatus4;
            i2 = i7;
            z = z2;
            i3 = i8;
            list = list4;
            j = j2;
        }
        c.a(aj5Var);
        return new Recent(i, str2, i2, num5, title, coverImage, str4, str, str5, mediaFormat, mediaStatus, num3, num2, num4, str3, num, list, z, i3, j, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Recent recent) {
        wt1Var.getClass();
        recent.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Recent.write$Self$AniStation_core_model(recent, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
