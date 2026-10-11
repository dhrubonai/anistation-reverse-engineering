package m3;

import android.view.View;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7305a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7306b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7307c;

    public m1(int i10) {
        this.f7305a = i10;
        if (i10 != 1) {
            this.f7306b = new n.k();
            this.f7307c = new n.i();
        }
    }

    public final void a(a1 a1Var) {
        l1 l1Var = (l1) ((n.k) this.f7306b).getOrDefault(a1Var, null);
        if (l1Var == null) {
            l1Var = l1.a();
            ((n.k) this.f7306b).put(a1Var, l1Var);
        }
        l1Var.f7299a |= 1;
    }

    public final void b(a1 a1Var, z1.h hVar) {
        l1 l1Var = (l1) ((n.k) this.f7306b).getOrDefault(a1Var, null);
        if (l1Var == null) {
            l1Var = l1.a();
            ((n.k) this.f7306b).put(a1Var, l1Var);
        }
        l1Var.f7301c = hVar;
        l1Var.f7299a |= 8;
    }

    public final void c(a1 a1Var, z1.h hVar) {
        l1 l1Var = (l1) ((n.k) this.f7306b).getOrDefault(a1Var, null);
        if (l1Var == null) {
            l1Var = l1.a();
            ((n.k) this.f7306b).put(a1Var, l1Var);
        }
        l1Var.f7300b = hVar;
        l1Var.f7299a |= 4;
    }

    public final void d() {
        switch (this.f7305a) {
            case 0:
                ((n.k) this.f7306b).clear();
                ((n.i) this.f7307c).b();
                return;
            default:
                int[] iArr = (int[]) this.f7306b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f7307c = null;
                return;
        }
    }

    public final void e(int i10) {
        Object obj = this.f7306b;
        if (((int[]) obj) == null) {
            int[] iArr = new int[Math.max(i10, 10) + 1];
            this.f7306b = iArr;
            Arrays.fill(iArr, -1);
        } else if (i10 >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f7306b = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            Object obj2 = this.f7306b;
            Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    public final View f(int i10, int i11, int i12, int i13) {
        int E;
        int i14;
        View u9;
        d0.h hVar = (d0.h) ((k1) this.f7306b);
        int i15 = hVar.f3026a;
        Object obj = hVar.f3027b;
        switch (i15) {
            case 0:
                E = ((k0) obj).C();
                break;
            default:
                E = ((k0) obj).E();
                break;
        }
        int l10 = ((d0.h) ((k1) this.f7306b)).l();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            d0.h hVar2 = (d0.h) ((k1) this.f7306b);
            int i16 = hVar2.f3026a;
            Object obj2 = hVar2.f3027b;
            switch (i16) {
                case 0:
                    u9 = ((k0) obj2).u(i10);
                    break;
                default:
                    u9 = ((k0) obj2).u(i10);
                    break;
            }
            int k10 = ((d0.h) ((k1) this.f7306b)).k(u9);
            int j4 = ((d0.h) ((k1) this.f7306b)).j(u9);
            Object obj3 = this.f7307c;
            c1.f fVar = (c1.f) obj3;
            fVar.f1678b = E;
            fVar.f1679c = l10;
            fVar.f1680d = k10;
            fVar.f1681e = j4;
            if (i12 != 0) {
                ((c1.f) obj3).f1677a = i12 | 0;
                if (((c1.f) obj3).a()) {
                    return u9;
                }
            }
            if (i13 != 0) {
                Object obj4 = this.f7307c;
                ((c1.f) obj4).f1677a = i13 | 0;
                if (((c1.f) obj4).a()) {
                    view = u9;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7306b
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.length
            if (r6 < r0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r5.f7307c
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L14
            goto L71
        L14:
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r0 != 0) goto L1a
            goto L34
        L1a:
            int r0 = r0.size()
            int r0 = r0 + r1
        L1f:
            if (r0 < 0) goto L34
            java.lang.Object r3 = r5.f7307c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            m3.h1 r3 = (m3.h1) r3
            int r4 = r3.f7236a
            if (r4 != r6) goto L31
            r2 = r3
            goto L34
        L31:
            int r0 = r0 + (-1)
            goto L1f
        L34:
            if (r2 == 0) goto L3d
            java.lang.Object r0 = r5.f7307c
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L3d:
            java.lang.Object r0 = r5.f7307c
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L46:
            if (r2 >= r0) goto L5a
            java.lang.Object r3 = r5.f7307c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            m3.h1 r3 = (m3.h1) r3
            int r3 = r3.f7236a
            if (r3 < r6) goto L57
            goto L5b
        L57:
            int r2 = r2 + 1
            goto L46
        L5a:
            r2 = r1
        L5b:
            if (r2 == r1) goto L71
            java.lang.Object r0 = r5.f7307c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            m3.h1 r0 = (m3.h1) r0
            java.lang.Object r3 = r5.f7307c
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.f7236a
            goto L72
        L71:
            r0 = r1
        L72:
            if (r0 != r1) goto L82
            java.lang.Object r0 = r5.f7306b
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r6 = r5.f7306b
            int[] r6 = (int[]) r6
            int r6 = r6.length
            return r6
        L82:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.f7306b
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r2 = r5.f7306b
            int[] r2 = (int[]) r2
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.m1.g(int):int");
    }

    public final boolean h(View view) {
        int E;
        c1.f fVar = (c1.f) this.f7307c;
        d0.h hVar = (d0.h) ((k1) this.f7306b);
        int i10 = hVar.f3026a;
        Object obj = hVar.f3027b;
        switch (i10) {
            case 0:
                E = ((k0) obj).C();
                break;
            default:
                E = ((k0) obj).E();
                break;
        }
        int l10 = ((d0.h) ((k1) this.f7306b)).l();
        int k10 = ((d0.h) ((k1) this.f7306b)).k(view);
        int j4 = ((d0.h) ((k1) this.f7306b)).j(view);
        fVar.f1678b = E;
        fVar.f1679c = l10;
        fVar.f1680d = k10;
        fVar.f1681e = j4;
        Object obj2 = this.f7307c;
        ((c1.f) obj2).f1677a = 24579 | 0;
        return ((c1.f) obj2).a();
    }

    public final void i(int i10, int i11) {
        int[] iArr = (int[]) this.f7306b;
        if (iArr != null && i10 < iArr.length) {
            int i12 = i10 + i11;
            e(i12);
            int[] iArr2 = (int[]) this.f7306b;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill((int[]) this.f7306b, i10, i12, -1);
            List list = (List) this.f7307c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    h1 h1Var = (h1) ((List) this.f7307c).get(size);
                    int i13 = h1Var.f7236a;
                    if (i13 >= i10) {
                        h1Var.f7236a = i13 + i11;
                    }
                }
            }
        }
    }

    public final void j(int i10, int i11) {
        int[] iArr = (int[]) this.f7306b;
        if (iArr != null && i10 < iArr.length) {
            int i12 = i10 + i11;
            e(i12);
            int[] iArr2 = (int[]) this.f7306b;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = (int[]) this.f7306b;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            List list = (List) this.f7307c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    h1 h1Var = (h1) ((List) this.f7307c).get(size);
                    int i13 = h1Var.f7236a;
                    if (i13 >= i10) {
                        if (i13 < i12) {
                            ((List) this.f7307c).remove(size);
                        } else {
                            h1Var.f7236a = i13 - i11;
                        }
                    }
                }
            }
        }
    }

    public final z1.h k(a1 a1Var, int i10) {
        l1 l1Var;
        z1.h hVar;
        int e10 = ((n.k) this.f7306b).e(a1Var);
        if (e10 >= 0 && (l1Var = (l1) ((n.k) this.f7306b).l(e10)) != null) {
            int i11 = l1Var.f7299a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                l1Var.f7299a = i12;
                if (i10 == 4) {
                    hVar = l1Var.f7300b;
                } else if (i10 == 8) {
                    hVar = l1Var.f7301c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    ((n.k) this.f7306b).j(e10);
                    l1Var.f7299a = 0;
                    l1Var.f7300b = null;
                    l1Var.f7301c = null;
                    l1.f7298d.b(l1Var);
                }
                return hVar;
            }
        }
        return null;
    }

    public final void l(a1 a1Var) {
        l1 l1Var = (l1) ((n.k) this.f7306b).getOrDefault(a1Var, null);
        if (l1Var == null) {
            return;
        }
        l1Var.f7299a &= -2;
    }

    public final void m(a1 a1Var) {
        n.i iVar = (n.i) this.f7307c;
        if (iVar.f7881a) {
            iVar.d();
        }
        int i10 = iVar.f7884d - 1;
        while (true) {
            if (i10 < 0) {
                break;
            }
            if (a1Var == ((n.i) this.f7307c).g(i10)) {
                n.i iVar2 = (n.i) this.f7307c;
                Object[] objArr = iVar2.f7883c;
                Object obj = objArr[i10];
                Object obj2 = n.i.f7880e;
                if (obj != obj2) {
                    objArr[i10] = obj2;
                    iVar2.f7881a = true;
                }
            } else {
                i10--;
            }
        }
        l1 l1Var = (l1) ((n.k) this.f7306b).remove(a1Var);
        if (l1Var != null) {
            l1Var.f7299a = 0;
            l1Var.f7300b = null;
            l1Var.f7301c = null;
            l1.f7298d.b(l1Var);
        }
    }

    public m1(d0.h hVar) {
        this.f7305a = 2;
        this.f7306b = hVar;
        this.f7307c = new c1.f();
    }
}
