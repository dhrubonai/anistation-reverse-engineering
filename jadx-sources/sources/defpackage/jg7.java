package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jg7 extends Exception {
    public final hw0 x;

    public jg7(hw0 hw0Var) {
        boolean z;
        if (hw0Var.y != 0 && hw0Var.z != null) {
            z = true;
        } else {
            z = false;
        }
        a34.m("ResolvableConnectionException can only be created with a connection result containing a resolution.", z);
        this.x = hw0Var;
    }
}
