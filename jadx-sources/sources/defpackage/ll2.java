package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ll2 extends y30 {
    public int h;

    @Override // defpackage.jz1
    public final void b(long j, long j2, long j3, List list, ep3[] ep3VarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!a(this.h, elapsedRealtime)) {
            return;
        }
        for (int i = this.b - 1; i >= 0; i--) {
            if (!a(i, elapsedRealtime)) {
                this.h = i;
                return;
            }
        }
        p65.l();
    }

    @Override // defpackage.jz1
    public final int d() {
        return this.h;
    }

    @Override // defpackage.jz1
    public final int o() {
        return 0;
    }

    @Override // defpackage.jz1
    public final Object r() {
        return null;
    }
}
