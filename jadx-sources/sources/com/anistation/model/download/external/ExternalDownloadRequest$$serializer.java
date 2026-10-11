package com.anistation.model.download.external;

import com.anistation.model.download.OfflineDownloadMetadata;
import com.anistation.model.download.OfflineDownloadMetadata$$serializer;
import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
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
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class ExternalDownloadRequest$$serializer implements wd2 {
    public static final ExternalDownloadRequest$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        ExternalDownloadRequest$$serializer externalDownloadRequest$$serializer = new ExternalDownloadRequest$$serializer();
        INSTANCE = externalDownloadRequest$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.download.external.ExternalDownloadRequest", externalDownloadRequest$$serializer, 6);
        kq4Var.j("id", false);
        kq4Var.j("metadata", false);
        kq4Var.j("streamKeys", false);
        kq4Var.j("subtitle", false);
        kq4Var.j("destinationTreeUri", true);
        kq4Var.j("destinationName", true);
        descriptor = kq4Var;
    }

    private ExternalDownloadRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = ExternalDownloadRequest.$childSerializers;
        mz5 mz5Var = mz5.a;
        return new x73[]{mz5Var, OfflineDownloadMetadata$$serializer.INSTANCE, rb3VarArr[2].getValue(), jb0.a(ExternalSubtitleRequest$$serializer.INSTANCE), jb0.a(mz5Var), mz5Var};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x006d. Please report as an issue. */
    @Override // defpackage.ne1
    public final ExternalDownloadRequest deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        List list;
        OfflineDownloadMetadata offlineDownloadMetadata;
        String str;
        String str2;
        ExternalSubtitleRequest externalSubtitleRequest;
        String str3;
        int i;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = ExternalDownloadRequest.$childSerializers;
        int i2 = 5;
        OfflineDownloadMetadata offlineDownloadMetadata2 = null;
        if (c.decodeSequentially()) {
            String m = c.m(aj5Var, 0);
            OfflineDownloadMetadata offlineDownloadMetadata3 = (OfflineDownloadMetadata) c.p(aj5Var, 1, OfflineDownloadMetadata$$serializer.INSTANCE, null);
            List list2 = (List) c.p(aj5Var, 2, (ne1) rb3VarArr[2].getValue(), null);
            ExternalSubtitleRequest externalSubtitleRequest2 = (ExternalSubtitleRequest) c.decodeNullableSerializableElement(aj5Var, 3, ExternalSubtitleRequest$$serializer.INSTANCE, null);
            String str4 = (String) c.decodeNullableSerializableElement(aj5Var, 4, mz5.a, null);
            list = list2;
            str = m;
            str2 = c.m(aj5Var, 5);
            externalSubtitleRequest = externalSubtitleRequest2;
            str3 = str4;
            i = 63;
            offlineDownloadMetadata = offlineDownloadMetadata3;
        } else {
            boolean z = true;
            int i3 = 0;
            List list3 = null;
            String str5 = null;
            String str6 = null;
            ExternalSubtitleRequest externalSubtitleRequest3 = null;
            String str7 = null;
            while (z) {
                int i4 = c.i(aj5Var);
                switch (i4) {
                    case -1:
                        z = false;
                    case 0:
                        str5 = c.m(aj5Var, 0);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        offlineDownloadMetadata2 = (OfflineDownloadMetadata) c.p(aj5Var, 1, OfflineDownloadMetadata$$serializer.INSTANCE, offlineDownloadMetadata2);
                        i3 |= 2;
                        i2 = 5;
                    case 2:
                        list3 = (List) c.p(aj5Var, 2, (ne1) rb3VarArr[2].getValue(), list3);
                        i3 |= 4;
                        i2 = 5;
                    case 3:
                        externalSubtitleRequest3 = (ExternalSubtitleRequest) c.decodeNullableSerializableElement(aj5Var, 3, ExternalSubtitleRequest$$serializer.INSTANCE, externalSubtitleRequest3);
                        i3 |= 8;
                        i2 = 5;
                    case 4:
                        str7 = (String) c.decodeNullableSerializableElement(aj5Var, 4, mz5.a, str7);
                        i3 |= 16;
                        i2 = 5;
                    case 5:
                        str6 = c.m(aj5Var, i2);
                        i3 |= 32;
                    default:
                        qi2.f(i4);
                        return null;
                }
            }
            list = list3;
            offlineDownloadMetadata = offlineDownloadMetadata2;
            str = str5;
            str2 = str6;
            externalSubtitleRequest = externalSubtitleRequest3;
            str3 = str7;
            i = i3;
        }
        c.a(aj5Var);
        return new ExternalDownloadRequest(i, str, offlineDownloadMetadata, list, externalSubtitleRequest, str3, str2, (kj5) null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, ExternalDownloadRequest externalDownloadRequest) {
        wt1Var.getClass();
        externalDownloadRequest.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        ExternalDownloadRequest.write$Self$AniStation_core_model(externalDownloadRequest, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
