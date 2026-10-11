package h4;

import androidx.lifecycle.q0;
import java.util.ArrayList;
import java.util.Iterator;
import k4.d;
import o7.j;
import r6.h0;
import y8.o;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5004a;

    public /* synthetic */ c(int i10) {
        if (i10 == 1) {
            this.f5004a = new ArrayList();
            return;
        }
        if (i10 == 2) {
            this.f5004a = new ArrayList();
            return;
        }
        if (i10 == 3) {
            this.f5004a = new ArrayList();
        } else if (i10 != 4) {
            this.f5004a = new ArrayList();
        } else {
            this.f5004a = new ArrayList();
        }
    }

    public void a(String str, String str2) {
        h0.u(str, "name");
        h0.u(str2, "value");
        ArrayList arrayList = this.f5004a;
        arrayList.add(str);
        arrayList.add(j.G1(str2).toString());
    }

    public o b() {
        return new o((String[]) this.f5004a.toArray(new String[0]));
    }

    public synchronized a c(Class cls, Class cls2) {
        boolean z9;
        if (cls2.isAssignableFrom(cls)) {
            return q0.f1132e;
        }
        Iterator it = this.f5004a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f5001a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f5002b)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                return bVar.f5003c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized v3.o d(Class cls) {
        int size = this.f5004a.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) this.f5004a.get(i10);
            if (dVar.f6475a.isAssignableFrom(cls)) {
                return dVar.f6476b;
            }
        }
        return null;
    }

    public synchronized ArrayList e(Class cls, Class cls2) {
        boolean z9;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f5004a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f5001a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f5002b)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && !arrayList.contains(bVar.f5002b)) {
                arrayList.add(bVar.f5002b);
            }
        }
        return arrayList;
    }

    public void f(String str) {
        h0.u(str, "name");
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5004a;
            if (i10 < arrayList.size()) {
                if (j.l1(str, (String) arrayList.get(i10))) {
                    arrayList.remove(i10);
                    arrayList.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            } else {
                return;
            }
        }
    }

    public c() {
        this.f5004a = new ArrayList(20);
    }
}
