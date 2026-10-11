package defpackage;

import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class z40 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ List y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ z40(xd6 xd6Var, ia3 ia3Var, List list, ko koVar, ud1 ud1Var, p82 p82Var, boolean z) {
        this.A = xd6Var;
        this.B = ia3Var;
        this.y = list;
        this.C = koVar;
        this.D = ud1Var;
        this.E = p82Var;
        this.z = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u44 u44Var;
        u44 C;
        byte b = this.x;
        Object obj = this.E;
        List list = this.y;
        Object obj2 = this.D;
        Object obj3 = this.C;
        Object obj4 = this.B;
        Object obj5 = this.A;
        switch (b) {
            case 0:
                xd6 xd6Var = (xd6) obj5;
                ia3 ia3Var = (ia3) obj4;
                ko koVar = (ko) obj3;
                ud1 ud1Var = (ud1) obj2;
                p82 p82Var = (p82) obj;
                boolean z = this.z;
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
                                if (list == null) {
                                    list = nt1.x;
                                }
                                kz kzVar = new kz(koVar, ud1Var, p82Var, j2, list, z);
                                kzVar.m();
                                kzVar.i();
                                ft5.q(j);
                                C.w().a();
                                Trace.endSection();
                                return;
                            } catch (Throwable th) {
                                ft5.q(j);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } finally {
                                C.c();
                            }
                        }
                    }
                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            default:
                WorkDatabase workDatabase = (WorkDatabase) obj5;
                String str = (String) obj4;
                z77 z77Var = (z77) obj3;
                z77 z77Var2 = (z77) obj2;
                Set set = (Set) obj;
                a87 workSpecDao = workDatabase.workSpecDao();
                h87 workTagDao = workDatabase.workTagDao();
                z77 b2 = z77.b(z77Var2, null, z77Var.b, null, z77Var.k, z77Var.n, z77Var.s, z77Var.t + 1, z77Var.u, z77Var.v, 29613053);
                if (z77Var2.v == 1) {
                    b2.u = z77Var2.u;
                    b2.v++;
                }
                workSpecDao.updateWorkSpec(o80.P(list, b2));
                workTagDao.deleteByWorkSpecId(str);
                workTagDao.insertTags(str, set);
                if (!this.z) {
                    workSpecDao.markWorkSpecScheduled(str, -1L);
                    workDatabase.workProgressDao().delete(str);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ z40(WorkDatabase workDatabase, String str, z77 z77Var, z77 z77Var2, List list, Set set, boolean z, l77 l77Var) {
        this.A = workDatabase;
        this.B = str;
        this.C = z77Var;
        this.D = z77Var2;
        this.y = list;
        this.E = set;
        this.z = z;
    }
}
