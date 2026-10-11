package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface p60 {
    default ii3 A(jr3 jr3Var) {
        byte[] bArr = jr3Var.k;
        if (bArr != null) {
            return F(bArr);
        }
        Uri uri = jr3Var.n;
        if (uri != null) {
            return s(uri);
        }
        return null;
    }

    ii3 F(byte[] bArr);

    ii3 s(Uri uri);
}
