package q;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final e f8813b;

    /* renamed from: c, reason: collision with root package name */
    public final c f8814c;

    /* renamed from: d, reason: collision with root package name */
    public d f8815d;

    /* renamed from: g, reason: collision with root package name */
    public p.k f8818g;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f8812a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f8816e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f8817f = -1;

    public d(e eVar, c cVar) {
        this.f8813b = eVar;
        this.f8814c = cVar;
    }

    public final void a(d dVar, int i10) {
        b(dVar, i10, -1, false);
    }

    public final boolean b(d dVar, int i10, int i11, boolean z9) {
        if (dVar == null) {
            h();
            return true;
        }
        if (!z9 && !g(dVar)) {
            return false;
        }
        this.f8815d = dVar;
        if (dVar.f8812a == null) {
            dVar.f8812a = new HashSet();
        }
        this.f8815d.f8812a.add(this);
        if (i10 > 0) {
            this.f8816e = i10;
        } else {
            this.f8816e = 0;
        }
        this.f8817f = i11;
        return true;
    }

    public final int c() {
        d dVar;
        if (this.f8813b.V == 8) {
            return 0;
        }
        int i10 = this.f8817f;
        if (i10 > -1 && (dVar = this.f8815d) != null && dVar.f8813b.V == 8) {
            return i10;
        }
        return this.f8816e;
    }

    public final d d() {
        c cVar = this.f8814c;
        int ordinal = cVar.ordinal();
        e eVar = this.f8813b;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case zzaja.zze.zzg /* 7 */:
            case 8:
                return null;
            case 1:
                return eVar.f8846z;
            case 2:
                return eVar.A;
            case 3:
                return eVar.f8844x;
            case 4:
                return eVar.f8845y;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final boolean e() {
        HashSet hashSet = this.f8812a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        if (this.f8815d != null) {
            return true;
        }
        return false;
    }

    public final boolean g(d dVar) {
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (dVar == null) {
            return false;
        }
        c cVar = c.BASELINE;
        c cVar2 = this.f8814c;
        e eVar = dVar.f8813b;
        c cVar3 = dVar.f8814c;
        if (cVar3 == cVar2) {
            if (cVar2 == cVar && (!eVar.f8843w || !this.f8813b.f8843w)) {
                return false;
            }
            return true;
        }
        int ordinal = cVar2.ordinal();
        c cVar4 = c.CENTER_Y;
        c cVar5 = c.CENTER_X;
        switch (ordinal) {
            case 0:
            case 5:
            case zzaja.zze.zzg /* 7 */:
            case 8:
                return false;
            case 1:
            case 3:
                if (cVar3 != c.LEFT && cVar3 != c.RIGHT) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (eVar instanceof i) {
                    if (z9 || cVar3 == cVar5) {
                        z11 = true;
                    }
                    return z11;
                }
                return z9;
            case 2:
            case 4:
                if (cVar3 != c.TOP && cVar3 != c.BOTTOM) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (eVar instanceof i) {
                    if (z10 || cVar3 == cVar4) {
                        z11 = true;
                    }
                    return z11;
                }
                return z10;
            case 6:
                if (cVar3 == cVar || cVar3 == cVar5 || cVar3 == cVar4) {
                    return false;
                }
                return true;
            default:
                throw new AssertionError(cVar2.name());
        }
    }

    public final void h() {
        HashSet hashSet;
        d dVar = this.f8815d;
        if (dVar != null && (hashSet = dVar.f8812a) != null) {
            hashSet.remove(this);
        }
        this.f8815d = null;
        this.f8816e = 0;
        this.f8817f = -1;
    }

    public final void i() {
        p.k kVar = this.f8818g;
        if (kVar == null) {
            this.f8818g = new p.k(1);
        } else {
            kVar.c();
        }
    }

    public final String toString() {
        return this.f8813b.W + ":" + this.f8814c.toString();
    }
}
