package defpackage;

import android.util.LruCache;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lw7 extends LruCache {
    public final /* synthetic */ nq3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw7(nq3 nq3Var) {
        super(20);
        this.a = nq3Var;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (!z) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.a.g;
        a34.x(arrayList);
        arrayList.add(num);
    }
}
