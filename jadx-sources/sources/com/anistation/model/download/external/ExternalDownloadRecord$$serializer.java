package com.anistation.model.download.external;

import com.anistation.model.download.EpisodeDownloadState;
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
import defpackage.ql3;
import defpackage.r42;
import defpackage.rb3;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class ExternalDownloadRecord$$serializer implements wd2 {
    public static final ExternalDownloadRecord$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        ExternalDownloadRecord$$serializer externalDownloadRecord$$serializer = new ExternalDownloadRecord$$serializer();
        INSTANCE = externalDownloadRecord$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.download.external.ExternalDownloadRecord", externalDownloadRecord$$serializer, 11);
        kq4Var.j("request", false);
        kq4Var.j("state", true);
        kq4Var.j("percentDownloaded", true);
        kq4Var.j("bytesDownloaded", true);
        kq4Var.j("contentLength", true);
        kq4Var.j("failureReason", true);
        kq4Var.j("videoUri", true);
        kq4Var.j("subtitleUri", true);
        kq4Var.j("fileName", true);
        kq4Var.j("updatedAt", true);
        kq4Var.j("exportedVideoFileName", true);
        descriptor = kq4Var;
    }

    private ExternalDownloadRecord$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] access$get$childSerializers$cp = ExternalDownloadRecord.access$get$childSerializers$cp();
        ql3 ql3Var = ql3.a;
        mz5 mz5Var = mz5.a;
        return new x73[]{ExternalDownloadRequest$$serializer.INSTANCE, access$get$childSerializers$cp[1].getValue(), r42.a, ql3Var, ql3Var, i13.a, jb0.a(mz5Var), jb0.a(mz5Var), jb0.a(mz5Var), ql3Var, jb0.a(mz5Var)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00a5. Please report as an issue. */
    @Override // defpackage.ne1
    public final ExternalDownloadRecord deserialize(l61 l61Var) {
        EpisodeDownloadState episodeDownloadState;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        ExternalDownloadRequest externalDownloadRequest;
        int i2;
        float f;
        long j;
        long j2;
        long j3;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3[] access$get$childSerializers$cp = ExternalDownloadRecord.access$get$childSerializers$cp();
        int i3 = 10;
        int i4 = 9;
        int i5 = 5;
        ExternalDownloadRequest externalDownloadRequest2 = null;
        if (c.decodeSequentially()) {
            ExternalDownloadRequest externalDownloadRequest3 = (ExternalDownloadRequest) c.p(aj5Var, 0, ExternalDownloadRequest$$serializer.INSTANCE, null);
            EpisodeDownloadState episodeDownloadState2 = (EpisodeDownloadState) c.p(aj5Var, 1, (ne1) access$get$childSerializers$cp[1].getValue(), null);
            float h = c.h(aj5Var, 2);
            long B = c.B(aj5Var, 3);
            long B2 = c.B(aj5Var, 4);
            int r = c.r(aj5Var, 5);
            mz5 mz5Var = mz5.a;
            String str5 = (String) c.decodeNullableSerializableElement(aj5Var, 6, mz5Var, null);
            String str6 = (String) c.decodeNullableSerializableElement(aj5Var, 7, mz5Var, null);
            String str7 = (String) c.decodeNullableSerializableElement(aj5Var, 8, mz5Var, null);
            long B3 = c.B(aj5Var, 9);
            episodeDownloadState = episodeDownloadState2;
            externalDownloadRequest = externalDownloadRequest3;
            str4 = (String) c.decodeNullableSerializableElement(aj5Var, 10, mz5Var, null);
            i = 2047;
            str3 = str6;
            str = str5;
            i2 = r;
            str2 = str7;
            f = h;
            j = B;
            j2 = B2;
            j3 = B3;
        } else {
            float f2 = 0.0f;
            boolean z = true;
            int i6 = 0;
            EpisodeDownloadState episodeDownloadState3 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            long j4 = 0;
            long j5 = 0;
            long j6 = 0;
            int i7 = 1;
            int i8 = 0;
            String str11 = null;
            while (z) {
                int i9 = c.i(aj5Var);
                switch (i9) {
                    case -1:
                        z = false;
                        i4 = 9;
                        i7 = 1;
                    case 0:
                        externalDownloadRequest2 = (ExternalDownloadRequest) c.p(aj5Var, 0, ExternalDownloadRequest$$serializer.INSTANCE, externalDownloadRequest2);
                        i8 |= 1;
                        i3 = 10;
                        i4 = 9;
                        i7 = 1;
                    case 1:
                        episodeDownloadState3 = (EpisodeDownloadState) c.p(aj5Var, i7, (ne1) access$get$childSerializers$cp[i7].getValue(), episodeDownloadState3);
                        i8 |= 2;
                        i3 = 10;
                        i4 = 9;
                    case 2:
                        f2 = c.h(aj5Var, 2);
                        i8 |= 4;
                        i3 = 10;
                    case 3:
                        j4 = c.B(aj5Var, 3);
                        i8 |= 8;
                        i3 = 10;
                    case 4:
                        j5 = c.B(aj5Var, 4);
                        i8 |= 16;
                        i3 = 10;
                    case 5:
                        i6 = c.r(aj5Var, i5);
                        i8 |= 32;
                    case 6:
                        str8 = (String) c.decodeNullableSerializableElement(aj5Var, 6, mz5.a, str8);
                        i8 |= 64;
                        i5 = 5;
                    case 7:
                        str10 = (String) c.decodeNullableSerializableElement(aj5Var, 7, mz5.a, str10);
                        i8 |= 128;
                        i5 = 5;
                    case 8:
                        str9 = (String) c.decodeNullableSerializableElement(aj5Var, 8, mz5.a, str9);
                        i8 |= 256;
                        i5 = 5;
                    case 9:
                        j6 = c.B(aj5Var, i4);
                        i8 |= 512;
                        i5 = 5;
                    case 10:
                        str11 = (String) c.decodeNullableSerializableElement(aj5Var, i3, mz5.a, str11);
                        i8 |= 1024;
                        i5 = 5;
                    default:
                        qi2.f(i9);
                        return null;
                }
            }
            episodeDownloadState = episodeDownloadState3;
            str = str8;
            str2 = str9;
            str3 = str10;
            i = i8;
            str4 = str11;
            externalDownloadRequest = externalDownloadRequest2;
            i2 = i6;
            f = f2;
            j = j4;
            j2 = j5;
            j3 = j6;
        }
        c.a(aj5Var);
        return new ExternalDownloadRecord(i, externalDownloadRequest, episodeDownloadState, f, j, j2, i2, str, str3, str2, j3, str4, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, ExternalDownloadRecord externalDownloadRecord) {
        wt1Var.getClass();
        externalDownloadRecord.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        ExternalDownloadRecord.write$Self$AniStation_core_model(externalDownloadRecord, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
