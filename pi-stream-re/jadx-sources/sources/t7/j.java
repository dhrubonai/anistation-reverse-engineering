package t7;

import androidx.lifecycle.q0;
import java.util.concurrent.CancellationException;
import p7.a1;
import p7.k1;
import p7.s0;
import p7.u1;
import p7.z1;
import r6.h0;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final w4.o f10066a = new w4.o("UNDEFINED", 3);

    /* renamed from: b, reason: collision with root package name */
    public static final w4.o f10067b = new w4.o("REUSABLE_CLAIMED", 3);

    /* JADX WARN: Finally extract failed */
    public static final void a(z6.e eVar, Object obj, h7.l lVar) {
        Object tVar;
        boolean z9;
        z1 z1Var;
        if (eVar instanceof i) {
            i iVar = (i) eVar;
            Throwable a10 = w6.d.a(obj);
            boolean z10 = false;
            if (a10 == null) {
                if (lVar != null) {
                    tVar = new p7.u(obj, lVar);
                } else {
                    tVar = obj;
                }
            } else {
                tVar = new p7.t(a10, false);
            }
            z6.e eVar2 = iVar.f10063e;
            iVar.getContext();
            p7.w wVar = iVar.f10062d;
            if (wVar.H()) {
                iVar.f10064f = tVar;
                iVar.f8686c = 1;
                wVar.G(iVar.getContext(), iVar);
                return;
            }
            s0 a11 = u1.a();
            if (a11.f8739c >= 4294967296L) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                iVar.f10064f = tVar;
                iVar.f8686c = 1;
                x6.h hVar = a11.f8741e;
                if (hVar == null) {
                    hVar = new x6.h();
                    a11.f8741e = hVar;
                }
                hVar.b(iVar);
                return;
            }
            a11.K(true);
            try {
                a1 a1Var = (a1) iVar.getContext().r(q0.f1134x);
                if (a1Var != null && !a1Var.a()) {
                    CancellationException s9 = ((k1) a1Var).s();
                    iVar.b(tVar, s9);
                    iVar.resumeWith(h0.F(s9));
                    z10 = true;
                }
                if (!z10) {
                    Object obj2 = iVar.f10065x;
                    z6.i context = eVar2.getContext();
                    Object b10 = z.b(context, obj2);
                    if (b10 != z.f10093a) {
                        z1Var = h0.d1(eVar2, context, b10);
                    } else {
                        z1Var = null;
                    }
                    try {
                        eVar2.resumeWith(obj);
                        if (z1Var == null || z1Var.U()) {
                            z.a(context, b10);
                        }
                    } catch (Throwable th) {
                        if (z1Var == null || z1Var.U()) {
                            z.a(context, b10);
                        }
                        throw th;
                    }
                }
                do {
                } while (a11.L());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        eVar.resumeWith(obj);
    }
}
