package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class os implements ni5 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ os(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.ni5
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new o1((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new sh3(this);
            case 3:
                return io3.V((ic2) obj);
            default:
                return new rh3((CharSequence) obj);
        }
    }
}
