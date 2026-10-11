package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class p48 extends o58 {
    public static final /* synthetic */ int y = 0;
    public final ArrayList x;

    public p48(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.x = arrayList;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // defpackage.o58, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.x.iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            ov3.d();
        } else {
            int length = bArr.length;
            throw null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        Iterator it = this.x.iterator();
        if (it.hasNext()) {
            throw qx1.f(it);
        }
    }

    @Override // defpackage.o58, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        Iterator it = this.x.iterator();
        if (it.hasNext()) {
            throw qx1.f(it);
        }
    }
}
