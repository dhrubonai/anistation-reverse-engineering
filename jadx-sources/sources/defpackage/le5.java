package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final /* synthetic */ class le5 implements x42, rc2 {
    public final /* synthetic */ ub2 x;

    public le5(ub2 ub2Var) {
        this.x = ub2Var;
    }

    @Override // defpackage.x42
    public final Object emit(Object obj, vz0 vz0Var) {
        this.x.invoke((String) obj);
        return pn6.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x42) || !(obj instanceof rc2)) {
            return false;
        }
        return a34.i(getFunctionDelegate(), ((rc2) obj).getFunctionDelegate());
    }

    @Override // defpackage.rc2
    public final ec2 getFunctionDelegate() {
        return new tc2(2, this.x, q23.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
