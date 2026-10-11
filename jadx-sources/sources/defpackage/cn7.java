package defpackage;

import android.os.Bundle;
import com.google.protobuf.Internal;
import com.unity3d.services.core.fid.Constants;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class cn7 implements q30, br3, ki6, r54, o41, a23 {
    public static volatile cn7 y;
    public Object x;
    public static final rd2 z = new rd2(1);
    public static final zf4 A = new Object();
    public static final yf4 B = new Object();

    /* JADX WARN: Type inference failed for: r0v7, types: [cs1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, vm3] */
    public cn7(byte b) {
        zx3 zx3Var;
        switch (b) {
            case 1:
                try {
                    zx3Var = (zx3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                } catch (Exception unused) {
                    zx3Var = z;
                }
                zx3[] zx3VarArr = {rd2.b, zx3Var};
                ?? obj = new Object();
                obj.a = zx3VarArr;
                this.x = (zx3) Internal.checkNotNull(obj, "messageInfoFactory");
                return;
            case 3:
                this.x = new h4(this);
                return;
            case 7:
                this.x = new AtomicReference(null);
                return;
            case 12:
                this.x = new r18((byte) 13);
                return;
            case 13:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                timeUnit.getClass();
                u76 u76Var = u76.h;
                u76Var.getClass();
                timeUnit.getClass();
                ?? obj2 = new Object();
                obj2.a = 300000000000L;
                obj2.b = u76Var.d();
                obj2.c = new cp2(obj2, h11.k(new StringBuilder(), dq6.g, " ConnectionPool"));
                obj2.d = new ConcurrentLinkedQueue();
                this.x = obj2;
                return;
            case 15:
                this.x = new rt3((byte) 27);
                return;
            case 16:
                this.x = new Object();
                return;
            case 18:
                this.x = new ConcurrentHashMap(16);
                return;
            case 21:
                this.x = new k01();
                return;
            case 22:
                this.x = null;
                return;
            case 28:
                this.x = nw2.k();
                return;
            default:
                this.x = new CopyOnWriteArrayList();
                return;
        }
    }

    public static ae3 p(cn7 cn7Var, int i) {
        ub2 ub2Var;
        af3 af3Var = (af3) cn7Var.x;
        ft5 b = et5.b();
        if (b != null) {
            ub2Var = b.e();
        } else {
            ub2Var = null;
        }
        ub2 ub2Var2 = ub2Var;
        ft5 e = et5.e(b);
        try {
            ue3 ue3Var = (ue3) af3Var.f.getValue();
            et5.k(b, e, ub2Var2);
            return af3Var.q.a(i, ue3Var.j, af3Var.d, new p03(i, ue3Var));
        } catch (Throwable th) {
            et5.k(b, e, ub2Var2);
            throw th;
        }
    }

    public static /* synthetic */ List r(cn7 cn7Var, CharSequence charSequence, int i, int i2, ic2 ic2Var, int i3) {
        boolean z2 = false;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        if ((i3 & 8) == 0) {
            z2 = true;
        }
        return cn7Var.q(charSequence, i, i2, z2, ic2Var);
    }

    @Override // defpackage.o41
    public q41 H() {
        return new d91((rt3) this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f9, code lost:
    
        if (r2 == null) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r12v0, types: [ir3] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    @Override // defpackage.br3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ur3 a(defpackage.ar3 r29) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn7.a(ar3):ur3");
    }

    @Override // defpackage.r54
    public void b(long j) {
        o81 o81Var = (o81) this.x;
        o81Var.p.c(j);
        ni6 ni6Var = o81Var.r;
        ni6Var.getClass();
        ni6Var.g();
        ni6Var.i.d(null, 4, 0, 0).b();
    }

    @Override // defpackage.a23
    public int c(char[] cArr, int i, int i2) {
        return ((jl0) this.x).a(cArr, i, i2);
    }

    @Override // defpackage.r54
    public void d(long j) {
        ((o81) this.x).p.d(j);
    }

    @Override // defpackage.ki6
    public void e(o15 o15Var, String str, String str2) {
        o81 o81Var = (o81) this.x;
        qz1 qz1Var = o81Var.p;
        v94.R(qz1Var, o15Var, str, str2);
        o81Var.i.u(qz1Var.a());
    }

    @Override // defpackage.br3
    public ar3 f(ur3 ur3Var) {
        return ((r18) this.x).f(ur3Var);
    }

    @Override // defpackage.r54
    public void g(int i, ea2 ea2Var, int i2, int i3) {
        v94.S(((o81) this.x).p, i, ea2Var, i2, i3);
    }

    @Override // defpackage.r54
    public void h() {
        ((o81) this.x).i.h();
    }

    @Override // defpackage.ki6
    public void i(o15 o15Var, String str, String str2, oz1 oz1Var) {
        o81 o81Var = (o81) this.x;
        qz1 qz1Var = o81Var.p;
        v94.R(qz1Var, o15Var, str, str2);
        eo3 eo3Var = o81Var.i;
        qz1Var.q = oz1Var;
        eo3Var.v(qz1Var.a(), oz1Var);
    }

    @Override // defpackage.q30
    public void j(hw0 hw0Var) {
        boolean z2;
        if (hw0Var.y == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        r30 r30Var = (r30) this.x;
        if (z2) {
            r30Var.k(null, r30Var.l());
            return;
        }
        p30 p30Var = r30Var.q;
        if (p30Var != null) {
            p30Var.a(hw0Var);
        }
    }

    public g4 l(int i) {
        return null;
    }

    public g4 m(int i) {
        return null;
    }

    public boolean n(int i, int i2, Bundle bundle) {
        return false;
    }

    public void o(q18 q18Var) {
        q18Var.getClass();
        h11.v(((k01) this.x).a(q18Var));
    }

    public List q(CharSequence charSequence, int i, int i2, boolean z2, ic2 ic2Var) {
        if (charSequence.length() != 0) {
            ts tsVar = (ts) this.x;
            while (i < i2) {
                char charAt = charSequence.charAt(i);
                if (((Boolean) ic2Var.invoke(Character.valueOf(charAt), Integer.valueOf(charAt))).booleanValue()) {
                    break;
                }
                ts[] tsVarArr = tsVar.d;
                ts tsVar2 = tsVarArr[charAt];
                if (tsVar2 == null) {
                    if (z2) {
                        tsVar = tsVarArr[Character.toLowerCase(charAt)];
                    } else {
                        tsVar = null;
                    }
                    if (tsVar == null) {
                        return nt1.x;
                    }
                } else {
                    tsVar = tsVar2;
                }
                i++;
            }
            return tsVar.b;
        }
        ze0.k("Couldn't search in char tree for empty string");
        return null;
    }

    public void k(int i, g4 g4Var, String str, Bundle bundle) {
    }

    public /* synthetic */ cn7(Object obj) {
        this.x = obj;
    }

    public cn7(r30 r30Var) {
        Objects.requireNonNull(r30Var);
        this.x = r30Var;
    }

    public cn7(InputStream inputStream) {
        this.x = new jl0(inputStream, kl0.a);
    }
}
