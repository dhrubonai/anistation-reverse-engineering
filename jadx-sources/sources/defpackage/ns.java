package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ns implements Iterable, j73 {
    public final /* synthetic */ byte x;
    public final Object y;

    public /* synthetic */ ns(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return new o1((Object[]) obj);
            case 1:
                return new yp1((Iterator) ((sb2) obj).invoke());
            case 2:
                return new rd1((sd1) obj);
            case 3:
                return new o1((rv1) obj);
            default:
                return new c06((CharSequence) obj);
        }
    }
}
