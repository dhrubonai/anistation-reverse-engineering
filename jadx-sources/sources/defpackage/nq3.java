package defpackage;

import android.net.Uri;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nq3 {
    public long a;
    public Object b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object f = new oq3();
    public Object g = new rq3();
    public Object h = Collections.EMPTY_LIST;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public nq3() {
        z62 z62Var = nw2.y;
        this.i = o15.B;
        this.l = new tq3();
        this.m = wq3.d;
        this.a = -9223372036854775807L;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [qq3, pq3] */
    public ar3 a() {
        boolean z;
        vq3 vq3Var;
        rq3 rq3Var = (rq3) this.g;
        if (((Uri) rq3Var.e) != null && ((UUID) rq3Var.d) == null) {
            z = false;
        } else {
            z = true;
        }
        io3.B(z);
        Uri uri = (Uri) this.e;
        sq3 sq3Var = null;
        if (uri != null) {
            String str = (String) this.c;
            rq3 rq3Var2 = (rq3) this.g;
            if (((UUID) rq3Var2.d) != null) {
                sq3Var = new sq3(rq3Var2);
            }
            vq3Var = new vq3(uri, str, sq3Var, (mq3) this.j, (List) this.h, (String) this.d, (nw2) this.i, this.a);
        } else {
            vq3Var = null;
        }
        String str2 = (String) this.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        oq3 oq3Var = (oq3) this.f;
        oq3Var.getClass();
        ?? pq3Var = new pq3(oq3Var);
        tq3 tq3Var = (tq3) this.l;
        tq3Var.getClass();
        uq3 uq3Var = new uq3(tq3Var);
        jr3 jr3Var = (jr3) this.k;
        if (jr3Var == null) {
            jr3Var = jr3.M;
        }
        return new ar3(str3, pq3Var, vq3Var, uq3Var, jr3Var, (wq3) this.m);
    }

    public void b(List list) {
        List list2;
        if (list != null && !list.isEmpty()) {
            list2 = Collections.unmodifiableList(new ArrayList(list));
        } else {
            list2 = Collections.EMPTY_LIST;
        }
        this.h = list2;
    }

    public void c(String str) {
        Uri parse;
        if (str == null) {
            parse = null;
        } else {
            parse = Uri.parse(str);
        }
        this.e = parse;
    }

    public void d() {
        h();
        ((ArrayList) this.d).clear();
        ((SparseIntArray) this.e).clear();
        ((lw7) this.f).evictAll();
        ((ArrayList) this.g).clear();
        ((h15) this.i).removeCallbacks((gm7) this.j);
        ((ArrayDeque) this.h).clear();
        BasePendingResult basePendingResult = (BasePendingResult) this.l;
        if (basePendingResult != null) {
            basePendingResult.a();
            this.l = null;
        }
        BasePendingResult basePendingResult2 = (BasePendingResult) this.k;
        if (basePendingResult2 != null) {
            basePendingResult2.a();
            this.k = null;
        }
        j();
        i();
    }

    public void e() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        a34.s();
        if (this.a != 0 && (basePendingResult = (BasePendingResult) this.l) == null) {
            if (basePendingResult != null) {
                basePendingResult.a();
                this.l = null;
            }
            BasePendingResult basePendingResult3 = (BasePendingResult) this.k;
            if (basePendingResult3 != null) {
                basePendingResult3.a();
                this.k = null;
            }
            s25 s25Var = (s25) this.c;
            s25Var.getClass();
            a34.s();
            if (!s25Var.x()) {
                basePendingResult2 = s25.w();
            } else {
                sf7 sf7Var = new sf7(s25Var, (byte) 2);
                s25.z(sf7Var);
                basePendingResult2 = sf7Var;
            }
            this.l = basePendingResult2;
            basePendingResult2.f(new ex7(this, (byte) 1));
        }
    }

    public /* synthetic */ void f() {
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        sparseIntArray.clear();
        for (int i = 0; i < ((ArrayList) this.d).size(); i++) {
            sparseIntArray.put(((Integer) ((ArrayList) this.d).get(i)).intValue(), i);
        }
    }

    public long g() {
        int i;
        bx3 e = ((s25) this.c).e();
        if (e != null) {
            MediaInfo mediaInfo = e.x;
            if (mediaInfo == null) {
                i = -1;
            } else {
                i = mediaInfo.y;
            }
            int i2 = e.B;
            int i3 = e.C;
            int i4 = e.I;
            if (i2 == 1) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            return 0L;
                        }
                    } else if (i != 2) {
                        return 0L;
                    }
                }
                if (i4 == 0) {
                    return 0L;
                }
            }
            return e.y;
        }
        return 0L;
    }

    public void h() {
        Set set = (Set) this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((n25) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        Set set = (Set) this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    p25 p25Var = ((n25) it.next()).a;
                    p25Var.x1();
                    p25Var.n.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        Set set = (Set) this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((n25) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() {
        Set set = (Set) this.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((n25) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
