package defpackage;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uu {
    public static final uu d;
    public final int a;
    public final int b;
    public final zw2 c;

    /* JADX WARN: Type inference failed for: r1v1, types: [ew2, yw2] */
    static {
        uu uuVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ?? ew2Var = new ew2(4);
            for (int i = 1; i <= 10; i++) {
                ew2Var.c(Integer.valueOf(eq6.t(i)));
            }
            uuVar = new uu(2, ew2Var.h());
        } else {
            uuVar = new uu(2, 10);
        }
        d = uuVar;
    }

    public uu(int i, Set set) {
        this.a = i;
        zw2 m = zw2.m(set);
        this.c = m;
        ho6 it = m.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu)) {
            return false;
        }
        uu uuVar = (uu) obj;
        if (this.a == uuVar.a && this.b == uuVar.b && Objects.equals(this.c, uuVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = ((this.a * 31) + this.b) * 31;
        zw2 zw2Var = this.c;
        if (zw2Var == null) {
            hashCode = 0;
        } else {
            hashCode = zw2Var.hashCode();
        }
        return i + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public uu(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
