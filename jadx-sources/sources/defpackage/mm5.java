package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mm5 implements wq1 {
    public int x;

    public boolean a(int i) {
        if ((this.x & i) == i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wq1
    public int b(Context context, String str, boolean z) {
        return 0;
    }

    @Override // defpackage.wq1
    public int c(Context context, String str) {
        return this.x;
    }

    public boolean d() {
        if ((!a(32) || a(64) || a(128)) && !a(64)) {
            return false;
        }
        return true;
    }

    public boolean e() {
        if (!d() && !a(128)) {
            return false;
        }
        return true;
    }
}
