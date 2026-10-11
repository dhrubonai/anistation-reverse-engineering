package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class bp2 extends m76 {
    public final /* synthetic */ byte e = 1;
    public final /* synthetic */ ep2 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp2(String str, ep2 ep2Var, int i, List list, boolean z) {
        super(str, true);
        this.f = ep2Var;
        this.g = i;
        this.h = list;
    }

    @Override // defpackage.m76
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.H.getClass();
                try {
                    this.f.T.G(this.g, 9);
                    synchronized (this.f) {
                        this.f.V.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
            default:
                this.f.H.getClass();
                try {
                    this.f.T.G(this.g, 9);
                    synchronized (this.f) {
                        this.f.V.remove(Integer.valueOf(this.g));
                    }
                } catch (IOException unused2) {
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp2(String str, ep2 ep2Var, int i, List list) {
        super(str, true);
        this.f = ep2Var;
        this.g = i;
        this.h = list;
    }
}
