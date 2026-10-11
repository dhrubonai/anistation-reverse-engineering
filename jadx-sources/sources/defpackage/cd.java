package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cd {
    public final gd a;
    public final int b;
    public final long c;
    public final zc6 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cd(defpackage.gd r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.<init>(gd, int, int, long):void");
    }

    public final zc6 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        boolean z;
        um4 um4Var;
        float c = c();
        gd gdVar = this.a;
        nf nfVar = gdVar.D;
        int i8 = gdVar.I;
        na3 na3Var = gdVar.F;
        xd6 xd6Var = gdVar.y;
        dd ddVar = ed.a;
        kn4 kn4Var = xd6Var.c;
        if (kn4Var != null && (um4Var = kn4Var.a) != null) {
            z = um4Var.a;
        } else {
            z = false;
        }
        return new zc6(charSequence, c, nfVar, i, truncateAt, i8, z, i3, i5, i6, i7, i4, i2, na3Var);
    }

    public final long b(n05 n05Var, int i, p65 p65Var) {
        int i2;
        gg5 rt3Var;
        int i3;
        int[] iArr;
        RectF R = z51.R(n05Var);
        if (i == 0 || i != 1) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        o0 o0Var = new o0((Object) p65Var, (byte) 2);
        zc6 zc6Var = this.d;
        Layout layout = zc6Var.f;
        if (Build.VERSION.SDK_INT >= 34) {
            iArr = s3.f(zc6Var, R, i2, o0Var);
        } else {
            kz c = zc6Var.c();
            if (i2 == 1) {
                rt3Var = new y23(layout.getText(), zc6Var.k(), (byte) 24);
            } else {
                rt3Var = new rt3((Object) layout.getText(), (Object) zc6Var.a, (byte) 26);
            }
            int lineForVertical = layout.getLineForVertical((int) R.top);
            if (R.top <= zc6Var.d(lineForVertical) || (lineForVertical = lineForVertical + 1) < zc6Var.g) {
                int i4 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) R.bottom);
                if (lineForVertical2 != 0 || R.bottom >= zc6Var.h(0)) {
                    int k = nv5.k(zc6Var, layout, c, i4, R, rt3Var, o0Var, true);
                    while (true) {
                        i3 = i4;
                        if (k != -1 || i3 >= lineForVertical2) {
                            break;
                        }
                        i4 = i3 + 1;
                        k = nv5.k(zc6Var, layout, c, i4, R, rt3Var, o0Var, true);
                    }
                    if (k != -1) {
                        int i5 = lineForVertical2;
                        int k2 = nv5.k(zc6Var, layout, c, i5, R, rt3Var, o0Var, false);
                        while (k2 == -1 && i3 < i5) {
                            i5--;
                            k2 = nv5.k(zc6Var, layout, c, i5, R, rt3Var, o0Var, false);
                        }
                        if (k2 != -1) {
                            iArr = new int[]{rt3Var.C(k + 1), rt3Var.D(k2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        if (iArr == null) {
            return nd6.b;
        }
        return fy5.a(iArr[0], iArr[1]);
    }

    public final float c() {
        return rx0.h(this.c);
    }

    public final void d(vg0 vg0Var) {
        Canvas a = u9.a(vg0Var);
        zc6 zc6Var = this.d;
        if (zc6Var.d) {
            a.save();
            a.clipRect(0.0f, 0.0f, c(), this.f);
        }
        int i = zc6Var.h;
        if (a.getClipBounds(zc6Var.o)) {
            if (i != 0) {
                a.translate(0.0f, i);
            }
            ThreadLocal threadLocal = ed6.a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new Canvas();
                threadLocal.set(obj);
            }
            e86 e86Var = (e86) obj;
            e86Var.a = a;
            try {
                zc6Var.f.draw(e86Var);
                if (i != 0) {
                    a.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                e86Var.a = null;
            }
        }
        if (zc6Var.d) {
            a.restore();
        }
    }

    public final void e(vg0 vg0Var, long j, km5 km5Var, g96 g96Var, bb4 bb4Var) {
        nf nfVar = this.a.D;
        byte b = nfVar.c;
        nfVar.d(j);
        nfVar.f(km5Var);
        nfVar.g(g96Var);
        nfVar.e(bb4Var);
        nfVar.b(3);
        new d0(1, this, cd.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, (byte) 1).invoke(vg0Var);
        nfVar.b(b);
    }

    public final void f(vg0 vg0Var, ka0 ka0Var, float f, km5 km5Var, g96 g96Var, bb4 bb4Var) {
        nf nfVar = this.a.D;
        byte b = nfVar.c;
        nfVar.c(ka0Var, (Float.floatToRawIntBits(c()) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L), f);
        nfVar.f(km5Var);
        nfVar.g(g96Var);
        nfVar.e(bb4Var);
        nfVar.b(3);
        new d0(1, this, cd.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, (byte) 2).invoke(vg0Var);
        nfVar.b(b);
    }
}
