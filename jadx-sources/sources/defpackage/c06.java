package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class c06 extends tk0 {
    public int x;
    public final /* synthetic */ CharSequence y;

    public c06(CharSequence charSequence) {
        this.y = charSequence;
    }

    @Override // defpackage.tk0
    public final char a() {
        int i = this.x;
        this.x = i + 1;
        return this.y.charAt(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.x < this.y.length()) {
            return true;
        }
        return false;
    }
}
