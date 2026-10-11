package defpackage;

import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i88 extends h78 {
    public static final i88 D;
    public final m88 C;

    static {
        UUID randomUUID = UUID.randomUUID();
        D = new i88("<skip trace>", randomUUID, h78.a(randomUUID), k88.e, q78.c());
    }

    public i88(String str, UUID uuid, String str2, m88 m88Var, q88 q88Var) {
        super(str, uuid, str2, q88Var);
        io3.n(m88Var.c);
        this.C = m88Var;
    }

    @Override // defpackage.h78
    public final m88 l() {
        boolean z;
        m88 m88Var = k88.e;
        m88 m88Var2 = this.C;
        m88Var2.getClass();
        m88 m88Var3 = k88.e;
        if (m88Var2 != m88Var3) {
            m88Var.getClass();
            if (m88Var == m88Var3) {
                return m88Var2;
            }
            zw2<m88> p = zw2.p(m88Var2, m88Var);
            if (p.isEmpty()) {
                return m88Var3;
            }
            if (p.size() == 1) {
                return (m88) p.iterator().next();
            }
            int i = 0;
            for (m88 m88Var4 : p) {
                do {
                    i += m88Var4.b.z;
                    m88Var4 = m88Var4.a;
                } while (m88Var4 != null);
            }
            if (i == 0) {
                return k88.e;
            }
            so5 so5Var = new so5(i);
            for (m88 m88Var5 : p) {
                do {
                    int i2 = 0;
                    while (true) {
                        so5 so5Var2 = m88Var5.b;
                        if (i2 >= so5Var2.z) {
                            break;
                        }
                        if (so5Var.put((j88) so5Var2.e(i2), so5Var2.h(i2)) == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        io3.p(z, "Duplicate bindings: %s", so5Var2.e(i2));
                        i2++;
                    }
                    m88Var5 = m88Var5.a;
                } while (m88Var5 != null);
            }
            return new m88(null, so5Var).a();
        }
        return m88Var;
    }
}
