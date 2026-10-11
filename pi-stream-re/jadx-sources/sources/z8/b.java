package z8;

import com.bumptech.glide.c;
import com.google.android.gms.common.api.f;
import g0.f1;
import java.io.Closeable;
import java.io.IOException;
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
import k9.g;
import k9.i;
import k9.w;
import o7.d;
import r6.h0;
import y8.d0;
import y8.e0;
import y8.j;
import y8.o;
import y8.q;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f12133a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f12134b = j.q(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f12135c;

    /* renamed from: d, reason: collision with root package name */
    public static final k9.o f12136d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f12137e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f12138f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f12139g;

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b1, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.b.<clinit>():void");
    }

    public static final boolean a(q qVar, q qVar2) {
        h0.u(qVar, "<this>");
        h0.u(qVar2, "other");
        if (h0.g(qVar.f11783d, qVar2.f11783d) && qVar.f11784e == qVar2.f11784e && h0.g(qVar.f11780a, qVar2.f11780a)) {
            return true;
        }
        return false;
    }

    public static final int b(long j4, TimeUnit timeUnit) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (j4 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (timeUnit != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                long millis = timeUnit.toMillis(j4);
                if (millis <= 2147483647L) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (millis == 0 && j4 > 0) {
                        z12 = false;
                    }
                    if (z12) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException("timeout".concat(" too small.").toString());
                }
                throw new IllegalArgumentException("timeout".concat(" too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException("timeout".concat(" < 0").toString());
    }

    public static final void c(Closeable closeable) {
        h0.u(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (h0.g(e11.getMessage(), "bio == null")) {
            } else {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c6, int i10, int i11) {
        h0.u(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c6) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int f(String str, int i10, int i11, String str2) {
        h0.u(str, "<this>");
        while (i10 < i11) {
            boolean z9 = false;
            if (o7.j.p1(str2, str.charAt(i10), 0, false, 2) >= 0) {
                z9 = true;
            }
            if (z9) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final boolean g(w wVar, TimeUnit timeUnit) {
        h0.u(wVar, "<this>");
        h0.u(timeUnit, "timeUnit");
        try {
            return t(wVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String str, Object... objArr) {
        h0.u(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        h0.s(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        boolean z9;
        boolean z10;
        h0.u(strArr, "<this>");
        if (strArr.length == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && strArr2 != null) {
            if (strArr2.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                for (String str : strArr) {
                    f1 f1Var = new f1(strArr2);
                    while (f1Var.hasNext()) {
                        if (comparator.compare(str, (String) f1Var.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long j(d0 d0Var) {
        String b10 = d0Var.f11696f.b("Content-Length");
        if (b10 != null) {
            try {
                return Long.parseLong(b10);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    public static final List k(Object... objArr) {
        h0.u(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(c.M(Arrays.copyOf(objArr2, objArr2.length)));
        h0.s(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (h0.B(charAt, 31) <= 0 || h0.B(charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int m(int i10, int i11, String str) {
        boolean z9;
        boolean z10;
        boolean z11;
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            boolean z12 = true;
            if (charAt == '\t' || charAt == '\n') {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 || charAt == '\f') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || charAt == '\r') {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && charAt != ' ') {
                z12 = false;
            }
            if (!z12) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int n(int i10, int i11, String str) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char charAt = str.charAt(i12);
                boolean z12 = false;
                if (charAt == '\t' || charAt == '\n') {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 || charAt == '\f') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || charAt == '\r') {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 || charAt == ' ') {
                    z12 = true;
                }
                if (!z12) {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        h0.u(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        h0.u(str, "name");
        if (!o7.j.l1(str, "Authorization") && !o7.j.l1(str, "Cookie") && !o7.j.l1(str, "Proxy-Authorization") && !o7.j.l1(str, "Set-Cookie")) {
            return false;
        }
        return true;
    }

    public static final int q(char c6) {
        if ('0' <= c6 && c6 < ':') {
            return c6 - '0';
        }
        char c10 = 'a';
        if (!('a' <= c6 && c6 < 'g')) {
            c10 = 'A';
            if (!('A' <= c6 && c6 < 'G')) {
                return -1;
            }
        }
        return (c6 - c10) + 10;
    }

    public static final Charset r(i iVar, Charset charset) {
        Charset charset2;
        h0.u(iVar, "<this>");
        h0.u(charset, "default");
        int s9 = iVar.s(f12136d);
        if (s9 != -1) {
            if (s9 != 0) {
                if (s9 != 1) {
                    if (s9 != 2) {
                        if (s9 != 3) {
                            if (s9 == 4) {
                                Charset charset3 = o7.a.f8311a;
                                charset2 = o7.a.f8312b;
                                if (charset2 == null) {
                                    charset2 = Charset.forName("UTF-32LE");
                                    h0.s(charset2, "forName(...)");
                                    o7.a.f8312b = charset2;
                                }
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            Charset charset4 = o7.a.f8311a;
                            charset2 = o7.a.f8313c;
                            if (charset2 == null) {
                                charset2 = Charset.forName("UTF-32BE");
                                h0.s(charset2, "forName(...)");
                                o7.a.f8313c = charset2;
                            }
                        }
                        return charset2;
                    }
                    Charset charset5 = StandardCharsets.UTF_16LE;
                    h0.s(charset5, "UTF_16LE");
                    return charset5;
                }
                Charset charset6 = StandardCharsets.UTF_16BE;
                h0.s(charset6, "UTF_16BE");
                return charset6;
            }
            Charset charset7 = StandardCharsets.UTF_8;
            h0.s(charset7, "UTF_8");
            return charset7;
        }
        return charset;
    }

    public static final int s(i iVar) {
        h0.u(iVar, "<this>");
        return (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
    }

    public static final boolean t(w wVar, int i10, TimeUnit timeUnit) {
        long j4;
        h0.u(wVar, "<this>");
        h0.u(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (wVar.c().e()) {
            j4 = wVar.c().c() - nanoTime;
        } else {
            j4 = Long.MAX_VALUE;
        }
        wVar.c().d(Math.min(j4, timeUnit.toNanos(i10)) + nanoTime);
        try {
            g gVar = new g();
            while (wVar.z(gVar, 8192L) != -1) {
                gVar.a();
            }
            if (j4 == Long.MAX_VALUE) {
                wVar.c().a();
            } else {
                wVar.c().d(nanoTime + j4);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j4 == Long.MAX_VALUE) {
                wVar.c().a();
            } else {
                wVar.c().d(nanoTime + j4);
            }
            return false;
        } catch (Throwable th) {
            if (j4 == Long.MAX_VALUE) {
                wVar.c().a();
            } else {
                wVar.c().d(nanoTime + j4);
            }
            throw th;
        }
    }

    public static final o u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f9.c cVar = (f9.c) it.next();
            String j4 = cVar.f4002a.j();
            String j10 = cVar.f4003b.j();
            arrayList.add(j4);
            arrayList.add(o7.j.G1(j10).toString());
        }
        return new o((String[]) arrayList.toArray(new String[0]));
    }

    public static final String v(q qVar, boolean z9) {
        h0.u(qVar, "<this>");
        String str = qVar.f11783d;
        if (o7.j.j1(str, ":")) {
            str = "[" + str + ']';
        }
        int i10 = qVar.f11784e;
        if (!z9) {
            char[] cArr = q.f11779k;
            if (i10 == j.h(qVar.f11780a)) {
                return str;
            }
        }
        return str + ':' + i10;
    }

    public static final List w(List list) {
        h0.u(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        h0.s(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int x(int i10, String str) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return f.API_PRIORITY_OTHER;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        return i10;
    }

    public static final String y(int i10, int i11, String str) {
        int m5 = m(i10, i11, str);
        String substring = str.substring(m5, n(m5, i11, str));
        h0.s(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void z(IOException iOException, List list) {
        h0.u(iOException, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.bumptech.glide.d.a(iOException, (Exception) it.next());
        }
    }
}
