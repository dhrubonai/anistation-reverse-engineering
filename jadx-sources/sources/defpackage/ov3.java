package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ov3 implements ay0, dw3, bw3, du2, ui1 {
    public final /* synthetic */ byte x;

    public static /* synthetic */ void d() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void e(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void g(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new er0(str + obj + obj2, (byte) 1);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void k(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalArgumentException(str + obj + '.');
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // defpackage.bw3
    public void a(fq4 fq4Var, dt3 dt3Var, List list) {
        switch (this.x) {
            case 4:
                fq4Var.E0(list);
                return;
            default:
                fq4Var.E0(list);
                return;
        }
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        fq4 fq4Var = (fq4) obj;
        switch (this.x) {
            case 0:
                fq4Var.A();
                return;
            case 1:
                fq4Var.V();
                return;
            case 7:
                fq4Var.d0();
                return;
            case 9:
                fq4Var.a();
                return;
            case 11:
                fq4Var.o();
                return;
            default:
                fq4Var.T0();
                return;
        }
    }

    @Override // defpackage.du2
    public boolean c(int i, int i2, int i3, int i4, int i5) {
        if (i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) {
            if (i2 == 77 && i3 == 76 && i4 == 76) {
                if (i5 == 84 || i == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dw3
    public Object j(bu3 bu3Var, dt3 dt3Var, int i) {
        switch (this.x) {
            case 2:
                bu3Var.getClass();
                throw new ClassCastException();
            case 3:
                at3 at3Var = bu3Var.e;
                bu3Var.q(dt3Var);
                at3Var.getClass();
                return wc7.w(new tk5(-6));
            case 4:
            case 5:
            case 7:
            case 9:
            default:
                bu3Var.getClass();
                throw new ClassCastException();
            case 6:
                bu3Var.getClass();
                throw new ClassCastException();
            case 8:
                bu3Var.getClass();
                throw new ClassCastException();
            case 10:
                bu3Var.getClass();
                throw new ClassCastException();
        }
    }

    public /* synthetic */ ov3(byte b) {
        this.x = b;
    }

    @Override // defpackage.ui1
    public double b(double d) {
        return d;
    }
}
