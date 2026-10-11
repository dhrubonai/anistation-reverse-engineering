package defpackage;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class qi2 implements du2, ko5, ay0, tp3, au3, dw3 {
    public final /* synthetic */ byte x;

    public static /* synthetic */ void e() {
        throw new NoSuchElementException();
    }

    public static void f(int i) {
        throw new IllegalArgumentException(qx1.h(i, "An unknown field for index "));
    }

    public static /* synthetic */ void g(int i, int i2) {
        throw new IndexOutOfBoundsException("position=" + i + ((Object) ", limit=") + i2);
    }

    public static /* synthetic */ void h(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void k(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void l(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void m(String str) {
        throw new NullPointerException(str);
    }

    @Override // defpackage.ko5
    public boolean a() {
        return false;
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        switch (this.x) {
            case 10:
                ((ExecutorService) obj).shutdown();
                return;
            case 16:
                ((fq4) obj).S0();
                return;
            case 17:
                ((fq4) obj).stop();
                return;
            case 19:
                ((fq4) obj).E();
                return;
            case 20:
                ((fq4) obj).B();
                return;
            case 23:
                ((fq4) obj).J();
                return;
            case 25:
                ((fq4) obj).L0();
                return;
            case 26:
                ((fq4) obj).g0();
                return;
            case 28:
                ((fq4) obj).N0();
                return;
            default:
                ((fq4) obj).V0();
                return;
        }
    }

    @Override // defpackage.tp3
    public int b(Object obj) {
        String str = ((mp3) obj).a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            return 0;
        }
        return 1;
    }

    @Override // defpackage.du2
    public boolean c(int i, int i2, int i3, int i4, int i5) {
        switch (this.x) {
            case 3:
                return false;
            default:
                if (i != 2 ? !(i2 != 65 || i3 != 80 || i4 != 73 || i5 != 67) : !(i2 != 80 || i3 != 73 || i4 != 67)) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.au3
    public void d(ct3 ct3Var, int i) {
        switch (this.x) {
            case 12:
                ct3Var.getClass();
                return;
            case 13:
                ct3Var.getClass();
                return;
            default:
                ct3Var.b(i);
                return;
        }
    }

    @Override // defpackage.dw3
    public Object j(bu3 bu3Var, dt3 dt3Var, int i) {
        switch (this.x) {
            case 21:
                at3 at3Var = bu3Var.e;
                bu3Var.q(dt3Var);
                at3Var.getClass();
                return wc7.w(new tk5(-6));
            case 22:
                bu3Var.getClass();
                throw new ClassCastException();
            case 23:
            default:
                return bu3Var.m(dt3Var);
            case 24:
                bu3Var.getClass();
                throw new ClassCastException();
        }
    }

    public /* synthetic */ qi2(byte b) {
        this.x = b;
    }
}
