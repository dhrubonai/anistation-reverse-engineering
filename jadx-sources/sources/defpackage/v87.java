package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v87 {
    public final z77 a;
    public final Context b;
    public final String c;
    public final l87 d;
    public final o77 e;
    public final pv0 f;
    public final pu4 g;
    public final WorkDatabase h;
    public final a87 i;
    public final ce1 j;
    public final ArrayList k;
    public final String l;
    public final j43 m;
    public final ArrayList n;
    public final ArrayList o;

    public v87(ai6 ai6Var) {
        z77 z77Var = (z77) ai6Var.e;
        this.a = z77Var;
        this.b = (Context) ai6Var.g;
        String str = z77Var.a;
        this.c = str;
        this.d = (l87) ai6Var.h;
        this.e = (o77) ai6Var.b;
        this.f = (pv0) ai6Var.a;
        this.g = (pu4) ai6Var.c;
        WorkDatabase workDatabase = (WorkDatabase) ai6Var.d;
        this.h = workDatabase;
        this.i = workDatabase.workSpecDao();
        this.j = workDatabase.dependencyDao();
        ArrayList arrayList = (ArrayList) ai6Var.f;
        this.k = arrayList;
        String str2 = z77Var.c;
        this.l = h11.k(h11.o("Work [ id=", str, ", class=", str2, ", tags={ "), yo0.q0(arrayList, ",", null, null, null, 62), " } ]");
        this.m = h98.e();
        this.n = new ArrayList();
        this.o = new ArrayList();
    }

    public final void a(li3 li3Var) {
        xk3.d().e(w87.a, "Worker result FAILURE for ".concat(this.l));
        if (this.a.c()) {
            c();
        } else {
            f(li3Var);
        }
    }

    public final void b(int i) {
        a87 a87Var = this.i;
        j77 j77Var = j77.x;
        String str = this.c;
        a87Var.setState(j77Var, str);
        a87Var.setLastEnqueueTime(str, System.currentTimeMillis());
        a87Var.resetWorkSpecNextScheduleTimeOverride(str, this.a.v);
        a87Var.markWorkSpecScheduled(str, -1L);
        a87Var.setStopReason(str, i);
    }

    public final void c() {
        long currentTimeMillis = System.currentTimeMillis();
        a87 a87Var = this.i;
        String str = this.c;
        a87Var.setLastEnqueueTime(str, currentTimeMillis);
        a87Var.setState(j77.x, str);
        a87Var.resetWorkSpecRunAttemptCount(str);
        a87Var.resetWorkSpecNextScheduleTimeOverride(str, this.a.v);
        a87Var.incrementPeriodCount(str);
        a87Var.markWorkSpecScheduled(str, -1L);
    }

    public final boolean d(int i) {
        z77 z77Var = this.a;
        if (a34.i(z77Var.y, Boolean.TRUE)) {
            String str = w87.a;
            xk3.d().a(str, "Worker " + z77Var.c + " was interrupted. Backing off.");
            b(i);
            return true;
        }
        a87 a87Var = this.i;
        String str2 = this.c;
        j77 state = a87Var.getState(str2);
        if (state != null && !state.a()) {
            String str3 = w87.a;
            xk3.d().a(str3, "Status for " + str2 + " is " + state + "; not doing any work and rescheduling for later execution");
            a87Var.setState(j77.x, str2);
            a87Var.setStopReason(str2, i);
            a87Var.markWorkSpecScheduled(str2, -1L);
            return true;
        }
        String str4 = w87.a;
        xk3.d().a(str4, "Status for " + str2 + " is " + state + " ; not doing any work");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.work.WorkerParameters, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.xz0 r18) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v87.e(xz0):java.lang.Object");
    }

    public final void f(oi3 oi3Var) {
        String str = this.c;
        ArrayList J = te4.J(str);
        J.addAll(bx7.v(this.j, str));
        int size = J.size();
        int i = 0;
        while (true) {
            a87 a87Var = this.i;
            if (i < size) {
                Object obj = J.get(i);
                i++;
                String str2 = (String) obj;
                if (a87Var.getState(str2) != j77.C) {
                    a87Var.setState(j77.A, str2);
                    if (!a34.i(str2, str)) {
                        this.o.add(str2);
                    }
                }
            } else {
                e41 e41Var = ((li3) oi3Var).a;
                e41Var.getClass();
                a87Var.resetWorkSpecNextScheduleTimeOverride(str, this.a.v);
                a87Var.setOutput(str, e41Var);
                return;
            }
        }
    }
}
