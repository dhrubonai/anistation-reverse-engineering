package defpackage;

import android.os.Trace;
import android.util.Pair;
import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class y40 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ y40(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.x = b;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
        this.D = obj5;
        this.y = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u44 u44Var;
        u44 C;
        byte b = this.x;
        Object obj = this.D;
        Object obj2 = this.C;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        switch (b) {
            case 0:
                xd6 xd6Var = (xd6) obj5;
                ia3 ia3Var = (ia3) obj4;
                String str = (String) obj3;
                ud1 ud1Var = (ud1) obj2;
                p82 p82Var = (p82) obj;
                boolean z = this.y;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    ft5 h = mt5.h();
                    if (h instanceof u44) {
                        u44Var = (u44) h;
                    } else {
                        u44Var = null;
                    }
                    if (u44Var != null && (C = u44Var.C(null, null)) != null) {
                        try {
                            ft5 j = C.j();
                            try {
                                xd6 j2 = ez5.j(xd6Var, ia3Var);
                                nt1 nt1Var = nt1.x;
                                gd gdVar = new gd(str, j2, nt1Var, nt1Var, p82Var, ud1Var, z);
                                gdVar.m();
                                gdVar.i();
                                C.w().a();
                                Trace.endSection();
                                return;
                            } finally {
                                ft5.q(j);
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } finally {
                                C.c();
                            }
                        }
                    }
                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            default:
                Pair pair = (Pair) obj4;
                ((xw3) obj5).b.i.y(((Integer) pair.first).intValue(), (jw3) pair.second, (ij3) obj3, (fr3) obj2, (IOException) obj, this.y);
                return;
        }
    }
}
