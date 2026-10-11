package c1;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n0 {
    public static final n0 G = new n0(new m0());
    public final Integer A;
    public final CharSequence B;
    public final CharSequence C;
    public final CharSequence D;
    public final Integer E;
    public final Bundle F;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1841a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f1842b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f1843c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f1844d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f1845e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f1846f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1847g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f1848h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f1849i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f1850j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f1851k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f1852l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f1853m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f1854n;
    public final Boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f1855p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f1856q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f1857r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f1858s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f1859t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f1860u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f1861v;

    /* renamed from: w, reason: collision with root package name */
    public final CharSequence f1862w;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f1863x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f1864y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f1865z;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
        f1.b0.J(5);
        f1.b0.J(6);
        f1.b0.J(8);
        f1.b0.J(9);
        f1.b0.J(10);
        f1.b0.J(11);
        f1.b0.J(12);
        f1.b0.J(13);
        f1.b0.J(14);
        f1.b0.J(15);
        f1.b0.J(16);
        f1.b0.J(17);
        f1.b0.J(18);
        f1.b0.J(19);
        f1.b0.J(20);
        f1.b0.J(21);
        f1.b0.J(22);
        f1.b0.J(23);
        f1.b0.J(24);
        f1.b0.J(25);
        f1.b0.J(26);
        f1.b0.J(27);
        f1.b0.J(28);
        f1.b0.J(29);
        f1.b0.J(30);
        f1.b0.J(31);
        f1.b0.J(32);
        f1.b0.J(1000);
    }

    public n0(m0 m0Var) {
        Boolean bool = m0Var.f1823n;
        Integer num = m0Var.f1822m;
        Integer num2 = m0Var.D;
        int i10 = 1;
        int i11 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case zzaja.zze.zzg /* 7 */:
                        case 8:
                        case 9:
                        case 10:
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i10 = 0;
                            break;
                        case 21:
                            i10 = 2;
                            break;
                        case 22:
                            i10 = 3;
                            break;
                        case 23:
                            i10 = 4;
                            break;
                        case 24:
                            i10 = 5;
                            break;
                        case 25:
                            i10 = 6;
                            break;
                    }
                    i11 = i10;
                }
                num = Integer.valueOf(i11);
            }
        } else if (num != null) {
            bool = Boolean.valueOf(num.intValue() != -1);
            if (bool.booleanValue() && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i11 = 21;
                        break;
                    case 3:
                        i11 = 22;
                        break;
                    case 4:
                        i11 = 23;
                        break;
                    case 5:
                        i11 = 24;
                        break;
                    case 6:
                        i11 = 25;
                        break;
                    default:
                        i11 = 20;
                        break;
                }
                num2 = Integer.valueOf(i11);
            }
        }
        this.f1841a = m0Var.f1810a;
        this.f1842b = m0Var.f1811b;
        this.f1843c = m0Var.f1812c;
        this.f1844d = m0Var.f1813d;
        this.f1845e = m0Var.f1814e;
        this.f1846f = m0Var.f1815f;
        this.f1847g = m0Var.f1816g;
        this.f1848h = m0Var.f1817h;
        this.f1849i = m0Var.f1818i;
        this.f1850j = m0Var.f1819j;
        this.f1851k = m0Var.f1820k;
        this.f1852l = m0Var.f1821l;
        this.f1853m = num;
        this.f1854n = bool;
        this.o = m0Var.o;
        Integer num3 = m0Var.f1824p;
        this.f1855p = num3;
        this.f1856q = num3;
        this.f1857r = m0Var.f1825q;
        this.f1858s = m0Var.f1826r;
        this.f1859t = m0Var.f1827s;
        this.f1860u = m0Var.f1828t;
        this.f1861v = m0Var.f1829u;
        this.f1862w = m0Var.f1830v;
        this.f1863x = m0Var.f1831w;
        this.f1864y = m0Var.f1832x;
        this.f1865z = m0Var.f1833y;
        this.A = m0Var.f1834z;
        this.B = m0Var.A;
        this.C = m0Var.B;
        this.D = m0Var.C;
        this.E = num2;
        this.F = m0Var.E;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (f1.b0.a(this.f1841a, n0Var.f1841a) && f1.b0.a(this.f1842b, n0Var.f1842b) && f1.b0.a(this.f1843c, n0Var.f1843c) && f1.b0.a(this.f1844d, n0Var.f1844d) && f1.b0.a(this.f1845e, n0Var.f1845e) && f1.b0.a(this.f1846f, n0Var.f1846f) && f1.b0.a(this.f1847g, n0Var.f1847g) && f1.b0.a(null, null) && f1.b0.a(null, null) && Arrays.equals(this.f1848h, n0Var.f1848h) && f1.b0.a(this.f1849i, n0Var.f1849i) && f1.b0.a(this.f1850j, n0Var.f1850j) && f1.b0.a(this.f1851k, n0Var.f1851k) && f1.b0.a(this.f1852l, n0Var.f1852l) && f1.b0.a(this.f1853m, n0Var.f1853m) && f1.b0.a(this.f1854n, n0Var.f1854n) && f1.b0.a(this.o, n0Var.o) && f1.b0.a(this.f1856q, n0Var.f1856q) && f1.b0.a(this.f1857r, n0Var.f1857r) && f1.b0.a(this.f1858s, n0Var.f1858s) && f1.b0.a(this.f1859t, n0Var.f1859t) && f1.b0.a(this.f1860u, n0Var.f1860u) && f1.b0.a(this.f1861v, n0Var.f1861v) && f1.b0.a(this.f1862w, n0Var.f1862w) && f1.b0.a(this.f1863x, n0Var.f1863x) && f1.b0.a(this.f1864y, n0Var.f1864y) && f1.b0.a(this.f1865z, n0Var.f1865z) && f1.b0.a(this.A, n0Var.A) && f1.b0.a(this.B, n0Var.B) && f1.b0.a(this.C, n0Var.C) && f1.b0.a(this.D, n0Var.D) && f1.b0.a(this.E, n0Var.E)) {
            if (this.F == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (n0Var.F == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 == z10) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[33];
        boolean z9 = false;
        objArr[0] = this.f1841a;
        objArr[1] = this.f1842b;
        objArr[2] = this.f1843c;
        objArr[3] = this.f1844d;
        objArr[4] = this.f1845e;
        objArr[5] = this.f1846f;
        objArr[6] = this.f1847g;
        objArr[7] = null;
        objArr[8] = null;
        objArr[9] = Integer.valueOf(Arrays.hashCode(this.f1848h));
        objArr[10] = this.f1849i;
        objArr[11] = this.f1850j;
        objArr[12] = this.f1851k;
        objArr[13] = this.f1852l;
        objArr[14] = this.f1853m;
        objArr[15] = this.f1854n;
        objArr[16] = this.o;
        objArr[17] = this.f1856q;
        objArr[18] = this.f1857r;
        objArr[19] = this.f1858s;
        objArr[20] = this.f1859t;
        objArr[21] = this.f1860u;
        objArr[22] = this.f1861v;
        objArr[23] = this.f1862w;
        objArr[24] = this.f1863x;
        objArr[25] = this.f1864y;
        objArr[26] = this.f1865z;
        objArr[27] = this.A;
        objArr[28] = this.B;
        objArr[29] = this.C;
        objArr[30] = this.D;
        objArr[31] = this.E;
        if (this.F == null) {
            z9 = true;
        }
        objArr[32] = Boolean.valueOf(z9);
        return Arrays.hashCode(objArr);
    }
}
