package defpackage;

import android.net.Uri;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class my5 {
    public final int a;
    public final long b;
    public final Uri c;
    public final nw2 d;
    public final nw2 e;

    public my5(int i, long j, Uri uri, o15 o15Var, o15 o15Var2) {
        this.a = i;
        this.b = j;
        this.c = uri;
        this.d = nw2.o(o15Var);
        this.e = nw2.o(o15Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my5)) {
            return false;
        }
        my5 my5Var = (my5) obj;
        if (this.a == my5Var.a && this.b == my5Var.b && Objects.equals(this.c, my5Var.c) && Objects.equals(this.d, my5Var.d) && Objects.equals(this.e, my5Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, this.e);
    }
}
