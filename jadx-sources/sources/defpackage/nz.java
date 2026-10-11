package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nz extends rd4 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz(ub2 ub2Var) {
        super(true);
        this.d = (byte) 2;
        this.e = ub2Var;
    }

    @Override // defpackage.rd4
    public void a() {
        switch (this.d) {
            case 0:
                return;
            case 1:
                ra2 ra2Var = (ra2) this.e;
                if (ra2.l(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + ra2Var);
                }
                if (ra2.l(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + ((uz) ra2Var.g));
                }
                uz uzVar = (uz) ra2Var.g;
                if (uzVar != null) {
                    uzVar.d = false;
                    ArrayList arrayList = uzVar.a;
                    byte b = 1;
                    int size = arrayList.size() - 1;
                    while (size >= 0) {
                        ta2 ta2Var = (ta2) arrayList.get(size);
                        if (ta2Var.c) {
                            if (ta2Var.a == 8) {
                                ta2Var.c = false;
                                arrayList.remove(size - 1);
                                size--;
                            } else {
                                ta2Var.b.getClass();
                                ta2Var.a = 2;
                                ta2Var.c = false;
                                for (int i = size - 1; i >= 0; i--) {
                                    ta2 ta2Var2 = (ta2) arrayList.get(i);
                                    if (ta2Var2.c) {
                                        ta2Var2.b.getClass();
                                        arrayList.remove(i);
                                        size--;
                                    }
                                }
                            }
                        }
                        size--;
                    }
                    uz uzVar2 = (uz) ra2Var.g;
                    a92 a92Var = new a92(ra2Var, b);
                    ArrayList arrayList2 = uzVar2.b;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        uzVar2.b = arrayList2;
                    }
                    arrayList2.add(a92Var);
                    ((uz) ra2Var.g).a(false);
                    ra2Var.k();
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.rd4
    public final void b() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((bt0) obj).c.invoke();
                return;
            case 1:
                ra2 ra2Var = (ra2) obj;
                if (ra2.l(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + ra2Var);
                }
                ra2Var.k();
                throw null;
            default:
                ((ub2) obj).invoke(this);
                return;
        }
    }

    @Override // defpackage.rd4
    public void c(lz lzVar) {
        switch (this.d) {
            case 0:
                return;
            case 1:
                ra2 ra2Var = (ra2) this.e;
                if (ra2.l(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + ra2Var);
                }
                if (((uz) ra2Var.g) != null) {
                    ArrayList arrayList = new ArrayList(Collections.singletonList((uz) ra2Var.g));
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = ((uz) arrayList.get(0)).a;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        cg1 cg1Var = ((ta2) obj).b;
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        pa1 pa1Var = (pa1) it.next();
                        pa1Var.getClass();
                        if (ra2.l(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + lzVar.c);
                        }
                        ArrayList arrayList3 = pa1Var.c;
                        ArrayList arrayList4 = new ArrayList();
                        int size2 = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj2 = arrayList3.get(i2);
                            i2++;
                            ((dw5) obj2).getClass();
                            dp0.Y(null, arrayList4);
                        }
                        List I0 = yo0.I0(yo0.N0(arrayList4));
                        int size3 = I0.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            ((cw5) I0.get(i3)).a(lzVar, pa1Var.a);
                        }
                    }
                    Iterator it2 = ((ArrayList) ra2Var.e).iterator();
                    if (it2.hasNext()) {
                        throw qx1.f(it2);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.rd4
    public void d(lz lzVar) {
        String str;
        String str2;
        switch (this.d) {
            case 0:
                return;
            case 1:
                ra2 ra2Var = (ra2) this.e;
                if (ra2.l(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + ra2Var);
                }
                HashSet hashSet = new HashSet();
                rt3 rt3Var = (rt3) ra2Var.f;
                rt3Var.getClass();
                ArrayList arrayList = new ArrayList();
                for (sa2 sa2Var : ((HashMap) rt3Var.z).values()) {
                }
                if (arrayList.size() <= 0) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        pa1 pa1Var = (pa1) it.next();
                        pa1Var.getClass();
                        if (ra2.l(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
                        }
                        boolean isAttachedToWindow = pa1Var.a.isAttachedToWindow();
                        synchronized (pa1Var.b) {
                            try {
                                ArrayList arrayList2 = pa1Var.b;
                                int size = arrayList2.size();
                                int i = 0;
                                while (i < size) {
                                    Object obj = arrayList2.get(i);
                                    i++;
                                    ((dw5) obj).getClass();
                                }
                                pa1Var.a(pa1Var.b);
                                ArrayList arrayList3 = new ArrayList(pa1Var.c);
                                int size2 = arrayList3.size();
                                int i2 = 0;
                                while (i2 < size2) {
                                    Object obj2 = arrayList3.get(i2);
                                    i2++;
                                    ((dw5) obj2).getClass();
                                }
                                int size3 = arrayList3.size();
                                int i3 = 0;
                                while (i3 < size3) {
                                    Object obj3 = arrayList3.get(i3);
                                    i3++;
                                    dw5 dw5Var = (dw5) obj3;
                                    if (ra2.l(2)) {
                                        if (isAttachedToWindow) {
                                            str2 = "";
                                        } else {
                                            str2 = "Container " + pa1Var.a + " is not attached to window. ";
                                        }
                                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + dw5Var);
                                    }
                                    dw5Var.a(pa1Var.a);
                                }
                                ArrayList arrayList4 = new ArrayList(pa1Var.b);
                                int size4 = arrayList4.size();
                                int i4 = 0;
                                while (i4 < size4) {
                                    Object obj4 = arrayList4.get(i4);
                                    i4++;
                                    ((dw5) obj4).getClass();
                                }
                                int size5 = arrayList4.size();
                                int i5 = 0;
                                while (i5 < size5) {
                                    Object obj5 = arrayList4.get(i5);
                                    i5++;
                                    dw5 dw5Var2 = (dw5) obj5;
                                    if (ra2.l(2)) {
                                        if (isAttachedToWindow) {
                                            str = "";
                                        } else {
                                            str = "Container " + pa1Var.a + " is not attached to window. ";
                                        }
                                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + dw5Var2);
                                    }
                                    dw5Var2.a(pa1Var.a);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                ((sa2) arrayList.get(0)).getClass();
                throw null;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz(Object obj, byte b) {
        super(false);
        this.d = b;
        this.e = obj;
    }

    private final void f() {
    }

    private final void g(lz lzVar) {
    }

    private final void h(lz lzVar) {
    }
}
