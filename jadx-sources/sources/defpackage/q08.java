package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q08 extends v08 {
    public volatile long B;
    public final long C;

    public q08(String str, yh2 yh2Var, long j) {
        super(str, yh2Var);
        this.C = j;
    }

    @Override // defpackage.v08
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.C);
    }

    @Override // defpackage.v08
    public final /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.v08
    public final /* synthetic */ Object c(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.v08
    public final /* synthetic */ Object d() {
        return Long.valueOf(this.B);
    }

    @Override // defpackage.v08
    public final /* synthetic */ void e(Object obj) {
        this.B = ((Long) obj).longValue();
    }
}
