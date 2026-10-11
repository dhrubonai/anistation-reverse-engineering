package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lf5 {
    public long a;
    public nr6 b;
    public boolean c;
    public float d;
    public final nl e = new nl(0.0f);
    public nl f;
    public long g;
    public long h;

    public final String toString() {
        long j = this.a;
        nr6 nr6Var = this.b;
        boolean z = this.c;
        float f = this.d;
        nl nlVar = this.f;
        long j2 = this.g;
        long j3 = this.h;
        StringBuilder sb = new StringBuilder("progress nanos: ");
        sb.append(j);
        sb.append(", animationSpec: ");
        sb.append(nr6Var);
        sb.append(", isComplete: ");
        sb.append(z);
        sb.append(", value: ");
        sb.append(f);
        sb.append(", start: ");
        sb.append(this.e);
        sb.append(", initialVelocity: ");
        sb.append(nlVar);
        qx1.w(sb, ", durationNanos: ", j2, ", animationSpecDuration: ");
        sb.append(j3);
        return sb.toString();
    }
}
