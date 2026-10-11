package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class dp2 extends m76 {
    public final /* synthetic */ ep2 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp2(String str, ep2 ep2Var, int i, long j) {
        super(str, true);
        this.e = ep2Var;
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.m76
    public final long a() {
        ep2 ep2Var = this.e;
        try {
            ep2Var.T.I(this.f, this.g);
            return -1L;
        } catch (IOException e) {
            ep2Var.a(2, 2, e);
            return -1L;
        }
    }
}
