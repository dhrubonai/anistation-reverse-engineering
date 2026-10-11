package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pw5 implements Iterator {
    public final cl0 A;
    public final boolean B;
    public int D;
    public final /* synthetic */ byte E;
    public final /* synthetic */ rw5 F;
    public String y;
    public final CharSequence z;
    public int x = 2;
    public int C = 0;

    public pw5(rw5 rw5Var, i90 i90Var, CharSequence charSequence, byte b) {
        this.E = b;
        this.F = rw5Var;
        this.A = (cl0) i90Var.c;
        this.B = i90Var.b;
        this.D = i90Var.a;
        this.z = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        r3 = r3 + 1;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw5.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.x = 2;
            String str = this.y;
            this.y = null;
            return str;
        }
        qi2.e();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
