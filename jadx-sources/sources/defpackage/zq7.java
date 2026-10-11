package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class zq7 extends vp7 {
    public boolean y;

    public zq7(gu7 gu7Var) {
        super(gu7Var);
        ((gu7) this.x).X++;
    }

    public final void M() {
        if (this.y) {
            return;
        }
        ze0.m("Not initialized");
    }

    public final void N() {
        if (!this.y) {
            if (!O()) {
                ((gu7) this.x).Z.incrementAndGet();
                this.y = true;
                return;
            }
            return;
        }
        ze0.m("Can't initialize twice");
    }

    public boolean O() {
        return true;
    }
}
