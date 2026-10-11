package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class pq implements lg3 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ pq(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.lg3
    public final void onStateChanged(og3 og3Var, dg3 dg3Var) {
        ar arVar;
        Object value;
        Object value2;
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                kr krVar = (kr) obj;
                if (dg3Var == dg3.ON_RESUME) {
                    qp qpVar = krVar.c;
                    sx5 sx5Var = krVar.d;
                    Object value3 = sx5Var.getValue();
                    if (value3 instanceof ar) {
                        arVar = (ar) value3;
                    } else {
                        arVar = null;
                    }
                    if (arVar != null && qpVar.a.getPackageManager().canRequestPackageInstalls()) {
                        pp a = qpVar.a(arVar.b);
                        if (!a.equals(op.a)) {
                            if (!a.equals(np.a)) {
                                ze0.l();
                                return;
                            }
                            do {
                                value = sx5Var.getValue();
                            } while (!sx5Var.j(value, arVar));
                            return;
                        }
                        do {
                            value2 = sx5Var.getValue();
                        } while (!sx5Var.j(value2, new er(arVar.a)));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                gt0 gt0Var = (gt0) obj;
                gt0Var.getClass();
                gt0Var.y = dg3Var.a();
                gt0Var.a();
                return;
            default:
                rq3 rq3Var = (rq3) obj;
                if (dg3Var == dg3.ON_START) {
                    rq3Var.c = true;
                    return;
                } else {
                    if (dg3Var == dg3.ON_STOP) {
                        rq3Var.c = false;
                        return;
                    }
                    return;
                }
        }
    }
}
