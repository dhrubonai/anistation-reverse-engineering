package defpackage;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class fy5 {
    public static final long a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            fz2.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = nd6.c;
        return j;
    }

    public static final long b(int i, long j) {
        int i2;
        int i3 = nd6.c;
        int i4 = (int) (j >> 32);
        int i5 = 0;
        if (i4 < 0) {
            i2 = 0;
        } else {
            i2 = i4;
        }
        if (i2 > i) {
            i2 = i;
        }
        int i6 = (int) (4294967295L & j);
        if (i6 >= 0) {
            i5 = i6;
        }
        if (i5 <= i) {
            i = i5;
        }
        if (i2 == i4 && i == i6) {
            return j;
        }
        return a(i2, i);
    }

    public static final void c(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = al2.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 != i5) {
                i4--;
            } else {
                return;
            }
        }
    }

    public static final i77 d(z77 z77Var) {
        z77Var.getClass();
        return new i77(z77Var.a, z77Var.t);
    }

    public static final long e(int i, byte[] bArr) {
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e0, code lost:
    
        r1 = defpackage.te4.s(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e4, code lost:
    
        defpackage.o80.r(r2, null);
        r10 = r1;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.v66 g(java.lang.String r31, defpackage.g85 r32) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy5.g(java.lang.String, g85):v66");
    }

    public static final String h(long j, CharSequence charSequence) {
        return charSequence.subSequence(nd6.g(j), nd6.f(j)).toString();
    }

    public static final ImageDecoder.Source i(lv2 lv2Var, mg4 mg4Var, boolean z) {
        qj4 g0;
        if (lv2Var.getFileSystem() == n22.x && (g0 = lv2Var.g0()) != null) {
            return ImageDecoder.createSource(g0.toFile());
        }
        t80 H = lv2Var.H();
        if (H instanceof bt) {
            return ImageDecoder.createSource(mg4Var.a.getAssets(), ((bt) H).g);
        }
        if (H instanceof qy0) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((qy0) H).g;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new iu2(assetFileDescriptor, (byte) 1));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (H instanceof i45) {
            i45 i45Var = (i45) H;
            if (i45Var.g.equals(mg4Var.a.getPackageName())) {
                return ImageDecoder.createSource(mg4Var.a.getResources(), i45Var.h);
            }
        }
        if (H instanceof bc0) {
            if (Build.VERSION.SDK_INT >= 30 || !z || ((bc0) H).g.isDirect()) {
                return ImageDecoder.createSource(((bc0) H).g);
            }
            return null;
        }
        return null;
    }

    public static final void j(int i, String str, String str2) {
        StringBuilder m = h11.m(i, "Expected ", str2, " at index ", ", but was '");
        m.append(str.charAt(i));
        m.append('\'');
        throw new IllegalArgumentException(m.toString());
    }

    public static void k(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static void l(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static void m(String str, int i, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    public static boolean n(ik7 ik7Var) {
        if (ik7Var == null) {
            return false;
        }
        Double h = ik7Var.h();
        if (h.isNaN() || h.doubleValue() < 0.0d || !h.equals(Double.valueOf(Math.floor(h.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static nm7 o(String str) {
        nm7 nm7Var;
        if (str != null && !str.isEmpty()) {
            nm7Var = (nm7) nm7.I0.get(Integer.valueOf(Integer.parseInt(str)));
        } else {
            nm7Var = null;
        }
        if (nm7Var != null) {
            return nm7Var;
        }
        ze0.k(zo5.l("Unsupported commandId ", str));
        return null;
    }

    public static boolean p(ik7 ik7Var, ik7 ik7Var2) {
        if (!ik7Var.getClass().equals(ik7Var2.getClass())) {
            return false;
        }
        if ((ik7Var instanceof xk7) || (ik7Var instanceof bk7)) {
            return true;
        }
        if (ik7Var instanceof xh7) {
            if (Double.isNaN(ik7Var.h().doubleValue()) || Double.isNaN(ik7Var2.h().doubleValue())) {
                return false;
            }
            return ik7Var.h().equals(ik7Var2.h());
        }
        if (ik7Var instanceof tk7) {
            return ik7Var.d().equals(ik7Var2.d());
        }
        if (ik7Var instanceof lg7) {
            return ik7Var.c().equals(ik7Var2.c());
        }
        if (ik7Var != ik7Var2) {
            return false;
        }
        return true;
    }

    public static int q(double d) {
        int i;
        if (!Double.isNaN(d) && !Double.isInfinite(d) && d != 0.0d) {
            if (d > 0.0d) {
                i = 1;
            } else {
                i = -1;
            }
            return (int) ((i * Math.floor(Math.abs(d))) % 4.294967296E9d);
        }
        return 0;
    }

    public static double r(double d) {
        int i;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d) && d != 0.0d && d != 0.0d) {
            if (d > 0.0d) {
                i = 1;
            } else {
                i = -1;
            }
            return i * Math.floor(Math.abs(d));
        }
        return d;
    }

    public static Object s(ik7 ik7Var) {
        if (ik7.q.equals(ik7Var)) {
            return null;
        }
        if (ik7.p.equals(ik7Var)) {
            return "";
        }
        if (ik7Var instanceof zj7) {
            return t((zj7) ik7Var);
        }
        if (ik7Var instanceof rf7) {
            ArrayList arrayList = new ArrayList();
            rf7 rf7Var = (rf7) ik7Var;
            int i = 0;
            while (i < rf7Var.p()) {
                if (i < rf7Var.p()) {
                    int i2 = i + 1;
                    Object s = s(rf7Var.q(i));
                    if (s != null) {
                        arrayList.add(s);
                    }
                    i = i2;
                } else {
                    p65.h(h11.g(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                    return null;
                }
            }
            return arrayList;
        }
        if (!ik7Var.h().isNaN()) {
            return ik7Var.h();
        }
        return ik7Var.d();
    }

    public static HashMap t(zj7 zj7Var) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(zj7Var.x.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Object s = s(zj7Var.b(str));
            if (s != null) {
                hashMap.put(str, s);
            }
        }
        return hashMap;
    }

    public static void u(vs7 vs7Var) {
        int q = q(vs7Var.i("runtime.counter").h().doubleValue() + 1.0d);
        if (q <= 1000000) {
            vs7Var.g("runtime.counter", new xh7(Double.valueOf(q)));
        } else {
            ze0.m("Instructions allowed exceeded");
        }
    }
}
