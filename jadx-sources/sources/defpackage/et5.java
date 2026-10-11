package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.anistation.model.AnimeWatchOrderItem;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class et5 {
    public static final void a(AnimeWatchOrderItem animeWatchOrderItem, int i, yz3 yz3Var, boolean z, ub2 ub2Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        Object obj;
        long j;
        animeWatchOrderItem.getClass();
        ub2Var.getClass();
        kd2Var.f0(-1638623701);
        if (kd2Var.h(animeWatchOrderItem)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (kd2Var.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (kd2Var.f(yz3Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        if (kd2Var.g(z)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (kd2Var.h(ub2Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        boolean z4 = true;
        if ((i12 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i12 & 1, z2)) {
            Object extraLarge = animeWatchOrderItem.getCoverImage().getExtraLarge();
            if (extraLarge == null) {
                extraLarge = animeWatchOrderItem.getCoverImage().getLarge();
            }
            Context context = (Context) kd2Var.j(eb.b);
            boolean f = kd2Var.f(extraLarge) | kd2Var.f(context);
            Object Q = kd2Var.Q();
            Object obj2 = au0.a;
            if (f || Q == obj2) {
                bv2 bv2Var = new bv2(context);
                bv2Var.c = extraLarge;
                hv2.a(bv2Var, true);
                Q = bv2Var.a();
                kd2Var.n0(Q);
            }
            ev2 ev2Var = (ev2) Q;
            boolean f2 = kd2Var.f(animeWatchOrderItem.getTitle());
            Object Q2 = kd2Var.Q();
            if (f2 || Q2 == obj2) {
                Q2 = e02.b(animeWatchOrderItem.getTitle());
                kd2Var.n0(Q2);
            }
            String str = (String) Q2;
            if ((i12 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object Q3 = kd2Var.Q();
            if (z3 || Q3 == obj2) {
                Q3 = "#" + i;
                kd2Var.n0(Q3);
            }
            String str2 = (String) Q3;
            boolean f3 = kd2Var.f(animeWatchOrderItem.getTotalEpisodes());
            Object Q4 = kd2Var.Q();
            Object obj3 = null;
            if (f3 || Q4 == obj2) {
                Integer totalEpisodes = animeWatchOrderItem.getTotalEpisodes();
                if (totalEpisodes != null && totalEpisodes.intValue() > 0) {
                    if (totalEpisodes.intValue() == 1) {
                        obj = "1 Ep";
                    } else {
                        obj = totalEpisodes + " Eps";
                    }
                    Q4 = obj;
                } else {
                    Q4 = null;
                }
                kd2Var.n0(Q4);
            }
            String str3 = (String) Q4;
            boolean f4 = kd2Var.f(animeWatchOrderItem.getDuration());
            Object Q5 = kd2Var.Q();
            if (f4 || Q5 == obj2) {
                Integer duration = animeWatchOrderItem.getDuration();
                if (duration != null && duration.intValue() > 0) {
                    obj3 = duration + "m";
                }
                kd2Var.n0(obj3);
                Q5 = obj3;
            }
            String str4 = (String) Q5;
            yz3 g = ar5.g(ar5.c(yz3Var, 1.0f), 110.0f, 0.0f, 2);
            boolean z5 = !z;
            if ((i12 & 57344) != 16384) {
                z4 = false;
            }
            boolean h = kd2Var.h(animeWatchOrderItem) | z4;
            Object Q6 = kd2Var.Q();
            if (h || Q6 == obj2) {
                Q6 = new lb5((Object) ub2Var, (Object) animeWatchOrderItem, (byte) 19);
                kd2Var.n0(Q6);
            }
            yz3 A = kb0.A(g, z5, null, null, false, (sb2) Q6, kd2Var, 0, 30);
            o75 o75Var = ((cn5) kd2Var.j(dn5.a)).c;
            if (z) {
                kd2Var.e0(1535670802);
                j = ((mp0) kd2Var.j(op0.a)).p;
                kd2Var.q(false);
            } else {
                kd2Var.e0(1535672309);
                j = ((mp0) kd2Var.j(op0.a)).n;
                kd2Var.q(false);
            }
            l36.a(A, o75Var, j, 0L, 0.0f, 0.0f, null, nx7.R(-854333370, new vx6(ev2Var, str, z, str2, animeWatchOrderItem, str3, str4), kd2Var), kd2Var, 12582912, 120);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new p74(animeWatchOrderItem, i, yz3Var, z, ub2Var, i2);
        }
    }

    public static ft5 b() {
        return (ft5) mt5.b.get();
    }

    public static int[] c(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static final boolean d(int i, KeyEvent keyEvent) {
        if (((int) (h41.C(keyEvent) >> 32)) == i) {
            return true;
        }
        return false;
    }

    public static ft5 e(ft5 ft5Var) {
        if (ft5Var instanceof ej6) {
            ej6 ej6Var = (ej6) ft5Var;
            if (ej6Var.t == nz5.c()) {
                ej6Var.r = null;
                return ft5Var;
            }
        }
        if (ft5Var instanceof fj6) {
            fj6 fj6Var = (fj6) ft5Var;
            if (fj6Var.i == nz5.c()) {
                fj6Var.h = null;
                return ft5Var;
            }
        }
        ft5 e = mt5.e(ft5Var, null, false);
        e.j();
        return e;
    }

    public static Object f(fe1 fe1Var, sb2 sb2Var) {
        u44 u44Var;
        ft5 ej6Var;
        ft5 ft5Var = (ft5) mt5.b.get();
        if (ft5Var instanceof ej6) {
            ej6 ej6Var2 = (ej6) ft5Var;
            if (ej6Var2.t == nz5.c()) {
                ub2 ub2Var = ej6Var2.r;
                ub2 ub2Var2 = ej6Var2.s;
                try {
                    ((ej6) ft5Var).r = mt5.i(fe1Var, ub2Var, true);
                    ((ej6) ft5Var).s = ub2Var2;
                    return sb2Var.invoke();
                } finally {
                    ej6Var2.r = ub2Var;
                    ej6Var2.s = ub2Var2;
                }
            }
        }
        if (ft5Var != null && !(ft5Var instanceof u44)) {
            ej6Var = ft5Var.u(fe1Var);
        } else {
            if (ft5Var instanceof u44) {
                u44Var = (u44) ft5Var;
            } else {
                u44Var = null;
            }
            ej6Var = new ej6(u44Var, fe1Var, null, true, false);
        }
        try {
            ft5 j = ej6Var.j();
            try {
                Object invoke = sb2Var.invoke();
                ft5.q(j);
                ej6Var.c();
                return invoke;
            } catch (Throwable th) {
                ft5.q(j);
                throw th;
            }
        } catch (Throwable th2) {
            ej6Var.c();
            throw th2;
        }
    }

    public static long g(int i, int i2, int i3, int i4) {
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    public static String h(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i6 = i;
        int i7 = i6;
        while (i6 <= i2) {
            if (i6 == i2) {
                i3 = i6;
            } else if (sb.charAt(i6) == '/') {
                i3 = i6 + 1;
            } else {
                i6++;
            }
            int i8 = i7 + 1;
            if (i6 == i8 && sb.charAt(i7) == '.') {
                sb.delete(i7, i3);
                i2 -= i3 - i7;
            } else {
                if (i6 == i7 + 2 && sb.charAt(i7) == '.' && sb.charAt(i8) == '.') {
                    i4 = sb.lastIndexOf("/", i7 - 2) + 1;
                    if (i4 > i) {
                        i5 = i4;
                    } else {
                        i5 = i;
                    }
                    sb.delete(i5, i3);
                    i2 -= i3 - i5;
                } else {
                    i4 = i6 + 1;
                }
                i7 = i4;
            }
            i6 = i7;
        }
        return sb.toString();
    }

    public static String i(String str, String str2) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] c = c(str2);
        if (c[0] != -1) {
            sb.append(str2);
            h(sb, c[1], c[2]);
            return sb.toString();
        }
        int[] c2 = c(str);
        if (c[3] == 0) {
            sb.append((CharSequence) str, 0, c2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (c[2] == 0) {
            sb.append((CharSequence) str, 0, c2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i2 = c[1];
        if (i2 != 0) {
            int i3 = c2[0] + 1;
            sb.append((CharSequence) str, 0, i3);
            sb.append(str2);
            return h(sb, c[1] + i3, i3 + c[2]);
        }
        if (str2.charAt(i2) == '/') {
            sb.append((CharSequence) str, 0, c2[1]);
            sb.append(str2);
            int i4 = c2[1];
            return h(sb, i4, c[2] + i4);
        }
        int i5 = c2[0] + 2;
        int i6 = c2[1];
        if (i5 < i6 && i6 == c2[2]) {
            sb.append((CharSequence) str, 0, i6);
            sb.append('/');
            sb.append(str2);
            int i7 = c2[1];
            return h(sb, i7, c[2] + i7 + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, c2[2] - 1);
        if (lastIndexOf == -1) {
            i = c2[1];
        } else {
            i = lastIndexOf + 1;
        }
        sb.append((CharSequence) str, 0, i);
        sb.append(str2);
        return h(sb, c2[1], i + c[2]);
    }

    public static Uri j(String str, String str2) {
        return Uri.parse(i(str, str2));
    }

    public static void k(ft5 ft5Var, ft5 ft5Var2, ub2 ub2Var) {
        if (ft5Var == ft5Var2) {
            if (ft5Var instanceof ej6) {
                ((ej6) ft5Var).r = ub2Var;
                return;
            } else if (ft5Var instanceof fj6) {
                ((fj6) ft5Var).h = ub2Var;
                return;
            } else {
                v71.g(ft5Var, "Non-transparent snapshot was reused: ");
                return;
            }
        }
        ft5Var2.getClass();
        ft5.q(ft5Var);
        ft5Var2.c();
    }

    public static final byte[] l(String str, Charset charset) {
        str.getClass();
        charset.getClass();
        Charset charset2 = kl0.a;
        if (charset.equals(charset2)) {
            byte[] bytes = str.getBytes(charset2);
            bytes.getClass();
            return bytes;
        }
        return kb0.v(charset.newEncoder(), str, 0, str.length());
    }

    public static void m(oa0 oa0Var, CharSequence charSequence, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = charSequence.length();
        }
        Charset charset = kl0.a;
        charSequence.getClass();
        charset.getClass();
        gv5.k(oa0Var, charSequence.toString(), 0, i);
    }

    public static String n(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = "".concat(str);
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static int o(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        if (intValue >= Level.FINE.intValue()) {
            return 3;
        }
        return 2;
    }

    public static final void p(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        w47 w47Var = new w47(level, exc, str, objArr, (byte) 6);
        int i = z88.a;
        executor.execute(new t35(new Object(), (Object) q78.a(), (Object) w47Var, (byte) 13));
    }
}
