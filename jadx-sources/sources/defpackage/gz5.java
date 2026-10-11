package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class gz5 extends m1 {
    public final String D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz5(String str, g53 g53Var) {
        super(g53Var);
        str.getClass();
        this.D = str;
    }

    @Override // defpackage.m1
    public final int B(int i) {
        if (i < this.D.length()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.m1
    public int C() {
        char charAt;
        int i = this.y;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.D;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.y = i;
        return i;
    }

    @Override // defpackage.m1
    public boolean e() {
        int i = this.y;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.D;
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.y = i;
                    return m1.x(charAt);
                }
                i++;
            } else {
                this.y = i;
                return false;
            }
        }
    }

    @Override // defpackage.m1
    public final String g() {
        String str;
        j('\"');
        int i = this.y;
        String str2 = this.D;
        int S = uz5.S(str2, '\"', i, 4);
        if (S == -1) {
            o();
            int i2 = this.y;
            if (i2 != str2.length() && i2 >= 0) {
                str = String.valueOf(str2.charAt(i2));
            } else {
                str = "EOF";
            }
            m1.u(this, qx1.m("Expected quotation mark '\"', but had '", str, "' instead"), i2, null, 4);
            throw null;
        }
        for (int i3 = i; i3 < S; i3++) {
            if (str2.charAt(i3) == '\\') {
                return m(str2, this.y, i3);
            }
        }
        this.y = S + 1;
        return str2.substring(i, S);
    }

    @Override // defpackage.m1
    public byte h() {
        String str;
        int i = this.y;
        while (true) {
            str = this.D;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.y = i2;
                return h98.k(charAt);
            }
            i = i2;
        }
        this.y = str.length();
        return (byte) 10;
    }

    @Override // defpackage.m1
    public void j(char c) {
        int i = this.y;
        if (i == -1) {
            F(c);
            throw null;
        }
        while (true) {
            String str = this.D;
            if (i < str.length()) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.y = i2;
                    if (charAt == c) {
                        return;
                    }
                    F(c);
                    throw null;
                }
                i = i2;
            } else {
                this.y = -1;
                F(c);
                throw null;
            }
        }
    }

    @Override // defpackage.m1
    public final void n(ub2 ub2Var, boolean z) {
        String l;
        int i;
        int i2;
        if (z) {
            l = o();
        } else {
            l = l();
        }
        l.getClass();
        nx7.s(16384, 16384);
        int length = l.length();
        int i3 = length / 16384;
        int i4 = 0;
        if (length % 16384 == 0) {
            i = 0;
        } else {
            i = 1;
        }
        ArrayList arrayList = new ArrayList(i3 + i);
        int i5 = 0;
        while (i5 >= 0 && i5 < length) {
            int i6 = i5 + 16384;
            if (i6 >= 0 && i6 <= length) {
                i2 = i6;
            } else {
                i2 = length;
            }
            CharSequence subSequence = l.subSequence(i5, i2);
            subSequence.getClass();
            arrayList.add(subSequence.toString());
            i5 = i6;
        }
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ub2Var.invoke(obj);
        }
    }

    @Override // defpackage.m1
    public final CharSequence w() {
        return this.D;
    }

    @Override // defpackage.m1
    public final String y(String str, boolean z) {
        str.getClass();
        int i = this.y;
        try {
            if (h() == 6 && a34.i(A(z), str)) {
                this.B = null;
                if (h() == 5) {
                    return A(z);
                }
            }
            return null;
        } finally {
            this.y = i;
            this.B = null;
        }
    }
}
