package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x48 implements v58 {
    public final Context a;
    public String d;
    public final Object c = new Object();
    public final d58 b = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [d58, java.lang.Object] */
    public x48(t91 t91Var) {
        this.a = t91Var.x;
    }

    @Override // defpackage.v58
    public final i58 a(Uri uri) {
        if (!g(uri)) {
            File k = wt5.k(f(uri));
            return new i58(new FileInputStream(k), k);
        }
        throw new IOException("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // defpackage.v58
    public final OutputStream b(Uri uri) {
        return this.b.b(f(uri));
    }

    @Override // defpackage.v58
    public final void c(Uri uri) {
        this.b.c(f(uri));
    }

    @Override // defpackage.v58
    public final String d() {
        return AndroidStaticDeviceInfoDataSource.PLATFORM_ANDROID;
    }

    @Override // defpackage.v58
    public final void e(Uri uri, Uri uri2) {
        this.b.e(f(uri), f(uri2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0045. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri f(android.net.Uri r12) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x48.f(android.net.Uri):android.net.Uri");
    }

    public final boolean g(Uri uri) {
        if (!TextUtils.isEmpty(uri.getAuthority()) && !this.a.getPackageName().equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }
}
