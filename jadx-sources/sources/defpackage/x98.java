package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class x98 implements Cloneable {
    public final ba8 x;
    public ba8 y;

    public x98(ba8 ba8Var) {
        this.x = ba8Var;
        if (!ba8Var.j()) {
            this.y = (ba8) ba8Var.i(4, null);
        } else {
            ze0.k("Default instance must be immutable.");
            throw null;
        }
    }

    public final void a() {
        if (!this.y.j()) {
            ba8 ba8Var = (ba8) this.x.i(4, null);
            mb8.c.a(ba8Var.getClass()).b(ba8Var, this.y);
            this.y = ba8Var;
        }
    }

    public final ba8 b() {
        boolean j = this.y.j();
        ba8 ba8Var = this.y;
        if (j) {
            ba8Var.getClass();
            mb8.c.a(ba8Var.getClass()).g(ba8Var);
            ba8Var.k();
            ba8Var = this.y;
        }
        ba8Var.getClass();
        boolean z = true;
        ba8 ba8Var2 = null;
        byte byteValue = ((Byte) ba8Var.i(1, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                boolean f = mb8.c.a(ba8Var.getClass()).f(ba8Var);
                if (true == f) {
                    ba8Var2 = ba8Var;
                }
                ba8Var.i(2, ba8Var2);
                z = f;
            }
        }
        if (z) {
            return ba8Var;
        }
        throw new er0("Message was missing required fields.  (Lite runtime could not determine which fields were missing).", (byte) 9);
    }

    public final Object clone() {
        x98 x98Var = (x98) this.x.i(5, null);
        boolean j = this.y.j();
        ba8 ba8Var = this.y;
        if (j) {
            ba8Var.getClass();
            mb8.c.a(ba8Var.getClass()).g(ba8Var);
            ba8Var.k();
            ba8Var = this.y;
        }
        x98Var.y = ba8Var;
        return x98Var;
    }
}
