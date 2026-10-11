package com.anistation.model.animelist;

import com.anistation.model.MediaFormat;
import com.anistation.model.MediaStatus;
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
public final /* synthetic */ class ImportedAnime$$serializer implements wd2 {
    public static final ImportedAnime$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        ImportedAnime$$serializer importedAnime$$serializer = new ImportedAnime$$serializer();
        INSTANCE = importedAnime$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.animelist.ImportedAnime", importedAnime$$serializer, 14);
        kq4Var.j("id", true);
        kq4Var.j("anilistId", false);
        kq4Var.j("malId", false);
        kq4Var.j("title", false);
        kq4Var.j("coverImage", false);
        kq4Var.j("bannerImage", false);
        kq4Var.j("totalEpisodes", false);
        kq4Var.j("currentAiredEpisodes", false);
        kq4Var.j("mediaStatus", false);
        kq4Var.j("status", false);
        kq4Var.j("progress", false);
        kq4Var.j("score", false);
        kq4Var.j("format", false);
        kq4Var.j("notes", false);
        descriptor = kq4Var;
    }

    private ImportedAnime$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = ImportedAnime.$childSerializers;
        mz5 mz5Var = mz5.a;
        i13 i13Var = i13.a;
        return new x73[]{jb0.a(mz5Var), i13Var, jb0.a(i13Var), mz5Var, jb0.a(mz5Var), jb0.a(mz5Var), jb0.a(i13Var), i13Var, jb0.a((x73) rb3VarArr[8].getValue()), rb3VarArr[9].getValue(), i13Var, jb0.a(i13Var), jb0.a((x73) rb3VarArr[12].getValue()), jb0.a(mz5Var)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00e2. Please report as an issue. */
    @Override // defpackage.ne1
    public final ImportedAnime deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        WatchStatus watchStatus;
        Integer num;
        Integer num2;
        String str;
        Integer num3;
        String str2;
        String str3;
        MediaStatus mediaStatus;
        String str4;
        int i;
        MediaFormat mediaFormat;
        int i2;
        int i3;
        String str5;
        int i4;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = ImportedAnime.$childSerializers;
        int i5 = 7;
        int i6 = 6;
        char c2 = 5;
        int i7 = 0;
        String str6 = null;
        if (c.decodeSequentially()) {
            mz5 mz5Var = mz5.a;
            String str7 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5Var, null);
            int r = c.r(aj5Var, 1);
            i13 i13Var = i13.a;
            Integer num4 = (Integer) c.decodeNullableSerializableElement(aj5Var, 2, i13Var, null);
            String m = c.m(aj5Var, 3);
            String str8 = (String) c.decodeNullableSerializableElement(aj5Var, 4, mz5Var, null);
            String str9 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5Var, null);
            Integer num5 = (Integer) c.decodeNullableSerializableElement(aj5Var, 6, i13Var, null);
            int r2 = c.r(aj5Var, 7);
            MediaStatus mediaStatus2 = (MediaStatus) c.decodeNullableSerializableElement(aj5Var, 8, (ne1) rb3VarArr[8].getValue(), null);
            WatchStatus watchStatus2 = (WatchStatus) c.p(aj5Var, 9, (ne1) rb3VarArr[9].getValue(), null);
            int r3 = c.r(aj5Var, 10);
            Integer num6 = (Integer) c.decodeNullableSerializableElement(aj5Var, 11, i13Var, null);
            mediaFormat = (MediaFormat) c.decodeNullableSerializableElement(aj5Var, 12, (ne1) rb3VarArr[12].getValue(), null);
            str = (String) c.decodeNullableSerializableElement(aj5Var, 13, mz5Var, null);
            i2 = r;
            i = 16383;
            i3 = r2;
            num2 = num5;
            str4 = str9;
            str5 = m;
            str3 = str8;
            num3 = num4;
            str2 = str7;
            mediaStatus = mediaStatus2;
            i4 = r3;
            num = num6;
            watchStatus = watchStatus2;
        } else {
            int i8 = 13;
            boolean z = true;
            WatchStatus watchStatus3 = null;
            Integer num7 = null;
            Integer num8 = null;
            String str10 = null;
            MediaStatus mediaStatus3 = null;
            String str11 = null;
            MediaFormat mediaFormat2 = null;
            String str12 = null;
            Integer num9 = null;
            String str13 = null;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (z) {
                int i12 = c.i(aj5Var);
                switch (i12) {
                    case -1:
                        z = false;
                        i5 = 7;
                        i6 = 6;
                        c2 = 5;
                    case 0:
                        str13 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5.a, str13);
                        i7 |= 1;
                        i8 = 13;
                        i5 = 7;
                        i6 = 6;
                        c2 = 5;
                    case 1:
                        i9 = c.r(aj5Var, 1);
                        i7 |= 2;
                        i8 = 13;
                        i5 = 7;
                        i6 = 6;
                        c2 = 5;
                    case 2:
                        num9 = (Integer) c.decodeNullableSerializableElement(aj5Var, 2, i13.a, num9);
                        i7 |= 4;
                        i8 = 13;
                        i5 = 7;
                        i6 = 6;
                        c2 = 5;
                    case 3:
                        str12 = c.m(aj5Var, 3);
                        i7 |= 8;
                        i8 = 13;
                        c2 = 5;
                    case 4:
                        str10 = (String) c.decodeNullableSerializableElement(aj5Var, 4, mz5.a, str10);
                        i7 |= 16;
                        i8 = 13;
                        c2 = 5;
                    case 5:
                        str11 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5.a, str11);
                        i7 |= 32;
                        c2 = 5;
                        i8 = 13;
                    case 6:
                        num8 = (Integer) c.decodeNullableSerializableElement(aj5Var, i6, i13.a, num8);
                        i7 |= 64;
                        i8 = 13;
                        c2 = 5;
                    case 7:
                        i10 = c.r(aj5Var, i5);
                        i7 |= 128;
                        i8 = 13;
                        c2 = 5;
                    case 8:
                        mediaStatus3 = (MediaStatus) c.decodeNullableSerializableElement(aj5Var, 8, (ne1) rb3VarArr[8].getValue(), mediaStatus3);
                        i7 |= 256;
                        i8 = 13;
                        c2 = 5;
                    case 9:
                        watchStatus3 = (WatchStatus) c.p(aj5Var, 9, (ne1) rb3VarArr[9].getValue(), watchStatus3);
                        i7 |= 512;
                        i8 = 13;
                        c2 = 5;
                    case 10:
                        i11 = c.r(aj5Var, 10);
                        i7 |= 1024;
                        i8 = 13;
                        c2 = 5;
                    case 11:
                        num7 = (Integer) c.decodeNullableSerializableElement(aj5Var, 11, i13.a, num7);
                        i7 |= 2048;
                        i8 = 13;
                        c2 = 5;
                    case 12:
                        mediaFormat2 = (MediaFormat) c.decodeNullableSerializableElement(aj5Var, 12, (ne1) rb3VarArr[12].getValue(), mediaFormat2);
                        i7 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                        i8 = 13;
                        c2 = 5;
                    case 13:
                        str6 = (String) c.decodeNullableSerializableElement(aj5Var, i8, mz5.a, str6);
                        i7 |= 8192;
                        c2 = 5;
                    default:
                        qi2.f(i12);
                        return null;
                }
            }
            watchStatus = watchStatus3;
            num = num7;
            num2 = num8;
            str = str6;
            num3 = num9;
            str2 = str13;
            str3 = str10;
            mediaStatus = mediaStatus3;
            str4 = str11;
            i = i7;
            mediaFormat = mediaFormat2;
            i2 = i9;
            i3 = i10;
            str5 = str12;
            i4 = i11;
        }
        c.a(aj5Var);
        return new ImportedAnime(i, str2, i2, num3, str5, str3, str4, num2, i3, mediaStatus, watchStatus, i4, num, mediaFormat, str, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, ImportedAnime importedAnime) {
        wt1Var.getClass();
        importedAnime.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        ImportedAnime.write$Self$AniStation_core_model(importedAnime, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
