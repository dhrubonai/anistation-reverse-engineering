package defpackage;

import android.net.Uri;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kd4 extends i30 {
    public final jd4 B;
    public final rt3 C;
    public final rt3 D;
    public v41 E;
    public p45 F;
    public InputStream G;
    public boolean H;
    public long I;
    public long J;

    static {
        cr3.a("media3.datasource.okhttp");
    }

    public kd4(jd4 jd4Var, rt3 rt3Var) {
        super(true);
        jd4Var.getClass();
        this.B = jd4Var;
        this.D = rt3Var;
        this.C = new rt3((byte) 27);
    }

    @Override // defpackage.q41
    public final void close() {
        if (this.H) {
            this.H = false;
            b();
            e();
        }
        this.F = null;
        this.E = null;
    }

    public final void e() {
        p45 p45Var = this.F;
        if (p45Var != null) {
            t45 t45Var = p45Var.D;
            t45Var.getClass();
            t45Var.close();
        }
        this.G = null;
    }

    public final void f(long j) {
        if (j != 0) {
            byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
            while (j > 0) {
                try {
                    int min = (int) Math.min(j, 4096L);
                    InputStream inputStream = this.G;
                    String str = eq6.a;
                    int read = inputStream.read(bArr, 0, min);
                    if (!Thread.currentThread().isInterrupted()) {
                        if (read != -1) {
                            j -= read;
                            a(read);
                        } else {
                            throw new mq2(2008);
                        }
                    } else {
                        throw new InterruptedIOException();
                    }
                } catch (IOException e) {
                    if (e instanceof mq2) {
                        throw ((mq2) e);
                    }
                    throw new mq2(2000);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [j1, java.lang.Object] */
    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        ws2 ws2Var;
        long j;
        n35 n35Var;
        this.E = v41Var;
        this.J = 0L;
        this.I = 0L;
        c();
        long j2 = v41Var.f;
        byte b = v41Var.c;
        long j3 = v41Var.g;
        String uri = v41Var.a.toString();
        uri.getClass();
        s41 s41Var = null;
        try {
            ra2 ra2Var = new ra2((byte) 1);
            ra2Var.n(null, uri);
            ws2Var = ra2Var.a();
        } catch (IllegalArgumentException unused) {
            ws2Var = null;
        }
        if (ws2Var != null) {
            kz kzVar = new kz((byte) 8);
            kzVar.x = ws2Var;
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.D.q());
            hashMap.putAll(this.C.q());
            hashMap.putAll(v41Var.e);
            for (Map.Entry entry : hashMap.entrySet()) {
                kzVar.y((String) entry.getKey(), (String) entry.getValue());
            }
            String a = xs2.a(j2, j3);
            if (a != null) {
                ((gk2) kzVar.z).f("Range", a);
            }
            if ((v41Var.i & 1) != 1) {
                ((gk2) kzVar.z).f("Accept-Encoding", "identity");
            }
            byte[] bArr = v41Var.d;
            if (bArr != null) {
                int length = bArr.length;
                j = 0;
                dq6.c(bArr.length, 0L, length);
                n35Var = new n35(null, length, bArr);
            } else {
                j = 0;
                if (b == 2) {
                    byte[] bArr2 = eq6.b;
                    bArr2.getClass();
                    int length2 = bArr2.length;
                    dq6.c(bArr2.length, 0L, length2);
                    s41Var = null;
                    n35Var = new n35(null, length2, bArr2);
                } else {
                    n35Var = null;
                }
            }
            kzVar.B(v41.b(b), n35Var);
            l35 r = kzVar.r();
            jd4 jd4Var = this.B;
            jd4Var.getClass();
            bz4 bz4Var = new bz4(jd4Var, r);
            try {
                ?? obj = new Object();
                bz4Var.d(new fq3((Object) obj, (byte) 3));
                try {
                    p45 p45Var = (p45) obj.get();
                    this.F = p45Var;
                    t45 t45Var = p45Var.D;
                    t45Var.getClass();
                    this.G = t45Var.a();
                    int i = p45Var.A;
                    long j4 = -1;
                    if (!p45Var.l()) {
                        if (i == 416 && j2 == xs2.c(p45Var.C.b("Content-Range"))) {
                            this.H = true;
                            d(v41Var);
                            if (j3 != -1) {
                                return j3;
                            }
                            return j;
                        }
                        try {
                            InputStream inputStream = this.G;
                            inputStream.getClass();
                            pd0.b(inputStream);
                        } catch (IOException unused2) {
                            String str = eq6.a;
                        }
                        TreeMap f = p45Var.C.f();
                        e();
                        if (i == 416) {
                            s41Var = new s41(2008);
                        }
                        throw new oq2(i, s41Var, f);
                    }
                    t45Var.q();
                    if (i != 200 || j2 == j) {
                        j2 = j;
                    }
                    if (j3 != -1) {
                        this.I = j3;
                    } else {
                        long b2 = xs2.b(p45.a(p45Var, "Content-Length"), p45.a(p45Var, "Content-Range"));
                        if (b2 != -1) {
                            j4 = b2 - j2;
                        }
                        this.I = j4;
                    }
                    this.H = true;
                    d(v41Var);
                    try {
                        f(j2);
                        return this.I;
                    } catch (mq2 e) {
                        e();
                        throw e;
                    }
                } catch (InterruptedException unused3) {
                    bz4Var.c();
                    throw new InterruptedIOException();
                } catch (ExecutionException e2) {
                    throw new IOException(e2);
                }
            } catch (IOException e3) {
                throw mq2.a(1, e3);
            }
        }
        throw new mq2("Malformed URL", 1004);
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.I;
            if (j != -1) {
                long j2 = j - this.J;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.G;
            String str = eq6.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.J += read;
                a(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = eq6.a;
            throw mq2.a(2, e);
        }
    }

    @Override // defpackage.q41
    public final Map s() {
        p45 p45Var = this.F;
        if (p45Var == null) {
            return Collections.EMPTY_MAP;
        }
        return p45Var.C.f();
    }

    @Override // defpackage.q41
    public final Uri y() {
        p45 p45Var = this.F;
        if (p45Var != null) {
            return Uri.parse(p45Var.x.a.h);
        }
        v41 v41Var = this.E;
        if (v41Var != null) {
            return v41Var.a;
        }
        return null;
    }
}
