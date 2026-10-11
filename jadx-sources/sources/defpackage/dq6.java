package defpackage;

import com.unity3d.services.core.network.model.HttpRequest;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class dq6 {
    public static final byte[] a;
    public static final ik2 b = z51.y(new String[0]);
    public static final s45 c;
    public static final lg4 d;
    public static final TimeZone e;
    public static final c15 f;
    public static final String g;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f1, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, pa0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, pa0] */
    static {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq6.<clinit>():void");
    }

    public static final boolean a(ws2 ws2Var, ws2 ws2Var2) {
        ws2Var.getClass();
        if (a34.i(ws2Var.d, ws2Var2.d) && ws2Var.e == ws2Var2.e && a34.i(ws2Var.a, ws2Var2.a)) {
            return true;
        }
        return false;
    }

    public static final int b(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    if (millis == 0 && j > 0) {
                        ze0.e("timeout too small.");
                        return 0;
                    }
                    return (int) millis;
                }
                ze0.e("timeout too large.");
                return 0;
            }
            ze0.m("unit == null");
            return 0;
        }
        p65.f("timeout < 0");
        return 0;
    }

    public static final void c(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (a34.i(e3.getMessage(), "bio == null")) {
            } else {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int g(String str, String str2, int i, int i2) {
        while (i < i2) {
            if (uz5.N(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final String h(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0034, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean i(java.lang.String[] r7, java.lang.String[] r8, java.util.Comparator r9) {
        /*
            r7.getClass()
            int r0 = r7.length
            r1 = 0
            if (r0 != 0) goto L8
            goto L37
        L8:
            if (r8 == 0) goto L37
            int r0 = r8.length
            if (r0 != 0) goto Le
            goto L37
        Le:
            int r0 = r7.length
            r2 = r1
        L10:
            if (r2 >= r0) goto L37
            r3 = r7[r2]
            r4 = r1
        L15:
            int r5 = r8.length
            r6 = 1
            if (r4 >= r5) goto L1b
            r5 = r6
            goto L1c
        L1b:
            r5 = r1
        L1c:
            if (r5 == 0) goto L34
            int r5 = r4 + 1
            r4 = r8[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2b
            int r4 = r9.compare(r3, r4)
            if (r4 != 0) goto L29
            return r6
        L29:
            r4 = r5
            goto L15
        L2b:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            defpackage.p65.h(r7)
            return r1
        L34:
            int r2 = r2 + 1
            goto L10
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq6.i(java.lang.String[], java.lang.String[], java.util.Comparator):boolean");
    }

    public static final long j(p45 p45Var) {
        String b2 = p45Var.C.b("Content-Length");
        if (b2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(b2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(te4.I(Arrays.copyOf(objArr2, objArr2.length)));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (a34.D(charAt, 31) <= 0 || a34.D(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                i++;
            } else {
                return i;
            }
        }
        return i2;
    }

    public static final int n(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        str.getClass();
        if (!str.equalsIgnoreCase("Authorization") && !str.equalsIgnoreCase("Cookie") && !str.equalsIgnoreCase("Proxy-Authorization") && !str.equalsIgnoreCase("Set-Cookie")) {
            return false;
        }
        return true;
    }

    public static final int q(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        return -1;
    }

    public static final Charset r(db0 db0Var, Charset charset) {
        db0Var.getClass();
        charset.getClass();
        int F = db0Var.F(d);
        if (F != -1) {
            if (F != 0) {
                if (F != 1) {
                    if (F != 2) {
                        if (F != 3) {
                            if (F == 4) {
                                Charset charset2 = kl0.a;
                                Charset charset3 = kl0.c;
                                if (charset3 == null) {
                                    Charset forName = Charset.forName("UTF-32LE");
                                    forName.getClass();
                                    kl0.c = forName;
                                    return forName;
                                }
                                return charset3;
                            }
                            p65.o();
                            return null;
                        }
                        Charset charset4 = kl0.a;
                        Charset charset5 = kl0.d;
                        if (charset5 == null) {
                            Charset forName2 = Charset.forName("UTF-32BE");
                            forName2.getClass();
                            kl0.d = forName2;
                            return forName2;
                        }
                        return charset5;
                    }
                    Charset charset6 = StandardCharsets.UTF_16LE;
                    charset6.getClass();
                    return charset6;
                }
                Charset charset7 = StandardCharsets.UTF_16BE;
                charset7.getClass();
                return charset7;
            }
            Charset charset8 = StandardCharsets.UTF_8;
            charset8.getClass();
            return charset8;
        }
        return charset;
    }

    public static final int s(db0 db0Var) {
        return (db0Var.readByte() & 255) | ((db0Var.readByte() & 255) << 16) | ((db0Var.readByte() & 255) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, pa0] */
    public static final boolean t(bv5 bv5Var, int i) {
        long j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        if (bv5Var.d().e()) {
            j = bv5Var.d().c() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        bv5Var.d().d(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            ?? obj = new Object();
            while (bv5Var.j0(8192L, obj) != -1) {
                obj.skip(obj.y);
            }
            if (j == Long.MAX_VALUE) {
                bv5Var.d().a();
                return true;
            }
            bv5Var.d().d(nanoTime + j);
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                bv5Var.d().a();
                return false;
            }
            bv5Var.d().d(nanoTime + j);
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                bv5Var.d().a();
            } else {
                bv5Var.d().d(nanoTime + j);
            }
            throw th;
        }
    }

    public static final ik2 u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ak2 ak2Var = (ak2) it.next();
            zd0 zd0Var = ak2Var.a;
            zd0 zd0Var2 = ak2Var.b;
            String q = zd0Var.q();
            String q2 = zd0Var2.q();
            arrayList.add(q);
            arrayList.add(uz5.w0(q2).toString());
        }
        return new ik2((String[]) arrayList.toArray(new String[0]));
    }

    public static final String v(ws2 ws2Var, boolean z) {
        int i;
        ws2Var.getClass();
        int i2 = ws2Var.e;
        String str = ws2Var.d;
        if (uz5.M(str, ":", false)) {
            str = qx1.g(']', "[", str);
        }
        if (!z) {
            String str2 = ws2Var.a;
            str2.getClass();
            if (str2.equals("http")) {
                i = 80;
            } else if (str2.equals(HttpRequest.DEFAULT_SCHEME)) {
                i = 443;
            } else {
                i = -1;
            }
            if (i2 == i) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final List w(List list) {
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final int x(int i, String str) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i;
    }
}
