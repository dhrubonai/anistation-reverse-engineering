package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d58 implements v58 {
    @Override // defpackage.v58
    public final i58 a(Uri uri) {
        File k = wt5.k(uri);
        return new i58(new FileInputStream(k), k);
    }

    @Override // defpackage.v58
    public final OutputStream b(Uri uri) {
        File k = wt5.k(uri);
        jf7.t(k);
        return new k58(new FileOutputStream(k), k);
    }

    @Override // defpackage.v58
    public final void c(Uri uri) {
        File k = wt5.k(uri);
        if (!k.isDirectory()) {
            if (!k.delete()) {
                if (!k.exists()) {
                    throw new FileNotFoundException(String.format("%s does not exist", uri));
                }
                throw new IOException(String.format("%s could not be deleted", uri));
            }
            return;
        }
        throw new FileNotFoundException(String.format("%s is a directory", uri));
    }

    @Override // defpackage.v58
    public final String d() {
        return "file";
    }

    @Override // defpackage.v58
    public final void e(Uri uri, Uri uri2) {
        File k = wt5.k(uri);
        File k2 = wt5.k(uri2);
        jf7.t(k2);
        if (k.renameTo(k2)) {
        } else {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }
}
