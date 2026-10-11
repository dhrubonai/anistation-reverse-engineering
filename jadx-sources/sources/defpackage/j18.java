package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class j18 extends b18 {
    public boolean z;

    public j18(z18 z18Var) {
        super(z18Var);
        this.y.O++;
    }

    public final void M() {
        if (this.z) {
            return;
        }
        ze0.m("Not initialized");
    }

    public final void N() {
        if (!this.z) {
            O();
            this.y.P++;
            this.z = true;
            return;
        }
        ze0.m("Can't initialize twice");
    }

    public void O() {
    }
}
