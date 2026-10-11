package defpackage;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fl0 implements CharacterIterator {
    public final CharSequence x;
    public final int y;
    public int z = 0;

    public fl0(CharSequence charSequence, int i) {
        this.x = charSequence;
        this.y = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.z;
        if (i == this.y) {
            return (char) 65535;
        }
        return this.x.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.z = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.y;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.z;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.y;
        if (i == 0) {
            this.z = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.z = i2;
        return this.x.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.z + 1;
        this.z = i;
        int i2 = this.y;
        if (i >= i2) {
            this.z = i2;
            return (char) 65535;
        }
        return this.x.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.z;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.z = i2;
        return this.x.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i <= this.y && i >= 0) {
            this.z = i;
            return current();
        }
        ze0.k("invalid position");
        return (char) 0;
    }
}
