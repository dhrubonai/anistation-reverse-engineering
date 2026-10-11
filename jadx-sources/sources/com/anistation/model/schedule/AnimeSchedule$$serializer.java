package com.anistation.model.schedule;

import com.anistation.model.CoverImage;
import com.anistation.model.CoverImage$$serializer;
import com.anistation.model.MediaFormat;
import com.anistation.model.MediaStatus;
import com.anistation.model.Title;
import com.anistation.model.Title$$serializer;
import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
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
public final /* synthetic */ class AnimeSchedule$$serializer implements wd2 {
    public static final AnimeSchedule$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        AnimeSchedule$$serializer animeSchedule$$serializer = new AnimeSchedule$$serializer();
        INSTANCE = animeSchedule$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.schedule.AnimeSchedule", animeSchedule$$serializer, 18);
        kq4Var.j("id", false);
        kq4Var.j("anilistId", false);
        kq4Var.j("malId", false);
        kq4Var.j("title", false);
        kq4Var.j("coverImage", false);
        kq4Var.j("color", false);
        kq4Var.j("format", false);
        kq4Var.j("status", false);
        kq4Var.j("totalEpisodes", false);
        kq4Var.j("averageScore", false);
        kq4Var.j("popularity", false);
        kq4Var.j("trending", false);
        kq4Var.j("season", false);
        kq4Var.j("seasonYear", false);
        kq4Var.j("genres", false);
        kq4Var.j("adult", false);
        kq4Var.j("episode", false);
        kq4Var.j("airingAt", false);
        descriptor = kq4Var;
    }

    private AnimeSchedule$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = AnimeSchedule.$childSerializers;
        mz5 mz5Var = mz5.a;
        i13 i13Var = i13.a;
        return new x73[]{jb0.a(mz5Var), i13Var, jb0.a(i13Var), Title$$serializer.INSTANCE, CoverImage$$serializer.INSTANCE, jb0.a(mz5Var), rb3VarArr[6].getValue(), rb3VarArr[7].getValue(), jb0.a(i13Var), jb0.a(i13Var), jb0.a(i13Var), jb0.a(i13Var), jb0.a(mz5Var), jb0.a(i13Var), jb0.a((x73) rb3VarArr[14].getValue()), l70.a, jb0.a(i13Var), ql3.a};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0122. Please report as an issue. */
    @Override // defpackage.ne1
    public final AnimeSchedule deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        MediaStatus mediaStatus;
        int i;
        Integer num;
        Integer num2;
        List list;
        CoverImage coverImage;
        String str;
        Integer num3;
        String str2;
        Integer num4;
        String str3;
        MediaFormat mediaFormat;
        Integer num5;
        boolean z;
        Title title;
        int i2;
        long j;
        Integer num6;
        Integer num7;
        Integer num8;
        Title title2;
        CoverImage coverImage2;
        Integer num9;
        Integer num10;
        Title title3;
        CoverImage coverImage3;
        Integer num11;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = AnimeSchedule.$childSerializers;
        char c2 = '\b';
        List list2 = null;
        if (c.decodeSequentially()) {
            mz5 mz5Var = mz5.a;
            String str4 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5Var, null);
            int r = c.r(aj5Var, 1);
            i13 i13Var = i13.a;
            Integer num12 = (Integer) c.decodeNullableSerializableElement(aj5Var, 2, i13Var, null);
            Title title4 = (Title) c.p(aj5Var, 3, Title$$serializer.INSTANCE, null);
            CoverImage coverImage4 = (CoverImage) c.p(aj5Var, 4, CoverImage$$serializer.INSTANCE, null);
            String str5 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5Var, null);
            MediaFormat mediaFormat2 = (MediaFormat) c.p(aj5Var, 6, (ne1) rb3VarArr[6].getValue(), null);
            MediaStatus mediaStatus2 = (MediaStatus) c.p(aj5Var, 7, (ne1) rb3VarArr[7].getValue(), null);
            Integer num13 = (Integer) c.decodeNullableSerializableElement(aj5Var, 8, i13Var, null);
            Integer num14 = (Integer) c.decodeNullableSerializableElement(aj5Var, 9, i13Var, null);
            Integer num15 = (Integer) c.decodeNullableSerializableElement(aj5Var, 10, i13Var, null);
            Integer num16 = (Integer) c.decodeNullableSerializableElement(aj5Var, 11, i13Var, null);
            String str6 = (String) c.decodeNullableSerializableElement(aj5Var, 12, mz5Var, null);
            Integer num17 = (Integer) c.decodeNullableSerializableElement(aj5Var, 13, i13Var, null);
            List list3 = (List) c.decodeNullableSerializableElement(aj5Var, 14, (ne1) rb3VarArr[14].getValue(), null);
            boolean w = c.w(aj5Var, 15);
            num2 = (Integer) c.decodeNullableSerializableElement(aj5Var, 16, i13Var, null);
            z = w;
            num5 = num12;
            mediaStatus = mediaStatus2;
            i2 = r;
            str3 = str4;
            j = c.B(aj5Var, 17);
            title = title4;
            str2 = str5;
            coverImage = coverImage4;
            mediaFormat = mediaFormat2;
            num3 = num13;
            num4 = num14;
            list = list3;
            i = 262143;
            num = num17;
            str = str6;
            num6 = num16;
            num7 = num15;
        } else {
            int i3 = 17;
            long j2 = 0;
            int i4 = 7;
            boolean z2 = true;
            int i5 = 0;
            boolean z3 = false;
            int i6 = 0;
            Integer num18 = null;
            Integer num19 = null;
            MediaStatus mediaStatus3 = null;
            Integer num20 = null;
            Integer num21 = null;
            String str7 = null;
            Integer num22 = null;
            String str8 = null;
            MediaFormat mediaFormat3 = null;
            Integer num23 = null;
            String str9 = null;
            Title title5 = null;
            CoverImage coverImage5 = null;
            int i7 = 6;
            Integer num24 = null;
            while (z2) {
                int i8 = c.i(aj5Var);
                switch (i8) {
                    case -1:
                        num8 = num23;
                        title2 = title5;
                        coverImage2 = coverImage5;
                        z2 = false;
                        num19 = num19;
                        c2 = '\b';
                        i7 = 6;
                        i4 = 7;
                        coverImage5 = coverImage2;
                        title5 = title2;
                        i3 = 17;
                        num23 = num8;
                    case 0:
                        Title title6 = title5;
                        Integer num25 = num19;
                        Integer num26 = num23;
                        title2 = title6;
                        coverImage2 = coverImage5;
                        num8 = num26;
                        str9 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5.a, str9);
                        i5 |= 1;
                        num19 = num25;
                        num18 = num18;
                        c2 = '\b';
                        i7 = 6;
                        i4 = 7;
                        coverImage5 = coverImage2;
                        title5 = title2;
                        i3 = 17;
                        num23 = num8;
                    case 1:
                        Title title7 = title5;
                        num9 = num19;
                        num10 = num23;
                        title3 = title7;
                        coverImage3 = coverImage5;
                        num11 = num18;
                        i6 = c.r(aj5Var, 1);
                        i5 |= 2;
                        Title title8 = title3;
                        num23 = num10;
                        num19 = num9;
                        title5 = title8;
                        num18 = num11;
                        c2 = '\b';
                        i7 = 6;
                        i4 = 7;
                        coverImage5 = coverImage3;
                        i3 = 17;
                    case 2:
                        coverImage3 = coverImage5;
                        num11 = num18;
                        Title title9 = title5;
                        num9 = num19;
                        Integer num27 = num23;
                        title3 = title9;
                        num10 = (Integer) c.decodeNullableSerializableElement(aj5Var, 2, i13.a, num27);
                        i5 |= 4;
                        Title title82 = title3;
                        num23 = num10;
                        num19 = num9;
                        title5 = title82;
                        num18 = num11;
                        c2 = '\b';
                        i7 = 6;
                        i4 = 7;
                        coverImage5 = coverImage3;
                        i3 = 17;
                    case 3:
                        coverImage3 = coverImage5;
                        i5 |= 8;
                        num19 = num19;
                        c2 = '\b';
                        i7 = 6;
                        i4 = 7;
                        title5 = (Title) c.p(aj5Var, 3, Title$$serializer.INSTANCE, title5);
                        num18 = num18;
                        coverImage5 = coverImage3;
                        i3 = 17;
                    case 4:
                        CoverImage coverImage6 = coverImage5;
                        num11 = num18;
                        coverImage3 = (CoverImage) c.p(aj5Var, 4, CoverImage$$serializer.INSTANCE, coverImage6);
                        i5 |= 16;
                        num18 = num11;
                        c2 = '\b';
                        i7 = 6;
                        i4 = 7;
                        coverImage5 = coverImage3;
                        i3 = 17;
                    case 5:
                        str8 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5.a, str8);
                        i5 |= 32;
                        i3 = 17;
                        c2 = '\b';
                        i7 = 6;
                        i4 = 7;
                    case 6:
                        mediaFormat3 = (MediaFormat) c.p(aj5Var, i7, (ne1) rb3VarArr[i7].getValue(), mediaFormat3);
                        i5 |= 64;
                        i3 = 17;
                        c2 = '\b';
                        i4 = 7;
                    case 7:
                        mediaStatus3 = (MediaStatus) c.p(aj5Var, i4, (ne1) rb3VarArr[i4].getValue(), mediaStatus3);
                        i5 |= 128;
                        i3 = 17;
                        c2 = '\b';
                    case 8:
                        num22 = (Integer) c.decodeNullableSerializableElement(aj5Var, 8, i13.a, num22);
                        i5 |= 256;
                        c2 = '\b';
                        i3 = 17;
                    case 9:
                        num24 = (Integer) c.decodeNullableSerializableElement(aj5Var, 9, i13.a, num24);
                        i5 |= 512;
                        i3 = 17;
                        c2 = '\b';
                    case 10:
                        num18 = (Integer) c.decodeNullableSerializableElement(aj5Var, 10, i13.a, num18);
                        i5 |= 1024;
                        i3 = 17;
                        c2 = '\b';
                    case 11:
                        num19 = (Integer) c.decodeNullableSerializableElement(aj5Var, 11, i13.a, num19);
                        i5 |= 2048;
                        i3 = 17;
                        c2 = '\b';
                    case 12:
                        str7 = (String) c.decodeNullableSerializableElement(aj5Var, 12, mz5.a, str7);
                        i5 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                        i3 = 17;
                        c2 = '\b';
                    case 13:
                        num20 = (Integer) c.decodeNullableSerializableElement(aj5Var, 13, i13.a, num20);
                        i5 |= 8192;
                        i3 = 17;
                        c2 = '\b';
                    case 14:
                        list2 = (List) c.decodeNullableSerializableElement(aj5Var, 14, (ne1) rb3VarArr[14].getValue(), list2);
                        i5 |= 16384;
                        i3 = 17;
                        c2 = '\b';
                    case 15:
                        z3 = c.w(aj5Var, 15);
                        i5 |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        i3 = 17;
                        c2 = '\b';
                    case 16:
                        num21 = (Integer) c.decodeNullableSerializableElement(aj5Var, 16, i13.a, num21);
                        i5 |= 65536;
                        i3 = 17;
                        c2 = '\b';
                    case 17:
                        j2 = c.B(aj5Var, i3);
                        i5 |= 131072;
                    default:
                        qi2.f(i8);
                        return null;
                }
            }
            mediaStatus = mediaStatus3;
            i = i5;
            num = num20;
            num2 = num21;
            list = list2;
            coverImage = coverImage5;
            str = str7;
            num3 = num22;
            str2 = str8;
            num4 = num24;
            str3 = str9;
            mediaFormat = mediaFormat3;
            num5 = num23;
            z = z3;
            title = title5;
            i2 = i6;
            j = j2;
            num6 = num19;
            num7 = num18;
        }
        c.a(aj5Var);
        return new AnimeSchedule(i, str3, i2, num5, title, coverImage, str2, mediaFormat, mediaStatus, num3, num4, num7, num6, str, num, list, z, num2, j, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, AnimeSchedule animeSchedule) {
        wt1Var.getClass();
        animeSchedule.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        AnimeSchedule.write$Self$AniStation_core_model(animeSchedule, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
