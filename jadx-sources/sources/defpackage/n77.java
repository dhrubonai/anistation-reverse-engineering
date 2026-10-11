package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.EdgeEffect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.work.impl.WorkDatabase;
import com.anistation.android.R;
import com.anistation.model.watch.shiro.ShiroPlaybackPlan;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class n77 {
    public static final sr a = new sr(0);
    public static final sr b = new sr(1);
    public static final os0 c = new os0(-1571120048, false, new Object());
    public static final os0 d = new os0(-1455401925, false, new ps0(8));
    public static final w11 e = w11.x;
    public static final Object f = new Object();
    public static Thread g;
    public static volatile Handler h;

    public static final Long A(wq2 wq2Var) {
        wq2Var.getClass();
        String str = wq2Var.a().get("Content-Length");
        if (str != null) {
            return b06.L(str);
        }
        return null;
    }

    public static final jz0 B(or2 or2Var) {
        or2Var.getClass();
        String r = or2Var.c.r("Content-Type");
        if (r != null) {
            jz0 jz0Var = jz0.e;
            return io3.X(r);
        }
        return null;
    }

    public static final void C(int i, int i2) {
        if (i <= i2) {
            return;
        }
        ze0.g(qx1.l("toIndex (", i, ") is greater than size (", i2, ")."));
    }

    public static f94 D(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e2) {
                xk3 d2 = xk3.d();
                String str = f94.b;
                d2.h(f94.b, qx1.i(i, "Ignoring adding capability '", "'"), e2);
            }
        }
        int[] iArr3 = te4.h;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr3[i2];
            if (!ms.r0(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e3) {
                    xk3 d3 = xk3.d();
                    String str2 = f94.b;
                    d3.h(f94.b, qx1.i(i3, "Ignoring removing default capability '", "'"), e3);
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return new f94(build);
    }

    public static final l77 E(Context context, pv0 pv0Var) {
        context.getClass();
        o77 o77Var = new o77(pv0Var.c);
        d77 d77Var = WorkDatabase.Companion;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ej5 ej5Var = o77Var.a;
        ej5Var.getClass();
        xb5 xb5Var = pv0Var.d;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        d77Var.getClass();
        WorkDatabase a2 = d77.a(applicationContext, ej5Var, xb5Var, z);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        kh6 kh6Var = new kh6(applicationContext2, o77Var);
        pu4 pu4Var = new pu4(context.getApplicationContext(), pv0Var, o77Var, a2);
        return new l77(context.getApplicationContext(), pv0Var, o77Var, a2, (List) m77.x.invoke(context, pv0Var, o77Var, a2, kh6Var, pu4Var), pu4Var, kh6Var);
    }

    public static byte[] F(int i, String str) {
        Object y45Var;
        try {
            y45Var = Base64.getUrlDecoder().decode(str);
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (z45.b(y45Var) != null) {
            try {
                y45Var = Base64.getDecoder().decode(str);
            } catch (Throwable th2) {
                y45Var = new y45(th2);
            }
        }
        if (y45Var instanceof y45) {
            y45Var = null;
        }
        byte[] bArr = (byte[]) y45Var;
        if (bArr == null || bArr.length != i) {
            return null;
        }
        return bArr;
    }

    public static final void G(uf3 uf3Var) {
        vc6 vc6Var = uf3Var.e;
        if (vc6Var != null) {
            uf3Var.v.invoke(mc6.a((mc6) uf3Var.d.y, null, 0L, 3));
            sc6 sc6Var = vc6Var.a;
            AtomicReference atomicReference = sc6Var.b;
            while (true) {
                if (atomicReference.compareAndSet(vc6Var, null)) {
                    sc6Var.a.d();
                    break;
                } else if (atomicReference.get() != vc6Var) {
                    break;
                }
            }
        }
        uf3Var.e = null;
    }

    public static String H(ShiroPlaybackPlan shiroPlaybackPlan) {
        Object y45Var;
        boolean z;
        if (shiroPlaybackPlan == null) {
            return null;
        }
        String fallbackUrl = shiroPlaybackPlan.getFallbackUrl();
        try {
            URI uri = new URI(fallbackUrl);
            String host = uri.getHost();
            boolean z2 = false;
            if (host != null) {
                boolean C = b06.C(uri.getScheme(), HttpRequest.DEFAULT_SCHEME, true);
                if (b06.C(uri.getScheme(), "http", true) && L(host)) {
                    z = true;
                } else {
                    z = false;
                }
                if (uri.getRawUserInfo() == null && (C || z)) {
                    z2 = true;
                }
            }
            y45Var = Boolean.valueOf(z2);
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        Object obj = Boolean.FALSE;
        if (y45Var instanceof y45) {
            y45Var = obj;
        }
        if (!((Boolean) y45Var).booleanValue()) {
            return null;
        }
        return fallbackUrl;
    }

    public static dx3 I(String str) {
        str.getClass();
        Matcher matcher = dx3.c.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            group.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            group.toLowerCase(locale).getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            group2.toLowerCase(locale).getClass();
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = dx3.d.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group3 = matcher2.group(1);
                    if (group3 == null) {
                        end = matcher2.end();
                    } else {
                        String group4 = matcher2.group(2);
                        if (group4 == null) {
                            group4 = matcher2.group(3);
                        } else if (b06.I(group4, "'", false) && b06.A(group4, "'", false) && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                        }
                        arrayList.add(group3);
                        arrayList.add(group4);
                        end = matcher2.end();
                    }
                } else {
                    throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"').toString());
                }
            }
            return new dx3(str, (String[]) arrayList.toArray(new String[0]));
        }
        ze0.e(qx1.g('\"', "No subtype found for: \"", str));
        return null;
    }

    public static final Paint J(ad adVar) {
        if (adVar == null) {
            dz2.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + z05.a(adVar.getClass()).e());
        }
        return (Paint) adVar.z;
    }

    public static yz3 K(yz3 yz3Var, yc5 yc5Var, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return f0(yz3Var, yc5Var, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e8, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean L(java.lang.String r7) {
        /*
            java.lang.String r0 = "localhost"
            boolean r0 = r7.equalsIgnoreCase(r0)
            r1 = 1
            if (r0 == 0) goto Lb
            goto Le7
        Lb:
            int r0 = r7.length()
            r2 = 2
            r3 = 0
            if (r0 < r2) goto L2d
            java.lang.String r0 = "["
            boolean r0 = defpackage.uz5.j0(r7, r0, r3)
            if (r0 == 0) goto L2d
            java.lang.String r0 = "]"
            boolean r0 = defpackage.uz5.O(r7, r0)
            if (r0 == 0) goto L2d
            int r0 = r7.length()
            int r0 = r0 - r1
            java.lang.String r0 = r7.substring(r1, r0)
            goto L2e
        L2d:
            r0 = r7
        L2e:
            java.lang.String r2 = "::1"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L38
            goto Le7
        L38:
            char[] r0 = new char[r1]
            r2 = 46
            r0[r3] = r2
            r2 = 6
            java.util.List r7 = defpackage.uz5.h0(r7, r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r4 = defpackage.zo0.V(r7, r2)
            r0.<init>(r4)
            java.util.Iterator r7 = r7.iterator()
        L52:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r7.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r4 = defpackage.b06.K(r4)
            if (r4 == 0) goto Le8
            r0.add(r4)
            goto L52
        L68:
            int r7 = r0.size()
            r4 = 4
            if (r7 != r4) goto Le8
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L76
            goto L90
        L76:
            int r7 = r0.size()
            r4 = r3
        L7b:
            if (r4 >= r7) goto L90
            java.lang.Object r5 = r0.get(r4)
            int r4 = r4 + 1
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 < 0) goto Le8
            r6 = 256(0x100, float:3.59E-43)
            if (r5 >= r6) goto Le8
            goto L7b
        L90:
            java.lang.Object r7 = r0.get(r3)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 == r2) goto Le7
            java.lang.Object r7 = r0.get(r3)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = 127(0x7f, float:1.78E-43)
            if (r7 == r2) goto Le7
            java.lang.Object r7 = r0.get(r3)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = 172(0xac, float:2.41E-43)
            if (r7 != r2) goto Lcb
            java.lang.Object r7 = r0.get(r1)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = 16
            if (r2 > r7) goto Lcb
            r2 = 32
            if (r7 >= r2) goto Lcb
            goto Le7
        Lcb:
            java.lang.Object r7 = r0.get(r3)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r2 = 192(0xc0, float:2.69E-43)
            if (r7 != r2) goto Le8
            java.lang.Object r7 = r0.get(r1)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r0 = 168(0xa8, float:2.35E-43)
            if (r7 != r0) goto Le8
        Le7:
            return r1
        Le8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n77.L(java.lang.String):boolean");
    }

    public static final void M(uf3 uf3Var, mc6 mc6Var, h12 h12Var) {
        ub2 ub2Var;
        ft5 b2 = et5.b();
        if (b2 != null) {
            ub2Var = b2.e();
        } else {
            ub2Var = null;
        }
        ub2 ub2Var2 = ub2Var;
        ft5 e2 = et5.e(b2);
        try {
            cd6 d2 = uf3Var.d();
            if (d2 == null) {
                return;
            }
            vc6 vc6Var = uf3Var.e;
            if (vc6Var == null) {
                return;
            }
            ha3 c2 = uf3Var.c();
            if (c2 == null) {
                return;
            }
            ct5.k(mc6Var, uf3Var.a, d2.a, c2, vc6Var, uf3Var.b(), h12Var);
        } finally {
            et5.k(b2, e2, ub2Var2);
        }
    }

    public static final yz3 N(yz3 yz3Var, ub2 ub2Var) {
        return yz3Var.w(new i83(ub2Var, null));
    }

    public static final yz3 O(yz3 yz3Var, ub2 ub2Var) {
        return yz3Var.w(new i83(null, ub2Var));
    }

    public static final long P(int i, int i2, boolean z, boolean z2) {
        long j;
        long j2 = i;
        long j3 = i2 & 2147483647L;
        if (z) {
            j = (j2 << 32) | Long.MIN_VALUE;
        } else {
            j = (j2 << 32) & Long.MAX_VALUE;
        }
        if (z2) {
            j3 |= 2147483648L;
        }
        return j3 | j;
    }

    public static final yz3 Q(yz3 yz3Var, th4 th4Var) {
        return yz3Var.w(new uh4(th4Var));
    }

    public static final yz3 R(yz3 yz3Var, float f2) {
        return yz3Var.w(new rh4(f2, f2, f2, f2));
    }

    public static final yz3 S(yz3 yz3Var, float f2, float f3) {
        return yz3Var.w(new rh4(f2, f3, f2, f3));
    }

    public static yz3 T(yz3 yz3Var, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        return S(yz3Var, f2, f3);
    }

    public static final yz3 U(yz3 yz3Var, float f2, float f3, float f4, float f5) {
        return yz3Var.w(new rh4(f2, f3, f4, f5));
    }

    public static yz3 V(yz3 yz3Var, float f2, float f3, float f4, float f5, int i) {
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i & 8) != 0) {
            f5 = 0.0f;
        }
        return U(yz3Var, f2, f3, f4, f5);
    }

    public static dx3 W(String str) {
        str.getClass();
        try {
            return I(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [su4, nj0, s0] */
    public static su4 X(v11 v11Var, r11 r11Var, ic2 ic2Var, int i) {
        l11 l11Var = r11Var;
        if ((i & 1) != 0) {
            l11Var = it1.x;
        }
        ?? nj0Var = new nj0(bx7.E(v11Var, l11Var), iv.d(0, 4, ta0.x), true, true);
        nj0Var.i0(y11.x, nj0Var, ic2Var);
        return nj0Var;
    }

    public static final List Y(m85 m85Var) {
        int n = kb0.n(m85Var, "id");
        int n2 = kb0.n(m85Var, "seq");
        int n3 = kb0.n(m85Var, "from");
        int n4 = kb0.n(m85Var, "to");
        ai3 y = te4.y();
        while (m85Var.p0()) {
            y.add(new aa2(m85Var.c0(n3), m85Var.c0(n4), (int) m85Var.getLong(n), (int) m85Var.getLong(n2)));
        }
        return yo0.B0(te4.r(y));
    }

    public static final u66 Z(g85 g85Var, String str, boolean z) {
        String str2;
        m85 s0 = g85Var.s0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int n = kb0.n(s0, "seqno");
            int n2 = kb0.n(s0, "cid");
            int n3 = kb0.n(s0, MediationMetaData.KEY_NAME);
            int n4 = kb0.n(s0, "desc");
            if (n != -1 && n2 != -1 && n3 != -1 && n4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (s0.p0()) {
                    if (((int) s0.getLong(n2)) >= 0) {
                        int i = (int) s0.getLong(n);
                        String c0 = s0.c0(n3);
                        if (s0.getLong(n4) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        linkedHashMap.put(Integer.valueOf(i), c0);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List C0 = yo0.C0(linkedHashMap.entrySet(), new k82((byte) 27));
                ArrayList arrayList = new ArrayList(zo0.V(C0, 10));
                Iterator it = C0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List I0 = yo0.I0(arrayList);
                List C02 = yo0.C0(linkedHashMap2.entrySet(), new k82((byte) 28));
                ArrayList arrayList2 = new ArrayList(zo0.V(C02, 10));
                Iterator it2 = C02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                u66 u66Var = new u66(str, z, I0, yo0.I0(arrayList2));
                o80.r(s0, null);
                return u66Var;
            }
            o80.r(s0, null);
            return null;
        } finally {
        }
    }

    public static final void a(final boolean z, final sb2 sb2Var, final boolean z2, final ko4 ko4Var, final String str, final String str2, final String str3, final String str4, final sb2 sb2Var2, yz3 yz3Var, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        final yz3 yz3Var2;
        int i11;
        float f2;
        ko4 ko4Var2 = ko4Var;
        sb2Var.getClass();
        ko4Var2.getClass();
        sb2Var2.getClass();
        kd2Var.f0(1881205525);
        if (kd2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i12 = i | i2;
        if (kd2Var.h(sb2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i13 = i12 | i3;
        if (kd2Var.g(z2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i14 = i13 | i4;
        if (kd2Var.h(ko4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i15 = i14 | i5;
        if (kd2Var.f(str)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i16 = i15 | i6;
        if (kd2Var.f(str2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i17 = i16 | i7;
        if (kd2Var.f(str3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i18 = i17 | i8;
        if (kd2Var.f(str4)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i19 = i18 | i9;
        if (kd2Var.h(sb2Var2)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i20 = i19 | i10 | 805306368;
        boolean z4 = false;
        if ((306783379 & i20) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i20 & 1, z3)) {
            if (!z) {
                zz4 u = kd2Var.u();
                if (u != null) {
                    u.d = new wv1(z, sb2Var, z2, ko4Var2, str, str2, str3, str4, sb2Var2, i);
                    return;
                }
                return;
            }
            boolean f3 = kd2Var.f(ko4Var2);
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (f3 || Q == obj) {
                Q = new qi4(ko4Var2.f());
                kd2Var.n0(Q);
            }
            final qi4 qi4Var = (qi4) Q;
            boolean f4 = kd2Var.f(ko4Var2);
            Object Q2 = kd2Var.Q();
            if (f4 || Q2 == obj) {
                Q2 = xt5.g(Boolean.valueOf(ko4Var2.H0()));
                kd2Var.n0(Q2);
            }
            final w44 w44Var = (w44) Q2;
            boolean f5 = kd2Var.f(ko4Var2);
            Object Q3 = kd2Var.Q();
            if (f5 || Q3 == obj) {
                Q3 = xt5.g(Boolean.valueOf(ko4Var2.l0()));
                kd2Var.n0(Q3);
            }
            w44 w44Var2 = (w44) Q3;
            int i21 = ko4Var2.getDeviceInfo().c;
            if (i21 < 1) {
                i11 = 1;
            } else {
                i11 = i21;
            }
            boolean f6 = kd2Var.f(qi4Var) | kd2Var.f(w44Var) | kd2Var.f(w44Var2) | kd2Var.h(ko4Var2);
            Object Q4 = kd2Var.Q();
            if (f6 || Q4 == obj) {
                Object gjVar = new gj((Object) ko4Var2, (Object) qi4Var, w44Var, w44Var2, (byte) 2);
                ko4Var2 = ko4Var2;
                kd2Var.n0(gjVar);
                Q4 = gjVar;
            }
            db.c(ko4Var2, (ub2) Q4, kd2Var);
            do5 f7 = rz3.f(z2, kd2Var, (i20 >> 6) & 14, 2);
            Configuration configuration = (Configuration) kd2Var.j(eb.a);
            float f8 = configuration.screenWidthDp;
            if (configuration.orientation == 2) {
                z4 = true;
            }
            WeakHashMap weakHashMap = z57.w;
            float a2 = sw0.h(mv5.b(kd2Var).e, kd2Var).a();
            Activity activity = (Activity) kd2Var.j(rj3.a);
            if (activity != null && activity.isInMultiWindowMode()) {
                a2 = 15.0f;
            }
            long j = ep0.h;
            long b2 = ep0.b(0.5f, ep0.b);
            ao2 ao2Var = io3.h;
            boolean z5 = z4;
            sz3 sz3Var = new sz3();
            if (z5) {
                f2 = f8 * 0.48f;
            } else {
                f2 = Float.NaN;
            }
            float f9 = f2;
            final float f10 = a2;
            final ko4 ko4Var3 = ko4Var2;
            final int i22 = i11;
            vz3 vz3Var = vz3.x;
            rz3.a(sb2Var, vz3Var, f7, f9, false, ao2Var, j, 0L, b2, null, new vs0((byte) 21), sz3Var, nx7.R(897791987, new jc2() { // from class: nh0
                @Override // defpackage.jc2
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    boolean z6;
                    kd2 kd2Var2 = (kd2) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    ((yp0) obj2).getClass();
                    if ((intValue & 17) != 16) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (kd2Var2.V(intValue & 1, z6)) {
                        yz3 U = n77.U(ar5.c(vz3.x, 1.0f), 15.0f, 12.0f, 15.0f, f10 + 8.0f);
                        long j2 = ((mp0) kd2Var2.j(op0.a)).p;
                        o75 o75Var = ((cn5) kd2Var2.j(dn5.a)).d;
                        final String str5 = str;
                        final String str6 = str2;
                        final String str7 = str3;
                        final String str8 = str4;
                        final int i23 = i22;
                        final ko4 ko4Var4 = ko4Var3;
                        final w44 w44Var3 = w44Var;
                        final qi4 qi4Var2 = qi4Var;
                        final sb2 sb2Var3 = sb2Var2;
                        final sb2 sb2Var4 = sb2Var;
                        l36.a(U, o75Var, j2, 0L, 0.0f, 0.0f, null, nx7.R(-1157419720, new ic2() { // from class: ph0
                            @Override // defpackage.ic2
                            public final Object invoke(Object obj5, Object obj6) {
                                boolean z7;
                                kd2 kd2Var3 = (kd2) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                if ((intValue2 & 3) != 2) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (kd2Var3.V(intValue2 & 1, z7)) {
                                    xp0 a3 = vp0.a(x97.z, pk2.K, kd2Var3, 0);
                                    int hashCode = Long.hashCode(kd2Var3.T);
                                    al4 l = kd2Var3.l();
                                    yz3 E = o80.E(kd2Var3, vz3.x);
                                    tt0.d.getClass();
                                    kd2Var3.h0();
                                    if (kd2Var3.S) {
                                        kd2Var3.k(za3.p0);
                                    } else {
                                        kd2Var3.q0();
                                    }
                                    ss5.i(p7.F, kd2Var3, a3);
                                    ss5.i(p7.E, kd2Var3, l);
                                    ss5.i(p7.G, kd2Var3, Integer.valueOf(hashCode));
                                    ss5.h(kd2Var3);
                                    ss5.i(p7.D, kd2Var3, E);
                                    b90.a(bx7.h(n03.k(ar5.e(ar5.l(n77.T(new tn2(pk2.L), 0.0f, 10.0f, 1), 40.0f), 5.0f), tm5.b), ((mp0) kd2Var3.j(op0.a)).r, io3.h), kd2Var3, 0);
                                    qi4 qi4Var3 = qi4Var2;
                                    int h2 = qi4Var3.h();
                                    w44 w44Var4 = w44Var3;
                                    boolean booleanValue = ((Boolean) w44Var4.getValue()).booleanValue();
                                    Object obj7 = ko4Var4;
                                    boolean h3 = kd2Var3.h(obj7) | kd2Var3.f(w44Var4);
                                    Object Q5 = kd2Var3.Q();
                                    Object obj8 = au0.a;
                                    if (h3 || Q5 == obj8) {
                                        Q5 = new n(obj7, w44Var4, (byte) 24);
                                        kd2Var3.n0(Q5);
                                    }
                                    sb2 sb2Var5 = (sb2) Q5;
                                    boolean f11 = kd2Var3.f(qi4Var3) | kd2Var3.h(obj7);
                                    Object Q6 = kd2Var3.Q();
                                    if (f11 || Q6 == obj8) {
                                        Q6 = new b0(obj7, qi4Var3, (byte) 22);
                                        kd2Var3.n0(Q6);
                                    }
                                    ub2 ub2Var = (ub2) Q6;
                                    Object obj9 = sb2Var3;
                                    boolean f12 = kd2Var3.f(obj9);
                                    Object obj10 = sb2Var4;
                                    boolean f13 = f12 | kd2Var3.f(obj10);
                                    Object Q7 = kd2Var3.Q();
                                    if (f13 || Q7 == obj8) {
                                        Q7 = new n(obj9, obj10, (byte) 25);
                                        kd2Var3.n0(Q7);
                                    }
                                    n77.b(str5, str6, str7, str8, h2, booleanValue, i23, sb2Var5, ub2Var, (sb2) Q7, null, kd2Var3, 0);
                                    kd2Var3.q(true);
                                } else {
                                    kd2Var3.Y();
                                }
                                return pn6.a;
                            }
                        }, kd2Var2), kd2Var2, 12582912, 120);
                    } else {
                        kd2Var2.Y();
                    }
                    return pn6.a;
                }
            }, kd2Var), kd2Var, ((i20 >> 3) & 14) | 807075888, CommonGatewayClient.CODE_400);
            yz3Var2 = vz3Var;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            u2.d = new ic2(z, sb2Var, z2, ko4Var, str, str2, str3, str4, sb2Var2, yz3Var2, i) { // from class: oh0
                public final /* synthetic */ ko4 A;
                public final /* synthetic */ String B;
                public final /* synthetic */ String C;
                public final /* synthetic */ String D;
                public final /* synthetic */ String E;
                public final /* synthetic */ sb2 F;
                public final /* synthetic */ yz3 G;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ sb2 y;
                public final /* synthetic */ boolean z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int N = kb0.N(1);
                    n77.a(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (kd2) obj2, N);
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r8 == r5) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a0(defpackage.wc0 r7, defpackage.xz0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.cj4
            if (r0 == 0) goto L13
            r0 = r8
            cj4 r0 = (defpackage.cj4) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            cj4 r0 = new cj4
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.A
            r2 = 0
            r3 = 2
            r4 = 1
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            int r7 = r0.y
            defpackage.m37.N(r8)
            goto L5f
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r2
        L33:
            wc0 r7 = r0.x
            defpackage.m37.N(r8)
            goto L47
        L39:
            defpackage.m37.N(r8)
            r0.x = r7
            r0.A = r4
            java.lang.Object r8 = defpackage.zz.W(r7, r0)
            if (r8 != r5) goto L47
            goto L5b
        L47:
            java.lang.Number r8 = (java.lang.Number) r8
            byte r8 = r8.byteValue()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r0.x = r2
            r0.y = r8
            r0.A = r3
            java.lang.Object r7 = defpackage.zz.W(r7, r0)
            if (r7 != r5) goto L5c
        L5b:
            return r5
        L5c:
            r6 = r8
            r8 = r7
            r7 = r6
        L5f:
            java.lang.Number r8 = (java.lang.Number) r8
            byte r8 = r8.byteValue()
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            int r7 = r7 + r8
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n77.a0(wc0, xz0):java.lang.Object");
    }

    public static final void b(final String str, final String str2, final String str3, final String str4, final int i, final boolean z, final int i2, final sb2 sb2Var, final ub2 ub2Var, final sb2 sb2Var2, yz3 yz3Var, kd2 kd2Var, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        int i14;
        final yz3 yz3Var2;
        float f2;
        String str5;
        float f3;
        String str6;
        kd2 kd2Var2 = kd2Var;
        sb2Var.getClass();
        ub2Var.getClass();
        sb2Var2.getClass();
        kd2Var2.f0(1309765442);
        if (kd2Var2.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i15 = i3 | i4;
        if (kd2Var2.f(str2)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i16 = i15 | i5;
        if (kd2Var2.f(str3)) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i17 = i16 | i6;
        if (kd2Var2.f(str4)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i18 = i17 | i7;
        if (kd2Var2.d(i)) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i19 = i18 | i8;
        if (kd2Var2.g(z)) {
            i9 = 131072;
        } else {
            i9 = 65536;
        }
        int i20 = i19 | i9;
        if (kd2Var2.d(i2)) {
            i10 = 1048576;
        } else {
            i10 = 524288;
        }
        int i21 = i20 | i10;
        if (kd2Var2.h(sb2Var)) {
            i11 = 8388608;
        } else {
            i11 = 4194304;
        }
        int i22 = i21 | i11;
        if (kd2Var2.h(ub2Var)) {
            i12 = 67108864;
        } else {
            i12 = 33554432;
        }
        int i23 = i22 | i12;
        if (kd2Var2.h(sb2Var2)) {
            i13 = 536870912;
        } else {
            i13 = 268435456;
        }
        int i24 = i23 | i13;
        if ((306783379 & i24) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (kd2Var2.V(i24 & 1, z2)) {
            tr trVar = x97.z;
            w50 w50Var = pk2.K;
            xp0 a2 = vp0.a(trVar, w50Var, kd2Var2, 0);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            vz3 vz3Var = vz3.x;
            yz3 E = o80.E(kd2Var2, vz3Var);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z3 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z3) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a2);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            yc6.b(lz5.f(R.string.playing, kd2Var2), S(vz3Var, 20.0f, 10.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var2).f, kd2Var, 48, 0, 131068);
            yz3 S = S(ar5.c(vz3Var, 1.0f), 20.0f, 8.0f);
            x50 x50Var = pk2.I;
            sr srVar = x97.y;
            z75 a3 = y75.a(srVar, x50Var, kd2Var, 48);
            int hashCode2 = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E2 = o80.E(kd2Var, S);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a3);
            ss5.i(ys0Var, kd2Var, l2);
            h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E2);
            yz3 h2 = bx7.h(n03.k(ar5.g(ar5.l(vz3Var, 112.0f), 65.0f, 0.0f, 2), n03.w(kd2Var).b), n03.r(kd2Var).r, io3.h);
            vo3 c2 = b90.c(pk2.y, false);
            int hashCode3 = Long.hashCode(kd2Var.T);
            al4 l3 = kd2Var.l();
            yz3 E3 = o80.E(kd2Var, h2);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, c2);
            ss5.i(ys0Var, kd2Var, l3);
            h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E3);
            int i25 = i24 >> 3;
            tl7.a(str2, str3, n90.a.b(vz3Var), pk2.O, kd2Var, (i25 & 112) | (i25 & 14) | 1572864);
            kd2Var.q(true);
            ov5.a(kd2Var, ar5.l(vz3Var, 14.0f));
            if (1.0f <= 0.0d) {
                cz2.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            ob3 ob3Var = new ob3(f2, true);
            xp0 a4 = vp0.a(new vr(2.0f, true, new ze0((byte) 6)), w50Var, kd2Var, 6);
            int hashCode4 = Long.hashCode(kd2Var.T);
            al4 l4 = kd2Var.l();
            yz3 E4 = o80.E(kd2Var, ob3Var);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a4);
            ss5.i(ys0Var, kd2Var, l4);
            h11.q(hashCode4, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E4);
            yc6.b(str3, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, xd6.a(n03.y(kd2Var).j, 0L, null, null, 0L, null, hz5.g(18), null, 16646143), kd2Var, (i24 >> 6) & 14, 24960, 110590);
            int i26 = i24 >> 9;
            yc6.b(str4, null, n03.r(kd2Var).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, n03.y(kd2Var).k, kd2Var, i26 & 14, 24960, 110586);
            kd2Var.q(true);
            kd2Var.q(true);
            yz3 S2 = S(ar5.c(vz3Var, 1.0f), 20.0f, 18.0f);
            xp0 a5 = vp0.a(new vr(8.0f, true, new ze0((byte) 6)), w50Var, kd2Var, 6);
            int hashCode5 = Long.hashCode(kd2Var.T);
            al4 l5 = kd2Var.l();
            yz3 E5 = o80.E(kd2Var, S2);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a5);
            ss5.i(ys0Var, kd2Var, l5);
            h11.q(hashCode5, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E5);
            yz3 T = T(vz3Var, 5.0f, 0.0f, 2);
            z75 a6 = y75.a(srVar, x50Var, kd2Var, 48);
            int hashCode6 = Long.hashCode(kd2Var.T);
            al4 l6 = kd2Var.l();
            yz3 E6 = o80.E(kd2Var, T);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a6);
            ss5.i(ys0Var, kd2Var, l6);
            h11.q(hashCode6, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E6);
            yt2.a(w65.H(R.drawable.tv, kd2Var, 0), null, ar5.i(vz3Var, 20.0f), 0L, kd2Var, 440, 8);
            ov5.a(kd2Var, ar5.l(vz3Var, 14.0f));
            if (str == null) {
                str5 = h11.i(kd2Var, -619033706, R.string.cast_device, kd2Var, false);
            } else {
                kd2Var.e0(-619034140);
                kd2Var.q(false);
                str5 = str;
            }
            yc6.b(str5, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var).h, kd2Var, 0, 0, 131070);
            kd2Var.q(true);
            z75 a7 = y75.a(srVar, x50Var, kd2Var, 48);
            int hashCode7 = Long.hashCode(kd2Var.T);
            al4 l7 = kd2Var.l();
            yz3 E7 = o80.E(kd2Var, vz3Var);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a7);
            ss5.i(ys0Var, kd2Var, l7);
            h11.q(hashCode7, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E7);
            i14 = i;
            zz.a(ar5.i(vz3Var, 36.0f), false, false, null, null, 0L, 0L, sb2Var, null, nx7.R(-132539582, new ic2() { // from class: qh0
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z4;
                    int i27;
                    kd2 kd2Var3 = (kd2) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (kd2Var3.V(intValue & 1, z4)) {
                        if (!z && i != 0) {
                            i27 = R.drawable.volume;
                        } else {
                            i27 = R.drawable.volume_off;
                        }
                        yt2.a(w65.H(i27, kd2Var3, 0), lz5.f(R.string.cast_volume, kd2Var3), null, 0L, kd2Var3, 8, 12);
                    } else {
                        kd2Var3.Y();
                    }
                    return pn6.a;
                }
            }, kd2Var), kd2Var, (i24 & 29360128) | 805306374, 382);
            float f4 = i2;
            float B = db.B(i14, 0.0f, f4);
            do0 do0Var = new do0(0.0f, f4);
            if (1.0f <= 0.0d) {
                cz2.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            } else {
                f3 = 1.0f;
            }
            kb0.a(B, ub2Var, V(new ob3(f3, true), 8.0f, 0.0f, 0.0f, 0.0f, 14), false, do0Var, 0, null, null, kd2Var, (i24 >> 21) & 112, 232);
            kd2Var.q(true);
            kd2Var.q(true);
            kb0.e(null, 0.0f, n03.r(kd2Var).B, kd2Var, 0, 3);
            yz3 S3 = S(kb0.A(ar5.c(vz3Var, 1.0f), false, null, null, true, sb2Var2, kd2Var, (i26 & 3670016) | 24582, 23), 20.0f, 15.0f);
            z75 a8 = y75.a(srVar, x50Var, kd2Var, 48);
            int hashCode8 = Long.hashCode(kd2Var.T);
            al4 l8 = kd2Var.l();
            yz3 E8 = o80.E(kd2Var, S3);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a8);
            ss5.i(ys0Var, kd2Var, l8);
            h11.q(hashCode8, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E8);
            yt2.a(w65.H(R.drawable.screen_cast_filled, kd2Var, 0), null, ar5.i(vz3Var, 24.0f), 0L, kd2Var, 440, 8);
            ov5.a(kd2Var, ar5.l(vz3Var, 14.0f));
            if (str == null) {
                str6 = h11.i(kd2Var, 438685399, R.string.cast_device, kd2Var, false);
            } else {
                kd2Var.e0(438684965);
                kd2Var.q(false);
                str6 = str;
            }
            yc6.b(lz5.g(R.string.disconnect_from, new Object[]{str6}, kd2Var), null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, n03.y(kd2Var).j, kd2Var, 0, 24960, 110590);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
            kd2Var2.q(true);
            yz3Var2 = vz3Var;
        } else {
            i14 = i;
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            final int i27 = i14;
            u.d = new ic2(str, str2, str3, str4, i27, z, i2, sb2Var, ub2Var, sb2Var2, yz3Var2, i3) { // from class: rh0
                public final /* synthetic */ String A;
                public final /* synthetic */ int B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ int D;
                public final /* synthetic */ sb2 E;
                public final /* synthetic */ ub2 F;
                public final /* synthetic */ sb2 G;
                public final /* synthetic */ yz3 H;
                public final /* synthetic */ String x;
                public final /* synthetic */ String y;
                public final /* synthetic */ String z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(1);
                    n77.b(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (r10 == r7) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(defpackage.wc0 r9, defpackage.xz0 r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n77.b0(wc0, xz0):java.lang.Object");
    }

    public static final void c(final boolean z, final sb2 sb2Var, final boolean z2, yz3 yz3Var, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z3;
        final yz3 yz3Var2;
        float f2;
        sb2Var.getClass();
        kd2Var.f0(-747676826);
        byte b2 = 4;
        if (kd2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (kd2Var.h(sb2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (kd2Var.g(z2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4 | 3072;
        boolean z4 = false;
        if ((i7 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var.V(i7 & 1, z3)) {
            if (!z) {
                zz4 u = kd2Var.u();
                if (u != null) {
                    u.d = new sh0(z, sb2Var, z2, i);
                    return;
                }
                return;
            }
            kd2Var.e0(1344225638);
            Context context = (Context) kd2Var.j(eb.b);
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (Q == obj) {
                Q = rs3.d(context);
                kd2Var.n0(Q);
            }
            Object obj2 = (rs3) Q;
            obj2.getClass();
            Object Q2 = kd2Var.Q();
            if (Q2 == obj) {
                Q2 = xh0.b(context).a();
                kd2Var.n0(Q2);
            }
            Object obj3 = (ks3) Q2;
            Object Q3 = kd2Var.Q();
            Iterable<qs3> iterable = nt1.x;
            if (Q3 == obj) {
                Q3 = xt5.g(iterable);
                kd2Var.n0(Q3);
            }
            w44 w44Var = (w44) Q3;
            if (obj3 != null) {
                boolean h2 = kd2Var.h(obj2) | kd2Var.h(obj3);
                Object Q4 = kd2Var.Q();
                if (h2 || Q4 == obj) {
                    Q4 = new bg(obj2, obj3, w44Var, b2);
                    kd2Var.n0(Q4);
                }
                db.d(obj2, obj3, (ub2) Q4, kd2Var);
                iterable = (List) w44Var.getValue();
            }
            kd2Var.q(false);
            boolean f3 = kd2Var.f(iterable);
            Object Q5 = kd2Var.Q();
            Object obj4 = Q5;
            if (f3 || Q5 == obj) {
                ArrayList arrayList = new ArrayList(zo0.V(iterable, 10));
                for (qs3 qs3Var : iterable) {
                    String str = qs3Var.d;
                    str.getClass();
                    arrayList.add(new yh0(str, new y7(qs3Var, (byte) 25)));
                }
                kd2Var.n0(arrayList);
                obj4 = arrayList;
            }
            List list = (List) obj4;
            do5 f4 = rz3.f(z2, kd2Var, (i7 >> 6) & 14, 2);
            Configuration configuration = (Configuration) kd2Var.j(eb.a);
            float f5 = configuration.screenWidthDp;
            if (configuration.orientation == 2) {
                z4 = true;
            }
            WeakHashMap weakHashMap = z57.w;
            float a2 = sw0.h(mv5.b(kd2Var).e, kd2Var).a();
            Activity activity = (Activity) kd2Var.j(rj3.a);
            if (activity != null && activity.isInMultiWindowMode()) {
                a2 = 15.0f;
            }
            long j = ep0.h;
            long b3 = ep0.b(0.5f, ep0.b);
            ao2 ao2Var = io3.h;
            sz3 sz3Var = new sz3();
            if (z4) {
                f2 = f5 * 0.48f;
            } else {
                f2 = Float.NaN;
            }
            vz3 vz3Var = vz3.x;
            rz3.a(sb2Var, vz3Var, f4, f2, false, ao2Var, j, 0L, b3, null, new vs0((byte) 20), sz3Var, nx7.R(1932047432, new lh0(a2, list, sb2Var), kd2Var), kd2Var, ((i7 >> 3) & 14) | 807075888, CommonGatewayClient.CODE_400);
            yz3Var2 = vz3Var;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            u2.d = new ic2(z, sb2Var, z2, yz3Var2, i) { // from class: mh0
                public final /* synthetic */ yz3 A;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ sb2 y;
                public final /* synthetic */ boolean z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int N = kb0.N(1);
                    n77.c(this.x, this.y, this.z, this.A, (kd2) obj5, N);
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum c0(defpackage.wc0 r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ej4
            if (r0 == 0) goto L13
            r0 = r6
            ej4 r0 = (defpackage.ej4) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ej4 r0 = new ej4
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            qc5 r5 = r0.x
            defpackage.m37.N(r6)
            goto L43
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L2e:
            defpackage.m37.N(r6)
            qc5 r6 = defpackage.z56.y
            r0.x = r6
            r0.z = r2
            java.lang.Object r5 = a0(r5, r0)
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto L40
            return r0
        L40:
            r4 = r6
            r6 = r5
            r5 = r4
        L43:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r0
            r5.getClass()
            z56 r5 = defpackage.qc5.c(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n77.c0(wc0, xz0):java.lang.Enum");
    }

    public static final void d(List list, ub2 ub2Var, yz3 yz3Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        boolean z;
        List list2;
        yz3 yz3Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        kd2 kd2Var2 = kd2Var;
        list.getClass();
        ub2Var.getClass();
        kd2Var2.f0(1937207412);
        if (kd2Var2.f(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (kd2Var2.h(ub2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3 | 384;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i5 & 1, z)) {
            vz3 vz3Var = vz3.x;
            yz3 V = V(ar5.c(vz3Var, 1.0f), 0.0f, 0.0f, 0.0f, 15.0f, 7);
            xp0 a2 = vp0.a(x97.z, pk2.K, kd2Var2, 0);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, V);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z5 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z5) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a2);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            yc6.b(lz5.f(R.string.select_a_device, kd2Var2), S(vz3Var, 20.0f, 14.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(pl6.a)).h, kd2Var, 48, 0, 131068);
            kd2Var2 = kd2Var;
            if (list.isEmpty()) {
                kd2Var2.e0(-1434519409);
                yz3 R = R(ar5.c(vz3Var, 1.0f), 32.0f);
                vo3 c2 = b90.c(pk2.C, false);
                int hashCode2 = Long.hashCode(kd2Var2.T);
                al4 l2 = kd2Var2.l();
                yz3 E2 = o80.E(kd2Var2, R);
                kd2Var2.h0();
                if (kd2Var2.S) {
                    kd2Var2.k(t53Var);
                } else {
                    kd2Var2.q0();
                }
                ss5.i(st0Var, kd2Var2, c2);
                ss5.i(ys0Var, kd2Var2, l2);
                h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
                ss5.i(ys0Var2, kd2Var2, E2);
                cv4.a(null, ((mp0) kd2Var2.j(op0.a)).o, 0.0f, 0L, 0, 0.0f, kd2Var2, 0, 61);
                z2 = true;
                kd2Var2.q(true);
                kd2Var2.q(false);
                list2 = list;
            } else {
                z2 = true;
                kd2Var2.e0(-1434207859);
                if ((i5 & 14) != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if ((i5 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z6 = z4 | z3;
                Object Q = kd2Var2.Q();
                if (!z6 && Q != au0.a) {
                    list2 = list;
                } else {
                    list2 = list;
                    Q = new b0(list2, ub2Var, (byte) 23);
                    kd2Var2.n0(Q);
                }
                h(null, null, null, null, null, null, false, null, (ub2) Q, kd2Var, 0, 511);
                kd2Var2 = kd2Var;
                kd2Var2.q(false);
            }
            kd2Var2.q(z2);
            yz3Var2 = vz3Var;
        } else {
            list2 = list;
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new df((Object) list2, (Object) ub2Var, yz3Var2, i, (byte) 3);
        }
    }

    public static final yc5 d0(kd2 kd2Var) {
        Object[] objArr = new Object[0];
        boolean d2 = kd2Var.d(0);
        Object Q = kd2Var.Q();
        if (d2 || Q == au0.a) {
            Q = new r75((byte) 17);
            kd2Var.n0(Q);
        }
        return (yc5) oi4.D(objArr, yc5.k, (sb2) Q, kd2Var, 0);
    }

    public static final void e(String str, sb2 sb2Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        boolean z;
        byte b2;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(1420934667);
        if (kd2Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (kd2Var2.h(sb2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i5 & 1, z)) {
            vz3 vz3Var = vz3.x;
            yz3 S = S(kb0.A(ar5.c(vz3Var, 1.0f), false, null, null, true, sb2Var, kd2Var2, ((i5 << 15) & 3670016) | 24582, 23), 20.0f, 14.0f);
            z75 a2 = y75.a(x97.y, pk2.I, kd2Var2, 48);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, S);
            tt0.d.getClass();
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(za3.p0);
            } else {
                kd2Var2.q0();
            }
            ss5.i(p7.F, kd2Var2, a2);
            ss5.i(p7.E, kd2Var2, l);
            ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode));
            ss5.h(kd2Var2);
            ss5.i(p7.D, kd2Var2, E);
            yt2.a(w65.H(R.drawable.screen_cast, kd2Var2, 0), null, ar5.i(vz3Var, 24.0f), 0L, kd2Var, 440, 8);
            ov5.a(kd2Var, ar5.l(vz3Var, 12.0f));
            yc6.b(str, null, ((mp0) kd2Var.j(op0.a)).o, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((nl6) kd2Var.j(pl6.a)).j, kd2Var, i5 & 14, 24960, 110586);
            kd2Var2 = kd2Var;
            b2 = 1;
            kd2Var2.q(true);
        } else {
            b2 = 1;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ei(str, sb2Var, i, b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e0(java.io.File r4, defpackage.ub2 r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.m22
            if (r0 == 0) goto L13
            r0 = r6
            m22 r0 = (defpackage.m22) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            m22 r0 = new m22
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.io.File r4 = r0.x
            defpackage.m37.N(r6)     // Catch: java.io.IOException -> L27
            return r6
        L27:
            r5 = move-exception
            goto L41
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L30:
            defpackage.m37.N(r6)
            r0.x = r4     // Catch: java.io.IOException -> L27
            r0.z = r2     // Catch: java.io.IOException -> L27
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.io.IOException -> L27
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L40
            return r5
        L40:
            return r4
        L41:
            boolean r6 = r5 instanceof defpackage.d21
            if (r6 != 0) goto La5
            r4.getClass()
            boolean r6 = r4.exists()
            if (r6 == 0) goto La0
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7a
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L6a
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L65
            java.io.IOException r4 = defpackage.m37.e(r4, r5)
            goto La4
        L65:
            java.io.IOException r4 = defpackage.m37.e(r4, r5)
            goto La4
        L6a:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L75
            java.io.IOException r4 = defpackage.m37.e(r4, r5)
            goto La4
        L75:
            java.io.IOException r4 = defpackage.m37.e(r4, r5)
            goto La4
        L7a:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L90
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L8b
            java.io.IOException r4 = defpackage.m37.e(r4, r5)
            goto La4
        L8b:
            java.io.IOException r4 = defpackage.m37.e(r4, r5)
            goto La4
        L90:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L9b
            java.io.IOException r4 = defpackage.m37.e(r4, r5)
            goto La4
        L9b:
            java.io.IOException r4 = defpackage.m37.e(r4, r5)
            goto La4
        La0:
            java.io.IOException r4 = defpackage.m37.e(r4, r5)
        La4:
            throw r4
        La5:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n77.e0(java.io.File, ub2, xz0):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void f(defpackage.mc6 r60, defpackage.ub2 r61, defpackage.yz3 r62, defpackage.xd6 r63, defpackage.p65 r64, defpackage.ub2 r65, defpackage.su5 r66, boolean r67, int r68, int r69, defpackage.yv2 r70, defpackage.m83 r71, boolean r72, defpackage.os0 r73, defpackage.kd2 r74, int r75, int r76) {
        /*
            Method dump skipped, instructions count: 2482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n77.f(mc6, ub2, yz3, xd6, p65, ub2, su5, boolean, int, int, yv2, m83, boolean, os0, kd2, int, int):void");
    }

    public static yz3 f0(yz3 yz3Var, yc5 yc5Var, boolean z, boolean z2) {
        rg4 rg4Var;
        yz3 k;
        rg4 rg4Var2 = rg4.x;
        if (z2) {
            rg4Var = rg4Var2;
        } else {
            rg4Var = rg4.y;
        }
        u34 u34Var = yc5Var.e;
        vz3 vz3Var = vz3.x;
        if (rg4Var == rg4Var2) {
            k = n03.k(vz3Var, ao2.c);
        } else {
            k = n03.k(vz3Var, ao2.b);
        }
        return yz3Var.w(k).w(new zc5(null, null, null, u34Var, rg4Var, yc5Var, z, true)).w(new md5(yc5Var, z2));
    }

    public static final void g(yz3 yz3Var, jb6 jb6Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        boolean z;
        kd2Var.f0(2036174316);
        if (kd2Var.f(yz3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (kd2Var.h(jb6Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i5 & 1, z)) {
            vo3 c2 = b90.c(pk2.y, true);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, yz3Var);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c2);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            te4.f(jb6Var, os0Var, kd2Var, (i5 >> 3) & 126);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new df((Object) yz3Var, (Object) jb6Var, os0Var, i, (byte) 6);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, w05] */
    public static final void g0(sc6 sc6Var, uf3 uf3Var, mc6 mc6Var, yv2 yv2Var, h12 h12Var) {
        pz2 pz2Var = uf3Var.d;
        r01 r01Var = uf3Var.v;
        r01 r01Var2 = uf3Var.w;
        ?? obj = new Object();
        bg bgVar = new bg((Object) pz2Var, (Object) r01Var, (Object) obj, (byte) 27);
        jn4 jn4Var = sc6Var.a;
        jn4Var.a(mc6Var, yv2Var, bgVar, r01Var2);
        vc6 vc6Var = new vc6(sc6Var, jn4Var);
        sc6Var.b.set(vc6Var);
        obj.x = vc6Var;
        uf3Var.e = vc6Var;
        M(uf3Var, mc6Var, h12Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.yz3 r16, defpackage.af3 r17, defpackage.th4 r18, defpackage.wr r19, defpackage.d7 r20, defpackage.i42 r21, boolean r22, defpackage.fc r23, defpackage.ub2 r24, defpackage.kd2 r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n77.h(yz3, af3, th4, wr, d7, i42, boolean, fc, ub2, kd2, int, int):void");
    }

    public static final boolean h0(long j) {
        if ((j & Long.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(defpackage.yz3 r16, defpackage.af3 r17, defpackage.vh4 r18, defpackage.ur r19, defpackage.x50 r20, defpackage.i42 r21, boolean r22, defpackage.fc r23, defpackage.ub2 r24, defpackage.kd2 r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n77.i(yz3, af3, vh4, ur, x50, i42, boolean, fc, ub2, kd2, int, int):void");
    }

    public static final boolean i0(long j) {
        if ((j & 2147483648L) != 0) {
            return true;
        }
        return false;
    }

    public static vh4 j(float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        return new vh4(f2, f3, f2, f3);
    }

    public static final int j0(long j) {
        return (int) ((j & 9223372032559808512L) >>> 32);
    }

    public static vh4 k(float f2, float f3, float f4, float f5, int i) {
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i & 8) != 0) {
            f5 = 0.0f;
        }
        return new vh4(f2, f3, f4, f5);
    }

    public static yz3 k0(yz3 yz3Var, yc5 yc5Var, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return f0(yz3Var, yc5Var, z, true);
    }

    public static final ad l() {
        return new ad(new Paint(7));
    }

    public static ByteBuffer l0(String str, List list) {
        int i = 8;
        for (int i2 = 0; i2 < list.size(); i2++) {
            i += ((ByteBuffer) list.get(i2)).remaining();
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.put(str.getBytes(StandardCharsets.UTF_8), 0, 4);
        for (int i3 = 0; i3 < list.size(); i3++) {
            allocate.put((ByteBuffer) list.get(i3));
        }
        allocate.flip();
        return allocate;
    }

    public static final void m(jb6 jb6Var, boolean z, kd2 kd2Var, int i) {
        int i2;
        int i3;
        boolean z2;
        cd6 d2;
        boolean z3;
        kd2Var.f0(626339208);
        if (kd2Var.h(jb6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (kd2Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        byte b2 = 0;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i5 & 1, z2)) {
            if (z) {
                kd2Var.e0(1530097388);
                uf3 uf3Var = jb6Var.d;
                bd6 bd6Var = null;
                if (uf3Var != null && (d2 = uf3Var.d()) != null) {
                    bd6 bd6Var2 = d2.a;
                    uf3 uf3Var2 = jb6Var.d;
                    if (uf3Var2 != null) {
                        z3 = uf3Var2.p;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        bd6Var = bd6Var2;
                    }
                }
                if (bd6Var == null) {
                    kd2Var.e0(1530097387);
                    kd2Var.q(false);
                } else {
                    kd2Var.e0(1530097388);
                    if (!nd6.d(jb6Var.l().b)) {
                        kd2Var.e0(2109807302);
                        h12 h12Var = jb6Var.b;
                        int i6 = (int) (jb6Var.l().b >> 32);
                        h12Var.b(i6);
                        h12 h12Var2 = jb6Var.b;
                        int i7 = (int) (jb6Var.l().b & 4294967295L);
                        h12Var2.b(i7);
                        c45 a2 = bd6Var.a(i6);
                        c45 a3 = bd6Var.a(Math.max(i7 - 1, 0));
                        uf3 uf3Var3 = jb6Var.d;
                        if (uf3Var3 != null && ((Boolean) uf3Var3.m.getValue()).booleanValue()) {
                            kd2Var.e0(2110225306);
                            nu5.a(true, a2, jb6Var, kd2Var, ((i5 << 6) & 896) | 6);
                            kd2Var.q(false);
                        } else {
                            kd2Var.e0(2110490542);
                            kd2Var.q(false);
                        }
                        uf3 uf3Var4 = jb6Var.d;
                        if (uf3Var4 != null && ((Boolean) uf3Var4.n.getValue()).booleanValue()) {
                            kd2Var.e0(2110574459);
                            nu5.a(false, a3, jb6Var, kd2Var, ((i5 << 6) & 896) | 6);
                            kd2Var.q(false);
                        } else {
                            kd2Var.e0(2110838734);
                            kd2Var.q(false);
                        }
                        kd2Var.q(false);
                    } else {
                        kd2Var.e0(2110860558);
                        kd2Var.q(false);
                    }
                    uf3 uf3Var5 = jb6Var.d;
                    if (uf3Var5 != null) {
                        ti4 ti4Var = uf3Var5.l;
                        if (!a34.i(jb6Var.t.a.y, jb6Var.l().a.y)) {
                            ti4Var.setValue(Boolean.FALSE);
                        }
                        if (uf3Var5.b()) {
                            if (((Boolean) ti4Var.getValue()).booleanValue()) {
                                jb6Var.s();
                            } else {
                                jb6Var.m();
                            }
                        }
                    }
                    kd2Var.q(false);
                }
                kd2Var.q(false);
            } else {
                kd2Var.e0(1989076778);
                kd2Var.q(false);
                jb6Var.m();
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new q01(jb6Var, z, i, b2);
        }
    }

    public static ByteBuffer m0(String str, ByteBuffer byteBuffer) {
        return n0(str.getBytes(StandardCharsets.UTF_8), byteBuffer);
    }

    public static final void n(jb6 jb6Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        ko k;
        cd6 cd6Var;
        kd2Var.f0(-1436003720);
        if (kd2Var.h(jb6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            uf3 uf3Var = jb6Var.d;
            if (uf3Var != null && ((Boolean) uf3Var.o.getValue()).booleanValue() && (k = jb6Var.k()) != null && k.y.length() > 0) {
                kd2Var.e0(-2112351432);
                boolean f2 = kd2Var.f(jb6Var);
                Object Q = kd2Var.Q();
                Object obj = au0.a;
                if (f2 || Q == obj) {
                    Q = new fb6(jb6Var);
                    kd2Var.n0(Q);
                }
                k96 k96Var = (k96) Q;
                ud1 ud1Var = (ud1) kd2Var.j(bv0.h);
                h12 h12Var = jb6Var.b;
                long j = jb6Var.l().b;
                int i4 = nd6.c;
                int i5 = (int) (j >> 32);
                h12Var.b(i5);
                uf3 uf3Var2 = jb6Var.d;
                if (uf3Var2 != null) {
                    cd6Var = uf3Var2.d();
                } else {
                    cd6Var = null;
                }
                cd6Var.getClass();
                bd6 bd6Var = cd6Var.a;
                n05 c2 = bd6Var.c(db.C(i5, 0, bd6Var.a.a.y.length()));
                long floatToRawIntBits = (Float.floatToRawIntBits((ud1Var.g0(2.0f) / 2.0f) + c2.a) << 32) | (Float.floatToRawIntBits(c2.d) & 4294967295L);
                boolean e2 = kd2Var.e(floatToRawIntBits);
                Object Q2 = kd2Var.Q();
                if (e2 || Q2 == obj) {
                    Q2 = new x01(floatToRawIntBits);
                    kd2Var.n0(Q2);
                }
                ad4 ad4Var = (ad4) Q2;
                boolean h2 = kd2Var.h(k96Var) | kd2Var.h(jb6Var);
                Object Q3 = kd2Var.Q();
                if (h2 || Q3 == obj) {
                    Q3 = new a11(k96Var, jb6Var);
                    kd2Var.n0(Q3);
                }
                yz3 a2 = v36.a(vz3.x, k96Var, (PointerInputEventHandler) Q3);
                boolean e3 = kd2Var.e(floatToRawIntBits);
                Object Q4 = kd2Var.Q();
                if (e3 || Q4 == obj) {
                    Q4 = new pb(floatToRawIntBits, (byte) 3);
                    kd2Var.n0(Q4);
                }
                rb.a(ad4Var, rh5.a(a2, false, (ub2) Q4), 0L, kd2Var, 0, 4);
                kd2Var.q(false);
            } else {
                kd2Var.e0(-2111042550);
                kd2Var.q(false);
            }
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new o0(jb6Var, i, (byte) 9);
        }
    }

    public static ByteBuffer n0(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + 8);
        allocate.putInt(byteBuffer.remaining() + 8);
        allocate.put(bArr, 0, 4);
        allocate.put(byteBuffer);
        allocate.flip();
        return allocate;
    }

    public static float o(EdgeEffect edgeEffect, float f2, float f3, ud1 ud1Var) {
        float f4;
        float f5 = dr1.a;
        double b2 = ud1Var.b() * 386.0878f * 160.0f * 0.84f;
        double d2 = dr1.a * b2;
        float exp = (float) (Math.exp((dr1.b / dr1.c) * Math.log((Math.abs(f2) * 0.35f) / d2)) * d2);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f4 = hb.d(edgeEffect);
        } else {
            f4 = 0.0f;
        }
        if (exp > f4 * f3) {
            return 0.0f;
        }
        int h0 = io3.h0(f2);
        if (i >= 31) {
            edgeEffect.onAbsorb(h0);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(h0);
        }
        return f2;
    }

    public static boolean o0(Thread thread) {
        Thread thread2 = g;
        if (thread2 == null) {
            thread2 = Looper.getMainLooper().getThread();
            g = thread2;
        }
        if (thread == thread2) {
            return true;
        }
        return false;
    }

    public static final yz3 p(yz3 yz3Var, ic2 ic2Var) {
        return yz3Var.w(new r6(ic2Var));
    }

    public static Handler p0() {
        if (h == null) {
            synchronized (f) {
                try {
                    if (h == null) {
                        h = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return h;
    }

    public static float q(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = (((((f4 * f7) + ((f3 * f6) + (f2 * f5))) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
        if (f8 < 0.0f) {
            return -f8;
        }
        return f8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.z36 r7, defpackage.oq4 r8, defpackage.h30 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.w92
            if (r0 == 0) goto L13
            r0 = r9
            w92 r0 = (defpackage.w92) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            w92 r0 = new w92
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.z
            int r1 = r0.A
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            oq4 r7 = r0.y
            z36 r8 = r0.x
            defpackage.m37.N(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            r7 = 0
            return r7
        L34:
            defpackage.m37.N(r9)
            a46 r9 = r7.B
            nq4 r9 = r9.Q
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            uq4 r5 = (defpackage.uq4) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L76
        L4e:
            r0.x = r7
            r0.y = r8
            r0.A = r3
            java.lang.Object r9 = r7.d(r8, r0)
            w11 r1 = defpackage.w11.x
            if (r9 != r1) goto L5d
            return r1
        L5d:
            nq4 r9 = (defpackage.nq4) r9
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            uq4 r5 = (defpackage.uq4) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            pn6 r7 = defpackage.pn6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n77.r(z36, oq4, h30):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.tu4 r4, defpackage.sb2 r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.qu4
            if (r0 == 0) goto L13
            r0 = r6
            qu4 r0 = (defpackage.qu4) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            qu4 r0 = new qu4
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.y
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            sb2 r5 = r0.x
            defpackage.m37.N(r6)     // Catch: java.lang.Throwable -> L28
            goto L63
        L28:
            r4 = move-exception
            goto L69
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L30:
            defpackage.m37.N(r6)
            l11 r6 = r0.getContext()
            h95 r1 = defpackage.h95.F
            j11 r6 = r6.get(r1)
            if (r6 != r4) goto L6d
            r0.x = r5     // Catch: java.lang.Throwable -> L28
            r0.z = r3     // Catch: java.lang.Throwable -> L28
            qg0 r6 = new qg0     // Catch: java.lang.Throwable -> L28
            vz0 r0 = defpackage.wc7.z(r0)     // Catch: java.lang.Throwable -> L28
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L28
            r6.t()     // Catch: java.lang.Throwable -> L28
            yd r0 = new yd     // Catch: java.lang.Throwable -> L28
            r1 = 4
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L28
            nj0 r4 = (defpackage.nj0) r4     // Catch: java.lang.Throwable -> L28
            r4.j0(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L28
            w11 r6 = defpackage.w11.x
            if (r4 != r6) goto L63
            return r6
        L63:
            r5.invoke()
            pn6 r4 = defpackage.pn6.a
            return r4
        L69:
            r5.invoke()
            throw r4
        L6d:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            defpackage.ze0.m(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n77.s(tu4, sb2, xz0):java.lang.Object");
    }

    public static final Object t(yq4 yq4Var, ic2 ic2Var, vz0 vz0Var) {
        Object a1 = ((a46) yq4Var).a1(new x92(vz0Var.getContext(), ic2Var, null, (byte) 0), vz0Var);
        if (a1 == w11.x) {
            return a1;
        }
        return pn6.a;
    }

    public static final void u(y83 y83Var, im0 im0Var) {
        String str;
        k03 k03Var = y83Var.b;
        r50 r50Var = k03Var.a;
        r50Var.f.add(im0Var);
        kz5 kz5Var = r50Var.c;
        qx4 qx4Var = r50Var.a;
        StringBuilder sb = new StringBuilder(f73.a(im0Var));
        sb.append(':');
        if (kz5Var != null) {
            str = kz5Var.a;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(':');
        sb.append(qx4Var);
        y83Var.a.c.put(sb.toString(), k03Var);
    }

    public static final void v(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
    }

    public static final void w(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        ze0.g(zo5.m("index: ", ", size: ", i, i2));
    }

    public static final void x(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            ze0.k(zo5.m("fromIndex: ", " > toIndex: ", i, i2));
            return;
        }
        p65.k(qx1.u("fromIndex: ", i, ", toIndex: ", i2, ", size: "), i3);
    }

    public static final Object y(vz0 vz0Var, x42 x42Var, sb2 sb2Var, jc2 jc2Var, w42[] w42VarArr) {
        cq0 cq0Var = new cq0(null, x42Var, sb2Var, jc2Var, w42VarArr);
        ec5 ec5Var = new ec5(vz0Var, vz0Var.getContext());
        Object e2 = lz5.e(ec5Var, true, ec5Var, cq0Var);
        if (e2 == w11.x) {
            return e2;
        }
        return pn6.a;
    }

    public static ByteBuffer z(ByteBuffer... byteBufferArr) {
        int i = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            i += byteBuffer.remaining();
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            allocate.put(byteBuffer2);
        }
        allocate.flip();
        return allocate;
    }
}
