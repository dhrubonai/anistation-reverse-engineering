package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class oz4 extends t45 {
    public final String x;
    public final long y;
    public final xy4 z;

    public oz4(String str, long j, xy4 xy4Var) {
        this.x = str;
        this.y = j;
        this.z = xy4Var;
    }

    @Override // defpackage.t45
    public final db0 o0() {
        return this.z;
    }

    @Override // defpackage.t45
    public final long p() {
        return this.y;
    }

    @Override // defpackage.t45
    public final dx3 q() {
        String str = this.x;
        if (str != null) {
            Pattern pattern = dx3.c;
            try {
                return n77.I(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
