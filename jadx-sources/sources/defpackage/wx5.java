package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class wx5 extends m1 implements Iterator, j73 {
    public final /* synthetic */ byte D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx5(bu5 bu5Var, Iterator it, byte b) {
        super(bu5Var, it);
        this.D = b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.D) {
            case 0:
                a();
                if (((Map.Entry) this.B) != null) {
                    return new eh0(this);
                }
                p65.l();
                return null;
            case 1:
                Map.Entry entry = (Map.Entry) this.C;
                if (entry != null) {
                    a();
                    return entry.getKey();
                }
                p65.l();
                return null;
            default:
                Map.Entry entry2 = (Map.Entry) this.C;
                if (entry2 != null) {
                    a();
                    return entry2.getValue();
                }
                p65.l();
                return null;
        }
    }
}
