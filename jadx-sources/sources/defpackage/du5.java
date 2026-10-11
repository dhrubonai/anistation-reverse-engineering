package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class du5 {
    public final ub2 a;
    public Object b;
    public b44 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final p44 e = x97.q();
    public final p44 f = new p44();
    public final q44 g = new q44();
    public final z44 h = new z44(new he1[16], 0);
    public final jd2 i = new jd2(this, (byte) 1);
    public final p44 l = x97.q();
    public final HashMap m = new HashMap();

    public du5(ub2 ub2Var) {
        this.a = ub2Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.du5.a(java.util.Set):boolean");
    }

    public final void b(Object obj, int i, Object obj2, b44 b44Var) {
        int i2;
        if (this.k <= 0) {
            int c = b44Var.c(obj);
            if (c < 0) {
                c = ~c;
                i2 = -1;
            } else {
                i2 = b44Var.c[c];
            }
            b44Var.b[c] = obj;
            b44Var.c[c] = i;
            if ((obj instanceof he1) && i2 != i) {
                ge1 i3 = ((he1) obj).i();
                this.m.put(obj, i3.f);
                b44 b44Var2 = i3.e;
                p44 p44Var = this.l;
                x97.N(p44Var, obj);
                Object[] objArr = b44Var2.b;
                long[] jArr = b44Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j & 255) < 128) {
                                    xx5 xx5Var = (xx5) objArr[(i4 << 3) + i6];
                                    if (xx5Var instanceof yx5) {
                                        ((yx5) xx5Var).g(2);
                                    }
                                    x97.k(p44Var, xx5Var, obj);
                                }
                                j >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
            if (i2 == -1) {
                if (obj instanceof yx5) {
                    ((yx5) obj).g(2);
                }
                x97.k(this.e, obj, obj2);
            }
        }
    }

    public final void c(Object obj, Object obj2) {
        p44 p44Var = this.e;
        x97.M(p44Var, obj2, obj);
        if ((obj2 instanceof he1) && !p44Var.c(obj2)) {
            x97.N(this.l, obj2);
            this.m.remove(obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.c94 r34) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.du5.d(c94):void");
    }
}
