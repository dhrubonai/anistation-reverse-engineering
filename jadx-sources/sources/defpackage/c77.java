package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c77 {
    public static final String h = xk3.f("WorkContinuationImpl");
    public final l77 a;
    public final String b;
    public final px1 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;

    public c77(l77 l77Var, String str, px1 px1Var, List list, int i) {
        this.a = l77Var;
        this.b = str;
        this.c = px1Var;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (px1Var == px1.x && ((w77) list.get(i2)).b.u != Long.MAX_VALUE) {
                ze0.k("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String uuid = ((w77) list.get(i2)).a.toString();
            uuid.getClass();
            this.e.add(uuid);
            this.f.add(uuid);
        }
    }

    public static HashSet a(c77 c77Var) {
        HashSet hashSet = new HashSet();
        c77Var.getClass();
        return hashSet;
    }
}
