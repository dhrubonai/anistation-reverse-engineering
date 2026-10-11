package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ze0 implements ri3, se2, sg0, ui1 {
    public final /* synthetic */ byte x;
    public static final ze0 y = new ze0((byte) 0);
    public static final ze0 z = new ze0((byte) 1);
    public static final ze0 A = new ze0((byte) 2);

    public /* synthetic */ ze0(byte b) {
        this.x = b;
    }

    public static /* synthetic */ void d() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void e(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void g(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void i(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void j() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void k(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void l() {
        throw new er0((byte) 4);
    }

    public static /* synthetic */ void m(String str) {
        throw new IllegalStateException(str);
    }

    @Override // defpackage.se2, defpackage.rs6
    public void a(ns6 ns6Var) {
        switch (this.x) {
            case 14:
                kb0.t("BaseGlShaderProgram", "Exception caught by default BaseGlShaderProgram errorListener.", ns6Var);
                return;
            default:
                kb0.t("DebugViewShaderProgram", "Exception caught by errorListener.", ns6Var);
                return;
        }
    }

    @Override // defpackage.ui1
    public double b(double d) {
        double d2;
        double d3;
        double d4;
        double d5;
        switch (this.x) {
            case 21:
                if (d < 0.0d) {
                    d2 = -d;
                } else {
                    d2 = d;
                }
                if (d2 >= 0.0031308049535603718d) {
                    d3 = (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d;
                } else {
                    d3 = d2 / 0.07739938080495357d;
                }
                return Math.copySign(d3, d);
            case 22:
                if (d < 0.0d) {
                    d4 = -d;
                } else {
                    d4 = d;
                }
                if (d4 >= 0.04045d) {
                    d5 = Math.pow((0.9478672985781991d * d4) + 0.05213270142180095d, 2.4d);
                } else {
                    d5 = d4 * 0.07739938080495357d;
                }
                return Math.copySign(d5, d);
            case 23:
                float[] fArr = rp0.a;
                return rp0.b(rp0.c, d);
            case 24:
                float[] fArr2 = rp0.a;
                return rp0.a(rp0.c, d);
            case 25:
                float[] fArr3 = rp0.a;
                return rp0.d(rp0.d, d);
            default:
                float[] fArr4 = rp0.a;
                return rp0.c(rp0.d, d);
        }
    }

    public String c(v41 v41Var) {
        String str = v41Var.h;
        if (str != null) {
            return str;
        }
        return v41Var.a.toString();
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        long j;
        af2 af2Var;
        zy1 zy1Var;
        mb1 mb1Var;
        byte b = 1;
        switch (this.x) {
            case 9:
                h71 h71Var = (h71) obj;
                l71 l71Var = h71Var.a;
                if (h71Var == l71Var.j && l71Var.n != null) {
                    j71 j71Var = l71Var.p;
                    int i = j71Var.d;
                    if (i != -1) {
                        long j2 = j71Var.e.f / i;
                        ww wwVar = l71Var.t;
                        wwVar.getClass();
                        j = eq6.c0(wwVar.a.getSampleRate(), j2);
                    } else {
                        j = -9223372036854775807L;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - l71Var.Z;
                    af2 af2Var2 = l71Var.n;
                    int i2 = l71Var.p.e.f;
                    long l0 = eq6.l0(j);
                    pz2 pz2Var = ((jp3) af2Var2.y).f1;
                    Handler handler = (Handler) pz2Var.y;
                    if (handler != null) {
                        handler.post(new aw(pz2Var, i2, l0, elapsedRealtime, (byte) 0));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                af2 af2Var3 = ((h71) obj).a.n;
                if (af2Var3 != null) {
                    q18 q18Var = new q18((byte) 6);
                    pz2 pz2Var2 = ((jp3) af2Var3.y).f1;
                    Handler handler2 = (Handler) pz2Var2.y;
                    if (handler2 != null) {
                        handler2.post(new cw(pz2Var2, q18Var, b));
                        return;
                    }
                    return;
                }
                return;
            case 11:
                h71 h71Var2 = (h71) obj;
                l71 l71Var2 = h71Var2.a;
                if (h71Var2 == l71Var2.j && (af2Var = l71Var2.n) != null && l71Var2.R && (zy1Var = ((jp3) af2Var.y).e0) != null) {
                    zy1Var.a();
                    return;
                }
                return;
            case 12:
                h71 h71Var3 = (h71) obj;
                l71 l71Var3 = h71Var3.a;
                if (h71Var3 == l71Var3.j && l71Var3.P) {
                    l71Var3.Q = true;
                    return;
                }
                return;
            default:
                af2 af2Var4 = ((g71) obj).a.n;
                if (af2Var4 != null) {
                    jp3 jp3Var = (jp3) af2Var4.y;
                    synchronized (jp3Var.x) {
                        mb1Var = jp3Var.P;
                    }
                    if (mb1Var != null) {
                        mb1Var.f.getClass();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.sg0
    public void cancel() {
    }
}
