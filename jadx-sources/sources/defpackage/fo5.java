package defpackage;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fo5 implements q41 {
    public q41 B;
    public Uri C;
    public byte[] E;
    public int F;
    public int H;
    public go5 I;
    public long J;
    public long L;
    public boolean M;
    public final l33 x;
    public final tq6 y;
    public final ConcurrentHashMap z;
    public final ArrayList A = new ArrayList();
    public Map D = ot1.x;
    public byte[] G = new byte[0];
    public long K = -1;

    public fo5(l33 l33Var, tq6 tq6Var, ConcurrentHashMap concurrentHashMap) {
        this.x = l33Var;
        this.y = tq6Var;
        this.z = concurrentHashMap;
    }

    public static byte[] f(q41 q41Var, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = q41Var.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            if (read != 0) {
                i2 += read;
            } else {
                qi2.k("Shiro segment read made no progress");
                return null;
            }
        }
        return Arrays.copyOf(bArr, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if ((r8.byteValue() & 255) == r7) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.go5 a(byte[] r8) {
        /*
            r7 = this;
            tq6 r7 = r7.y
            int r0 = r7.e
            int r1 = r7.f
            int r7 = r7.g
            int r2 = r8.length
            r3 = 12
            r4 = 8
            r5 = 1
            r6 = 0
            if (r2 < r3) goto L49
            r2 = r8[r6]
            r3 = 82
            if (r2 != r3) goto L49
            r2 = r8[r5]
            r3 = 73
            if (r2 != r3) goto L49
            r2 = 2
            r2 = r8[r2]
            r3 = 70
            if (r2 != r3) goto L49
            r2 = 3
            r2 = r8[r2]
            if (r2 != r3) goto L49
            r2 = r8[r4]
            r3 = 87
            if (r2 != r3) goto L49
            r2 = 9
            r2 = r8[r2]
            r3 = 69
            if (r2 != r3) goto L49
            r2 = 10
            r2 = r8[r2]
            r3 = 66
            if (r2 != r3) goto L49
            r2 = 11
            r2 = r8[r2]
            r3 = 80
            if (r2 != r3) goto L49
            r0 = r1
            goto L7c
        L49:
            byte[] r1 = new byte[r4]
            r1 = {x009c: FILL_ARRAY_DATA , data: [-119, 80, 78, 71, 13, 10, 26, 10} // fill-array
            int r2 = r8.length
            if (r2 < r4) goto L7b
            f13 r2 = new f13
            r3 = 7
            r2.<init>(r6, r3, r5)
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L65
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L65
            goto L7c
        L65:
            java.util.Iterator r2 = r2.iterator()
        L69:
            r3 = r2
            e13 r3 = (defpackage.e13) r3
            boolean r4 = r3.z
            if (r4 == 0) goto L7c
            int r3 = r3.nextInt()
            r4 = r8[r3]
            r3 = r1[r3]
            if (r4 != r3) goto L7b
            goto L69
        L7b:
            r0 = r6
        L7c:
            if (r0 <= 0) goto L95
            if (r0 < 0) goto L8a
            int r1 = r8.length
            if (r0 >= r1) goto L8a
            r8 = r8[r0]
            java.lang.Byte r8 = java.lang.Byte.valueOf(r8)
            goto L8b
        L8a:
            r8 = 0
        L8b:
            if (r8 == 0) goto L96
            byte r8 = r8.byteValue()
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 != r7) goto L96
        L95:
            r5 = r6
        L96:
            go5 r7 = new go5
            r7.<init>(r0, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo5.a(byte[]):go5");
    }

    public final q41 b() {
        q41 H = this.x.H();
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((i30) H).z((n71) obj);
        }
        return H;
    }

    public final long c(v41 v41Var) {
        long j;
        q41 b = b();
        this.B = b;
        kd4 kd4Var = (kd4) b;
        long h = kd4Var.h(v41Var);
        Uri y = kd4Var.y();
        if (y == null) {
            y = v41Var.a;
            y.getClass();
        }
        this.C = y;
        Map s = kd4Var.s();
        s.getClass();
        this.D = s;
        long j2 = v41Var.g;
        Long valueOf = Long.valueOf(j2);
        if (j2 == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            j = valueOf.longValue();
        } else {
            j = h;
        }
        this.K = j;
        if (h != -1) {
            long j3 = v41Var.f;
            long j4 = Long.MAX_VALUE;
            if (j3 <= Long.MAX_VALUE - h) {
                j4 = j3 + h;
            }
            if (j4 > this.y.d) {
                qi2.k("Shiro resource exceeds the configured limit");
                return 0L;
            }
        }
        return h;
    }

    @Override // defpackage.q41
    public final void close() {
        q41 q41Var = this.B;
        this.B = null;
        if (q41Var != null) {
            try {
                q41Var.close();
            } catch (Throwable unused) {
            }
        }
        this.M = false;
        this.C = null;
        this.D = ot1.x;
        this.E = null;
        this.F = 0;
        this.G = new byte[0];
        this.H = 0;
        this.I = null;
        this.J = 0L;
        this.K = -1L;
        this.L = 0L;
    }

    public final long d(v41 v41Var) {
        Object y45Var;
        byte[] bytes;
        tq6 tq6Var = this.y;
        int i = tq6Var.c;
        q41 b = b();
        this.B = b;
        u41 a = v41Var.a();
        a.f = 0L;
        long j = -1;
        a.g = -1L;
        kd4 kd4Var = (kd4) b;
        kd4Var.h(a.a());
        Uri y = kd4Var.y();
        if (y == null) {
            y = v41Var.a;
            y.getClass();
        }
        this.C = y;
        Map s = kd4Var.s();
        s.getClass();
        this.D = s;
        long j2 = ((i * 4) / 3) + 32;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 16384;
        byte[] bArr = new byte[16384];
        long j3 = 0;
        while (true) {
            int read = kd4Var.read(bArr, 0, i2);
            long j4 = j;
            if (read != -1) {
                if (read != 0) {
                    byte[] bArr2 = bArr;
                    j3 += read;
                    if (j3 <= j2) {
                        byteArrayOutputStream.write(bArr2, 0, read);
                        bArr = bArr2;
                        j = j4;
                        i2 = 16384;
                    } else {
                        qi2.k("Shiro playlist exceeds the configured limit");
                        return 0L;
                    }
                } else {
                    qi2.k("Shiro playlist read made no progress");
                    return 0L;
                }
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                kd4Var.close();
                this.B = null;
                byte[] bArr3 = tq6Var.a;
                Charset charset = kl0.a;
                String obj = uz5.w0(new String(byteArray, charset)).toString();
                if (b06.I(obj, "#EXTM3U", false)) {
                    bytes = obj.getBytes(charset);
                    bytes.getClass();
                } else {
                    try {
                        y45Var = Base64.getDecoder().decode(obj);
                    } catch (Throwable th) {
                        y45Var = new y45(th);
                    }
                    Throwable b2 = z45.b(y45Var);
                    if (b2 == null) {
                        byte[] bArr4 = (byte[]) y45Var;
                        if (bArr4.length <= i) {
                            int length = bArr4.length;
                            byte[] bArr5 = new byte[length];
                            for (int i3 = 0; i3 < length; i3++) {
                                bArr5[i3] = (byte) (bArr4[i3] ^ bArr3[i3 % bArr3.length]);
                            }
                            Charset charset2 = kl0.a;
                            String obj2 = uz5.w0(new String(bArr5, charset2)).toString();
                            if (b06.I(obj2, "#EXTM3U", false)) {
                                bytes = obj2.getBytes(charset2);
                                bytes.getClass();
                            } else {
                                qi2.k("Invalid Shiro playlist payload");
                                return 0L;
                            }
                        } else {
                            qi2.k("Shiro playlist exceeds the configured limit");
                            return 0L;
                        }
                    } else {
                        throw new IOException("Invalid Shiro playlist encoding", b2);
                    }
                }
                if (bytes.length <= i) {
                    long j5 = v41Var.f;
                    if (j5 <= bytes.length) {
                        this.E = bytes;
                        int i4 = (int) j5;
                        this.F = i4;
                        long length2 = bytes.length - i4;
                        this.K = length2;
                        long j6 = v41Var.g;
                        if (j6 != j4) {
                            long min = Math.min(length2, j6);
                            this.K = min;
                            return min;
                        }
                        return length2;
                    }
                    throw new s41(2008);
                }
                qi2.k("Shiro playlist exceeds the configured limit");
                return 0L;
            }
        }
    }

    public final long e(v41 v41Var) {
        long j;
        long j2;
        byte[] C0;
        long j3;
        long j4;
        long j5;
        long j6;
        tq6 tq6Var = this.y;
        long j7 = tq6Var.d;
        byte[] bArr = tq6Var.b;
        Uri uri = v41Var.a;
        long j8 = v41Var.g;
        String uri2 = uri.toString();
        uri2.getClass();
        long j9 = v41Var.f;
        long j10 = Long.MAX_VALUE;
        ConcurrentHashMap concurrentHashMap = this.z;
        if (j9 > 0) {
            go5 go5Var = (go5) concurrentHashMap.get(uri2);
            if (go5Var == null) {
                q41 b = b();
                try {
                    u41 a = v41Var.a();
                    a.f = 0L;
                    j4 = 0;
                    a.g = Math.max(tq6Var.e, tq6Var.f) + 1;
                    kd4 kd4Var = (kd4) b;
                    kd4Var.h(a.a());
                    go5Var = a(f(b, Math.max(tq6Var.e, tq6Var.f) + 1));
                    kd4Var.close();
                    concurrentHashMap.put(uri2, go5Var);
                } catch (Throwable th) {
                    ((kd4) b).close();
                    throw th;
                }
            } else {
                j4 = 0;
            }
            this.I = go5Var;
            this.J = j9 % bArr.length;
            q41 b2 = b();
            this.B = b2;
            u41 a2 = v41Var.a();
            long j11 = go5Var.a;
            if (j9 > Long.MAX_VALUE - j11) {
                j5 = Long.MAX_VALUE;
            } else {
                j5 = j11 + j9;
            }
            a2.f = j5;
            kd4 kd4Var2 = (kd4) b2;
            long h = kd4Var2.h(a2.a());
            Uri y = kd4Var2.y();
            if (y == null) {
                uri.getClass();
            } else {
                uri = y;
            }
            this.C = uri;
            Map s = kd4Var2.s();
            s.getClass();
            this.D = s;
            this.K = j8;
            if (h != -1) {
                if (j9 > Long.MAX_VALUE - h) {
                    j6 = Long.MAX_VALUE;
                } else {
                    j6 = j9 + h;
                }
                if (j6 <= j7) {
                    if (j8 != -1) {
                        h = Math.min(j8, h);
                    }
                    this.K = h;
                    return h;
                }
                qi2.k("Shiro segment exceeds the configured limit");
                return j4;
            }
        } else {
            q41 b3 = b();
            this.B = b3;
            Long valueOf = Long.valueOf(j8);
            if (j8 == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                j = j7;
                long max = Math.max(tq6Var.e, tq6Var.f);
                if (longValue <= Long.MAX_VALUE - max) {
                    j10 = max + longValue;
                }
                j2 = j10;
            } else {
                j = j7;
                j2 = -1;
            }
            u41 a3 = v41Var.a();
            a3.g = j2;
            kd4 kd4Var3 = (kd4) b3;
            long h2 = kd4Var3.h(a3.a());
            Uri y2 = kd4Var3.y();
            if (y2 == null) {
                uri.getClass();
            } else {
                uri = y2;
            }
            this.C = uri;
            Map s2 = kd4Var3.s();
            s2.getClass();
            this.D = s2;
            byte[] f = f(b3, Math.max(tq6Var.e, tq6Var.f) + 1);
            go5 a4 = a(f);
            boolean z = a4.b;
            int i = a4.a;
            concurrentHashMap.put(uri2, a4);
            this.I = a4;
            if (f.length <= i) {
                C0 = new byte[0];
            } else {
                C0 = ms.C0(f, i, f.length);
                if (z) {
                    int length = C0.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        C0[i2] = (byte) (bArr[(int) (i2 % bArr.length)] ^ C0[i2]);
                    }
                }
            }
            this.G = C0;
            if (z) {
                j3 = C0.length % bArr.length;
            } else {
                j3 = 0;
            }
            this.J = j3;
            this.K = j8;
            if (h2 != -1) {
                long j12 = h2 - i;
                if (j12 < 0) {
                    j12 = 0;
                }
                if (j12 <= j) {
                    if (j8 != -1) {
                        j12 = Math.min(j8, j12);
                    }
                    this.K = j12;
                    return j12;
                }
                qi2.k("Shiro segment exceeds the configured limit");
                return 0L;
            }
        }
        return j8;
    }

    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        long c;
        v41Var.getClass();
        Uri uri = v41Var.a;
        if (!this.M) {
            uri.getClass();
            if (this.y.a(uri.getScheme(), uri.getHost())) {
                this.C = uri;
                this.L = v41Var.f;
                try {
                    String path = uri.getPath();
                    if (path != null && b06.A(path, ".m3u8", true)) {
                        c = d(v41Var);
                    } else {
                        String path2 = uri.getPath();
                        if (path2 != null && (b06.A(path2, ".png", true) || b06.A(path2, ".webp", true))) {
                            c = e(v41Var);
                        } else {
                            c = c(v41Var);
                        }
                    }
                    this.M = true;
                    return c;
                } catch (Exception e) {
                    q41 q41Var = this.B;
                    this.B = null;
                    if (q41Var != null) {
                        try {
                            q41Var.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw e;
                }
            }
            qi2.k("Blocked Shiro resource host");
            return 0L;
        }
        ze0.m("Shiro data source is already open");
        return 0L;
    }

    public final int m() {
        long j = this.K;
        if (j == -1) {
            return Integer.MAX_VALUE;
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return (int) j;
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        bArr.getClass();
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.E;
        if (bArr2 != null) {
            int i5 = this.F;
            if (i5 < bArr2.length && this.K != 0) {
                int min = Math.min(i2, Math.min(bArr2.length - i5, m()));
                int i6 = this.F;
                ms.v0(i, i6, i6 + min, bArr2, bArr);
                this.F += min;
                long j = this.K;
                if (j != -1) {
                    this.K = j - min;
                }
                return min;
            }
        } else if (this.K != 0) {
            int i7 = this.H;
            byte[] bArr3 = this.G;
            int length = bArr3.length;
            tq6 tq6Var = this.y;
            if (i7 < length) {
                int min2 = Math.min(i2, Math.min(bArr3.length - i7, m()));
                byte[] bArr4 = this.G;
                int i8 = this.H;
                ms.v0(i, i8, i8 + min2, bArr4, bArr);
                this.H += min2;
                long j2 = this.K;
                if (j2 != -1) {
                    this.K = j2 - min2;
                }
                long j3 = this.L + min2;
                this.L = j3;
                if (j3 <= tq6Var.d) {
                    return min2;
                }
                qi2.k("Shiro segment exceeds the configured limit");
                return 0;
            }
            q41 q41Var = this.B;
            if (q41Var != null) {
                int read = q41Var.read(bArr, i, Math.min(i2, m()));
                if (read != -1) {
                    go5 go5Var = this.I;
                    if (go5Var != null && go5Var.b) {
                        long j4 = this.J;
                        byte[] bArr5 = tq6Var.b;
                        int i9 = 0;
                        while (i9 < read) {
                            int i10 = i4;
                            byte[] bArr6 = bArr5;
                            int length2 = (int) ((i9 + j4) % bArr5.length);
                            int i11 = i + i9;
                            bArr[i11] = (byte) (bArr6[length2] ^ bArr[i11]);
                            i9++;
                            bArr5 = bArr6;
                            i4 = i10;
                        }
                        i3 = i4;
                        this.J += read;
                    } else {
                        i3 = 0;
                    }
                    long j5 = this.K;
                    if (j5 != -1) {
                        this.K = j5 - read;
                    }
                    long j6 = this.L + read;
                    this.L = j6;
                    if (j6 > tq6Var.d) {
                        qi2.k("Shiro segment exceeds the configured limit");
                        return i3;
                    }
                }
                return read;
            }
        }
        return -1;
    }

    @Override // defpackage.q41
    public final Map s() {
        return this.D;
    }

    @Override // defpackage.q41
    public final Uri y() {
        Uri y;
        q41 q41Var = this.B;
        if (q41Var != null && (y = q41Var.y()) != null) {
            return y;
        }
        return this.C;
    }

    @Override // defpackage.q41
    public final void z(n71 n71Var) {
        n71Var.getClass();
        ArrayList arrayList = this.A;
        if (!arrayList.contains(n71Var)) {
            arrayList.add(n71Var);
        }
        q41 q41Var = this.B;
        if (q41Var != null) {
            q41Var.z(n71Var);
        }
    }
}
