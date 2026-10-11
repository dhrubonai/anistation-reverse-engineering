package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class m88 {
    public static final j88 d = new Object();
    public final m88 a;
    public final so5 b;
    public boolean c = false;

    public /* synthetic */ m88(m88 m88Var, so5 so5Var) {
        if (m88Var != null) {
            io3.n(m88Var.c);
        }
        this.a = m88Var;
        this.b = so5Var;
    }

    public final m88 a() {
        if (!this.c) {
            this.c = true;
            m88 m88Var = this.a;
            if (m88Var != null && this.b.isEmpty()) {
                return m88Var;
            }
            return this;
        }
        ze0.m("Already frozen");
        return null;
    }

    public final boolean b() {
        if (!this.b.containsKey(d)) {
            m88 m88Var = this.a;
            if (m88Var == null || !m88Var.b()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (m88 m88Var = this; m88Var != null; m88Var = m88Var.a) {
            for (int i = 0; i < m88Var.b.z; i++) {
                sb.append("[");
                sb.append(this.b.h(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
