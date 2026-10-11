package defpackage;

import com.anistation.model.download.OfflineDownloadMetadata;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class jk1 {
    public static final x53 a = zz.d(new f01((byte) 9));

    public static OfflineDownloadMetadata a(byte[] bArr) {
        Object y45Var;
        bArr.getClass();
        Object obj = null;
        if (bArr.length == 0) {
            return null;
        }
        try {
            x53 x53Var = a;
            String str = new String(bArr, kl0.a);
            x53Var.getClass();
            y45Var = (OfflineDownloadMetadata) x53Var.a(OfflineDownloadMetadata.Companion.serializer(), str);
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (!(y45Var instanceof y45)) {
            obj = y45Var;
        }
        return (OfflineDownloadMetadata) obj;
    }

    public static byte[] b(OfflineDownloadMetadata offlineDownloadMetadata) {
        offlineDownloadMetadata.getClass();
        x53 x53Var = a;
        x53Var.getClass();
        byte[] bytes = x53Var.b(OfflineDownloadMetadata.Companion.serializer(), offlineDownloadMetadata).getBytes(kl0.a);
        bytes.getClass();
        return bytes;
    }
}
