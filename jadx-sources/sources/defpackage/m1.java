package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class m1 {
    public final Object A;
    public Object B;
    public Object C;
    public final /* synthetic */ byte x;
    public int y;
    public final Object z;

    public m1(g53 g53Var) {
        this.x = (byte) 0;
        this.z = g53Var;
        this.A = new ad(g53Var);
        this.C = new StringBuilder();
    }

    public static /* synthetic */ void u(m1 m1Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = m1Var.y;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        m1Var.t(i, str, str2);
        throw null;
    }

    public static boolean x(char c) {
        if (c != ',' && c != ':' && c != ']' && c != '}') {
            return true;
        }
        return false;
    }

    public String A(boolean z) {
        String l;
        byte z2 = z();
        if (z) {
            if (z2 == 1 || z2 == 0) {
                l = o();
            } else {
                return null;
            }
        } else {
            if (z2 != 1) {
                return null;
            }
            l = l();
        }
        this.B = l;
        return l;
    }

    public abstract int B(int i);

    public abstract int C();

    public String D(int i, int i2) {
        return w().subSequence(i, i2).toString();
    }

    public boolean E() {
        int C = C();
        CharSequence w = w();
        if (C < w.length() && C != -1 && w.charAt(C) == ',') {
            this.y++;
            return true;
        }
        return false;
    }

    public void F(char c) {
        int i;
        String str;
        int i2 = this.y;
        if (i2 > 0 && c == '\"') {
            try {
                this.y = i2 - 1;
                String o = o();
                this.y = i2;
                if (a34.i(o, "null")) {
                    t(this.y - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.y = i2;
                throw th;
            }
        }
        String V = h98.V(h98.k(c));
        int i3 = this.y;
        if (i3 > 0) {
            i = i3 - 1;
        } else {
            i = i3;
        }
        if (i3 != w().length() && i >= 0) {
            str = String.valueOf(w().charAt(i));
        } else {
            str = "EOF";
        }
        u(this, qx1.n("Expected ", V, ", but had '", str, "' instead"), i, null, 4);
        throw null;
    }

    public void a() {
        Map.Entry entry;
        this.B = (Map.Entry) this.C;
        Iterator it = (Iterator) this.A;
        if (it.hasNext()) {
            entry = (Map.Entry) it.next();
        } else {
            entry = null;
        }
        this.C = entry;
    }

    public int b(int i, int i2) {
        char c;
        d(i, i2);
        int B = B(i2 + 1);
        if (B != -1) {
            int i3 = B + 1;
            char charAt = w().charAt(B);
            if (charAt == 'u') {
                return c(w(), i3);
            }
            if (charAt < 'u') {
                c = uk0.a[charAt];
            } else {
                c = 0;
            }
            if (c != 0) {
                ((StringBuilder) this.C).append(c);
                return i3;
            }
            u(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6);
            throw null;
        }
        u(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
        throw null;
    }

    public int c(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.y = i;
            r();
            if (this.y + 4 < charSequence.length()) {
                return c(charSequence, this.y);
            }
            u(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        ((StringBuilder) this.C).append((char) (v(charSequence, i + 3) + (v(charSequence, i) << 12) + (v(charSequence, i + 1) << 8) + (v(charSequence, i + 2) << 4)));
        return i2;
    }

    public void d(int i, int i2) {
        ((StringBuilder) this.C).append(w(), i, i2);
    }

    public abstract boolean e();

    public void f(int i, String str) {
        if (w().length() - i >= str.length()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != (w().charAt(i + i2) | ' ')) {
                    u(this, "Expected valid boolean literal prefix, but had '" + o() + '\'', 0, null, 6);
                    throw null;
                }
            }
            this.y = str.length() + i;
            return;
        }
        u(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }

    public abstract String g();

    public abstract byte h();

    public boolean hasNext() {
        if (((Map.Entry) this.C) != null) {
            return true;
        }
        return false;
    }

    public byte i(byte b) {
        int i;
        String str;
        byte h = h();
        if (h != b) {
            String V = h98.V(b);
            int i2 = this.y;
            if (i2 > 0) {
                i = i2 - 1;
            } else {
                i = i2;
            }
            if (i2 != w().length() && i >= 0) {
                str = String.valueOf(w().charAt(i));
            } else {
                str = "EOF";
            }
            u(this, qx1.n("Expected ", V, ", but had '", str, "' instead"), i, null, 4);
            throw null;
        }
        return h;
    }

    public abstract void j(char c);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x013b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
    
        if (r11 == r1) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013c, code lost:
    
        if (r1 == r11) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013e, code lost:
    
        if (r21 == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0142, code lost:
    
        if (r1 == (r11 - 1)) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0148, code lost:
    
        if (r19 == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014a, code lost:
    
        if (r2 == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:
    
        if (w().charAt(r11) != '\"') goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0158, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015b, code lost:
    
        u(r22, "Expected closing quotation mark", r11, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0162, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0163, code lost:
    
        u(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0169, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        r22.y = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016c, code lost:
    
        if (r20 == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016e, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0171, code lost:
    
        if (r8 != false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0173, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0182, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0187, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018d, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0195, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0197, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019a, code lost:
    
        u(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b4, code lost:
    
        u(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ba, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017b, code lost:
    
        if (r8 != true) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017d, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bb, code lost:
    
        defpackage.ze0.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01be, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:
    
        if (r21 == false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c1, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c6, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c9, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ca, code lost:
    
        u(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d0, code lost:
    
        u(r22, "Expected numeric literal", r11, null, 4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long k() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m1.k():long");
    }

    public String l() {
        String str = (String) this.B;
        if (str != null) {
            str.getClass();
            this.B = null;
            return str;
        }
        return g();
    }

    public String m(CharSequence charSequence, int i, int i2) {
        String q;
        charSequence.getClass();
        char charAt = charSequence.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                i = B(b(i, i2));
                if (i == -1) {
                    u(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    d(i, i2);
                    i = B(i2);
                    if (i == -1) {
                        u(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            charAt = charSequence.charAt(i2);
        }
        if (!z) {
            q = D(i, i2);
        } else {
            q = q(i, i2);
        }
        this.y = i2 + 1;
        return q;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(defpackage.ub2 r9, boolean r10) {
        /*
            r8 = this;
            byte r0 = r8.z()
            if (r10 == 0) goto La
            if (r0 == 0) goto La
            goto L91
        La:
            r0 = 34
            if (r10 != 0) goto L11
            r8.j(r0)
        L11:
            int r1 = r8.y
            java.lang.CharSequence r2 = r8.w()
            char r2 = r2.charAt(r1)
            r3 = 0
            r4 = r2
            r5 = r3
            r2 = r1
        L1f:
            if (r10 == 0) goto L28
            byte r6 = defpackage.h98.k(r4)
            if (r6 != 0) goto L79
            goto L2a
        L28:
            if (r4 == r0) goto L79
        L2a:
            if (r10 != 0) goto L3b
            r6 = 92
            if (r4 != r6) goto L3b
            int r1 = r8.b(r1, r2)
            int r1 = r8.B(r1)
            r5 = 1
            r2 = r1
            goto L40
        L3b:
            int r2 = r2 + 1
            r7 = r2
            r2 = r1
            r1 = r7
        L40:
            java.lang.CharSequence r4 = r8.w()
            int r4 = r4.length()
            if (r1 < r4) goto L6d
            if (r5 == 0) goto L54
            java.lang.String r2 = r8.q(r2, r1)
            r9.invoke(r2)
            goto L5b
        L54:
            java.lang.String r2 = r8.D(r2, r1)
            r9.invoke(r2)
        L5b:
            int r1 = r8.B(r1)
            r2 = -1
            if (r1 == r2) goto L65
            r2 = r1
            r5 = r3
            goto L70
        L65:
            java.lang.String r9 = "EOF"
            r10 = 4
            r0 = 0
            u(r8, r9, r1, r0, r10)
            throw r0
        L6d:
            r7 = r2
            r2 = r1
            r1 = r7
        L70:
            java.lang.CharSequence r4 = r8.w()
            char r4 = r4.charAt(r2)
            goto L1f
        L79:
            if (r5 == 0) goto L83
            java.lang.String r1 = r8.q(r1, r2)
            r9.invoke(r1)
            goto L8a
        L83:
            java.lang.String r1 = r8.D(r1, r2)
            r9.invoke(r1)
        L8a:
            r8.y = r2
            if (r10 != 0) goto L91
            r8.j(r0)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m1.n(ub2, boolean):void");
    }

    public String o() {
        String q;
        String str = (String) this.B;
        if (str != null) {
            str.getClass();
            this.B = null;
            return str;
        }
        int C = C();
        if (C < w().length() && C != -1) {
            byte k = h98.k(w().charAt(C));
            if (k == 1) {
                return l();
            }
            if (k == 0) {
                boolean z = false;
                while (h98.k(w().charAt(C)) == 0) {
                    C++;
                    if (C >= w().length()) {
                        d(this.y, C);
                        int B = B(C);
                        if (B == -1) {
                            this.y = C;
                            return q(0, 0);
                        }
                        C = B;
                        z = true;
                    }
                }
                int i = this.y;
                if (!z) {
                    q = D(i, C);
                } else {
                    q = q(i, C);
                }
                this.y = C;
                return q;
            }
            u(this, "Expected beginning of the string, but got " + w().charAt(C), 0, null, 6);
            throw null;
        }
        u(this, "EOF", C, null, 4);
        throw null;
    }

    public String p() {
        String o = o();
        if (a34.i(o, "null") && w().charAt(this.y - 1) != '\"') {
            u(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
            throw null;
        }
        return o;
    }

    public String q(int i, int i2) {
        d(i, i2);
        StringBuilder sb = (StringBuilder) this.C;
        String sb2 = sb.toString();
        sb.setLength(0);
        return sb2;
    }

    public void remove() {
        bu5 bu5Var = (bu5) this.z;
        if (bu5Var.d().d == this.y) {
            Map.Entry entry = (Map.Entry) this.B;
            if (entry != null) {
                bu5Var.remove(entry.getKey());
                this.B = null;
                this.y = bu5Var.d().d;
                return;
            }
            p65.l();
            return;
        }
        ze0.j();
    }

    public void s() {
        if (h() == 10) {
            return;
        }
        u(this, "Expected EOF after parsing, but had " + w().charAt(this.y - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void t(int i, String str, String str2) {
        String str3;
        String j = ((ad) this.A).j();
        CharSequence w = w();
        w.getClass();
        if (((g53) this.z).l) {
            str3 = iv.I(w, i).toString();
        } else {
            str3 = null;
        }
        throw new o53(iv.v(i, str, j, str2, str3));
    }

    public String toString() {
        switch (this.x) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) w());
                sb.append("', currentPosition=");
                return qx1.o(sb, this.y, ')');
            default:
                return super.toString();
        }
    }

    public int v(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        u(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence w();

    public String y(String str, boolean z) {
        str.getClass();
        return null;
    }

    public byte z() {
        CharSequence w = w();
        int i = this.y;
        while (true) {
            int B = B(i);
            if (B != -1) {
                char charAt = w.charAt(B);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    this.y = B;
                    return h98.k(charAt);
                }
                i = B + 1;
            } else {
                this.y = B;
                return (byte) 10;
            }
        }
    }

    public m1(bu5 bu5Var, Iterator it) {
        this.x = (byte) 1;
        this.z = bu5Var;
        this.A = it;
        this.y = bu5Var.d().d;
        a();
    }

    public void r() {
    }
}
