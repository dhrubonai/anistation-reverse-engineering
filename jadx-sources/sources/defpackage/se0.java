package defpackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class se0 {
    public final lp5 a;
    public final long b;
    public v41 c;
    public long d;
    public File e;
    public OutputStream f;
    public long g;
    public long h;
    public n55 i;

    public se0(lp5 lp5Var) {
        lp5Var.getClass();
        this.a = lp5Var;
        this.b = 5242880L;
    }

    public final void a() {
        boolean z;
        OutputStream outputStream = this.f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            eq6.h(this.f);
            this.f = null;
            File file = this.e;
            this.e = null;
            lp5 lp5Var = this.a;
            long j = this.g;
            synchronized (lp5Var) {
                if (!file.exists()) {
                    return;
                }
                if (j == 0) {
                    file.delete();
                    return;
                }
                mp5 a = mp5.a(file, j, -9223372036854775807L, lp5Var.c);
                a.getClass();
                if0 h = lp5Var.c.h(a.x);
                h.getClass();
                io3.B(h.c(a.y, a.z));
                long a2 = ry0.a(h.e);
                if (a2 != -1) {
                    if (a.y + a.z <= a2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    io3.B(z);
                }
                if (lp5Var.d != null) {
                    try {
                        lp5Var.d.G(a.z, file.getName(), a.C);
                    } catch (IOException e) {
                        throw new IOException(e);
                    }
                }
                lp5Var.a(a);
                try {
                    lp5Var.c.s();
                    lp5Var.notifyAll();
                } catch (IOException e2) {
                    throw new IOException(e2);
                }
            }
        } catch (Throwable th) {
            eq6.h(this.f);
            this.f = null;
            File file2 = this.e;
            this.e = null;
            file2.delete();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.BufferedOutputStream, n55] */
    public final void b(v41 v41Var) {
        File b;
        long j = v41Var.g;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.h, this.d);
        }
        lp5 lp5Var = this.a;
        String str = v41Var.h;
        String str2 = eq6.a;
        long j3 = v41Var.f + this.h;
        synchronized (lp5Var) {
            try {
                lp5Var.c();
                if0 h = lp5Var.c.h(str);
                h.getClass();
                io3.B(h.c(j3, j2));
                if (!lp5Var.a.exists()) {
                    lp5.d(lp5Var.a);
                    lp5Var.m();
                }
                lp5Var.b.getClass();
                File file = new File(lp5Var.a, Integer.toString(lp5Var.f.nextInt(10)));
                if (!file.exists()) {
                    lp5.d(file);
                }
                b = mp5.b(file, h.a, j3, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = b;
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        n55 n55Var = this.i;
        if (n55Var == null) {
            this.i = new BufferedOutputStream(fileOutputStream, 20480);
        } else {
            n55Var.a(fileOutputStream);
        }
        this.f = this.i;
        this.g = 0L;
    }
}
