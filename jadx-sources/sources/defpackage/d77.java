package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d77 {
    public static WorkDatabase a(Context context, Executor executor, tn0 tn0Var, boolean z) {
        q65 l;
        context.getClass();
        executor.getClass();
        tn0Var.getClass();
        if (z) {
            l = new q65(context, WorkDatabase.class, null);
            l.i = true;
        } else {
            l = wc7.l(context, WorkDatabase.class, "androidx.work.workdb");
            l.h = new hh0(context);
        }
        l.f = executor;
        l.d.add(new pm0(tn0Var));
        l.a(py3.f);
        l.a(new y35(context, 2, 3));
        l.a(py3.g);
        l.a(py3.h);
        l.a(new y35(context, 5, 6));
        l.a(py3.i);
        l.a(py3.j);
        l.a(py3.k);
        l.a(new y35(context));
        l.a(new y35(context, 10, 11));
        l.a(py3.b);
        l.a(py3.c);
        l.a(py3.d);
        l.a(py3.e);
        l.a(new y35(context, 21, 22));
        l.n = false;
        l.o = true;
        l.p = true;
        return (WorkDatabase) l.b();
    }
}
