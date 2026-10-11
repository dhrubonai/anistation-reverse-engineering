package defpackage;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class m30 {
    public static final l30 d;
    public static final k30 e;
    public final j30 a;
    public final Character b;
    public volatile m30 c;

    static {
        new l30("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        d = new l30("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new m30("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new m30("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        e = new k30(new j30("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public m30(j30 j30Var, Character ch) {
        boolean z;
        this.a = j30Var;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = j30Var.g;
            if (charValue < bArr.length && bArr[charValue] != -1) {
                z = false;
                io3.p(z, "Padding character %s was already in alphabet", ch);
                this.b = ch;
            }
        }
        z = true;
        io3.p(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public final String a(int i, byte[] bArr) {
        io3.y(0, i, bArr.length);
        j30 j30Var = this.a;
        int i2 = j30Var.e;
        int i3 = j30Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(oi4.o(i, i3) * i2);
        try {
            c(sb, bArr, i);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        boolean z;
        io3.y(i, i + i2, bArr.length);
        j30 j30Var = this.a;
        int i3 = j30Var.f;
        int i4 = j30Var.d;
        int i5 = 0;
        if (i2 <= i3) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(j30Var.b[((int) (j >>> (i7 - i5))) & j30Var.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < j30Var.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        io3.y(0, i, bArr.length);
        while (i2 < i) {
            j30 j30Var = this.a;
            b(sb, bArr, i2, Math.min(j30Var.f, i - i2));
            i2 += j30Var.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m30) {
            m30 m30Var = (m30) obj;
            if (this.a.equals(m30Var.a) && Objects.equals(this.b, m30Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        j30 j30Var = this.a;
        sb.append(j30Var);
        if (8 % j30Var.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public m30(String str, String str2) {
        this(new j30(str, str2.toCharArray()), (Character) '=');
    }
}
