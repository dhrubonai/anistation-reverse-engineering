package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o24 {
    public final kz a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public o24(kz kzVar, long j, int i, int i2) {
        int i3;
        boolean z;
        n05 n05Var;
        int i4;
        int g;
        int i5;
        this.a = kzVar;
        this.b = i;
        if (rx0.j(j) != 0 || rx0.i(j) != 0) {
            fz2.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) kzVar.B;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            ei4 ei4Var = (ei4) arrayList2.get(i6);
            gd gdVar = ei4Var.a;
            int h = rx0.h(j);
            if (rx0.c(j)) {
                i4 = i6;
                g = rx0.g(j) - ((int) Math.ceil(f));
                if (g < 0) {
                    g = 0;
                }
            } else {
                i4 = i6;
                g = rx0.g(j);
            }
            i3 = 0;
            cd cdVar = new cd(gdVar, this.b - i7, i2, sx0.b(0, h, 0, g, 5));
            float f2 = cdVar.f + f;
            zc6 zc6Var = cdVar.d;
            int i8 = i7 + zc6Var.g;
            arrayList.add(new di4(cdVar, ei4Var.b, ei4Var.c, i7, i8, f, f2));
            if (!zc6Var.d) {
                if (i8 == this.b) {
                    i5 = i4;
                    if (i5 != te4.D((ArrayList) this.a.B)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = f2;
            }
            z = true;
            i7 = i8;
            f = f2;
            break;
        }
        i3 = 0;
        z = false;
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = rx0.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            di4 di4Var = (di4) arrayList.get(i9);
            List list = di4Var.a.g;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                n05 n05Var2 = (n05) list.get(i10);
                if (n05Var2 != null) {
                    n05Var = di4Var.a(n05Var2);
                } else {
                    n05Var = null;
                }
                arrayList4.add(n05Var);
            }
            dp0.Y(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.a.y).size()) {
            int size4 = ((List) this.a.y).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = yo0.u0(arrayList5, arrayList3);
        }
        this.g = arrayList3;
    }

    public static void i(o24 o24Var, vg0 vg0Var, long j, km5 km5Var, g96 g96Var, bb4 bb4Var) {
        vg0Var.h();
        ArrayList arrayList = o24Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            di4 di4Var = (di4) arrayList.get(i);
            di4Var.a.e(vg0Var, j, km5Var, g96Var, bb4Var);
            vg0Var.o(0.0f, di4Var.a.f);
        }
        vg0Var.p();
    }

    public static void j(o24 o24Var, vg0 vg0Var, ka0 ka0Var, float f, km5 km5Var, g96 g96Var, bb4 bb4Var) {
        vg0Var.h();
        ArrayList arrayList = o24Var.h;
        if (arrayList.size() <= 1) {
            m37.n(o24Var, vg0Var, ka0Var, f, km5Var, g96Var, bb4Var);
        } else if (ka0Var instanceof su5) {
            m37.n(o24Var, vg0Var, ka0Var, f, km5Var, g96Var, bb4Var);
        } else if (ka0Var instanceof im5) {
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                cd cdVar = ((di4) arrayList.get(i)).a;
                f3 += cdVar.f;
                f2 = Math.max(f2, cdVar.c());
            }
            Shader b = ((im5) ka0Var).b((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            Matrix matrix = new Matrix();
            b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                cd cdVar2 = ((di4) arrayList.get(i2)).a;
                cdVar2.f(vg0Var, new la0(b), f, km5Var, g96Var, bb4Var);
                vg0Var.o(0.0f, cdVar2.f);
                matrix.setTranslate(0.0f, -cdVar2.f);
                b.setLocalMatrix(matrix);
            }
        } else {
            ze0.l();
            return;
        }
        vg0Var.p();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, u05, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.io.Serializable] */
    public final void a(long j, float[] fArr) {
        k(nd6.g(j));
        l(nd6.f(j));
        ?? obj = new Object();
        obj.x = 0;
        q23.A(this.h, j, new p70(j, (Object) fArr, (Serializable) obj, (Serializable) new Object(), (byte) 2));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        di4 di4Var = (di4) arrayList.get(q23.y(i, arrayList));
        cd cdVar = di4Var.a;
        return cdVar.d.d(i - di4Var.d) + di4Var.f;
    }

    public final int c(int i, boolean z) {
        int e;
        m(i);
        ArrayList arrayList = this.h;
        di4 di4Var = (di4) arrayList.get(q23.y(i, arrayList));
        cd cdVar = di4Var.a;
        int i2 = i - di4Var.d;
        zc6 zc6Var = cdVar.d;
        if (z) {
            Layout layout = zc6Var.f;
            ThreadLocal threadLocal = ed6.a;
            if (layout.getEllipsisCount(i2) > 0 && zc6Var.b == TextUtils.TruncateAt.END) {
                e = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            } else {
                kz c = zc6Var.c();
                Layout layout2 = (Layout) c.x;
                e = c.z(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            }
        } else {
            e = zc6Var.e(i2);
        }
        return e + di4Var.b;
    }

    public final int d(int i) {
        int x;
        int length = ((ko) this.a.x).y.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            x = arrayList.size() - 1;
        } else if (i < 0) {
            x = 0;
        } else {
            x = q23.x(i, arrayList);
        }
        di4 di4Var = (di4) arrayList.get(x);
        return di4Var.a.d.f(di4Var.d(i)) + di4Var.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        di4 di4Var = (di4) arrayList.get(q23.z(arrayList, f));
        int i = di4Var.c - di4Var.b;
        int i2 = di4Var.d;
        if (i == 0) {
            return i2;
        }
        cd cdVar = di4Var.a;
        float f2 = f - di4Var.f;
        zc6 zc6Var = cdVar.d;
        int i3 = (int) (f2 - 0.0f);
        int i4 = zc6Var.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = zc6Var.f.getLineForVertical(i3 - zc6Var.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        di4 di4Var = (di4) arrayList.get(q23.y(i, arrayList));
        cd cdVar = di4Var.a;
        return cdVar.d.h(i - di4Var.d) + di4Var.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        di4 di4Var = (di4) arrayList.get(q23.z(arrayList, intBitsToFloat));
        int i2 = di4Var.c;
        int i3 = di4Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        cd cdVar = di4Var.a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i) - di4Var.f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        zc6 zc6Var = cdVar.d;
        int intBitsToFloat4 = (int) (Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits)) - 0.0f);
        Layout layout = zc6Var.f;
        int lineForVertical = layout.getLineForVertical(intBitsToFloat4 - zc6Var.h);
        if (lineForVertical >= zc6Var.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (zc6Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long h(n05 n05Var, int i, p65 p65Var) {
        long j;
        long j2;
        float f = n05Var.b;
        ArrayList arrayList = this.h;
        int z = q23.z(arrayList, f);
        float f2 = ((di4) arrayList.get(z)).g;
        float f3 = n05Var.d;
        if (f2 < f3 && z != arrayList.size() - 1) {
            int z2 = q23.z(arrayList, f3);
            long j3 = nd6.b;
            while (true) {
                j = nd6.b;
                if (!nd6.c(j3, j) || z > z2) {
                    break;
                }
                di4 di4Var = (di4) arrayList.get(z);
                j3 = di4Var.b(di4Var.a.b(di4Var.c(n05Var), i, p65Var), true);
                z++;
            }
            if (nd6.c(j3, j)) {
                return j;
            }
            while (true) {
                j2 = nd6.b;
                if (!nd6.c(j, j2) || z > z2) {
                    break;
                }
                di4 di4Var2 = (di4) arrayList.get(z2);
                j = di4Var2.b(di4Var2.a.b(di4Var2.c(n05Var), i, p65Var), true);
                z2--;
            }
            if (nd6.c(j, j2)) {
                return j3;
            }
            return fy5.a((int) (j3 >> 32), (int) (4294967295L & j));
        }
        di4 di4Var3 = (di4) arrayList.get(z);
        return di4Var3.b(di4Var3.a.b(di4Var3.c(n05Var), i, p65Var), true);
    }

    public final void k(int i) {
        ko koVar = (ko) this.a.x;
        if (i >= 0 && i < koVar.y.length()) {
            return;
        }
        fz2.a("offset(" + i + ") is out of bounds [0, " + koVar.y.length() + ")");
    }

    public final void l(int i) {
        ko koVar = (ko) this.a.x;
        if (i >= 0 && i <= koVar.y.length()) {
            return;
        }
        fz2.a("offset(" + i + ") is out of bounds [0, " + koVar.y.length() + "]");
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (!z) {
            fz2.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
        }
    }
}
