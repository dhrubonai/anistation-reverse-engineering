package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class sd1 implements ni5 {
    public final CharSequence a;
    public final int b;
    public final ic2 c;

    public sd1(CharSequence charSequence, int i, ic2 ic2Var) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = ic2Var;
    }

    @Override // defpackage.ni5
    public final Iterator iterator() {
        return new rd1(this);
    }
}
