package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.anistation.model.download.EpisodeDownload;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class sw0 {
    public static final os0 D;
    public static final f01 F;
    public static final int[] x = {2002, 2000, 1920, 1601, 1600, 1001, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 960, 800, 800, 480, CommonGatewayClient.CODE_400, CommonGatewayClient.CODE_400, 2048};
    public static final oa0 y = new Object();
    public static final os0 z = new os0(-1553457316, false, new ps0(13));
    public static final os0 A = new os0(-2053180643, false, new qs0(23));
    public static final os0 B = new os0(916911, false, new qs0(24));
    public static final os0 C = new os0(-1032916597, false, new qs0(25));
    public static final os0 E = new os0(1434918298, false, new qs0(27));
    public static final st0 G = new st0((byte) 16);
    public static final Object H = new Object();
    public static final rs4 I = new rs4(1);
    public static final us0 J = new us0(2);
    public static final float K = 24.0f;
    public static final w32 L = new w32(0);

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oa0] */
    static {
        byte b = 26;
        D = new os0(-374049836, false, new qs0(b));
        F = new f01(b);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [b45, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [wf0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, cn7] */
    public static final cn7 A(m18 m18Var, String str, Executor executor, sb2 sb2Var) {
        pn6 pn6Var = pn6.a;
        m18Var.getClass();
        executor.getClass();
        cj3 cj3Var = new cj3(0);
        ?? obj = new Object();
        obj.c = new Object();
        zf0 zf0Var = new zf0(obj);
        obj.b = zf0Var;
        obj.a = h11.class;
        try {
            executor.execute(new fr1(m18Var, str, sb2Var, cj3Var, obj, (byte) 1));
            obj.a = pn6Var;
        } catch (Exception e) {
            zf0Var.y.l(e);
        }
        ?? obj2 = new Object();
        obj2.x = zf0Var;
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r9.f() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = r9.g(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r9.f() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r9.g(3) <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r9.o(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r9.f() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r5 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r9 = r9.g(4);
        r8 = defpackage.sw0.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r5 != 44100) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r9 != 13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r9 = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        return new defpackage.n3(r5, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r5 != 48000) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r9 >= 14) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        r6 = r8[r9];
        r2 = r2 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r2 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r2 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r2 == 3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r2 == 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r9 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (r9 == 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        r9 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        if (r9 == 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (r9 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0055, code lost:
    
        r5 = 44100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r9.g(2) == 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r9.g(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.n3 B(defpackage.yi0 r9) {
        /*
            r0 = 16
            int r1 = r9.g(r0)
            int r0 = r9.g(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.g(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.g(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.g(r1)
            boolean r2 = r9.f()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.g(r2)
            boolean r5 = r9.f()
            if (r5 == 0) goto L47
            int r5 = r9.g(r4)
            if (r5 <= 0) goto L47
            r9.o(r1)
        L47:
            boolean r5 = r9.f()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.g(r3)
            int[] r8 = defpackage.sw0.x
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8b
            r8 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r7) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            n3 r1 = new n3
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw0.B(yi0):n3");
    }

    public static void C(yi0 yi0Var, m3 m3Var) {
        int g = yi0Var.g(5);
        yi0Var.o(2);
        if (yi0Var.f()) {
            yi0Var.o(5);
        }
        if (g >= 7 && g <= 10) {
            yi0Var.n();
        }
        if (yi0Var.f()) {
            int g2 = yi0Var.g(3);
            if (m3Var.b == -1 && g >= 0 && g <= 15 && (g2 == 0 || g2 == 1)) {
                m3Var.b = g;
            }
            if (yi0Var.f()) {
                I(yi0Var);
            }
        }
    }

    public static void D(yi0 yi0Var, m3 m3Var) {
        yi0Var.o(2);
        boolean f = yi0Var.f();
        int g = yi0Var.g(8);
        for (int i = 0; i < g; i++) {
            yi0Var.o(2);
            if (yi0Var.f()) {
                yi0Var.o(5);
            }
            if (f) {
                yi0Var.o(24);
            } else {
                if (yi0Var.f()) {
                    if (!yi0Var.f()) {
                        yi0Var.o(4);
                    }
                    m3Var.c = yi0Var.g(6) + 1;
                }
                yi0Var.o(4);
            }
        }
        if (yi0Var.f()) {
            yi0Var.o(3);
            if (yi0Var.f()) {
                I(yi0Var);
            }
        }
    }

    public static final Object E(al4 al4Var, jw4 jw4Var) {
        jw4Var.getClass();
        Object obj = al4Var.get(jw4Var);
        if (obj == null) {
            obj = jw4Var.b();
        }
        return ((wq6) obj).a(al4Var);
    }

    public static void F(i18 i18Var) {
        sx5 sx5Var;
        kl4 kl4Var;
        int i;
        Object obj;
        kl4 kl4Var2;
        do {
            sx5Var = h05.z;
            kl4Var = (kl4) sx5Var.getValue();
            bl4 bl4Var = kl4Var.z;
            xh3 xh3Var = (xh3) bl4Var.get(i18Var);
            if (xh3Var == null) {
                kl4Var2 = kl4Var;
            } else {
                Object obj2 = xh3Var.a;
                Object obj3 = xh3Var.b;
                oj6 oj6Var = bl4Var.x;
                if (i18Var != null) {
                    i = i18Var.hashCode();
                } else {
                    i = 0;
                }
                oj6 v = oj6Var.v(i, 0, i18Var);
                if (oj6Var != v) {
                    if (v == null) {
                        bl4Var = bl4.z;
                    } else {
                        bl4Var = new bl4(v, bl4Var.y - 1);
                    }
                }
                pk2 pk2Var = pk2.W;
                if (obj2 != pk2Var) {
                    Object obj4 = bl4Var.get(obj2);
                    obj4.getClass();
                    bl4Var = bl4Var.c(obj2, new xh3(((xh3) obj4).a, obj3));
                }
                if (obj3 != pk2Var) {
                    Object obj5 = bl4Var.get(obj3);
                    obj5.getClass();
                    bl4Var = bl4Var.c(obj3, new xh3(obj2, ((xh3) obj5).b));
                }
                if (obj2 != pk2Var) {
                    obj = kl4Var.x;
                } else {
                    obj = obj3;
                }
                if (obj3 != pk2Var) {
                    obj2 = kl4Var.y;
                }
                kl4Var2 = new kl4(obj, obj2, bl4Var);
            }
            if (kl4Var == kl4Var2) {
                return;
            }
        } while (!sx5Var.j(kl4Var, kl4Var2));
    }

    public static TypedValue G(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(defpackage.w42 r6, defpackage.xz0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.h62
            if (r0 == 0) goto L13
            r0 = r7
            h62 r0 = (defpackage.h62) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            h62 r0 = new h62
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.z
            r2 = 0
            ni1 r3 = defpackage.tb4.a
            r4 = 1
            if (r1 == 0) goto L30
            if (r1 != r4) goto L2a
            w05 r6 = r0.x
            defpackage.m37.N(r7)
            goto L4e
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r2
        L30:
            defpackage.m37.N(r7)
            w05 r7 = new w05
            r7.<init>()
            r7.x = r3
            z52 r1 = new z52
            r5 = 2
            r1.<init>(r7, r5)
            r0.x = r7
            r0.z = r4
            java.lang.Object r6 = r6.collect(r1, r0)
            w11 r0 = defpackage.w11.x
            if (r6 != r0) goto L4d
            return r0
        L4d:
            r6 = r7
        L4e:
            java.lang.Object r6 = r6.x
            if (r6 == r3) goto L53
            return r6
        L53:
            java.lang.String r6 = "Flow is empty"
            defpackage.p65.h(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw0.H(w42, xz0):java.lang.Object");
    }

    public static void I(yi0 yi0Var) {
        int g = yi0Var.g(6);
        if (g >= 2 && g <= 42) {
            yi0Var.o(g * 8);
            return;
        }
        throw bj4.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(g)));
    }

    public static final char[] J(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
        }
        return cArr;
    }

    public static final String K(long j) {
        if (j <= 0) {
            return "0 MB";
        }
        float f = ((float) j) / 1048576.0f;
        if (f < 1024.0f) {
            return String.format(Locale.US, "%.0f MB", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        }
        return String.format(Locale.US, "%.2f GB", Arrays.copyOf(new Object[]{Float.valueOf(f / 1024.0f)}, 1));
    }

    public static String L(long j) {
        return qx1.j(j, "PointerId(value=", ")");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [zk4, dl4] */
    public static final al4 M(mw4[] mw4VarArr, al4 al4Var, al4 al4Var2) {
        al4 al4Var3 = al4.A;
        ?? dl4Var = new dl4(al4Var3);
        dl4Var.D = al4Var3;
        for (mw4 mw4Var : mw4VarArr) {
            jw4 jw4Var = mw4Var.a;
            if (mw4Var.g || !al4Var.containsKey(jw4Var)) {
                dl4Var.put(jw4Var, jw4Var.d(mw4Var, (wq6) al4Var2.get(jw4Var)));
            }
        }
        return dl4Var.a();
    }

    public static final tw5 N(z04 z04Var, kd2 kd2Var) {
        y04 y04Var = (y04) kd2Var.j(ho3.a);
        int ordinal = z04Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                y04Var.getClass();
                                tw5 tw5Var = y04.g;
                                tw5Var.getClass();
                                return tw5Var;
                            }
                            ze0.l();
                            return null;
                        }
                        y04Var.getClass();
                        tw5 tw5Var2 = y04.f;
                        tw5Var2.getClass();
                        return tw5Var2;
                    }
                    y04Var.getClass();
                    tw5 tw5Var3 = y04.e;
                    tw5Var3.getClass();
                    return tw5Var3;
                }
                y04Var.getClass();
                tw5 tw5Var4 = y04.d;
                tw5Var4.getClass();
                return tw5Var4;
            }
            y04Var.getClass();
            tw5 tw5Var5 = y04.c;
            tw5Var5.getClass();
            return tw5Var5;
        }
        y04Var.getClass();
        tw5 tw5Var6 = y04.b;
        tw5Var6.getClass();
        return tw5Var6;
    }

    public static final n05 O(ha3 ha3Var) {
        n05 q = te4.q(ha3Var, true);
        long q2 = ha3Var.q(q.f());
        float f = q.c;
        float f2 = q.d;
        long q3 = ha3Var.q((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        return new n05(Float.intBitsToFloat((int) (q2 >> 32)), Float.intBitsToFloat((int) (q2 & 4294967295L)), Float.intBitsToFloat((int) (q3 >> 32)), Float.intBitsToFloat((int) (q3 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r17, final defpackage.ub2 r18, defpackage.yz3 r19, boolean r20, defpackage.kd2 r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw0.a(boolean, ub2, yz3, boolean, kd2, int, int):void");
    }

    public static final void b(final EpisodeDownload episodeDownload, final Long l, final Long l2, final boolean z2, final sb2 sb2Var, final boolean z3, final sb2 sb2Var2, final ub2 ub2Var, yz3 yz3Var, final sb2 sb2Var3, final sb2 sb2Var4, kd2 kd2Var, final int i, final int i2, final int i3) {
        int i4;
        Long l3;
        Long l4;
        boolean z4;
        yz3 yz3Var2;
        int i5;
        int i6;
        int i7;
        boolean z5;
        final yz3 yz3Var3;
        yz3 yz3Var4;
        File file;
        boolean z6;
        boolean z7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        sb2Var.getClass();
        sb2Var2.getClass();
        ub2Var.getClass();
        sb2Var3.getClass();
        sb2Var4.getClass();
        kd2Var.f0(748691584);
        if (kd2Var.h(episodeDownload)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i17 = i4 | i;
        if ((i & 48) == 0) {
            l3 = l;
            if (kd2Var.f(l3)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i17 |= i16;
        } else {
            l3 = l;
        }
        if ((i & 384) == 0) {
            l4 = l2;
            if (kd2Var.f(l4)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i17 |= i15;
        } else {
            l4 = l2;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            if (kd2Var.g(z4)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i17 |= i14;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            if (kd2Var.h(sb2Var)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i17 |= i13;
        }
        if ((i & 196608) == 0) {
            if (kd2Var.g(z3)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i17 |= i12;
        }
        if ((1572864 & i) == 0) {
            if (kd2Var.h(sb2Var2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i17 |= i11;
        }
        if ((i & 12582912) == 0) {
            if (kd2Var.h(ub2Var)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i17 |= i10;
        }
        int i18 = i3 & 256;
        if (i18 != 0) {
            i6 = i17 | 100663296;
            yz3Var2 = yz3Var;
        } else {
            yz3Var2 = yz3Var;
            if (kd2Var.f(yz3Var2)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i6 = i17 | i5;
        }
        if ((i & 805306368) == 0) {
            if (kd2Var.h(sb2Var3)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i6 |= i9;
        }
        if ((i2 & 6) == 0) {
            if (kd2Var.h(sb2Var4)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i2 | i8;
        } else {
            i7 = i2;
        }
        boolean z8 = false;
        int i19 = i6;
        if ((i6 & 306783379) == 306783378 && (i7 & 3) == 2) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (kd2Var.V(i19 & 1, z5)) {
            if (i18 != 0) {
                yz3Var4 = vz3.x;
            } else {
                yz3Var4 = yz3Var2;
            }
            Context context = (Context) kd2Var.j(eb.b);
            String id = episodeDownload.getId();
            String animeId = episodeDownload.getMetadata().getAnimeId();
            boolean f = kd2Var.f(episodeDownload.getMetadata().getThumbnailImage()) | kd2Var.f(id) | kd2Var.f(animeId) | kd2Var.f(episodeDownload.getMetadata().getCoverImage());
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (f || Q == q18Var) {
                File D2 = x97.D(context, episodeDownload.getId());
                if (!D2.exists() || D2.length() <= 0) {
                    D2 = null;
                }
                File B2 = x97.B(context, episodeDownload.getMetadata().getAnimeId(), Integer.valueOf(episodeDownload.getMetadata().getAnilistId()));
                if (B2.exists() && B2.length() > 0) {
                    file = B2;
                } else {
                    file = null;
                }
                Q = episodeDownload.getMetadata().getThumbnailImage();
                if (Q == null) {
                    Q = episodeDownload.getMetadata().getCoverImage();
                }
                if (D2 == null) {
                    if (file != null) {
                        Q = file;
                    }
                } else {
                    Q = D2;
                }
                kd2Var.n0(Q);
            }
            bv2 bv2Var = new bv2(context);
            bv2Var.c = Q;
            hv2.a(bv2Var, true);
            ev2 a = bv2Var.a();
            yz3 yz3Var5 = yz3Var4;
            yz3 T = n77.T(ar5.c(yz3Var4, 1.0f), 0.0f, 6.0f, 1);
            boolean isCompleted = episodeDownload.isCompleted();
            if ((i19 & 458752) == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i19 & 57344) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z9 = z6 | z7;
            if ((i19 & 1879048192) == 536870912) {
                z8 = true;
            }
            boolean z10 = z9 | z8;
            Object Q2 = kd2Var.Q();
            if (z10 || Q2 == q18Var) {
                Q2 = new jm(z3, sb2Var, sb2Var3, (byte) 1);
                kd2Var.n0(Q2);
            }
            l36.a(kb0.z(T, isCompleted, (sb2) Q2, sb2Var4, kd2Var, ((i7 << 24) & 234881024) | 196608, 46), ((cn5) kd2Var.j(dn5.a)).c, ((mp0) kd2Var.j(op0.a)).n, 0L, 0.0f, 0.0f, null, nx7.R(2105235333, new wv1(episodeDownload, a, z3, l3, l4, z4, sb2Var, ub2Var, sb2Var2), kd2Var), kd2Var, 12582912, 120);
            yz3Var3 = yz3Var5;
        } else {
            kd2Var.Y();
            yz3Var3 = yz3Var2;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: xv1
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(i | 1);
                    int N2 = kb0.N(i2);
                    sw0.b(EpisodeDownload.this, l, l2, z2, sb2Var, z3, sb2Var2, ub2Var, yz3Var3, sb2Var3, sb2Var4, (kd2) obj, N, N2, i3);
                    return pn6.a;
                }
            };
        }
    }

    public static final byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, int i) {
        secretKey.getClass();
        bArr.getClass();
        byte[] Q0 = ms.Q0(bArr, bArr2);
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        mac.getClass();
        if (i >= 12) {
            byte[] bArr3 = new byte[0];
            byte[] bArr4 = Q0;
            while (bArr3.length < i) {
                mac.reset();
                mac.init(secretKey);
                mac.update(bArr4);
                bArr4 = mac.doFinal();
                bArr4.getClass();
                mac.reset();
                mac.init(secretKey);
                mac.update(bArr4);
                mac.update(Q0);
                byte[] doFinal = mac.doFinal();
                doFinal.getClass();
                bArr3 = ms.Q0(bArr3, doFinal);
            }
            return Arrays.copyOf(bArr3, i);
        }
        ze0.k("Failed requirement.");
        return null;
    }

    public static final yz3 d(yz3 yz3Var, float f) {
        if (f == 1.0f) {
            return yz3Var;
        }
        return io3.P(yz3Var, 0.0f, 0.0f, f, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 1044475);
    }

    public static final List e(og5 og5Var, int i, int i2, ArrayList arrayList, r34 r34Var, int i3, int i4, int i5, boolean z2, ub2 ub2Var) {
        int i6;
        r34 r34Var2;
        vd3 vd3Var;
        int i7;
        long j;
        int i8;
        Object obj;
        int i9;
        int max;
        long j2;
        if (og5Var != null && !arrayList.isEmpty() && (i6 = r34Var.b) != 0) {
            int i10 = -1;
            int i11 = 0;
            if (i2 - i >= 0 && i6 != 0) {
                f13 r0 = db.r0(0, i6);
                int i12 = r0.x;
                int i13 = r0.y;
                int i14 = -1;
                if (i12 <= i13) {
                    while (r34Var.c(i12) <= i) {
                        i14 = r34Var.c(i12);
                        if (i12 == i13) {
                            break;
                        }
                        i12++;
                    }
                }
                if (i14 == -1) {
                    r34Var2 = y03.a;
                } else {
                    r34 r34Var3 = y03.a;
                    r34Var2 = new r34(1);
                    r34Var2.a(i14);
                }
            } else {
                r34Var2 = y03.a;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj2 = arrayList.get(i15);
                int index = ((vd3) obj2).getIndex();
                int[] iArr = r34Var.a;
                int i16 = r34Var.b;
                int i17 = i11;
                while (true) {
                    if (i17 >= i16) {
                        break;
                    }
                    if (iArr[i17] == index) {
                        arrayList3.add(obj2);
                        break;
                    }
                    i17++;
                }
                i15++;
                i11 = 0;
            }
            int[] iArr2 = r34Var2.a;
            int i18 = r34Var2.b;
            int i19 = 0;
            while (i19 < i18) {
                int i20 = iArr2[i19];
                int size2 = arrayList.size();
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    if (i22 < size2) {
                        Object obj3 = arrayList.get(i22);
                        i22++;
                        if (((vd3) obj3).getIndex() == i20) {
                            break;
                        }
                        i21++;
                    } else {
                        i21 = i10;
                        break;
                    }
                }
                if (i21 == i10) {
                    vd3Var = (vd3) ub2Var.invoke(Integer.valueOf(i20));
                } else {
                    vd3Var = (vd3) arrayList.remove(i21);
                }
                int e0 = db.e0(vd3Var, z2);
                if (i21 == i10) {
                    i7 = i19;
                    i8 = Integer.MIN_VALUE;
                } else {
                    long g = vd3Var.g(0);
                    if (z2) {
                        i7 = i19;
                        j = g & 4294967295L;
                    } else {
                        i7 = i19;
                        j = g >> 32;
                    }
                    i8 = (int) j;
                }
                int size3 = arrayList3.size();
                int i23 = 0;
                while (true) {
                    if (i23 < size3) {
                        obj = arrayList3.get(i23);
                        if (((vd3) obj).getIndex() != i20) {
                            break;
                        }
                        i23++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                vd3 vd3Var2 = (vd3) obj;
                if (vd3Var2 != null) {
                    long g2 = vd3Var2.g(0);
                    if (z2) {
                        j2 = g2 & 4294967295L;
                    } else {
                        j2 = g2 >> 32;
                    }
                    i9 = (int) j2;
                } else {
                    i9 = Integer.MIN_VALUE;
                }
                if (i8 == Integer.MIN_VALUE) {
                    max = -i3;
                } else {
                    max = Math.max(-i3, i8);
                }
                if (i9 != Integer.MIN_VALUE) {
                    max = Math.min(max, i9 - e0);
                }
                vd3Var.j();
                vd3Var.k(max, 0, i4, i5);
                arrayList2.add(vd3Var);
                i19 = i7 + 1;
                i10 = -1;
            }
            return arrayList2;
        }
        return nt1.x;
    }

    public static final Drawable f(mu2 mu2Var, Resources resources) {
        if (mu2Var instanceof gp1) {
            return ((gp1) mu2Var).a;
        }
        if (mu2Var instanceof o60) {
            return new BitmapDrawable(resources, ((o60) mu2Var).a);
        }
        return new ru2(mu2Var);
    }

    public static final mu2 g(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return new o60(((BitmapDrawable) drawable).getBitmap());
        }
        return new gp1(drawable);
    }

    public static final g03 h(qg qgVar, kd2 kd2Var) {
        return new g03(qgVar, (ud1) kd2Var.j(bv0.h));
    }

    public static final void i(ae0 ae0Var) {
        ae0Var.getClass();
        h41.A(new d0(1, ae0Var, ae0.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 3));
    }

    public static final boolean j(n05 n05Var, float f, float f2) {
        float f3 = n05Var.a;
        if (f <= n05Var.c && f3 <= f) {
            float f4 = n05Var.b;
            if (f2 <= n05Var.d && f4 <= f2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean k(long j, n05 n05Var) {
        float f = n05Var.a;
        float f2 = n05Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f <= intBitsToFloat && intBitsToFloat <= f2) {
            float f3 = n05Var.b;
            float f4 = n05Var.d;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (f3 <= intBitsToFloat2 && intBitsToFloat2 <= f4) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final long l(cv5 cv5Var, long j) {
        cv5Var.getClass();
        cv5Var.g(j);
        long min = Math.min(j, cv5Var.c().z);
        cv5Var.c().skip(min);
        return min;
    }

    public static final w42 m(w42 w42Var) {
        if (w42Var instanceof qx5) {
            return w42Var;
        }
        return n(w42Var, F, G);
    }

    public static final ji1 n(w42 w42Var, ub2 ub2Var, ic2 ic2Var) {
        if (w42Var instanceof ji1) {
            ji1 ji1Var = (ji1) w42Var;
            if (ji1Var.y == ub2Var && ji1Var.z == ic2Var) {
                return ji1Var;
            }
        }
        return new ji1(w42Var, ub2Var, ic2Var);
    }

    public static final boolean o(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(defpackage.w42 r7, defpackage.vz0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.c62
            if (r0 == 0) goto L13
            r0 = r8
            c62 r0 = (defpackage.c62) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            c62 r0 = new c62
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.A
            r2 = 0
            ni1 r3 = defpackage.tb4.a
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2e
            z52 r7 = r0.y
            w05 r1 = r0.x
            defpackage.m37.N(r8)     // Catch: defpackage.f -> L2c
            goto L62
        L2c:
            r8 = move-exception
            goto L57
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r2
        L34:
            defpackage.m37.N(r8)
            w05 r1 = new w05
            r1.<init>()
            r1.x = r3
            z52 r8 = new z52
            r5 = 0
            r8.<init>(r1, r5)
            r0.x = r1     // Catch: defpackage.f -> L53
            r0.y = r8     // Catch: defpackage.f -> L53
            r0.A = r4     // Catch: defpackage.f -> L53
            java.lang.Object r7 = r7.collect(r8, r0)     // Catch: defpackage.f -> L53
            w11 r8 = defpackage.w11.x
            if (r7 != r8) goto L62
            return r8
        L53:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L57:
            java.lang.Object r4 = r8.x
            if (r4 != r7) goto L6d
            l11 r7 = r0.getContext()
            defpackage.h98.o(r7)
        L62:
            java.lang.Object r7 = r1.x
            if (r7 == r3) goto L67
            return r7
        L67:
            java.lang.String r7 = "Expected at least one element"
            defpackage.p65.h(r7)
            return r2
        L6d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw0.p(w42, vz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.w42 r6, defpackage.ic2 r7, defpackage.xz0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.d62
            if (r0 == 0) goto L13
            r0 = r8
            d62 r0 = (defpackage.d62) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            d62 r0 = new d62
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.A
            r2 = 0
            ni1 r3 = defpackage.tb4.a
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2e
            b62 r6 = r0.y
            w05 r7 = r0.x
            defpackage.m37.N(r8)     // Catch: defpackage.f -> L2c
            goto L64
        L2c:
            r8 = move-exception
            goto L59
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r2
        L34:
            defpackage.m37.N(r8)
            w05 r8 = new w05
            r8.<init>()
            r8.x = r3
            b62 r1 = new b62
            r5 = 0
            r1.<init>(r7, r8, r5)
            r0.x = r8     // Catch: defpackage.f -> L55
            r0.y = r1     // Catch: defpackage.f -> L55
            r0.A = r4     // Catch: defpackage.f -> L55
            java.lang.Object r6 = r6.collect(r1, r0)     // Catch: defpackage.f -> L55
            w11 r7 = defpackage.w11.x
            if (r6 != r7) goto L53
            return r7
        L53:
            r7 = r8
            goto L64
        L55:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r1
        L59:
            java.lang.Object r1 = r8.x
            if (r1 != r6) goto L6f
            l11 r6 = r0.getContext()
            defpackage.h98.o(r6)
        L64:
            java.lang.Object r6 = r7.x
            if (r6 == r3) goto L69
            return r6
        L69:
            java.lang.String r6 = "Expected at least one element matching the predicate"
            defpackage.p65.h(r6)
            return r2
        L6f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw0.q(w42, ic2, xz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.w42 r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.f62
            if (r0 == 0) goto L13
            r0 = r6
            f62 r0 = (defpackage.f62) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            f62 r0 = new f62
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.z
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            z52 r5 = r0.y
            w05 r1 = r0.x
            defpackage.m37.N(r6)     // Catch: defpackage.f -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L52
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L32:
            defpackage.m37.N(r6)
            w05 r1 = new w05
            r1.<init>()
            z52 r6 = new z52
            r6.<init>(r1, r2)
            r0.x = r1     // Catch: defpackage.f -> L4e
            r0.y = r6     // Catch: defpackage.f -> L4e
            r0.A = r2     // Catch: defpackage.f -> L4e
            java.lang.Object r5 = r5.collect(r6, r0)     // Catch: defpackage.f -> L4e
            w11 r6 = defpackage.w11.x
            if (r5 != r6) goto L5d
            return r6
        L4e:
            r5 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L52:
            java.lang.Object r2 = r6.x
            if (r2 != r5) goto L60
            l11 r5 = r0.getContext()
            defpackage.h98.o(r5)
        L5d:
            java.lang.Object r5 = r1.x
            return r5
        L60:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw0.r(w42, xz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, w05] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.w42 r4, defpackage.ic2 r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.g62
            if (r0 == 0) goto L13
            r0 = r6
            g62 r0 = (defpackage.g62) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            g62 r0 = new g62
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.z
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            b62 r4 = r0.y
            w05 r5 = r0.x
            defpackage.m37.N(r6)     // Catch: defpackage.f -> L29
            goto L5f
        L29:
            r6 = move-exception
            goto L54
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L32:
            defpackage.m37.N(r6)
            w05 r6 = new w05
            r6.<init>()
            b62 r1 = new b62
            r1.<init>(r5, r6, r2)
            r0.x = r6     // Catch: defpackage.f -> L50
            r0.y = r1     // Catch: defpackage.f -> L50
            r0.A = r2     // Catch: defpackage.f -> L50
            java.lang.Object r4 = r4.collect(r1, r0)     // Catch: defpackage.f -> L50
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L4e
            return r5
        L4e:
            r5 = r6
            goto L5f
        L50:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r1
        L54:
            java.lang.Object r1 = r6.x
            if (r1 != r4) goto L62
            l11 r4 = r0.getContext()
            defpackage.h98.o(r4)
        L5f:
            java.lang.Object r4 = r5.x
            return r4
        L62:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw0.s(w42, ic2, xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (((int) ((defpackage.oa0) r0).z) >= 1048576) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.ae0 r2, defpackage.xz0 r3) {
        /*
            r2.getClass()
            java.lang.Throwable r0 = r2.b()
            if (r0 != 0) goto L2b
            boolean r0 = r2.i()
            if (r0 != 0) goto L1f
            qq5 r0 = r2.e()
            r0.getClass()
            oa0 r0 = (defpackage.oa0) r0
            long r0 = r0.z
            int r0 = (int) r0
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r0 < r1) goto L28
        L1f:
            java.lang.Object r2 = r2.d(r3)
            w11 r3 = defpackage.w11.x
            if (r2 != r3) goto L28
            return r2
        L28:
            pn6 r2 = defpackage.pn6.a
            return r2
        L2b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw0.t(ae0, xz0):java.lang.Object");
    }

    public static void u(int i, zi4 zi4Var) {
        zi4Var.K(7);
        byte[] bArr = zi4Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static ByteBuffer v(qc4 qc4Var) {
        boolean z2;
        ByteBuffer byteBuffer = qc4Var.b;
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + 9);
        allocate.put((byte) ((qc4Var.a << 3) | 2));
        int remaining = byteBuffer.remaining();
        boolean z3 = true;
        if (remaining > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.n(z2);
        int i = remaining;
        int i2 = 0;
        do {
            i2++;
            i >>= 7;
        } while (i != 0);
        ByteBuffer allocate2 = ByteBuffer.allocate(i2);
        if (i2 >= 8) {
            z3 = false;
        }
        io3.B(z3);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (byte) (remaining & 127);
            remaining >>= 7;
            if (remaining != 0) {
                i4 |= 128;
            }
            allocate2.put((byte) i4);
        }
        allocate2.flip();
        allocate.put(allocate2);
        allocate.put(byteBuffer.duplicate());
        allocate.flip();
        return allocate;
    }

    public static final long w(cv5 cv5Var) {
        cv5Var.getClass();
        return cv5Var.c().z;
    }

    public static long x(double d) {
        io3.m("not a normal value", z(d));
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits << 1;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }

    public static a83 y(al6 al6Var) {
        return new a83(c83.x, al6Var);
    }

    public static boolean z(double d) {
        if (Math.getExponent(d) <= 1023) {
            return true;
        }
        return false;
    }
}
