package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n48 extends m58 {
    public static final /* synthetic */ int y = 0;
    public final ArrayList x;

    public n48(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.x = arrayList;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (obj != null) {
                ov3.d();
                return;
            } else {
                try {
                    throw null;
                    break;
                } catch (Throwable unused) {
                }
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            Iterator it = this.x.iterator();
            if (it.hasNext()) {
                throw qx1.f(it);
            }
        }
        return read;
    }

    @Override // defpackage.m58, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = ((FilterInputStream) this).in.read(bArr);
        if (read != -1) {
            Iterator it = this.x.iterator();
            if (it.hasNext()) {
                throw qx1.f(it);
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            Iterator it = this.x.iterator();
            if (it.hasNext()) {
                throw qx1.f(it);
            }
        }
        return read;
    }
}
