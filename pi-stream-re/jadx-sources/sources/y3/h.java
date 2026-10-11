package y3;

import android.util.Log;
import androidx.appcompat.widget.a0;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f11592a = new a0(28);

    /* renamed from: b, reason: collision with root package name */
    public final c f11593b = new c(1);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11594c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f11595d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final int f11596e;

    /* renamed from: f, reason: collision with root package name */
    public int f11597f;

    public h(int i10) {
        this.f11596e = i10;
    }

    public final synchronized void a() {
        c(0);
    }

    public final void b(int i10, Class cls) {
        NavigableMap g10 = g(cls);
        Integer num = (Integer) g10.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                g10.remove(Integer.valueOf(i10));
                return;
            } else {
                g10.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void c(int i10) {
        int i11;
        while (this.f11597f > i10) {
            Object W = this.f11592a.W();
            w7.b.q(W);
            a e10 = e(W.getClass());
            int i12 = this.f11597f;
            e eVar = (e) e10;
            int a10 = eVar.a(W);
            switch (eVar.f11584a) {
                case 0:
                    i11 = 1;
                    break;
                default:
                    i11 = 4;
                    break;
            }
            this.f11597f = i12 - (i11 * a10);
            b(eVar.a(W), W.getClass());
            if (Log.isLoggable(eVar.b(), 2)) {
                Log.v(eVar.b(), "evicted: " + eVar.a(W));
            }
        }
    }

    public final synchronized Object d(int i10, Class cls) {
        g gVar;
        boolean z9;
        Integer num = (Integer) g(cls).ceilingKey(Integer.valueOf(i10));
        boolean z10 = false;
        if (num != null) {
            int i11 = this.f11597f;
            if (i11 != 0 && this.f11596e / i11 < 2) {
                z9 = false;
                if (!z9 || num.intValue() <= i10 * 8) {
                    z10 = true;
                }
            }
            z9 = true;
            if (!z9) {
            }
            z10 = true;
        }
        if (z10) {
            c cVar = this.f11593b;
            int intValue = num.intValue();
            gVar = (g) cVar.e();
            gVar.f11590b = intValue;
            gVar.f11591c = cls;
        } else {
            g gVar2 = (g) this.f11593b.e();
            gVar2.f11590b = i10;
            gVar2.f11591c = cls;
            gVar = gVar2;
        }
        return f(gVar, cls);
    }

    public final a e(Class cls) {
        HashMap hashMap = this.f11595d;
        a aVar = (a) hashMap.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new e(1);
            } else if (cls.equals(byte[].class)) {
                aVar = new e(0);
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, aVar);
        }
        return aVar;
    }

    public final Object f(g gVar, Class cls) {
        Object obj;
        int i10;
        a e10 = e(cls);
        Object K = this.f11592a.K(gVar);
        if (K != null) {
            int i11 = this.f11597f;
            e eVar = (e) e10;
            int a10 = eVar.a(K);
            switch (eVar.f11584a) {
                case 0:
                    i10 = 1;
                    break;
                default:
                    i10 = 4;
                    break;
            }
            this.f11597f = i11 - (i10 * a10);
            b(eVar.a(K), cls);
        }
        if (K == null) {
            e eVar2 = (e) e10;
            if (Log.isLoggable(eVar2.b(), 2)) {
                Log.v(eVar2.b(), "Allocated " + gVar.f11590b + " bytes");
            }
            int i12 = gVar.f11590b;
            switch (eVar2.f11584a) {
                case 0:
                    obj = new byte[i12];
                    break;
                default:
                    obj = new int[i12];
                    break;
            }
            return obj;
        }
        return K;
    }

    public final NavigableMap g(Class cls) {
        HashMap hashMap = this.f11594c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final synchronized void h(Object obj) {
        int i10;
        boolean z9;
        Class<?> cls = obj.getClass();
        e eVar = (e) e(cls);
        int a10 = eVar.a(obj);
        int i11 = 1;
        switch (eVar.f11584a) {
            case 0:
                i10 = 1;
                break;
            default:
                i10 = 4;
                break;
        }
        int i12 = i10 * a10;
        if (i12 <= this.f11596e / 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return;
        }
        g gVar = (g) this.f11593b.e();
        gVar.f11590b = a10;
        gVar.f11591c = cls;
        this.f11592a.U(gVar, obj);
        NavigableMap g10 = g(cls);
        Integer num = (Integer) g10.get(Integer.valueOf(gVar.f11590b));
        Integer valueOf = Integer.valueOf(gVar.f11590b);
        if (num != null) {
            i11 = 1 + num.intValue();
        }
        g10.put(valueOf, Integer.valueOf(i11));
        this.f11597f += i12;
        c(this.f11596e);
    }

    public final synchronized void i(int i10) {
        try {
            if (i10 >= 40) {
                a();
            } else if (i10 >= 20 || i10 == 15) {
                c(this.f11596e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
