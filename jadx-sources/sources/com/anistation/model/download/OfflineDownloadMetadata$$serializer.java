package com.anistation.model.download;

import com.anistation.model.MediaFormat;
import com.anistation.model.watch.Skips;
import com.anistation.model.watch.Skips$$serializer;
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
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class OfflineDownloadMetadata$$serializer implements wd2 {
    public static final OfflineDownloadMetadata$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        OfflineDownloadMetadata$$serializer offlineDownloadMetadata$$serializer = new OfflineDownloadMetadata$$serializer();
        INSTANCE = offlineDownloadMetadata$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.download.OfflineDownloadMetadata", offlineDownloadMetadata$$serializer, 28);
        kq4Var.j("version", true);
        kq4Var.j("anistationId", true);
        kq4Var.j("anilistId", false);
        kq4Var.j("malId", false);
        kq4Var.j("animeTitle", false);
        kq4Var.j("episodeTitle", false);
        kq4Var.j("episodeNumber", false);
        kq4Var.j("coverImage", false);
        kq4Var.j("thumbnailImage", false);
        kq4Var.j("bannerImage", true);
        kq4Var.j("filler", false);
        kq4Var.j("description", false);
        kq4Var.j("length", false);
        kq4Var.j("seasonYear", false);
        kq4Var.j("format", false);
        kq4Var.j("server", false);
        kq4Var.j("sourceType", false);
        kq4Var.j("storageType", true);
        kq4Var.j("quality", false);
        kq4Var.j("sourceUrl", false);
        kq4Var.j("sourceMimeType", false);
        kq4Var.j("headers", false);
        kq4Var.j("subtitle", false);
        kq4Var.j("skips", false);
        kq4Var.j("airedAt", false);
        kq4Var.j("createdAt", false);
        kq4Var.j("audioLanguage", true);
        kq4Var.j("audioLabel", true);
        descriptor = kq4Var;
    }

    private OfflineDownloadMetadata$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = OfflineDownloadMetadata.$childSerializers;
        i13 i13Var = i13.a;
        mz5 mz5Var = mz5.a;
        return new x73[]{i13Var, jb0.a(mz5Var), i13Var, jb0.a(i13Var), mz5Var, mz5Var, i13Var, jb0.a(mz5Var), jb0.a(mz5Var), jb0.a(mz5Var), jb0.a(l70.a), jb0.a(mz5Var), jb0.a(i13Var), jb0.a(i13Var), jb0.a((x73) rb3VarArr[14].getValue()), mz5Var, mz5Var, rb3VarArr[17].getValue(), mz5Var, mz5Var, mz5Var, rb3VarArr[21].getValue(), jb0.a(OfflineSubtitleMetadata$$serializer.INSTANCE), jb0.a(Skips$$serializer.INSTANCE), jb0.a(mz5Var), ql3.a, jb0.a(mz5Var), jb0.a(mz5Var)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x01a2. Please report as an issue. */
    @Override // defpackage.ne1
    public final OfflineDownloadMetadata deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        String str;
        Integer num;
        int i;
        String str2;
        String str3;
        String str4;
        Skips skips;
        String str5;
        Integer num2;
        MediaFormat mediaFormat;
        Integer num3;
        DownloadStorageType downloadStorageType;
        OfflineSubtitleMetadata offlineSubtitleMetadata;
        String str6;
        Boolean bool;
        String str7;
        int i2;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i3;
        String str13;
        String str14;
        Map map;
        int i4;
        String str15;
        long j;
        Boolean bool2;
        String str16;
        int i5;
        int i6;
        int i7;
        OfflineSubtitleMetadata offlineSubtitleMetadata2;
        Map map2;
        Boolean bool3;
        String str17;
        OfflineSubtitleMetadata offlineSubtitleMetadata3;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = OfflineDownloadMetadata.$childSerializers;
        if (c.decodeSequentially()) {
            int r = c.r(aj5Var, 0);
            mz5 mz5Var = mz5.a;
            String str18 = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5Var, null);
            int r2 = c.r(aj5Var, 2);
            i13 i13Var = i13.a;
            Integer num4 = (Integer) c.decodeNullableSerializableElement(aj5Var, 3, i13Var, null);
            String m = c.m(aj5Var, 4);
            String m2 = c.m(aj5Var, 5);
            int r3 = c.r(aj5Var, 6);
            String str19 = (String) c.decodeNullableSerializableElement(aj5Var, 7, mz5Var, null);
            String str20 = (String) c.decodeNullableSerializableElement(aj5Var, 8, mz5Var, null);
            String str21 = (String) c.decodeNullableSerializableElement(aj5Var, 9, mz5Var, null);
            Boolean bool4 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 10, l70.a, null);
            String str22 = (String) c.decodeNullableSerializableElement(aj5Var, 11, mz5Var, null);
            Integer num5 = (Integer) c.decodeNullableSerializableElement(aj5Var, 12, i13Var, null);
            Integer num6 = (Integer) c.decodeNullableSerializableElement(aj5Var, 13, i13Var, null);
            MediaFormat mediaFormat2 = (MediaFormat) c.decodeNullableSerializableElement(aj5Var, 14, (ne1) rb3VarArr[14].getValue(), null);
            String m3 = c.m(aj5Var, 15);
            String m4 = c.m(aj5Var, 16);
            DownloadStorageType downloadStorageType2 = (DownloadStorageType) c.p(aj5Var, 17, (ne1) rb3VarArr[17].getValue(), null);
            String m5 = c.m(aj5Var, 18);
            String m6 = c.m(aj5Var, 19);
            String m7 = c.m(aj5Var, 20);
            Map map3 = (Map) c.p(aj5Var, 21, (ne1) rb3VarArr[21].getValue(), null);
            OfflineSubtitleMetadata offlineSubtitleMetadata4 = (OfflineSubtitleMetadata) c.decodeNullableSerializableElement(aj5Var, 22, OfflineSubtitleMetadata$$serializer.INSTANCE, null);
            Skips skips2 = (Skips) c.decodeNullableSerializableElement(aj5Var, 23, Skips$$serializer.INSTANCE, null);
            String str23 = (String) c.decodeNullableSerializableElement(aj5Var, 24, mz5Var, null);
            long B = c.B(aj5Var, 25);
            str5 = (String) c.decodeNullableSerializableElement(aj5Var, 26, mz5Var, null);
            str4 = (String) c.decodeNullableSerializableElement(aj5Var, 27, mz5Var, null);
            str2 = str23;
            str10 = m4;
            str11 = m3;
            str12 = str21;
            str7 = str19;
            i3 = r3;
            str13 = m2;
            num2 = num4;
            str14 = m;
            str9 = str20;
            i = 268435455;
            str15 = m6;
            skips = skips2;
            offlineSubtitleMetadata = offlineSubtitleMetadata4;
            str8 = m5;
            downloadStorageType = downloadStorageType2;
            str6 = m7;
            str3 = str22;
            mediaFormat = mediaFormat2;
            num3 = num6;
            i4 = r2;
            str = str18;
            map = map3;
            num = num5;
            bool = bool4;
            j = B;
            i2 = r;
        } else {
            MediaFormat mediaFormat3 = null;
            boolean z = true;
            long j2 = 0;
            OfflineSubtitleMetadata offlineSubtitleMetadata5 = null;
            Map map4 = null;
            Boolean bool5 = null;
            Integer num7 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            Skips skips3 = null;
            String str27 = null;
            String str28 = null;
            Integer num8 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            Integer num9 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            DownloadStorageType downloadStorageType3 = null;
            while (z) {
                int i12 = c.i(aj5Var);
                switch (i12) {
                    case -1:
                        offlineSubtitleMetadata2 = offlineSubtitleMetadata5;
                        map2 = map4;
                        bool3 = bool5;
                        str17 = str28;
                        z = false;
                        offlineSubtitleMetadata5 = offlineSubtitleMetadata2;
                        bool5 = bool3;
                        str28 = str17;
                        map4 = map2;
                    case 0:
                        offlineSubtitleMetadata2 = offlineSubtitleMetadata5;
                        map2 = map4;
                        bool3 = bool5;
                        str17 = str28;
                        i9 = c.r(aj5Var, 0);
                        i8 |= 1;
                        offlineSubtitleMetadata5 = offlineSubtitleMetadata2;
                        bool5 = bool3;
                        str28 = str17;
                        map4 = map2;
                    case 1:
                        offlineSubtitleMetadata2 = offlineSubtitleMetadata5;
                        map2 = map4;
                        str17 = str28;
                        bool3 = bool5;
                        str37 = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5.a, str37);
                        i8 |= 2;
                        offlineSubtitleMetadata5 = offlineSubtitleMetadata2;
                        bool5 = bool3;
                        str28 = str17;
                        map4 = map2;
                    case 2:
                        offlineSubtitleMetadata3 = offlineSubtitleMetadata5;
                        map2 = map4;
                        str17 = str28;
                        i11 = c.r(aj5Var, 2);
                        i8 |= 4;
                        offlineSubtitleMetadata5 = offlineSubtitleMetadata3;
                        str28 = str17;
                        map4 = map2;
                    case 3:
                        map2 = map4;
                        str17 = str28;
                        num9 = (Integer) c.decodeNullableSerializableElement(aj5Var, 3, i13.a, num9);
                        i8 |= 8;
                        offlineSubtitleMetadata5 = offlineSubtitleMetadata5;
                        str33 = str33;
                        str28 = str17;
                        map4 = map2;
                    case 4:
                        offlineSubtitleMetadata3 = offlineSubtitleMetadata5;
                        map2 = map4;
                        str17 = str28;
                        str35 = c.m(aj5Var, 4);
                        i8 |= 16;
                        offlineSubtitleMetadata5 = offlineSubtitleMetadata3;
                        str28 = str17;
                        map4 = map2;
                    case 5:
                        offlineSubtitleMetadata3 = offlineSubtitleMetadata5;
                        map2 = map4;
                        str17 = str28;
                        str34 = c.m(aj5Var, 5);
                        i8 |= 32;
                        offlineSubtitleMetadata5 = offlineSubtitleMetadata3;
                        str28 = str17;
                        map4 = map2;
                    case 6:
                        offlineSubtitleMetadata3 = offlineSubtitleMetadata5;
                        map2 = map4;
                        str17 = str28;
                        i10 = c.r(aj5Var, 6);
                        i8 |= 64;
                        offlineSubtitleMetadata5 = offlineSubtitleMetadata3;
                        str28 = str17;
                        map4 = map2;
                    case 7:
                        map2 = map4;
                        str17 = str28;
                        str33 = (String) c.decodeNullableSerializableElement(aj5Var, 7, mz5.a, str33);
                        i8 |= 128;
                        offlineSubtitleMetadata5 = offlineSubtitleMetadata5;
                        str36 = str36;
                        str28 = str17;
                        map4 = map2;
                    case 8:
                        offlineSubtitleMetadata3 = offlineSubtitleMetadata5;
                        map2 = map4;
                        str17 = str28;
                        str36 = (String) c.decodeNullableSerializableElement(aj5Var, 8, mz5.a, str36);
                        i8 |= 256;
                        offlineSubtitleMetadata5 = offlineSubtitleMetadata3;
                        str28 = str17;
                        map4 = map2;
                    case 9:
                        map2 = map4;
                        str28 = (String) c.decodeNullableSerializableElement(aj5Var, 9, mz5.a, str28);
                        i8 |= 512;
                        offlineSubtitleMetadata5 = offlineSubtitleMetadata5;
                        map4 = map2;
                    case 10:
                        bool5 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 10, l70.a, bool5);
                        i8 |= 1024;
                        offlineSubtitleMetadata5 = offlineSubtitleMetadata5;
                        str28 = str28;
                    case 11:
                        bool2 = bool5;
                        str16 = str28;
                        str25 = (String) c.decodeNullableSerializableElement(aj5Var, 11, mz5.a, str25);
                        i8 |= 2048;
                        str28 = str16;
                        bool5 = bool2;
                    case 12:
                        bool2 = bool5;
                        str16 = str28;
                        num7 = (Integer) c.decodeNullableSerializableElement(aj5Var, 12, i13.a, num7);
                        i8 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                        str28 = str16;
                        bool5 = bool2;
                    case 13:
                        bool2 = bool5;
                        str16 = str28;
                        num8 = (Integer) c.decodeNullableSerializableElement(aj5Var, 13, i13.a, num8);
                        i8 |= 8192;
                        str28 = str16;
                        bool5 = bool2;
                    case 14:
                        bool2 = bool5;
                        str16 = str28;
                        mediaFormat3 = (MediaFormat) c.decodeNullableSerializableElement(aj5Var, 14, (ne1) rb3VarArr[14].getValue(), mediaFormat3);
                        i8 |= 16384;
                        str28 = str16;
                        bool5 = bool2;
                    case 15:
                        bool2 = bool5;
                        str16 = str28;
                        str32 = c.m(aj5Var, 15);
                        i8 |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        str28 = str16;
                        bool5 = bool2;
                    case 16:
                        bool2 = bool5;
                        str16 = str28;
                        str31 = c.m(aj5Var, 16);
                        i5 = 65536;
                        i8 |= i5;
                        str28 = str16;
                        bool5 = bool2;
                    case 17:
                        bool2 = bool5;
                        str16 = str28;
                        downloadStorageType3 = (DownloadStorageType) c.p(aj5Var, 17, (ne1) rb3VarArr[17].getValue(), downloadStorageType3);
                        i6 = 131072;
                        i8 |= i6;
                        str28 = str16;
                        bool5 = bool2;
                    case 18:
                        bool2 = bool5;
                        str16 = str28;
                        str30 = c.m(aj5Var, 18);
                        i5 = 262144;
                        i8 |= i5;
                        str28 = str16;
                        bool5 = bool2;
                    case 19:
                        bool2 = bool5;
                        str16 = str28;
                        str38 = c.m(aj5Var, 19);
                        i5 = 524288;
                        i8 |= i5;
                        str28 = str16;
                        bool5 = bool2;
                    case 20:
                        bool2 = bool5;
                        str16 = str28;
                        str29 = c.m(aj5Var, 20);
                        i8 |= 1048576;
                        str28 = str16;
                        bool5 = bool2;
                    case 21:
                        bool2 = bool5;
                        str16 = str28;
                        map4 = (Map) c.p(aj5Var, 21, (ne1) rb3VarArr[21].getValue(), map4);
                        i6 = 2097152;
                        i8 |= i6;
                        str28 = str16;
                        bool5 = bool2;
                    case 22:
                        bool2 = bool5;
                        str16 = str28;
                        offlineSubtitleMetadata5 = (OfflineSubtitleMetadata) c.decodeNullableSerializableElement(aj5Var, 22, OfflineSubtitleMetadata$$serializer.INSTANCE, offlineSubtitleMetadata5);
                        i7 = 4194304;
                        i8 |= i7;
                        str28 = str16;
                        bool5 = bool2;
                    case 23:
                        bool2 = bool5;
                        str16 = str28;
                        skips3 = (Skips) c.decodeNullableSerializableElement(aj5Var, 23, Skips$$serializer.INSTANCE, skips3);
                        i7 = 8388608;
                        i8 |= i7;
                        str28 = str16;
                        bool5 = bool2;
                    case 24:
                        bool2 = bool5;
                        str16 = str28;
                        str24 = (String) c.decodeNullableSerializableElement(aj5Var, 24, mz5.a, str24);
                        i7 = 16777216;
                        i8 |= i7;
                        str28 = str16;
                        bool5 = bool2;
                    case 25:
                        bool2 = bool5;
                        str16 = str28;
                        j2 = c.B(aj5Var, 25);
                        i8 |= 33554432;
                        str28 = str16;
                        bool5 = bool2;
                    case 26:
                        bool2 = bool5;
                        str16 = str28;
                        str27 = (String) c.decodeNullableSerializableElement(aj5Var, 26, mz5.a, str27);
                        i6 = 67108864;
                        i8 |= i6;
                        str28 = str16;
                        bool5 = bool2;
                    case 27:
                        str16 = str28;
                        bool2 = bool5;
                        str26 = (String) c.decodeNullableSerializableElement(aj5Var, 27, mz5.a, str26);
                        i6 = 134217728;
                        i8 |= i6;
                        str28 = str16;
                        bool5 = bool2;
                    default:
                        qi2.f(i12);
                        return null;
                }
            }
            str = str37;
            num = num7;
            i = i8;
            str2 = str24;
            str3 = str25;
            str4 = str26;
            skips = skips3;
            str5 = str27;
            num2 = num9;
            mediaFormat = mediaFormat3;
            num3 = num8;
            downloadStorageType = downloadStorageType3;
            offlineSubtitleMetadata = offlineSubtitleMetadata5;
            str6 = str29;
            bool = bool5;
            str7 = str33;
            i2 = i9;
            str8 = str30;
            str9 = str36;
            str10 = str31;
            str11 = str32;
            str12 = str28;
            i3 = i10;
            str13 = str34;
            str14 = str35;
            map = map4;
            i4 = i11;
            str15 = str38;
            j = j2;
        }
        c.a(aj5Var);
        return new OfflineDownloadMetadata(i, i2, str, i4, num2, str14, str13, i3, str7, str9, str12, bool, str3, num, num3, mediaFormat, str11, str10, downloadStorageType, str8, str15, str6, map, offlineSubtitleMetadata, skips, str2, j, str5, str4, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, OfflineDownloadMetadata offlineDownloadMetadata) {
        wt1Var.getClass();
        offlineDownloadMetadata.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        OfflineDownloadMetadata.write$Self$AniStation_core_model(offlineDownloadMetadata, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
