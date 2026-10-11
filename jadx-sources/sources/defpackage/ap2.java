package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ap2 extends m76 {
    public final /* synthetic */ ep2 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ pa0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap2(String str, ep2 ep2Var, int i, pa0 pa0Var, int i2, boolean z) {
        super(str, true);
        this.e = ep2Var;
        this.f = i;
        this.g = pa0Var;
        this.h = i2;
    }

    @Override // defpackage.m76
    public final long a() {
        try {
            p7 p7Var = this.e.H;
            pa0 pa0Var = this.g;
            int i = this.h;
            p7Var.getClass();
            pa0Var.skip(i);
            this.e.T.G(this.f, 9);
            synchronized (this.e) {
                this.e.V.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
