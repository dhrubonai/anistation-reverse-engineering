package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ai5 {
    public final String a;
    public final ic2 b;
    public final boolean c;

    public /* synthetic */ ai5(String str) {
        this(str, new oa5((byte) 25));
    }

    public final String toString() {
        return zo5.l("AccessibilityKey: ", this.a);
    }

    public ai5(String str, ic2 ic2Var) {
        this.a = str;
        this.b = ic2Var;
    }

    public ai5(String str, int i) {
        this(str);
        this.c = true;
    }

    public ai5(String str, boolean z, ic2 ic2Var) {
        this(str, ic2Var);
        this.c = z;
    }
}
