package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class az5 extends v0 {
    public final mn0 a;
    public final y43 b;
    public final i97 c;
    public final az5[] d;
    public final uj5 e;
    public final g53 f;
    public boolean g;
    public String h;
    public String i;

    public az5(mn0 mn0Var, y43 y43Var, i97 i97Var, az5[] az5VarArr) {
        mn0Var.getClass();
        this.a = mn0Var;
        this.b = y43Var;
        this.c = i97Var;
        this.d = az5VarArr;
        this.e = y43Var.b;
        this.f = y43Var.a;
        int ordinal = i97Var.ordinal();
        if (az5VarArr != null) {
            az5 az5Var = az5VarArr[ordinal];
            if (az5Var != null || az5Var != this) {
                az5VarArr[ordinal] = this;
            }
        }
    }

    @Override // defpackage.hu0
    public final void a(aj5 aj5Var) {
        aj5Var.getClass();
        mn0 mn0Var = this.a;
        mn0Var.t();
        mn0Var.i();
        mn0Var.l(this.c.y);
    }

    @Override // defpackage.wt1
    public final uj5 b() {
        return this.e;
    }

    @Override // defpackage.wt1
    public final hu0 c(aj5 aj5Var) {
        az5 az5Var;
        aj5Var.getClass();
        y43 y43Var = this.b;
        i97 i = jy5.i(y43Var, aj5Var);
        char c = i.x;
        mn0 mn0Var = this.a;
        mn0Var.l(c);
        mn0Var.e();
        String str = this.h;
        if (str != null) {
            String str2 = this.i;
            if (str2 == null) {
                str2 = aj5Var.a();
            }
            mn0Var.g();
            mn0Var.r(str);
            mn0Var.l(':');
            mn0Var.s();
            o(str2);
            this.h = null;
            this.i = null;
        }
        if (this.c == i) {
            return this;
        }
        az5[] az5VarArr = this.d;
        if (az5VarArr != null && (az5Var = az5VarArr[i.ordinal()]) != null) {
            return az5Var;
        }
        return new az5(mn0Var, y43Var, i, az5VarArr);
    }

    @Override // defpackage.v0, defpackage.wt1
    public final void d(double d) {
        if (this.g) {
            o(String.valueOf(d));
        } else {
            ((b23) this.a.y).i(String.valueOf(d));
        }
        if (!this.f.i && Math.abs(d) > Double.MAX_VALUE) {
            throw new o53(iv.J(Double.valueOf(d), null), null, 2);
        }
    }

    @Override // defpackage.v0, defpackage.wt1
    public final void e(short s) {
        if (this.g) {
            o(String.valueOf((int) s));
        } else {
            this.a.p(s);
        }
    }

    @Override // defpackage.wt1
    public final void encodeNull() {
        mn0 mn0Var = this.a;
        mn0Var.getClass();
        ((b23) mn0Var.y).i("null");
    }

    @Override // defpackage.v0, defpackage.hu0
    public final void encodeNullableSerializableElement(aj5 aj5Var, int i, mj5 mj5Var, Object obj) {
        aj5Var.getClass();
        mj5Var.getClass();
        if (obj == null && !this.f.f) {
            return;
        }
        super.encodeNullableSerializableElement(aj5Var, i, mj5Var, obj);
    }

    @Override // defpackage.v0, defpackage.wt1
    public final void f(byte b) {
        if (this.g) {
            o(String.valueOf((int) b));
        } else {
            this.a.j(b);
        }
    }

    @Override // defpackage.v0, defpackage.wt1
    public final void g(boolean z) {
        if (this.g) {
            o(String.valueOf(z));
        } else {
            ((b23) this.a.y).i(String.valueOf(z));
        }
    }

    @Override // defpackage.v0, defpackage.wt1
    public final wt1 h(aj5 aj5Var) {
        aj5Var.getClass();
        boolean a = bz5.a(aj5Var);
        i97 i97Var = this.c;
        y43 y43Var = this.b;
        mn0 mn0Var = this.a;
        if (a) {
            if (!(mn0Var instanceof du0)) {
                mn0Var = new du0((b23) mn0Var.y, this.g);
            }
            return new az5(mn0Var, y43Var, i97Var, null);
        }
        if (aj5Var.isInline() && aj5Var.equals(r53.a)) {
            if (!(mn0Var instanceof cu0)) {
                mn0Var = new cu0((b23) mn0Var.y, this.g);
            }
            return new az5(mn0Var, y43Var, i97Var, null);
        }
        if (this.h != null) {
            this.i = aj5Var.a();
        }
        return this;
    }

    @Override // defpackage.v0, defpackage.wt1
    public final void i(float f) {
        if (this.g) {
            o(String.valueOf(f));
        } else {
            ((b23) this.a.y).i(String.valueOf(f));
        }
        if (!this.f.i && Math.abs(f) > Float.MAX_VALUE) {
            throw new o53(iv.J(Float.valueOf(f), null), null, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r3 != defpackage.hm0.x) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0039, code lost:
    
        if (defpackage.a34.i(r3, defpackage.f06.d) == false) goto L21;
     */
    @Override // defpackage.wt1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.mj5 r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.getClass()
            y43 r0 = r5.b
            g53 r1 = r0.a
            boolean r2 = r6 instanceof defpackage.p2
            hm0 r3 = r1.k
            if (r2 == 0) goto L12
            hm0 r4 = defpackage.hm0.x
            if (r3 == r4) goto L44
            goto L3b
        L12:
            int r3 = r3.ordinal()
            if (r3 == 0) goto L44
            r4 = 1
            if (r3 == r4) goto L23
            r4 = 2
            if (r3 != r4) goto L1f
            goto L44
        L1f:
            defpackage.ze0.l()
            return
        L23:
            aj5 r3 = r6.getDescriptor()
            hj5 r3 = r3.getKind()
            f06 r4 = defpackage.f06.a
            boolean r4 = defpackage.a34.i(r3, r4)
            if (r4 != 0) goto L3b
            f06 r4 = defpackage.f06.d
            boolean r3 = defpackage.a34.i(r3, r4)
            if (r3 == 0) goto L44
        L3b:
            aj5 r3 = r6.getDescriptor()
            java.lang.String r3 = defpackage.z51.h(r0, r3)
            goto L45
        L44:
            r3 = 0
        L45:
            if (r2 == 0) goto L60
            r2 = r6
            p2 r2 = (defpackage.p2) r2
            if (r7 == 0) goto L54
            mj5 r2 = defpackage.gr4.findPolymorphicSerializer(r2, r5, r7)
            r2.getClass()
            goto L61
        L54:
            aj5 r5 = r2.getDescriptor()
            java.lang.String r6 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r7 = "Value for serializer "
            defpackage.ov3.m(r7, r5, r6)
            return
        L60:
            r2 = r6
        L61:
            if (r3 == 0) goto Lec
            aj5 r4 = r2.getDescriptor()
            r4.getClass()
            defpackage.m37.B(r0, r4)
            java.util.Set r0 = defpackage.db.s(r4)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto Lb6
            aj5 r5 = r6.getDescriptor()
            java.lang.String r5 = r5.a()
            aj5 r6 = r2.getDescriptor()
            java.lang.String r6 = r6.a()
            hm0 r7 = r1.k
            hm0 r0 = defpackage.hm0.y
            if (r7 != r0) goto L96
            boolean r7 = defpackage.a34.i(r5, r6)
            if (r7 == 0) goto L96
            java.lang.String r5 = "in ALL_JSON_OBJECTS class discriminator mode"
            goto L9e
        L96:
            java.lang.String r7 = "as base class '"
            r0 = 39
            java.lang.String r5 = defpackage.qx1.g(r0, r7, r5)
        L9e:
            java.lang.String r7 = "' cannot be serialized "
            java.lang.String r0 = " because it has property name that conflicts with JSON class discriminator '"
            java.lang.String r1 = "Class '"
            java.lang.StringBuilder r5 = defpackage.h11.o(r1, r6, r7, r5, r0)
            java.lang.String r6 = "'."
            java.lang.String r5 = defpackage.h11.k(r5, r3, r6)
            o53 r6 = new o53
            java.lang.String r7 = "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation."
            r6.<init>(r5, r7)
            throw r6
        Lb6:
            aj5 r6 = r2.getDescriptor()
            hj5 r6 = r6.getKind()
            r6.getClass()
            boolean r0 = r6 instanceof defpackage.gj5
            if (r0 != 0) goto Le6
            boolean r0 = r6 instanceof defpackage.xt4
            if (r0 != 0) goto Le0
            boolean r6 = r6 instanceof defpackage.er4
            if (r6 != 0) goto Lda
            aj5 r6 = r2.getDescriptor()
            java.lang.String r6 = r6.a()
            r5.h = r3
            r5.i = r6
            goto Lec
        Lda:
            java.lang.String r5 = "Actual serializer for polymorphic cannot be polymorphic itself"
            defpackage.ze0.m(r5)
            return
        Le0:
            java.lang.String r5 = "Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead"
            defpackage.ze0.m(r5)
            return
        Le6:
            java.lang.String r5 = "Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead"
            defpackage.ze0.m(r5)
            return
        Lec:
            r2.serialize(r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az5.j(mj5, java.lang.Object):void");
    }

    @Override // defpackage.v0, defpackage.wt1
    public final void k(char c) {
        o(String.valueOf(c));
    }

    @Override // defpackage.wt1
    public final void l(aj5 aj5Var, int i) {
        aj5Var.getClass();
        o(aj5Var.f(i));
    }

    @Override // defpackage.v0, defpackage.wt1
    public final void m(int i) {
        if (this.g) {
            o(String.valueOf(i));
        } else {
            this.a.m(i);
        }
    }

    @Override // defpackage.v0, defpackage.wt1
    public final void n(long j) {
        if (this.g) {
            o(String.valueOf(j));
        } else {
            this.a.o(j);
        }
    }

    @Override // defpackage.v0, defpackage.wt1
    public final void o(String str) {
        str.getClass();
        this.a.r(str);
    }

    @Override // defpackage.v0
    public final void q(aj5 aj5Var, int i) {
        aj5Var.getClass();
        int ordinal = this.c.ordinal();
        mn0 mn0Var = this.a;
        boolean z = true;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (!mn0Var.x) {
                        mn0Var.l(',');
                    }
                    mn0Var.g();
                    m37.B(this.b, aj5Var);
                    o(aj5Var.f(i));
                    mn0Var.l(':');
                    mn0Var.s();
                    return;
                }
                if (i == 0) {
                    this.g = true;
                }
                if (i == 1) {
                    mn0Var.l(',');
                    mn0Var.s();
                    this.g = false;
                    return;
                }
                return;
            }
            if (!mn0Var.x) {
                if (i % 2 == 0) {
                    mn0Var.l(',');
                    mn0Var.g();
                } else {
                    mn0Var.l(':');
                    mn0Var.s();
                    z = false;
                }
                this.g = z;
                return;
            }
            this.g = true;
            mn0Var.g();
            return;
        }
        if (!mn0Var.x) {
            mn0Var.l(',');
        }
        mn0Var.g();
    }

    @Override // defpackage.v0, defpackage.hu0
    public final boolean shouldEncodeElementDefault(aj5 aj5Var, int i) {
        aj5Var.getClass();
        return this.f.a;
    }
}
