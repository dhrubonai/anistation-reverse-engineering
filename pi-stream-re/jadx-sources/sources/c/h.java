package c;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.j0;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public Random f1586a = new Random();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1587b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1588c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1589d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1590e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final transient HashMap f1591f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f1592g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f1593h = new Bundle();

    public final boolean a(int i10, int i11, Intent intent) {
        b bVar;
        String str = (String) this.f1587b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        f fVar = (f) this.f1591f.get(str);
        if (fVar != null && (bVar = fVar.f1582a) != null && this.f1590e.contains(str)) {
            bVar.a(fVar.f1583b.c(intent, i11));
            this.f1590e.remove(str);
            return true;
        }
        this.f1592g.remove(str);
        this.f1593h.putParcelable(str, new a(intent, i11));
        return true;
    }

    public abstract void b(int i10, d.a aVar, Object obj);

    public final e c(String str, u uVar, d.a aVar, b bVar) {
        boolean z9;
        p lifecycle = uVar.getLifecycle();
        w wVar = (w) lifecycle;
        if (wVar.f1156c.compareTo(o.STARTED) >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            e(str);
            HashMap hashMap = this.f1589d;
            g gVar = (g) hashMap.get(str);
            if (gVar == null) {
                gVar = new g(lifecycle);
            }
            d dVar = new d(this, str, bVar, aVar);
            gVar.f1584a.a(dVar);
            gVar.f1585b.add(dVar);
            hashMap.put(str, gVar);
            return new e(this, str, aVar, 0);
        }
        throw new IllegalStateException("LifecycleOwner " + uVar + " is attempting to register while current state is " + wVar.f1156c + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final e d(String str, d.a aVar, j0 j0Var) {
        e(str);
        this.f1591f.put(str, new f(aVar, j0Var));
        HashMap hashMap = this.f1592g;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            j0Var.a(obj);
        }
        Bundle bundle = this.f1593h;
        a aVar2 = (a) bundle.getParcelable(str);
        if (aVar2 != null) {
            bundle.remove(str);
            j0Var.a(aVar.c(aVar2.f1573b, aVar2.f1572a));
        }
        return new e(this, str, aVar, 1);
    }

    public final void e(String str) {
        HashMap hashMap = this.f1588c;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        int nextInt = this.f1586a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            HashMap hashMap2 = this.f1587b;
            if (hashMap2.containsKey(Integer.valueOf(i10))) {
                nextInt = this.f1586a.nextInt(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i10), str);
                hashMap.put(str, Integer.valueOf(i10));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f1590e.contains(str) && (num = (Integer) this.f1588c.remove(str)) != null) {
            this.f1587b.remove(num);
        }
        this.f1591f.remove(str);
        HashMap hashMap = this.f1592g;
        if (hashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = this.f1593h;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f1589d;
        g gVar = (g) hashMap2.get(str);
        if (gVar != null) {
            ArrayList arrayList = gVar.f1585b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar.f1584a.b((s) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
