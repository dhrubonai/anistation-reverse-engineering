package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dj0 implements k16 {
    public final List x;

    public dj0(ArrayList arrayList) {
        this.x = Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.k16
    public int a(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }

    @Override // defpackage.k16
    public long e(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        return 0L;
    }

    @Override // defpackage.k16
    public List g(long j) {
        if (j >= 0) {
            return this.x;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.k16
    public int h() {
        return 1;
    }

    public dj0(List list) {
        this.x = list;
    }
}
