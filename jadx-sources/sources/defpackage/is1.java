package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class is1 implements Runnable {
    public final ArrayList x;
    public final byte y;

    /* JADX WARN: Multi-variable type inference failed */
    public is1(List list, int i, Throwable th) {
        bb4.r(list, "initCallbacks cannot be null");
        this.x = new ArrayList(list);
        this.y = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.x;
        int size = arrayList.size();
        int i = 0;
        if (this.y != 1) {
            while (i < size) {
                ((hs1) arrayList.get(i)).a();
                i++;
            }
        } else {
            while (i < size) {
                ((hs1) arrayList.get(i)).b();
                i++;
            }
        }
    }
}
