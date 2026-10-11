package defpackage;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l86 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;
    public final ArrayList d;

    public l86(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l86) {
                l86 l86Var = (l86) obj;
                if (!a34.i(this.a, l86Var.a) || !nd6.c(this.b, l86Var.b) || !a34.i(this.c, l86Var.c) || !this.d.equals(l86Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = nd6.c;
        return this.d.hashCode() + ((this.c.hashCode() + qx1.d(hashCode, this.b, 31)) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + nd6.i(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ")";
    }
}
