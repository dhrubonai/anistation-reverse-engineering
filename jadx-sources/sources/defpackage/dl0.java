package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class dl0 extends tk0 {
    public final int x;
    public boolean y;
    public int z;

    public dl0(char c, char c2) {
        boolean z;
        this.x = c2;
        if (c <= c2) {
            z = true;
        } else {
            z = false;
        }
        this.y = z;
        this.z = z ? c : c2;
    }

    @Override // defpackage.tk0
    public final char a() {
        int i = this.z;
        if (i == this.x) {
            if (this.y) {
                this.y = false;
            } else {
                qi2.e();
                return (char) 0;
            }
        } else {
            this.z = i + 1;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.y;
    }
}
