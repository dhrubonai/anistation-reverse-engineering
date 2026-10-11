package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.media.AudioDescriptor;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.anistation.android.R;
import com.anistation.model.Info;
import com.anistation.model.Recent;
import com.unity3d.ads.core.domain.AndroidGetIsModulesInitEnabled;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class iv {
    public static AudioManager a;
    public static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final os0 d = new os0(1845212254, false, new qs0(13));
    public static final dw2 e = new dw2(false);
    public static final np0 f = np0.C;
    public static final float g = 4.0f;
    public static final float h = 32.0f;
    public static final float i = 1.0f;
    public static pc j;
    public static t9 k;
    public static xg0 l;

    public static int A(yi0 yi0Var) {
        int g2 = yi0Var.g(4);
        if (g2 == 15) {
            if (yi0Var.b() >= 24) {
                return yi0Var.g(24);
            }
            throw bj4.a("AAC header insufficient data", null);
        }
        if (g2 < 13) {
            return b[g2];
        }
        throw bj4.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static final ag5 B(Object obj) {
        if (obj != iv0.a) {
            return (ag5) obj;
        }
        ze0.m("Does not contain segment");
        return null;
    }

    public static final long C(long j2) {
        if (j2 < 0) {
            m18 m18Var = fq1.y;
            return fq1.A;
        }
        m18 m18Var2 = fq1.y;
        return fq1.z;
    }

    public static final void D(m1 m1Var, String str) {
        m1Var.t(m1Var.y - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final boolean E(Context context) {
        try {
            if (Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static final boolean F(Object obj) {
        if (obj == iv0.a) {
            return true;
        }
        return false;
    }

    public static final bx5 G(w42 w42Var, v11 v11Var) {
        return tl7.z(v11Var, null, null, new c52(w42Var, null, (byte) 0), 3);
    }

    public static final yz3 H(yz3 yz3Var, t73 t73Var, fe3 fe3Var, rg4 rg4Var, boolean z) {
        return yz3Var.w(new ie3(t73Var, fe3Var, rg4Var, z));
    }

    public static final CharSequence I(CharSequence charSequence, int i2) {
        String str;
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i2 == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    return "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                if (i3 > 0) {
                    str = ".....";
                } else {
                    str = "";
                }
                if (i4 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder sb = new StringBuilder(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length2 = charSequence.length();
                if (i4 > length2) {
                    i4 = length2;
                }
                sb.append(charSequence.subSequence(i3, i4).toString());
                sb.append(str2);
                return sb.toString();
            }
        }
        return charSequence;
    }

    public static final String J(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        String str2 = ". ";
        if (str != null) {
            str2 = qx1.m(" with key ", str, ". ");
        }
        return h11.k(sb, str2, "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static ed4 K(yi0 yi0Var, boolean z) {
        int g2 = yi0Var.g(5);
        if (g2 == 31) {
            g2 = yi0Var.g(6) + 32;
        }
        int A = A(yi0Var);
        int g3 = yi0Var.g(4);
        String h2 = qx1.h(g2, "mp4a.40.");
        if (g2 == 5 || g2 == 29) {
            A = A(yi0Var);
            int g4 = yi0Var.g(5);
            if (g4 == 31) {
                g4 = yi0Var.g(6) + 32;
            }
            g2 = g4;
            if (g2 == 22) {
                g3 = yi0Var.g(4);
            }
        }
        if (z) {
            if (g2 != 1 && g2 != 2 && g2 != 3 && g2 != 4 && g2 != 6 && g2 != 7 && g2 != 17) {
                switch (g2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw bj4.d("Unsupported audio object type: " + g2);
                }
            }
            if (yi0Var.f()) {
                kb0.O("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (yi0Var.f()) {
                yi0Var.o(14);
            }
            boolean f2 = yi0Var.f();
            if (g3 != 0) {
                if (g2 == 6 || g2 == 20) {
                    yi0Var.o(3);
                }
                if (f2) {
                    if (g2 == 22) {
                        yi0Var.o(16);
                    }
                    if (g2 == 17 || g2 == 19 || g2 == 20 || g2 == 23) {
                        yi0Var.o(3);
                    }
                    yi0Var.o(1);
                }
                switch (g2) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int g5 = yi0Var.g(2);
                        if (g5 == 2 || g5 == 3) {
                            throw bj4.d("Unsupported epConfig: " + g5);
                        }
                }
            } else {
                ze0.d();
                return null;
            }
        }
        int i2 = c[g3];
        if (i2 != -1) {
            return new ed4(A, i2, h2);
        }
        throw bj4.a(null, null);
    }

    public static final Object L(ic2 ic2Var) {
        Thread.interrupted();
        return bx7.K(it1.x, new yh(ic2Var, null, (byte) 20));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
    
        if ((java.lang.Integer.signum(r7) * java.lang.Long.signum(r16)) > 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012d, code lost:
    
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012b, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0129, code lost:
    
        if ((java.lang.Integer.signum(r7) * java.lang.Long.signum(r16)) > 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long M(long r34, long r36) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv.M(long, long):long");
    }

    public static final long N(long j2, long j3) {
        long j4 = j2 - j3;
        long j5 = (j4 ^ j2) & (~(j4 ^ j3));
        jq1 jq1Var = jq1.NANOSECONDS;
        if (j5 < 0) {
            jq1 jq1Var2 = jq1.MILLISECONDS;
            if (jq1Var.compareTo(jq1Var2) < 0) {
                long j6 = (j2 / 1000000) - (j3 / 1000000);
                long j7 = (j2 % 1000000) - (j3 % 1000000);
                m18 m18Var = fq1.y;
                return fq1.g(w65.W(j6, jq1Var2), w65.W(j7, jq1Var));
            }
            return fq1.k(C(j4));
        }
        return w65.W(j4, jq1Var);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, of6] */
    public static final xt O(InputStream inputStream) {
        inputStream.getClass();
        return new xt(inputStream, (of6) new Object());
    }

    public static final void P(String str, e73 e73Var) {
        String sb;
        e73Var.getClass();
        StringBuilder sb2 = new StringBuilder("in the polymorphic scope of '");
        im0 im0Var = (im0) e73Var;
        sb2.append(im0Var.f());
        sb2.append('\'');
        String sb3 = sb2.toString();
        if (str == null) {
            sb = qx1.g('.', "Class discriminator was missing and no default serializers were registered ", sb3);
        } else {
            StringBuilder o = h11.o("Serializer for subclass '", str, "' is not found ", sb3, ".\nCheck if class with serial name '");
            qx1.x(o, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            o.append(im0Var.f());
            o.append("' has to be sealed and '@Serializable'.");
            sb = o.toString();
        }
        throw new IllegalArgumentException(sb);
    }

    public static final boolean Q(Throwable th, sb2 sb2Var) {
        List asList;
        Object invoke;
        th.getClass();
        Integer num = x33.a;
        vf1 vf1Var = null;
        if (num != null && num.intValue() < 19) {
            Method method = nm4.b;
            if (method != null && (invoke = method.invoke(th, null)) != null) {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            } else {
                asList = nt1.x;
            }
        } else {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        }
        int size = asList.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) asList.get(i2)) instanceof vf1) {
                return false;
            }
        }
        try {
            pt0 pt0Var = (pt0) sb2Var.invoke();
            if (pt0Var != null) {
                boolean z2 = pt0Var.b;
                List list = pt0Var.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((rt0) list.get(i3)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                pt0Var.getClass();
                vf1Var = new vf1(pt0Var);
            }
        } catch (Throwable th2) {
            vf1Var = th2;
        }
        if (vf1Var != null) {
            n03.i(th, vf1Var);
        }
        return z;
    }

    public static final Exception R(String str, FileNotFoundException fileNotFoundException) {
        int i2;
        boolean z = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                Process.myUserHandle().writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                i2 = obtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i2 = 0;
            }
            Object invoke = method.invoke(null, "sys.user." + i2 + ".ce_available", "false");
            invoke.getClass();
            z = ((String) invoke).equals(AndroidGetIsModulesInitEnabled.ENABLE_MODULES_INIT_VALUE);
        } catch (Throwable th) {
            n03.i(fileNotFoundException, th);
        }
        if (z || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new ng1(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r33, final java.lang.String r34, final java.lang.String r35, defpackage.yz3 r36, java.lang.String r37, java.lang.String r38, boolean r39, long r40, long r42, long r44, long r46, final defpackage.sb2 r48, final defpackage.sb2 r49, defpackage.sb2 r50, defpackage.kd2 r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv.a(boolean, java.lang.String, java.lang.String, yz3, java.lang.String, java.lang.String, boolean, long, long, long, long, sb2, sb2, sb2, kd2, int, int, int):void");
    }

    public static final void b(boolean z, ub2 ub2Var, yz3 yz3Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        yz3 yz3Var2;
        long j2;
        float f2;
        boolean z3;
        boolean z4;
        xh4 H;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(-817826315);
        byte b2 = 2;
        if (kd2Var2.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (kd2Var2.h(ub2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4 | 384;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var2.V(i6 & 1, z2)) {
            if (z) {
                j2 = ep0.e;
            } else {
                j2 = ip0.j;
            }
            px5 a2 = jq5.a(j2, z51.V(300, 6, null), "autoPlaySwitchBackgroundColor", kd2Var2);
            if (z) {
                f2 = 16.0f;
            } else {
                f2 = 0.0f;
            }
            px5 a3 = xj.a(f2, z51.O(1.0f, 400.0f, null, 4), "autoPlaySwitchThumbOffset", kd2Var2);
            vz3 vz3Var = vz3.x;
            yz3 e2 = ar5.e(ar5.l(vz3Var, 38.0f), 22.0f);
            long j3 = ((ep0) a2.getValue()).a;
            o75 o75Var = tm5.b;
            yz3 h2 = bx7.h(e2, j3, o75Var);
            if ((i6 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i6 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | z3;
            Object Q = kd2Var2.Q();
            q18 q18Var = au0.a;
            if (z5 || Q == q18Var) {
                Q = new ch((byte) 4, ub2Var, z);
                kd2Var2.n0(Q);
            }
            kd2Var2 = kd2Var;
            yz3 R = n77.R(kb0.A(h2, false, null, null, false, (sb2) Q, kd2Var, 0, 31), 2.0f);
            vo3 c2 = b90.c(pk2.B, false);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, R);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z6 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z6) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, c2);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            boolean f3 = kd2Var2.f(a3);
            Object Q2 = kd2Var2.Q();
            if (f3 || Q2 == q18Var) {
                Q2 = new qh(a3, b2);
                kd2Var2.n0(Q2);
            }
            yz3 h3 = bx7.h(ar5.i(oi4.z(vz3Var, (ub2) Q2), 18.0f), ep0.b, o75Var);
            vo3 c3 = b90.c(pk2.C, false);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l3 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, h3);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, c3);
            ss5.i(ys0Var, kd2Var2, l3);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            if (z) {
                kd2Var2.e0(-473635375);
                H = w65.H(R.drawable.play, kd2Var2, 0);
                kd2Var2.q(false);
            } else {
                kd2Var2.e0(-473557968);
                H = w65.H(R.drawable.pause, kd2Var2, 0);
                kd2Var2.q(false);
            }
            yt2.a(H, null, ar5.i(vz3Var, 10.0f), ep0.e, kd2Var2, 3512, 0);
            kd2Var2.q(true);
            kd2Var2.q(true);
            yz3Var2 = vz3Var;
        } else {
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new dh(z, ub2Var, yz3Var2, i2, (byte) 1);
        }
    }

    public static final void c(Info info, float f2, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        boolean z;
        kd2 kd2Var2;
        kd2Var.f0(-1712634750);
        if (kd2Var.h(info)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (kd2Var.c(f2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i6 & 1, z)) {
            Object bannerImage = info.getBannerImage();
            if (bannerImage == null && (bannerImage = info.getCoverImage().getExtraLarge()) == null) {
                bannerImage = info.getCoverImage().getLarge();
            }
            Context context = (Context) kd2Var.j(eb.b);
            boolean f3 = kd2Var.f(bannerImage) | kd2Var.f(context);
            Object Q = kd2Var.Q();
            if (f3 || Q == au0.a) {
                bv2 bv2Var = new bv2(context);
                bv2Var.c = bannerImage;
                hv2.a(bv2Var, true);
                Q = bv2Var.a();
                kd2Var.n0(Q);
            }
            ev2 ev2Var = (ev2) Q;
            yz3 h2 = bx7.h(n03.k(ar5.e(ar5.c(vz3.x, 1.0f), f2), ((cn5) kd2Var.j(dn5.a)).c), ((mp0) kd2Var.j(op0.a)).p, io3.h);
            vo3 c2 = b90.c(pk2.y, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E = o80.E(kd2Var, h2);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c2);
            ss5.i(p7.E, kd2Var, l2);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            kd2Var2 = kd2Var;
            tl7.a(ev2Var, e02.b(info.getTitle()), ar5.c, pk2.O, kd2Var2, 1573248);
            kd2Var2.q(true);
        } else {
            kd2Var2 = kd2Var;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new a30(info, f2, i2);
        }
    }

    public static za0 d(int i2, int i3, ta0 ta0Var) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        ta0 ta0Var2 = ta0.x;
        if (i4 != 0) {
            ta0Var = ta0Var2;
        }
        if (i2 != -2) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != Integer.MAX_VALUE) {
                        if (ta0Var == ta0Var2) {
                            return new za0(i2, null);
                        }
                        return new qv0(i2, ta0Var, null);
                    }
                    return new za0(Integer.MAX_VALUE, null);
                }
                if (ta0Var == ta0Var2) {
                    return new za0(0, null);
                }
                return new qv0(1, ta0Var, null);
            }
            if (ta0Var == ta0Var2) {
                return new qv0(1, ta0.y, null);
            }
            ze0.k("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (ta0Var == ta0Var2) {
            lj0.c.getClass();
            return new za0(kj0.b, null);
        }
        return new qv0(1, ta0Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(int i2, kd2 kd2Var) {
        boolean z;
        Window window;
        fg1 fg1Var;
        kd2Var.f0(-320231828);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        byte b2 = 14;
        if (kd2Var.V(i2 & 1, z)) {
            View view = (View) kd2Var.j(eb.f);
            while (true) {
                window = null;
                if (view != 0) {
                    if (view instanceof fg1) {
                        fg1Var = (fg1) view;
                        break;
                    }
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = 0;
                    }
                } else {
                    fg1Var = null;
                    break;
                }
            }
            if (fg1Var != null) {
                window = fg1Var.getWindow();
            }
            boolean h2 = kd2Var.h(window);
            Object Q = kd2Var.Q();
            if (h2 || Q == au0.a) {
                Q = new l0(window, b2);
                kd2Var.n0(Q);
            }
            db.c(window, (ub2) Q, kd2Var);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new vs0(i2, b2);
        }
    }

    public static pc f(int i2, int i3, int i4) {
        ColorSpace colorSpace;
        ColorSpace.Rgb rgb;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace.Named named;
        ColorSpace colorSpace4;
        ColorSpace.Named named2;
        ColorSpace.Named named3;
        b65 b65Var = rp0.e;
        oi4.G(i4);
        Bitmap.Config G = oi4.G(i4);
        if (a34.i(b65Var, b65Var)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (a34.i(b65Var, rp0.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (a34.i(b65Var, rp0.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (a34.i(b65Var, rp0.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (a34.i(b65Var, rp0.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (a34.i(b65Var, rp0.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (a34.i(b65Var, rp0.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (a34.i(b65Var, rp0.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (a34.i(b65Var, rp0.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (a34.i(b65Var, rp0.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (a34.i(b65Var, rp0.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (a34.i(b65Var, rp0.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (a34.i(b65Var, rp0.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (a34.i(b65Var, rp0.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (a34.i(b65Var, rp0.p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (a34.i(b65Var, rp0.n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            int i5 = Build.VERSION.SDK_INT;
            ColorSpace.Rgb.TransferParameters transferParameters = null;
            if (i5 >= 34) {
                if (a34.i(b65Var, rp0.v)) {
                    named3 = ColorSpace.Named.BT2020_HLG;
                    colorSpace4 = ColorSpace.get(named3);
                } else if (a34.i(b65Var, rp0.w)) {
                    named2 = ColorSpace.Named.BT2020_PQ;
                    colorSpace4 = ColorSpace.get(named2);
                } else {
                    colorSpace4 = null;
                }
                if (colorSpace4 != null) {
                    colorSpace2 = colorSpace4;
                    return new pc(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, G, true, colorSpace2));
                }
            }
            if (i5 >= 36) {
                if (a34.i(b65Var, rp0.x)) {
                    named = ColorSpace.Named.OK_LAB;
                    colorSpace3 = ColorSpace.get(named);
                } else {
                    colorSpace3 = null;
                }
                if (colorSpace3 != null) {
                    colorSpace2 = colorSpace3;
                    return new pc(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, G, true, colorSpace2));
                }
            }
            if (b65Var != null) {
                String str = b65Var.a;
                float[] a2 = b65Var.d.a();
                wh6 wh6Var = b65Var.g;
                if (wh6Var != null) {
                    transferParameters = new ColorSpace.Rgb.TransferParameters(wh6Var.b, wh6Var.c, wh6Var.d, wh6Var.e, wh6Var.f, wh6Var.g, wh6Var.a);
                }
                float[] fArr = b65Var.i;
                final byte b2 = 0;
                if (transferParameters != null) {
                    rgb = new ColorSpace.Rgb(str, b65Var.h, a2, transferParameters);
                    if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb.getTransform(), fArr)) {
                        colorSpace = new ColorSpace.Rgb(str, fArr, transferParameters);
                    }
                } else {
                    float[] fArr2 = b65Var.h;
                    final a65 a65Var = b65Var.l;
                    DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: qp0
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d2) {
                            byte b3 = b2;
                            ub2 ub2Var = a65Var;
                            switch (b3) {
                                case 0:
                                    return ((Number) ub2Var.invoke(Double.valueOf(d2))).doubleValue();
                                default:
                                    return ((Number) ub2Var.invoke(Double.valueOf(d2))).doubleValue();
                            }
                        }
                    };
                    final a65 a65Var2 = b65Var.o;
                    final byte b3 = 1;
                    rgb = new ColorSpace.Rgb(str, fArr2, a2, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: qp0
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d2) {
                            byte b32 = b3;
                            ub2 ub2Var = a65Var2;
                            switch (b32) {
                                case 0:
                                    return ((Number) ub2Var.invoke(Double.valueOf(d2))).doubleValue();
                                default:
                                    return ((Number) ub2Var.invoke(Double.valueOf(d2))).doubleValue();
                            }
                        }
                    }, b65Var.e, b65Var.f);
                }
                colorSpace2 = rgb;
                return new pc(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, G, true, colorSpace2));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        colorSpace2 = colorSpace;
        return new pc(Bitmap.createBitmap((DisplayMetrics) null, i2, i3, G, true, colorSpace2));
    }

    public static final o53 g(aj5 aj5Var) {
        String str = "Value of type '" + aj5Var.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + aj5Var.getKind() + '\'';
        aj5Var.a();
        return new o53(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:360:0x06af, code lost:
    
        if (r6 == r5) goto L420;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final boolean r79, final boolean r80, final boolean r81, final boolean r82, final long r83, final long r85, final long r87, final boolean r89, final boolean r90, final boolean r91, final com.anistation.model.settings.HoldAction r92, final boolean r93, final defpackage.sb2 r94, final defpackage.sb2 r95, final boolean r96, final defpackage.sb2 r97, final boolean r98, final defpackage.ub2 r99, final boolean r100, final boolean r101, final java.lang.String r102, final defpackage.ub2 r103, final defpackage.ub2 r104, final defpackage.sb2 r105, final defpackage.sb2 r106, final boolean r107, final boolean r108, final defpackage.sb2 r109, final boolean r110, final boolean r111, final defpackage.ub2 r112, final boolean r113, final defpackage.sb2 r114, final defpackage.sb2 r115, final defpackage.sb2 r116, final defpackage.sb2 r117, final java.lang.String r118, final int r119, final boolean r120, final boolean r121, final boolean r122, final defpackage.sb2 r123, defpackage.yz3 r124, defpackage.kd2 r125, final int r126, final int r127, final int r128, final int r129, final int r130) {
        /*
            Method dump skipped, instructions count: 2390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv.h(boolean, boolean, boolean, boolean, long, long, long, boolean, boolean, boolean, com.anistation.model.settings.HoldAction, boolean, sb2, sb2, boolean, sb2, boolean, ub2, boolean, boolean, java.lang.String, ub2, ub2, sb2, sb2, boolean, boolean, sb2, boolean, boolean, ub2, boolean, sb2, sb2, sb2, sb2, java.lang.String, int, boolean, boolean, boolean, sb2, yz3, kd2, int, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x036f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x039e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0425 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final boolean r32, final boolean r33, final defpackage.ub2 r34, final boolean r35, int r36, final boolean r37, final boolean r38, boolean r39, defpackage.kd2 r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv.i(boolean, boolean, ub2, boolean, int, boolean, boolean, boolean, kd2, int):void");
    }

    public static final void j(w44 w44Var, boolean z) {
        w44Var.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:332:0x057d, code lost:
    
        if (r1 == com.anistation.model.settings.HoldAction.PAUSE) goto L380;
     */
    /* JADX WARN: Removed duplicated region for block: B:297:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0412  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final boolean r56, final boolean r57, final boolean r58, final boolean r59, final long r60, final long r62, final boolean r64, final boolean r65, final boolean r66, com.anistation.model.settings.HoldAction r67, final boolean r68, final defpackage.sb2 r69, final defpackage.sb2 r70, final boolean r71, final defpackage.sb2 r72, final boolean r73, final defpackage.ub2 r74, final boolean r75, final boolean r76, final java.lang.String r77, final defpackage.sb2 r78, final defpackage.sb2 r79, final boolean r80, final boolean r81, final defpackage.sb2 r82, final boolean r83, final boolean r84, final defpackage.ub2 r85, final boolean r86, final defpackage.sb2 r87, final defpackage.sb2 r88, final defpackage.sb2 r89, final defpackage.sb2 r90, final java.lang.String r91, final int r92, final boolean r93, final boolean r94, final boolean r95, defpackage.sb2 r96, defpackage.yz3 r97, defpackage.kd2 r98, final int r99, final int r100, final int r101, final int r102) {
        /*
            Method dump skipped, instructions count: 1612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv.k(boolean, boolean, boolean, boolean, long, long, boolean, boolean, boolean, com.anistation.model.settings.HoldAction, boolean, sb2, sb2, boolean, sb2, boolean, ub2, boolean, boolean, java.lang.String, sb2, sb2, boolean, boolean, sb2, boolean, boolean, ub2, boolean, sb2, sb2, sb2, sb2, java.lang.String, int, boolean, boolean, boolean, sb2, yz3, kd2, int, int, int, int):void");
    }

    public static final void l(rd3 rd3Var, Object obj, int i2, Object obj2, kd2 kd2Var, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        kd2Var.f0(1439843069);
        if (kd2Var.f(rd3Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i4 | i3;
        if (kd2Var.f(obj)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i9 = i8 | i5;
        if (kd2Var.d(i2)) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i10 = i9 | i6;
        if (kd2Var.f(obj2)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i11 = i10 | i7;
        if ((i11 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i11 & 1, z)) {
            ((j95) obj).e(obj2, nx7.R(980966366, new mo(i2, rd3Var, obj2), kd2Var), kd2Var, 48);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je(rd3Var, obj, i2, obj2, i3, (byte) 8);
        }
    }

    public static final void m(Recent recent, vh4 vh4Var, yz3 yz3Var, ub2 ub2Var, ub2 ub2Var2, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        yz3 yz3Var2;
        Object obj;
        int i7;
        String str;
        String str2;
        String str3;
        Object obj2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z2;
        recent.getClass();
        ub2Var2.getClass();
        kd2Var.f0(-2092102958);
        if (kd2Var.h(recent)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (kd2Var.f(vh4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4 | 384;
        if (kd2Var.h(ub2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (kd2Var.h(ub2Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i11 & 1, z)) {
            Context context = (Context) kd2Var.j(eb.b);
            Object thumbnailImage = recent.getThumbnailImage();
            if (thumbnailImage == null) {
                thumbnailImage = recent.getCoverImage().getExtraLarge();
            }
            boolean f2 = kd2Var.f(thumbnailImage) | kd2Var.f(context);
            Object Q = kd2Var.Q();
            Object obj3 = au0.a;
            if (f2 || Q == obj3) {
                bv2 bv2Var = new bv2(context);
                bv2Var.c = thumbnailImage;
                hv2.a(bv2Var, true);
                Q = bv2Var.a();
                kd2Var.n0(Q);
            }
            ev2 ev2Var = (ev2) Q;
            String b2 = e02.b(recent.getTitle());
            String c2 = e02.c(recent);
            boolean e2 = kd2Var.e(recent.getAiredAt());
            Object Q2 = kd2Var.Q();
            if (!e2 && Q2 != obj3) {
                i7 = i11;
                str = b2;
                str2 = c2;
                obj = obj3;
            } else {
                long currentTimeMillis = System.currentTimeMillis() - recent.getAiredAt();
                Q2 = "Just now";
                if (currentTimeMillis <= 0) {
                    i7 = i11;
                    str = b2;
                    str2 = c2;
                    obj = obj3;
                } else {
                    long j2 = currentTimeMillis / 1000;
                    long j3 = j2 / 60;
                    long j4 = j3 / 60;
                    long j5 = j4 / 24;
                    long j6 = j5 / 7;
                    obj = obj3;
                    long j7 = j5 / 30;
                    i7 = i11;
                    long j8 = j5 / 365;
                    if (j2 < 60) {
                        str = b2;
                        str2 = c2;
                        Q2 = "Just now";
                    } else {
                        str = b2;
                        str2 = c2;
                        if (j3 < 60) {
                            if (j3 == 1) {
                                str8 = "min";
                            } else {
                                str8 = "mins";
                            }
                            obj2 = j3 + " " + str8 + " ago";
                        } else if (j4 < 24) {
                            if (j4 == 1) {
                                str7 = "hour";
                            } else {
                                str7 = "hours";
                            }
                            obj2 = j4 + " " + str7 + " ago";
                        } else if (j5 < 7) {
                            if (j5 == 1) {
                                str6 = "day";
                            } else {
                                str6 = "days";
                            }
                            obj2 = j5 + " " + str6 + " ago";
                        } else if (j6 < 4) {
                            if (j6 == 1) {
                                str5 = "week";
                            } else {
                                str5 = "weeks";
                            }
                            obj2 = j6 + " " + str5 + " ago";
                        } else if (j7 < 12) {
                            if (j7 == 1) {
                                str4 = "month";
                            } else {
                                str4 = "months";
                            }
                            obj2 = j7 + " " + str4 + " ago";
                        } else {
                            if (j8 == 1) {
                                str3 = "year";
                            } else {
                                str3 = "years";
                            }
                            obj2 = j8 + " " + str3 + " ago";
                        }
                        Q2 = obj2;
                    }
                }
                kd2Var.n0(Q2);
            }
            String str9 = (String) Q2;
            vz3 vz3Var = vz3.x;
            yz3 Q3 = n77.Q(ar5.c(vz3Var, 1.0f), vh4Var);
            if ((i7 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean h2 = z2 | kd2Var.h(recent);
            Object Q4 = kd2Var.Q();
            if (h2 || Q4 == obj) {
                Q4 = new hs6(ub2Var2, recent, (byte) 0);
                kd2Var.n0(Q4);
            }
            l36.a(kb0.A(Q3, false, null, null, false, (sb2) Q4, kd2Var, 0, 31), null, ((mp0) kd2Var.j(op0.a)).n, 0L, 0.0f, 0.0f, null, nx7.R(1687346775, new is6(ev2Var, str, recent, ub2Var, str2, str9), kd2Var), kd2Var, 12582912, 122);
            yz3Var2 = vz3Var;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ni(recent, vh4Var, yz3Var2, ub2Var, ub2Var2, i2);
        }
    }

    public static final void n(Recent recent, ub2 ub2Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        kd2Var.f0(629581002);
        if (kd2Var.h(recent)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (kd2Var.h(ub2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        byte b2 = 1;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i6 & 1, z)) {
            yz3 h2 = bx7.h(n03.k(ar5.i(vz3.x, 38.0f), tm5.b), ((mp0) kd2Var.j(op0.a)).o, io3.h);
            if ((i6 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean h3 = z2 | kd2Var.h(recent);
            Object Q = kd2Var.Q();
            if (h3 || Q == au0.a) {
                Q = new hs6(ub2Var, recent, b2);
                kd2Var.n0(Q);
            }
            yz3 A = kb0.A(h2, false, null, null, false, (sb2) Q, kd2Var, 0, 31);
            vo3 c2 = b90.c(pk2.C, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E = o80.E(kd2Var, A);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c2);
            ss5.i(p7.E, kd2Var, l2);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            String extraLarge = recent.getCoverImage().getExtraLarge();
            if (extraLarge == null && (extraLarge = recent.getCoverImage().getLarge()) == null) {
                extraLarge = recent.getLogo();
            }
            tl7.b(extraLarge, recent.getTitle().getEnglish(), ar5.c, w65.H(R.drawable.logo, kd2Var, 0), w65.H(R.drawable.logo, kd2Var, 0), kd2Var, 295296, 31688);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new vl5((byte) 9, i2, recent, ub2Var);
        }
    }

    public static final void o(String str, String str2, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        boolean z;
        String str3;
        float f2;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(-392710474);
        if (kd2Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (kd2Var2.f(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i6 & 1, z)) {
            x50 x50Var = pk2.I;
            vr vrVar = new vr(4.0f, true, new ze0((byte) 6));
            vz3 vz3Var = vz3.x;
            float f3 = 1.0f;
            yz3 c2 = ar5.c(vz3Var, 1.0f);
            z75 a2 = y75.a(vrVar, x50Var, kd2Var2, 54);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, c2);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z2 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z2) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a2);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            sr srVar = x97.y;
            if (1.0f <= 0.0d) {
                cz2.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            ob3 ob3Var = new ob3(f2, false);
            z75 a3 = y75.a(srVar, x50Var, kd2Var, 54);
            int hashCode2 = Long.hashCode(kd2Var.T);
            al4 l3 = kd2Var.l();
            yz3 E2 = o80.E(kd2Var, ob3Var);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a3);
            ss5.i(ys0Var, kd2Var, l3);
            h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E2);
            tq1 tq1Var = pl6.a;
            xd6 xd6Var = ((nl6) kd2Var.j(tq1Var)).l;
            s92 s92Var = s92.C;
            tq1 tq1Var2 = op0.a;
            long b2 = ep0.b(0.7f, ((mp0) kd2Var.j(tq1Var2)).o);
            if (1.0f <= 0.0d) {
                cz2.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            yc6.b(str, new ob3(f3, false), b2, 0L, s92Var, null, 0L, null, 0L, 2, false, 1, 0, xd6Var, kd2Var, (i6 & 14) | 1572864, 24960, 110520);
            kd2Var2 = kd2Var;
            ov5.a(kd2Var2, ar5.l(vz3Var, 2.0f));
            yt2.a(w65.H(R.drawable.tick, kd2Var2, 0), lz5.f(R.string.tick, kd2Var2), ar5.i(vz3Var, 14.0f), ep0.b(0.7f, ((mp0) kd2Var2.j(tq1Var2)).o), kd2Var2, 392, 0);
            kd2Var2.q(true);
            if (str2 == null || str2.length() == 0) {
                str3 = str2;
                kd2Var2.e0(2065021960);
                kd2Var2.q(false);
            } else {
                kd2Var2.e0(2064496293);
                yc6.b("•", null, ep0.b(0.7f, ((mp0) kd2Var2.j(tq1Var2)).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(tq1Var)).l, kd2Var, 6, 0, 131066);
                str3 = str2;
                yc6.b(str3, null, ep0.b(0.7f, ((mp0) kd2Var.j(tq1Var2)).o), 0L, s92Var, null, 0L, null, 0L, 2, false, 1, 0, ((nl6) kd2Var.j(tq1Var)).l, kd2Var, ((i6 >> 3) & 14) | 1572864, 24960, 110522);
                kd2Var2 = kd2Var;
                kd2Var2.q(false);
            }
            kd2Var2.q(true);
        } else {
            str3 = str2;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new vl5((byte) 8, i2, str, str3);
        }
    }

    public static final void p(wc0 wc0Var) {
        wc0Var.getClass();
        wc0Var.a(new IOException("Channel was cancelled"));
    }

    public static final Object q(w42 w42Var, ic2 ic2Var, vz0 vz0Var) {
        int i2 = y52.a;
        Object collect = zz.l(new wj0(new x52(ic2Var, null, (byte) 0), w42Var, it1.x, -2, ta0.x), 0).collect(va4.x, vz0Var);
        pn6 pn6Var = pn6.a;
        w11 w11Var = w11.x;
        if (collect != w11Var) {
            collect = pn6Var;
        }
        if (collect == w11Var) {
            return collect;
        }
        return pn6Var;
    }

    public static final dn0 s(String str, sb2 sb2Var, ub2 ub2Var) {
        sb2Var.getClass();
        return new dn0(str, sb2Var, ub2Var);
    }

    public static final void t(CharsetEncoder charsetEncoder, oa0 oa0Var, CharSequence charSequence, int i2, int i3) {
        charsetEncoder.getClass();
        charSequence.getClass();
        if (i2 >= i3) {
            return;
        }
        do {
            byte[] v = kb0.v(charsetEncoder, charSequence, i2, i3);
            oa0Var.write(v, 0, v.length);
            int length = v.length;
            if (length >= 0) {
                i2 += length;
            } else {
                ze0.m("Check failed.");
                return;
            }
        } while (i2 < i3);
    }

    public static final Activity u(Context context) {
        if (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                baseContext.getClass();
                return u(baseContext);
            }
            return null;
        }
        return null;
    }

    public static final String v(int i2, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i2 >= 0) {
            sb.append("Unexpected JSON token at offset " + i2 + ": ");
        }
        sb.append(str);
        if (str2 != null && !uz5.V(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !uz5.V(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.function.Function] */
    public static nw2 x(List list) {
        int standard;
        byte[] descriptor;
        if (Build.VERSION.SDK_INT >= 31 && list != null) {
            TreeSet treeSet = new TreeSet(Comparator.comparing(new Object()).reversed());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AudioDescriptor e2 = za.e(it.next());
                standard = e2.getStandard();
                if (standard == 1) {
                    descriptor = e2.getDescriptor();
                    if (descriptor.length != 3) {
                        kb0.O("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                    } else {
                        byte b2 = descriptor[0];
                        int i2 = (b2 & 7) + 1;
                        if (((b2 >> 3) & 15) == 1) {
                            treeSet.add(Integer.valueOf(eq6.t(i2)));
                        }
                    }
                }
            }
            return nw2.o(treeSet);
        }
        z62 z62Var = nw2.y;
        return o15.B;
    }

    public static synchronized AudioManager y(Context context) {
        synchronized (iv.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    a = null;
                }
                AudioManager audioManager = a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    nv0 nv0Var = new nv0();
                    zz.F().execute(new gb(applicationContext, nv0Var, (byte) 1));
                    nv0Var.b();
                    AudioManager audioManager2 = a;
                    audioManager2.getClass();
                    return audioManager2;
                }
                AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
                a = audioManager3;
                audioManager3.getClass();
                return audioManager3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [yh2, zh1, java.lang.Object] */
    public static final zh1 z(ev2 ev2Var, oc1 oc1Var) {
        k76 k76Var = ev2Var.c;
        if (k76Var instanceof zd2) {
            ow6 c2 = lz5.c(((zd2) k76Var).getView());
            synchronized (c2) {
                yh2 yh2Var = c2.y;
                if (yh2Var != null) {
                    Bitmap.Config[] configArr = pq6.a;
                    if (a34.i(Looper.myLooper(), Looper.getMainLooper()) && c2.B) {
                        c2.B = false;
                        yh2Var.y = oc1Var;
                        return yh2Var;
                    }
                }
                bx5 bx5Var = c2.z;
                if (bx5Var != null) {
                    bx5Var.l(null);
                }
                c2.z = null;
                View view = c2.x;
                ?? obj = new Object();
                obj.x = view;
                obj.y = oc1Var;
                c2.y = obj;
                return obj;
            }
        }
        return new eo3((Object) oc1Var, (byte) 7);
    }

    public boolean r(kw4 kw4Var) {
        return false;
    }

    public Object w(kw4 kw4Var) {
        throw new IllegalStateException("");
    }
}
