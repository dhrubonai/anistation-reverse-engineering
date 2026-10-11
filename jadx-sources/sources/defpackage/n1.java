package defpackage;

import com.unity3d.ads.core.domain.AndroidGetIsModulesInitEnabled;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class n1 extends y66 implements m53 {
    public final y43 c;
    public final String d;
    public final g53 e;

    public n1(y43 y43Var, String str) {
        this.c = y43Var;
        this.d = str;
        this.e = y43Var.a;
    }

    @Override // defpackage.y66
    public final boolean D(Object obj) {
        Boolean bool;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        q53 O = O(str2);
        if (!(O instanceof l63)) {
            String str3 = "Expected " + z05.a(l63.class).f() + ", but had " + z05.a(O.getClass()).f() + " as the serialized body of boolean";
            String U = U(str2);
            if (this.c.a.l) {
                str = iv.I(O.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new o53(iv.v(-1, str3, U, null, str));
        }
        l63 l63Var = (l63) O;
        try {
            aj5 aj5Var = r53.a;
            String b = l63Var.b();
            String[] strArr = jz5.a;
            b.getClass();
            if (b.equalsIgnoreCase(AndroidGetIsModulesInitEnabled.ENABLE_MODULES_INIT_VALUE)) {
                bool = Boolean.TRUE;
            } else if (b.equalsIgnoreCase("false")) {
                bool = Boolean.FALSE;
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            V(l63Var, "boolean", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            V(l63Var, "boolean", str2);
            throw null;
        }
    }

    @Override // defpackage.y66
    public final byte E(Object obj) {
        Byte b;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        q53 O = O(str2);
        if (!(O instanceof l63)) {
            String str3 = "Expected " + z05.a(l63.class).f() + ", but had " + z05.a(O.getClass()).f() + " as the serialized body of byte";
            String U = U(str2);
            if (this.c.a.l) {
                str = iv.I(O.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new o53(iv.v(-1, str3, U, null, str));
        }
        l63 l63Var = (l63) O;
        try {
            long b2 = r53.b(l63Var);
            if (-128 <= b2 && b2 <= 127) {
                b = Byte.valueOf((byte) b2);
            } else {
                b = null;
            }
            if (b != null) {
                return b.byteValue();
            }
            V(l63Var, "byte", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            V(l63Var, "byte", str2);
            throw null;
        }
    }

    @Override // defpackage.y66
    public final char F(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        q53 O = O(str2);
        if (!(O instanceof l63)) {
            String str3 = "Expected " + z05.a(l63.class).f() + ", but had " + z05.a(O.getClass()).f() + " as the serialized body of char";
            String U = U(str2);
            if (this.c.a.l) {
                str = iv.I(O.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new o53(iv.v(-1, str3, U, null, str));
        }
        l63 l63Var = (l63) O;
        try {
            String b = l63Var.b();
            b.getClass();
            int length = b.length();
            if (length != 0) {
                if (length == 1) {
                    return b.charAt(0);
                }
                throw new IllegalArgumentException("Char sequence has more than one element.");
            }
            throw new NoSuchElementException("Char sequence is empty.");
        } catch (IllegalArgumentException unused) {
            V(l63Var, "char", str2);
            throw null;
        }
    }

    @Override // defpackage.y66
    public final double G(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        str3.getClass();
        q53 O = O(str3);
        boolean z = O instanceof l63;
        y43 y43Var = this.c;
        if (!z) {
            String str4 = "Expected " + z05.a(l63.class).f() + ", but had " + z05.a(O.getClass()).f() + " as the serialized body of double";
            String U = U(str3);
            if (y43Var.a.l) {
                str2 = iv.I(O.toString(), -1).toString();
            } else {
                str2 = null;
            }
            throw new o53(iv.v(-1, str4, U, null, str2));
        }
        l63 l63Var = (l63) O;
        try {
            aj5 aj5Var = r53.a;
            double parseDouble = Double.parseDouble(l63Var.b());
            if (!y43Var.a.i && Math.abs(parseDouble) > Double.MAX_VALUE) {
                String J = iv.J(Double.valueOf(parseDouble), str3);
                if (y43Var.a.l) {
                    str = iv.I(P().toString(), -1).toString();
                } else {
                    str = null;
                }
                throw new o53(iv.v(-1, J, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", str));
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            V(l63Var, "double", str3);
            throw null;
        }
    }

    @Override // defpackage.y66
    public final float H(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        str3.getClass();
        q53 O = O(str3);
        boolean z = O instanceof l63;
        y43 y43Var = this.c;
        if (!z) {
            String str4 = "Expected " + z05.a(l63.class).f() + ", but had " + z05.a(O.getClass()).f() + " as the serialized body of float";
            String U = U(str3);
            if (y43Var.a.l) {
                str2 = iv.I(O.toString(), -1).toString();
            } else {
                str2 = null;
            }
            throw new o53(iv.v(-1, str4, U, null, str2));
        }
        l63 l63Var = (l63) O;
        try {
            aj5 aj5Var = r53.a;
            float parseFloat = Float.parseFloat(l63Var.b());
            if (!y43Var.a.i && Math.abs(parseFloat) > Float.MAX_VALUE) {
                String J = iv.J(Float.valueOf(parseFloat), str3);
                if (y43Var.a.l) {
                    str = iv.I(P().toString(), -1).toString();
                } else {
                    str = null;
                }
                throw new o53(iv.v(-1, J, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", str));
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            V(l63Var, "float", str3);
            throw null;
        }
    }

    @Override // defpackage.y66
    public final l61 I(Object obj, aj5 aj5Var) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        aj5Var.getClass();
        if (bz5.a(aj5Var)) {
            q53 O = O(str2);
            String a = aj5Var.a();
            boolean z = O instanceof l63;
            y43 y43Var = this.c;
            if (!z) {
                String str3 = "Expected " + z05.a(l63.class).f() + ", but had " + z05.a(O.getClass()).f() + " as the serialized body of " + a;
                String U = U(str2);
                if (y43Var.a.l) {
                    str = iv.I(O.toString(), -1).toString();
                } else {
                    str = null;
                }
                throw new o53(iv.v(-1, str3, U, null, str));
            }
            return new n53(hz5.a(y43Var, ((l63) O).b()), y43Var);
        }
        this.a.add(str2);
        return this;
    }

    @Override // defpackage.y66
    public final int J(Object obj) {
        Integer num;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        q53 O = O(str2);
        if (!(O instanceof l63)) {
            String str3 = "Expected " + z05.a(l63.class).f() + ", but had " + z05.a(O.getClass()).f() + " as the serialized body of int";
            String U = U(str2);
            if (this.c.a.l) {
                str = iv.I(O.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new o53(iv.v(-1, str3, U, null, str));
        }
        l63 l63Var = (l63) O;
        try {
            long b = r53.b(l63Var);
            if (-2147483648L <= b && b <= 2147483647L) {
                num = Integer.valueOf((int) b);
            } else {
                num = null;
            }
            if (num != null) {
                return num.intValue();
            }
            V(l63Var, "int", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            V(l63Var, "int", str2);
            throw null;
        }
    }

    @Override // defpackage.y66
    public final long K(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        q53 O = O(str2);
        if (!(O instanceof l63)) {
            String str3 = "Expected " + z05.a(l63.class).f() + ", but had " + z05.a(O.getClass()).f() + " as the serialized body of long";
            String U = U(str2);
            if (this.c.a.l) {
                str = iv.I(O.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new o53(iv.v(-1, str3, U, null, str));
        }
        l63 l63Var = (l63) O;
        try {
            return r53.b(l63Var);
        } catch (IllegalArgumentException unused) {
            this.V(l63Var, "long", str2);
            throw null;
        }
    }

    @Override // defpackage.y66
    public final short L(Object obj) {
        Short sh;
        String str;
        String str2 = (String) obj;
        str2.getClass();
        q53 O = O(str2);
        if (!(O instanceof l63)) {
            String str3 = "Expected " + z05.a(l63.class).f() + ", but had " + z05.a(O.getClass()).f() + " as the serialized body of short";
            String U = U(str2);
            if (this.c.a.l) {
                str = iv.I(O.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new o53(iv.v(-1, str3, U, null, str));
        }
        l63 l63Var = (l63) O;
        try {
            long b = r53.b(l63Var);
            if (-32768 <= b && b <= 32767) {
                sh = Short.valueOf((short) b);
            } else {
                sh = null;
            }
            if (sh != null) {
                return sh.shortValue();
            }
            V(l63Var, "short", str2);
            throw null;
        } catch (IllegalArgumentException unused) {
            V(l63Var, "short", str2);
            throw null;
        }
    }

    @Override // defpackage.y66
    public final String M(Object obj) {
        String str;
        String str2 = (String) obj;
        str2.getClass();
        q53 O = O(str2);
        boolean z = O instanceof l63;
        y43 y43Var = this.c;
        String str3 = null;
        if (!z) {
            String str4 = "Expected " + z05.a(l63.class).f() + ", but had " + z05.a(O.getClass()).f() + " as the serialized body of string";
            String U = U(str2);
            if (y43Var.a.l) {
                str = iv.I(O.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new o53(iv.v(-1, str4, U, null, str));
        }
        l63 l63Var = (l63) O;
        if (!(l63Var instanceof b63)) {
            String m = qx1.m("Expected string value for a non-null key '", str2, "', got null literal instead");
            String U2 = U(str2);
            if (y43Var.a.l) {
                str3 = iv.I(P().toString(), -1).toString();
            }
            throw new o53(iv.v(-1, m, U2, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", str3));
        }
        b63 b63Var = (b63) l63Var;
        if (!b63Var.x && !y43Var.a.c) {
            String m2 = qx1.m("String literal for value of key '", str2, "' should be quoted");
            String U3 = U(str2);
            if (y43Var.a.l) {
                str3 = iv.I(P().toString(), -1).toString();
            }
            throw new o53(iv.v(-1, m2, U3, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", str3));
        }
        return b63Var.y;
    }

    public abstract q53 O(String str);

    public final q53 P() {
        q53 O;
        String str = (String) yo0.s0(this.a);
        if (str != null && (O = O(str)) != null) {
            return O;
        }
        return S();
    }

    public String Q(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return aj5Var.f(i);
    }

    public final String R(aj5 aj5Var, int i) {
        aj5Var.getClass();
        String Q = Q(aj5Var, i);
        Q.getClass();
        return Q;
    }

    public abstract q53 S();

    public final String T() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return "$";
        }
        return yo0.q0(arrayList, ".", "$.", null, null, 60);
    }

    public final String U(String str) {
        str.getClass();
        return T() + '.' + str;
    }

    public final void V(l63 l63Var, String str, String str2) {
        String str3;
        String str4;
        if (b06.I(str, "i", false)) {
            str3 = "an ";
        } else {
            str3 = "a ";
        }
        String str5 = "Failed to parse literal '" + l63Var + "' as " + str3.concat(str) + " value";
        String U = U(str2);
        if (this.c.a.l) {
            str4 = iv.I(P().toString(), -1).toString();
        } else {
            str4 = null;
        }
        throw new o53(iv.v(-1, str5, U, null, str4));
    }

    @Override // defpackage.gu0
    public void a(aj5 aj5Var) {
        aj5Var.getClass();
    }

    @Override // defpackage.gu0
    public final uj5 b() {
        return this.c.b;
    }

    @Override // defpackage.l61
    public gu0 c(aj5 aj5Var) {
        String str;
        String str2;
        String str3;
        String str4;
        aj5Var.getClass();
        q53 P = P();
        hj5 kind = aj5Var.getKind();
        boolean i = a34.i(kind, f06.b);
        y43 y43Var = this.c;
        if (!i && !(kind instanceof er4)) {
            if (a34.i(kind, f06.c)) {
                aj5 c = jy5.c(y43Var.b, aj5Var.h(0));
                hj5 kind2 = c.getKind();
                if (!(kind2 instanceof xt4) && !a34.i(kind2, gj5.a)) {
                    if (y43Var.a.d) {
                        String a = aj5Var.a();
                        if (!(P instanceof a53)) {
                            String str5 = "Expected " + z05.a(a53.class).f() + ", but had " + z05.a(P.getClass()).f() + " as the serialized body of " + a;
                            String T = T();
                            if (y43Var.a.l) {
                                str4 = iv.I(P.toString(), -1).toString();
                            } else {
                                str4 = null;
                            }
                            throw new o53(iv.v(-1, str5, T, null, str4));
                        }
                        return new s63(y43Var, (a53) P);
                    }
                    throw iv.g(c);
                }
                String a2 = aj5Var.a();
                if (!(P instanceof h63)) {
                    String str6 = "Expected " + z05.a(h63.class).f() + ", but had " + z05.a(P.getClass()).f() + " as the serialized body of " + a2;
                    String T2 = T();
                    if (y43Var.a.l) {
                        str3 = iv.I(P.toString(), -1).toString();
                    } else {
                        str3 = null;
                    }
                    throw new o53(iv.v(-1, str6, T2, null, str3));
                }
                return new t63(y43Var, (h63) P);
            }
            String a3 = aj5Var.a();
            if (!(P instanceof h63)) {
                String str7 = "Expected " + z05.a(h63.class).f() + ", but had " + z05.a(P.getClass()).f() + " as the serialized body of " + a3;
                String T3 = T();
                if (y43Var.a.l) {
                    str2 = iv.I(P.toString(), -1).toString();
                } else {
                    str2 = null;
                }
                throw new o53(iv.v(-1, str7, T3, null, str2));
            }
            return new r63(y43Var, (h63) P, this.d, 8);
        }
        String a4 = aj5Var.a();
        if (!(P instanceof a53)) {
            String str8 = "Expected " + z05.a(a53.class).f() + ", but had " + z05.a(P.getClass()).f() + " as the serialized body of " + a4;
            String T4 = T();
            if (y43Var.a.l) {
                str = iv.I(P.toString(), -1).toString();
            } else {
                str = null;
            }
            throw new o53(iv.v(-1, str8, T4, null, str));
        }
        return new s63(y43Var, (a53) P);
    }

    @Override // defpackage.l61
    public boolean decodeNotNullMark() {
        return !(P() instanceof e63);
    }

    @Override // defpackage.y66, defpackage.l61
    public final Object f(ne1 ne1Var) {
        String str;
        String str2;
        String str3;
        ne1Var.getClass();
        if (ne1Var instanceof p2) {
            p2 p2Var = (p2) ne1Var;
            aj5 descriptor = p2Var.getDescriptor();
            y43 y43Var = this.c;
            String h = z51.h(y43Var, descriptor);
            q53 P = P();
            String a = p2Var.getDescriptor().a();
            if (!(P instanceof h63)) {
                String str4 = "Expected " + z05.a(h63.class).f() + ", but had " + z05.a(P.getClass()).f() + " as the serialized body of " + a;
                String T = T();
                if (y43Var.a.l) {
                    str3 = iv.I(P.toString(), -1).toString();
                } else {
                    str3 = null;
                }
                throw new o53(iv.v(-1, str4, T, null, str3));
            }
            h63 h63Var = (h63) P;
            q53 q53Var = (q53) h63Var.get(h);
            try {
                if (q53Var != null) {
                    l63 a2 = r53.a(q53Var);
                    if (!(a2 instanceof e63)) {
                        str = a2.b();
                        ne1 findPolymorphicSerializer = gr4.findPolymorphicSerializer((p2) ne1Var, this, str);
                        findPolymorphicSerializer.getClass();
                        return mv5.g(y43Var, h, h63Var, findPolymorphicSerializer);
                    }
                }
                ne1 findPolymorphicSerializer2 = gr4.findPolymorphicSerializer((p2) ne1Var, this, str);
                findPolymorphicSerializer2.getClass();
                return mv5.g(y43Var, h, h63Var, findPolymorphicSerializer2);
            } catch (lj5 e) {
                String message = e.getMessage();
                message.getClass();
                if (y43Var.a.l) {
                    str2 = iv.I(h63Var.toString(), -1).toString();
                } else {
                    str2 = null;
                }
                throw new o53(iv.v(-1, message, null, null, str2));
            }
            str = null;
        } else {
            return ne1Var.deserialize(this);
        }
    }

    @Override // defpackage.m53
    public final q53 k() {
        return P();
    }

    @Override // defpackage.l61
    public final l61 q(aj5 aj5Var) {
        aj5Var.getClass();
        if (yo0.s0(this.a) != null) {
            return I(N(), aj5Var);
        }
        return new m63(this.c, S(), this.d).q(aj5Var);
    }

    @Override // defpackage.m53
    public final y43 v() {
        return this.c;
    }
}
