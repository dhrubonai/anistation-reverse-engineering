package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n67 implements lg3 {
    public final /* synthetic */ w05 A;
    public final /* synthetic */ ke0 x;
    public final /* synthetic */ uf y;
    public final /* synthetic */ h05 z;

    public n67(ke0 ke0Var, uf ufVar, h05 h05Var, w05 w05Var) {
        this.x = ke0Var;
        this.y = ufVar;
        this.z = h05Var;
        this.A = w05Var;
    }

    @Override // defpackage.lg3
    public final void onStateChanged(og3 og3Var, dg3 dg3Var) {
        boolean z;
        pg0 pg0Var = null;
        switch (m67.a[dg3Var.ordinal()]) {
            case 1:
                tl7.z(this.x, null, y11.A, new l5(this.A, this.z, og3Var, this, null, (byte) 19), 1);
                return;
            case 2:
                uf ufVar = this.y;
                if (ufVar != null) {
                    tu tuVar = (tu) ufVar.z;
                    synchronized (tuVar.y) {
                        try {
                            synchronized (tuVar.y) {
                                z = tuVar.x;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) tuVar.z;
                                tuVar.z = (ArrayList) tuVar.A;
                                tuVar.A = arrayList;
                                tuVar.x = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((vz0) arrayList.get(i)).resumeWith(pn6.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                h05 h05Var = this.z;
                synchronized (h05Var.c) {
                    if (h05Var.t) {
                        h05Var.t = false;
                        pg0Var = h05Var.C();
                    }
                }
                if (pg0Var != null) {
                    ((qg0) pg0Var).resumeWith(pn6.a);
                    return;
                }
                return;
            case 3:
                h05 h05Var2 = this.z;
                synchronized (h05Var2.c) {
                    h05Var2.t = true;
                }
                return;
            case 4:
                this.z.A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                ze0.l();
                return;
        }
    }
}
