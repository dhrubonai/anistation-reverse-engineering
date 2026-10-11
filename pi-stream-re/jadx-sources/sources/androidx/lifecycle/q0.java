package androidx.lifecycle;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.List;
import r6.n1;

/* loaded from: classes.dex */
public class q0 implements y0.b, b4.y, com.google.android.gms.common.internal.r, e0.i, f9.e0, h4.a, n4.e, o1.q, z6.h, t1.a, v3.j, x2.h, y1.r, y3.d, y8.b, y8.l, y8.m {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f1128a = new q0();

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f1129b = new q0();

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f1130c = new q0();

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f1131d = new q0();

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f1132e = new q0();

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q0 f1133f = new q0();

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ q0 f1134x = new q0();

    /* renamed from: y, reason: collision with root package name */
    public static final q0 f1135y = new q0();

    /* renamed from: z, reason: collision with root package name */
    public static final q0 f1136z = new q0();
    public static final /* synthetic */ q0 A = new q0();

    public q0() {
    }

    public static long A(f1.r rVar) {
        boolean z9;
        Throwable th = (IOException) rVar.f3849d;
        if (!(th instanceof c1.r0) && !(th instanceof FileNotFoundException) && !(th instanceof h1.v) && !(th instanceof z1.n)) {
            int i10 = h1.i.f4582b;
            while (true) {
                if (th != null) {
                    if ((th instanceof h1.i) && ((h1.i) th).f4583a == 2008) {
                        z9 = true;
                        break;
                    }
                    th = th.getCause();
                } else {
                    z9 = false;
                    break;
                }
            }
            if (!z9) {
                return Math.min((rVar.f3846a - 1) * 1000, 5000);
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static y8.c C(y8.o r27) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.q0.C(y8.o):y8.c");
    }

    public static final y8.g u(q0 q0Var, String str) {
        y8.g gVar = new y8.g(str);
        y8.g.f11713d.put(str, gVar);
        return gVar;
    }

    public static z1.i y(z1.h hVar, f1.r rVar) {
        boolean z9;
        int i10;
        IOException iOException = (IOException) rVar.f3849d;
        if (!(iOException instanceof h1.y) || ((i10 = ((h1.y) iOException).f4644d) != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return null;
        }
        if (hVar.a(1)) {
            return new z1.i(1, 300000L);
        }
        if (!hVar.a(2)) {
            return null;
        }
        return new z1.i(2, 60000L);
    }

    public List B(String str) {
        r6.h0.u(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            r6.h0.s(allByName, "getAllByName(hostname)");
            return x6.i.o1(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }

    public boolean D(c1.v vVar) {
        String str = vVar.f1935m;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // o1.q
    public /* synthetic */ void a() {
    }

    @Override // y3.d
    public Bitmap b(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // y3.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // o1.q
    public void d(Looper looper, k1.i0 i0Var) {
    }

    @Override // v3.j
    public void e(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // h4.a
    public x3.e0 f(x3.e0 e0Var, v3.l lVar) {
        return e0Var;
    }

    @Override // x2.h
    public d2.b0 g() {
        return new d2.u(-9223372036854775807L);
    }

    @Override // e0.i
    public int h(CharSequence charSequence, int i10) {
        int i11 = i10 + 0;
        int i12 = 2;
        for (int i13 = 0; i13 < i11 && i12 == 2; i13++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i13));
            e0.k kVar = e0.l.f3317a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i12 = 2;
                            break;
                    }
                }
                i12 = 0;
            }
            i12 = 1;
        }
        return i12;
    }

    @Override // y3.d
    public Bitmap i(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // b4.y
    public b4.x j(b4.c0 c0Var) {
        return b4.f0.f1457a;
    }

    @Override // o1.q
    public /* synthetic */ void k() {
    }

    @Override // o1.q
    public o1.k l(o1.n nVar, c1.v vVar) {
        if (vVar.f1937p == null) {
            return null;
        }
        return new o1.v(new o1.j(6001, new o1.g0()));
    }

    @Override // x2.h
    public long m(d2.q qVar) {
        return -1L;
    }

    @Override // com.google.android.gms.common.internal.r
    public /* bridge */ /* synthetic */ Object n(com.google.android.gms.common.api.s sVar) {
        return null;
    }

    @Override // o1.q
    public int o(c1.v vVar) {
        if (vVar.f1937p != null) {
            return 1;
        }
        return 0;
    }

    @Override // y3.d
    public void p(int i10) {
    }

    @Override // n4.e
    public n4.d q(v3.a aVar) {
        return n4.b.f8009a;
    }

    @Override // o1.q
    public /* synthetic */ o1.p r(o1.n nVar, c1.v vVar) {
        return o1.p.f8165l;
    }

    @Override // y3.d
    public void s() {
    }

    @Override // x2.h
    public void t(long j4) {
    }

    public r6.h0 v(c1.v vVar) {
        String str = vVar.f1935m;
        if (str != null) {
            str.hashCode();
            int i10 = 0;
            int i11 = 1;
            char c6 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c6 = 4;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    return new m2.b(i10);
                case 1:
                    return new p2.a();
                case 2:
                    return new q2.j(null);
                case 3:
                    return new m2.b(i11);
                case 4:
                    return new s2.c();
            }
        }
        throw new IllegalArgumentException(r.f.d("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public y1.s[] w(y1.q[] qVarArr, z1.c cVar) {
        y1.s bVar;
        n1 v9 = y1.b.v(qVarArr);
        y1.s[] sVarArr = new y1.s[qVarArr.length];
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            y1.q qVar = qVarArr[i10];
            if (qVar != null) {
                int[] iArr = qVar.f11525b;
                if (iArr.length != 0) {
                    if (iArr.length == 1) {
                        bVar = new y1.t(iArr[0], qVar.f11526c, qVar.f11524a);
                    } else {
                        long j4 = 25000;
                        bVar = new y1.b(qVar.f11524a, iArr, qVar.f11526c, cVar, 10000, j4, j4, 1279, 719, 0.7f, 0.75f, (r6.o0) v9.get(i10), f1.a.f3794a);
                    }
                    sVarArr[i10] = bVar;
                }
            }
        }
        return sVarArr;
    }

    public synchronized y8.g x(String str) {
        y8.g gVar;
        String str2;
        r6.h0.u(str, "javaName");
        LinkedHashMap linkedHashMap = y8.g.f11713d;
        gVar = (y8.g) linkedHashMap.get(str);
        if (gVar == null) {
            if (o7.j.C1(str, "TLS_", false)) {
                String substring = str.substring(4);
                r6.h0.s(substring, "this as java.lang.String).substring(startIndex)");
                str2 = "SSL_".concat(substring);
            } else if (o7.j.C1(str, "SSL_", false)) {
                String substring2 = str.substring(4);
                r6.h0.s(substring2, "this as java.lang.String).substring(startIndex)");
                str2 = "TLS_".concat(substring2);
            } else {
                str2 = str;
            }
            gVar = (y8.g) linkedHashMap.get(str2);
            if (gVar == null) {
                gVar = new y8.g(str);
            }
            linkedHashMap.put(str, gVar);
        }
        return gVar;
    }

    public int z(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    public /* synthetic */ q0(int i10) {
    }

    public q0(View view, int i10, String str) {
    }
}
