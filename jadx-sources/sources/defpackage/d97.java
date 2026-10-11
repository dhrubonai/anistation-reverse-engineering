package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class d97 implements ug3, rc2 {
    public final /* synthetic */ qu0 x;

    public d97(qu0 qu0Var) {
        this.x = qu0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ug3) || !(obj instanceof rc2)) {
            return false;
        }
        return a34.i(getFunctionDelegate(), ((rc2) obj).getFunctionDelegate());
    }

    @Override // defpackage.rc2
    public final ec2 getFunctionDelegate() {
        return new tc2(1, this.x, qu0.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
