package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oz7 {
    public final String a;
    public final boolean b;

    public oz7(String str, boolean z) {
        a34.u(str);
        this.a = str;
        a34.u("com.google.android.gms");
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oz7) {
                oz7 oz7Var = (oz7) obj;
                if (bx7.q(this.a, oz7Var.a) && bx7.q("com.google.android.gms", "com.google.android.gms") && bx7.q(null, null) && this.b == oz7Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, "com.google.android.gms", null, 4225, Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        a34.x(null);
        throw null;
    }
}
