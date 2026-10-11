package m3;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public final c0 f7174d;

    /* renamed from: a, reason: collision with root package name */
    public final p.f f7171a = new p.f(30, 1);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7172b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7173c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f7176f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final d0.h f7175e = new d0.h(this, 2);

    public b(c0 c0Var) {
        this.f7174d = c0Var;
    }

    public final boolean a(int i10) {
        ArrayList arrayList = this.f7173c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f7146a;
            if (i12 == 8) {
                if (f(aVar.f7149d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = aVar.f7147b;
                int i14 = aVar.f7149d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f7173c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7174d.a((a) arrayList.get(i10));
        }
        l(arrayList);
        this.f7176f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f7172b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f7146a;
            c0 c0Var = this.f7174d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            c0Var.a(aVar);
                            c0Var.f(aVar.f7147b, aVar.f7149d);
                        }
                    } else {
                        c0Var.a(aVar);
                        c0Var.d(aVar.f7148c, aVar.f7147b, aVar.f7149d);
                    }
                } else {
                    c0Var.a(aVar);
                    int i12 = aVar.f7147b;
                    int i13 = aVar.f7149d;
                    RecyclerView recyclerView = c0Var.f7186a;
                    recyclerView.Q(i12, i13, true);
                    recyclerView.A0 = true;
                    recyclerView.f1258x0.f7408c += i13;
                }
            } else {
                c0Var.a(aVar);
                c0Var.e(aVar.f7147b, aVar.f7149d);
            }
        }
        l(arrayList);
        this.f7176f = 0;
    }

    public final void d(a aVar) {
        int i10;
        p.f fVar;
        boolean z9;
        int i11 = aVar.f7146a;
        if (i11 != 1 && i11 != 8) {
            int m5 = m(aVar.f7147b, i11);
            int i12 = aVar.f7147b;
            int i13 = aVar.f7146a;
            if (i13 != 2) {
                if (i13 == 4) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + aVar);
                }
            } else {
                i10 = 0;
            }
            int i14 = 1;
            int i15 = 1;
            while (true) {
                int i16 = aVar.f7149d;
                fVar = this.f7171a;
                if (i14 >= i16) {
                    break;
                }
                int m9 = m((i10 * i14) + aVar.f7147b, aVar.f7146a);
                int i17 = aVar.f7146a;
                if (i17 == 2 ? m9 == m5 : !(i17 != 4 || m9 != m5 + 1)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i15++;
                } else {
                    a h10 = h(aVar.f7148c, i17, m5, i15);
                    e(h10, i12);
                    h10.f7148c = null;
                    fVar.b(h10);
                    if (aVar.f7146a == 4) {
                        i12 += i15;
                    }
                    i15 = 1;
                    m5 = m9;
                }
                i14++;
            }
            Object obj = aVar.f7148c;
            aVar.f7148c = null;
            fVar.b(aVar);
            if (i15 > 0) {
                a h11 = h(obj, aVar.f7146a, m5, i15);
                e(h11, i12);
                h11.f7148c = null;
                fVar.b(h11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void e(a aVar, int i10) {
        c0 c0Var = this.f7174d;
        c0Var.a(aVar);
        int i11 = aVar.f7146a;
        if (i11 != 2) {
            if (i11 == 4) {
                c0Var.d(aVar.f7148c, i10, aVar.f7149d);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = aVar.f7149d;
        RecyclerView recyclerView = c0Var.f7186a;
        recyclerView.Q(i10, i12, true);
        recyclerView.A0 = true;
        recyclerView.f1258x0.f7408c += i12;
    }

    public final int f(int i10, int i11) {
        ArrayList arrayList = this.f7173c;
        int size = arrayList.size();
        while (i11 < size) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f7146a;
            if (i12 == 8) {
                int i13 = aVar.f7147b;
                if (i13 == i10) {
                    i10 = aVar.f7149d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (aVar.f7149d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = aVar.f7147b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = aVar.f7149d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += aVar.f7149d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        if (this.f7172b.size() > 0) {
            return true;
        }
        return false;
    }

    public final a h(Object obj, int i10, int i11, int i12) {
        a aVar = (a) this.f7171a.j();
        if (aVar == null) {
            return new a(obj, i10, i11, i12);
        }
        aVar.f7146a = i10;
        aVar.f7147b = i11;
        aVar.f7149d = i12;
        aVar.f7148c = obj;
        return aVar;
    }

    public final void i(a aVar) {
        this.f7173c.add(aVar);
        int i10 = aVar.f7146a;
        c0 c0Var = this.f7174d;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        c0Var.f(aVar.f7147b, aVar.f7149d);
                        return;
                    } else {
                        throw new IllegalArgumentException("Unknown update op type for " + aVar);
                    }
                }
                c0Var.d(aVar.f7148c, aVar.f7147b, aVar.f7149d);
                return;
            }
            int i11 = aVar.f7147b;
            int i12 = aVar.f7149d;
            RecyclerView recyclerView = c0Var.f7186a;
            recyclerView.Q(i11, i12, false);
            recyclerView.A0 = true;
            return;
        }
        c0Var.e(aVar.f7147b, aVar.f7149d);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.b.j():void");
    }

    public final void k(a aVar) {
        aVar.f7148c = null;
        this.f7171a.b(aVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k((a) arrayList.get(i10));
        }
        arrayList.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        ArrayList arrayList = this.f7173c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i14 = aVar.f7146a;
            if (i14 == 8) {
                int i15 = aVar.f7147b;
                int i16 = aVar.f7149d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 >= i13 && i10 <= i12) {
                    if (i13 == i15) {
                        if (i11 == 1) {
                            aVar.f7149d = i16 + 1;
                        } else if (i11 == 2) {
                            aVar.f7149d = i16 - 1;
                        }
                        i10++;
                    } else {
                        if (i11 == 1) {
                            aVar.f7147b = i15 + 1;
                        } else if (i11 == 2) {
                            aVar.f7147b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        aVar.f7147b = i15 + 1;
                        aVar.f7149d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f7147b = i15 - 1;
                        aVar.f7149d = i16 - 1;
                    }
                }
            } else {
                int i17 = aVar.f7147b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.f7149d;
                    } else if (i14 == 2) {
                        i10 += aVar.f7149d;
                    }
                } else if (i11 == 1) {
                    aVar.f7147b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f7147b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.f7146a == 8) {
                int i18 = aVar2.f7149d;
                if (i18 == aVar2.f7147b || i18 < 0) {
                    arrayList.remove(size2);
                    k(aVar2);
                }
            } else if (aVar2.f7149d <= 0) {
                arrayList.remove(size2);
                k(aVar2);
            }
        }
        return i10;
    }
}
