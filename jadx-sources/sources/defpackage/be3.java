package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class be3 {
    public final ub2 a;
    public tu c;
    public int f;
    public final dn0 b = new dn0((byte) 26);
    public int d = -1;
    public int e = -1;

    public be3(ub2 ub2Var) {
        this.a = ub2Var;
    }

    public final ae3 a(int i, long j, boolean z, ub2 ub2Var) {
        tu tuVar = this.c;
        if (tuVar != null) {
            ft4 ft4Var = (ft4) tuVar.A;
            boolean z2 = ft4Var instanceof ce;
            et4 et4Var = new et4(tuVar, i, this.b, ub2Var);
            et4Var.d = new rx0(j);
            if (z2) {
                if (z) {
                    ce ceVar = (ce) ft4Var;
                    ceVar.y.add(new eu4(1, et4Var));
                    if (!ceVar.z) {
                        ceVar.z = true;
                        ceVar.x.post(ceVar);
                    }
                } else {
                    ce ceVar2 = (ce) ft4Var;
                    ceVar2.y.add(new eu4(0, et4Var));
                    if (!ceVar2.z) {
                        ceVar2.z = true;
                        ceVar2.x.post(ceVar2);
                    }
                }
            } else {
                ft4Var.a(et4Var);
            }
            Trace.setCounter("compose:lazy:schedule_prefetch:index", i);
            return et4Var;
        }
        return eq1.a;
    }
}
