package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yf0 extends x2 {
    public final /* synthetic */ zf0 E;

    public yf0(zf0 zf0Var) {
        this.E = zf0Var;
    }

    @Override // defpackage.x2
    public final String i() {
        wf0 wf0Var = (wf0) this.E.x.get();
        if (wf0Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + wf0Var.a + "]";
    }
}
