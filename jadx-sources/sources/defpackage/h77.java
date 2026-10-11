package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h77 {
    public final o77 a;
    public final pu4 b;
    public final a87 c;

    static {
        xk3.f("WMFgUpdater");
    }

    public h77(WorkDatabase workDatabase, pu4 pu4Var, o77 o77Var) {
        this.b = pu4Var;
        this.a = o77Var;
        this.c = workDatabase.workSpecDao();
    }
}
