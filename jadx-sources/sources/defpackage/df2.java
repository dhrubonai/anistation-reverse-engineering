package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class df2 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public Object f;
    public Object g;

    public df2(uc7 uc7Var, Object[] objArr, StringBuilder sb) {
        this.a = (byte) 2;
        this.b = 0;
        this.c = -1;
        it5.h(uc7Var, "context");
        this.e = uc7Var;
        this.d = 0;
        this.f = objArr;
        this.g = sb;
    }

    public static void g(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(db8.a(obj));
        sb.append("]");
    }

    public VolumeProvider a() {
        df2 df2Var;
        if (((VolumeProvider) this.f) == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                df2Var = this;
                df2Var.f = new ww6(df2Var, this.b, this.c, this.d, (String) this.e, (byte) 1);
            } else {
                df2Var = this;
                df2Var.f = new xw6(df2Var, df2Var.b, df2Var.c, df2Var.d, (byte) 1);
            }
        } else {
            df2Var = this;
        }
        return (VolumeProvider) df2Var.f;
    }

    public void b() {
        if (this.c != 0) {
            HashMap hashMap = ((o88) this.g).d;
            int[] iArr = (int[]) this.e;
            o88 o88Var = (o88) hashMap.get(Integer.valueOf(iArr[this.b]));
            while (true) {
                int i = (o88Var.b - o88Var.a) + 1;
                int i2 = this.c;
                if (i <= i2) {
                    int i3 = this.b + i;
                    this.b = i3;
                    this.g = o88Var;
                    int i4 = i2 - i;
                    this.c = i4;
                    if (i4 > 0) {
                        o88Var = (o88) o88Var.d.get(Integer.valueOf(iArr[i3]));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void c() {
        o88 o88Var = ((o88) this.g).c;
        if (o88Var != null) {
            this.g = o88Var;
        } else {
            this.g = (o88) this.f;
            int i = this.c;
            if (i > 0) {
                this.c = i - 1;
            }
            if (this.d > 0) {
                this.b++;
            }
        }
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if ((r8 instanceof java.math.BigDecimal) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
    
        if ((r8 instanceof java.math.BigInteger) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r8, defpackage.xa8 r9, defpackage.za8 r10) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df2.d(java.lang.Object, xa8, za8):void");
    }

    public void e(o88 o88Var, StringBuilder sb) {
        for (o88 o88Var2 : o88Var.d.values()) {
            sb.append("  ");
            sb.append(o88Var);
            sb.append(" -> ");
            sb.append(o88Var2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.e;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, o88Var2.a, Math.min(iArr.length, o88Var2.b + 1))));
            sb.append("\"]\n");
            e(o88Var2, sb);
        }
    }

    public boolean f(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int[] iArr = (int[]) this.e;
            int length = iArr.length;
            int min = Math.min(length, i2);
            if (min - i == Math.min(length, i4) - i3) {
                for (int i5 = i; i5 <= min; i5++) {
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("digraph {\n");
                e((o88) this.f, sb);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public df2(int[] iArr) {
        this.a = (byte) 1;
        this.e = iArr;
        o88 o88Var = new o88(-1, -1);
        this.f = o88Var;
        this.g = o88Var;
    }

    public df2(st3 st3Var, int i, int i2, int i3, String str) {
        this.a = (byte) 0;
        this.g = st3Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }
}
