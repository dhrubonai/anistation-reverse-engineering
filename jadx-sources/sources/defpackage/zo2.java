package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class zo2 extends m76 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ ep2 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zo2(String str, ep2 ep2Var, int i, int i2, byte b) {
        super(str, true);
        this.e = b;
        this.f = ep2Var;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.m76
    public final long a() {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                ep2 ep2Var = this.f;
                try {
                    ep2Var.T.A(this.g, this.h, true);
                } catch (IOException e) {
                    ep2Var.a(2, 2, e);
                }
                return -1L;
            case 1:
                p7 p7Var = this.f.H;
                int i3 = this.h;
                p7Var.getClass();
                if (i3 != 0) {
                    synchronized (this.f) {
                        this.f.V.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                }
                throw null;
            default:
                ep2 ep2Var2 = this.f;
                try {
                    i = this.g;
                    i2 = this.h;
                } catch (IOException e2) {
                    ep2Var2.a(2, 2, e2);
                }
                if (i2 != 0) {
                    ep2Var2.T.G(i, i2);
                    return -1L;
                }
                throw null;
        }
    }
}
