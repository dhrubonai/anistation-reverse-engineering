package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class o63 implements ni5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Iterator b;

    public /* synthetic */ o63(Iterator it, byte b) {
        this.a = b;
        this.b = it;
    }

    @Override // defpackage.ni5
    public final Iterator iterator() {
        byte b = this.a;
        return this.b;
    }
}
