package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rq3 {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Serializable g;
    public Cloneable h;

    public rq3(ga5 ga5Var, nj4 nj4Var) {
        this.d = ga5Var;
        this.e = nj4Var;
        this.f = new og5((byte) 3);
        this.g = new LinkedHashMap();
        this.c = true;
    }

    public void a() {
        ga5 ga5Var = (ga5) this.d;
        if (((rg3) ga5Var.getLifecycle()).i == eg3.y) {
            if (!this.a) {
                ((nj4) this.e).invoke();
                ga5Var.getLifecycle().a(new pq(this, (byte) 2));
                this.a = true;
                return;
            }
            ze0.m("SavedStateRegistry was already attached.");
            return;
        }
        ze0.m("Restarter must be created only during owner's initialization stage");
    }

    public rq3(UUID uuid) {
        this();
        this.d = uuid;
    }

    public rq3() {
        this.f = t15.D;
        this.b = true;
        z62 z62Var = nw2.y;
        this.g = o15.B;
    }
}
