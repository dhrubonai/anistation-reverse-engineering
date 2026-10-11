package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Collection y;

    public /* synthetic */ m2(Collection collection, byte b) {
        this.x = b;
        this.y = collection;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        boolean contains;
        byte b = this.x;
        Collection<?> collection = this.y;
        switch (b) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
