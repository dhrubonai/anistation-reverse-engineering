package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rh3 implements Iterator, j73 {
    public int A;
    public int B;
    public final CharSequence x;
    public byte y;
    public int z;

    public rh3(CharSequence charSequence) {
        this.x = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        byte b = this.y;
        if (b != 0) {
            if (b != 1) {
                return false;
            }
            return true;
        }
        int i2 = 2;
        if (this.B < 0) {
            this.y = (byte) 2;
            return false;
        }
        CharSequence charSequence = this.x;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i3 = this.z; i3 < length2; i3++) {
            char charAt = charSequence.charAt(i3);
            if (charAt == '\n' || charAt == '\r') {
                if (charAt != '\r' || (i = i3 + 1) >= charSequence.length() || charSequence.charAt(i) != '\n') {
                    i2 = 1;
                }
                length = i3;
                this.y = (byte) 1;
                this.B = i2;
                this.A = length;
                return true;
            }
        }
        i2 = -1;
        this.y = (byte) 1;
        this.B = i2;
        this.A = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.y = (byte) 0;
            int i = this.A;
            int i2 = this.z;
            this.z = this.B + i;
            return this.x.subSequence(i2, i).toString();
        }
        qi2.e();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
