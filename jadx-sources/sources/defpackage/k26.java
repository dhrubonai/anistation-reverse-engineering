package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashSet;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k26 implements q41 {
    public int A;
    public Uri B;
    public Map C = ot1.x;
    public boolean D;
    public boolean E;
    public final q41 x;
    public final LinkedHashSet y;
    public byte[] z;

    public k26(q41 q41Var, LinkedHashSet linkedHashSet) {
        this.x = q41Var;
        this.y = linkedHashSet;
    }

    public static byte[] a(Uri uri) {
        String uri2 = uri.toString();
        uri2.getClass();
        String q = nu5.q(uri2);
        if (q.equals("text/x-ssa")) {
            q = "text/vtt";
        }
        if (q.equals("text/vtt")) {
            byte[] bytes = "WEBVTT\n\n".getBytes(kl0.a);
            bytes.getClass();
            return bytes;
        }
        return new byte[0];
    }

    @Override // defpackage.q41
    public final void close() {
        if (this.D) {
            this.z = null;
            this.A = 0;
            this.B = null;
            this.C = ot1.x;
        } else if (this.E) {
            try {
                this.x.close();
            } catch (Throwable unused) {
            }
        }
        this.D = false;
        this.E = false;
    }

    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        int length;
        byte[] a;
        long j;
        v41Var.getClass();
        Uri uri = v41Var.a;
        if (!this.E) {
            this.B = uri;
            uri.getClass();
            String path = uri.getPath();
            q41 q41Var = this.x;
            if ((path == null || (!b06.A(path, ".ass", true) && !b06.A(path, ".ssa", true))) && !this.y.contains(uri)) {
                this.D = false;
                try {
                    long h = q41Var.h(v41Var);
                    this.E = true;
                    return h;
                } catch (Exception e) {
                    try {
                        q41Var.close();
                    } catch (Throwable unused) {
                    }
                    throw e;
                }
            }
            this.D = true;
            u41 a2 = v41Var.a();
            a2.f = 0L;
            a2.g = -1L;
            v41 a3 = a2.a();
            try {
                try {
                    a = a(uri);
                    mi miVar = new mi((Object) this, (Object) a3, (Object) v41Var, (byte) 14);
                    int i = 0;
                    while (true) {
                        if (i >= 2) {
                            break;
                        }
                        try {
                            a = (byte[]) miVar.invoke();
                            break;
                        } catch (InterruptedIOException e2) {
                            if (Thread.currentThread().isInterrupted()) {
                                throw e2;
                            }
                        } catch (IOException unused2) {
                        }
                        i++;
                    }
                    j = v41Var.f;
                } catch (Exception e3) {
                    this.z = null;
                    this.A = 0;
                    if (!(e3 instanceof s41)) {
                        if ((e3 instanceof InterruptedIOException) && Thread.currentThread().isInterrupted()) {
                            throw e3;
                        }
                        byte[] a4 = a(uri);
                        this.z = a4;
                        this.A = 0;
                        this.E = true;
                        length = a4.length;
                    } else {
                        throw e3;
                    }
                }
                if (j <= a.length) {
                    this.z = a;
                    int i2 = (int) j;
                    this.A = i2;
                    this.E = true;
                    length = a.length - i2;
                    long j2 = length;
                    try {
                        q41Var.close();
                    } catch (Throwable unused3) {
                    }
                    return j2;
                }
                throw new s41(2008);
            } catch (Throwable th) {
                try {
                    q41Var.close();
                } catch (Throwable unused4) {
                }
                throw th;
            }
        }
        ze0.m("Subtitle data source is already open");
        return 0L;
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        bArr.getClass();
        if (i2 == 0) {
            return 0;
        }
        if (!this.D) {
            return this.x.read(bArr, i, i2);
        }
        byte[] bArr2 = this.z;
        if (bArr2 == null || (i3 = this.A) >= bArr2.length) {
            return -1;
        }
        int min = Math.min(i2, bArr2.length - i3);
        int i4 = this.A;
        ms.v0(i, i4, i4 + min, bArr2, bArr);
        this.A += min;
        return min;
    }

    @Override // defpackage.q41
    public final Map s() {
        if (this.D) {
            return this.C;
        }
        Map s = this.x.s();
        s.getClass();
        return s;
    }

    @Override // defpackage.q41
    public final Uri y() {
        if (this.D) {
            return this.B;
        }
        return this.x.y();
    }

    @Override // defpackage.q41
    public final void z(n71 n71Var) {
        n71Var.getClass();
        this.x.z(n71Var);
    }
}
