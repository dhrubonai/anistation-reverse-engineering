package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class yr implements CharSequence {
    public final char[] x;
    public int y;

    public yr(char[] cArr) {
        this.x = cArr;
        this.y = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.x[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.y;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return b06.x(this.x, i, Math.min(i2, this.y));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.y;
        return b06.x(this.x, 0, Math.min(i, i));
    }
}
