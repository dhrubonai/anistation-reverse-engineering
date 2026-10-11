package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class qv0 extends za0 {
    public final ta0 P;

    public qv0(int i, ta0 ta0Var, ub2 ub2Var) {
        super(i, ub2Var);
        this.P = ta0Var;
        if (ta0Var != ta0.x) {
            if (i >= 1) {
                return;
            }
            ze0.e(qx1.i(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            throw null;
        }
        ov3.m("This implementation does not support suspension for senders, use ", z05.a(za0.class).f(), " instead");
        throw null;
    }

    @Override // defpackage.za0
    public final boolean A() {
        if (this.P == ta0.y) {
            return true;
        }
        return false;
    }

    public final Object O(Object obj, boolean z) {
        dx6 dx6Var;
        ub2 ub2Var;
        er0 o;
        ta0 ta0Var = this.P;
        ta0 ta0Var2 = ta0.z;
        pn6 pn6Var = pn6.a;
        dx6 dx6Var2 = null;
        if (ta0Var == ta0Var2) {
            Object i = super.i(obj);
            if ((i instanceof ck0) && !(i instanceof bk0)) {
                if (z && (ub2Var = this.y) != null && (o = o80.o(ub2Var, obj, null)) != null) {
                    throw o;
                }
            } else {
                return i;
            }
        } else {
            Object obj2 = obj;
            Object obj3 = bb0.d;
            ek0 ek0Var = (ek0) za0.E.get(this);
            while (true) {
                long andIncrement = za0.A.getAndIncrement(this);
                long j = 1152921504606846975L & andIncrement;
                boolean x = x(andIncrement, false);
                int i2 = bb0.b;
                long j2 = i2;
                long j3 = j / j2;
                dx6 dx6Var3 = dx6Var2;
                int i3 = (int) (j % j2);
                if (ek0Var.A != j3) {
                    ek0 o2 = o(j3, ek0Var);
                    if (o2 == null) {
                        if (x) {
                            return new bk0(t());
                        }
                        dx6Var2 = dx6Var3;
                    } else {
                        ek0Var = o2;
                    }
                }
                int L = L(ek0Var, i3, obj2, j, obj3, x);
                if (L != 0) {
                    if (L == 1) {
                        break;
                    }
                    if (L != 2) {
                        if (L != 3) {
                            if (L != 4) {
                                if (L == 5) {
                                    ek0Var.b();
                                }
                                obj2 = obj;
                                dx6Var2 = dx6Var3;
                            } else {
                                if (j < s()) {
                                    ek0Var.b();
                                }
                                return new bk0(t());
                            }
                        } else {
                            ze0.m("unexpected");
                            return dx6Var3;
                        }
                    } else {
                        if (x) {
                            ek0Var.i();
                            return new bk0(t());
                        }
                        if (obj3 instanceof dx6) {
                            dx6Var = (dx6) obj3;
                        } else {
                            dx6Var = dx6Var3;
                        }
                        if (dx6Var != null) {
                            dx6Var.b(ek0Var, i3 + i2);
                        }
                        k((ek0Var.A * j2) + i3);
                    }
                } else {
                    ek0Var.b();
                    return pn6Var;
                }
            }
        }
        return pn6Var;
    }

    @Override // defpackage.za0, defpackage.ki5
    public final Object b(vz0 vz0Var, Object obj) {
        er0 o;
        if (O(obj, true) instanceof bk0) {
            ub2 ub2Var = this.y;
            if (ub2Var != null && (o = o80.o(ub2Var, obj, null)) != null) {
                n03.i(o, t());
                throw o;
            }
            throw t();
        }
        return pn6.a;
    }

    @Override // defpackage.za0, defpackage.ki5
    public final Object i(Object obj) {
        return O(obj, false);
    }
}
