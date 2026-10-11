package m3;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class a1 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f7152t = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f7153a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f7154b;

    /* renamed from: j, reason: collision with root package name */
    public int f7162j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f7169r;

    /* renamed from: s, reason: collision with root package name */
    public d0 f7170s;

    /* renamed from: c, reason: collision with root package name */
    public int f7155c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f7156d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f7157e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f7158f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f7159g = -1;

    /* renamed from: h, reason: collision with root package name */
    public a1 f7160h = null;

    /* renamed from: i, reason: collision with root package name */
    public a1 f7161i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f7163k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f7164l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f7165m = 0;

    /* renamed from: n, reason: collision with root package name */
    public a3.h f7166n = null;
    public boolean o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f7167p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f7168q = -1;

    public a1(View view) {
        if (view != null) {
            this.f7153a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(Object obj) {
        if (obj == null) {
            b(1024);
            return;
        }
        if ((1024 & this.f7162j) == 0) {
            if (this.f7163k == null) {
                ArrayList arrayList = new ArrayList();
                this.f7163k = arrayList;
                this.f7164l = Collections.unmodifiableList(arrayList);
            }
            this.f7163k.add(obj);
        }
    }

    public final void b(int i10) {
        this.f7162j = i10 | this.f7162j;
    }

    public final int c() {
        RecyclerView recyclerView;
        d0 adapter;
        int I;
        if (this.f7170s == null || (recyclerView = this.f7169r) == null || (adapter = recyclerView.getAdapter()) == null || (I = this.f7169r.I(this)) == -1 || this.f7170s != adapter) {
            return -1;
        }
        return I;
    }

    public final int d() {
        int i10 = this.f7159g;
        if (i10 == -1) {
            return this.f7155c;
        }
        return i10;
    }

    public final List e() {
        ArrayList arrayList;
        if ((this.f7162j & 1024) == 0 && (arrayList = this.f7163k) != null && arrayList.size() != 0) {
            return this.f7164l;
        }
        return f7152t;
    }

    public final boolean f() {
        View view = this.f7153a;
        if (view.getParent() != null && view.getParent() != this.f7169r) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f7162j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f7162j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f7162j & 16) == 0) {
            WeakHashMap weakHashMap = g0.y0.f4277a;
            if (!g0.h0.i(this.f7153a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        if ((this.f7162j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f7166n != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f7162j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final void m(int i10, boolean z9) {
        if (this.f7156d == -1) {
            this.f7156d = this.f7155c;
        }
        if (this.f7159g == -1) {
            this.f7159g = this.f7155c;
        }
        if (z9) {
            this.f7159g += i10;
        }
        this.f7155c += i10;
        View view = this.f7153a;
        if (view.getLayoutParams() != null) {
            ((l0) view.getLayoutParams()).f7296c = true;
        }
    }

    public final void n() {
        if (RecyclerView.Q0 && l()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f7162j = 0;
        this.f7155c = -1;
        this.f7156d = -1;
        this.f7157e = -1L;
        this.f7159g = -1;
        this.f7165m = 0;
        this.f7160h = null;
        this.f7161i = null;
        ArrayList arrayList = this.f7163k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f7162j &= -1025;
        this.f7167p = 0;
        this.f7168q = -1;
        RecyclerView.l(this);
    }

    public final void o(boolean z9) {
        int i10;
        int i11 = this.f7165m;
        if (z9) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f7165m = i10;
        if (i10 < 0) {
            this.f7165m = 0;
            if (!RecyclerView.Q0) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z9 && i10 == 1) {
            this.f7162j |= 16;
        } else if (z9 && i10 == 0) {
            this.f7162j &= -17;
        }
        if (RecyclerView.R0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z9 + ":" + this);
        }
    }

    public final boolean p() {
        if ((this.f7162j & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if ((this.f7162j & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String simpleName;
        boolean z9;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder a10 = p.j.a(simpleName, "{");
        a10.append(Integer.toHexString(hashCode()));
        a10.append(" position=");
        a10.append(this.f7155c);
        a10.append(" id=");
        a10.append(this.f7157e);
        a10.append(", oldPos=");
        a10.append(this.f7156d);
        a10.append(", pLpos:");
        a10.append(this.f7159g);
        StringBuilder sb = new StringBuilder(a10.toString());
        if (k()) {
            sb.append(" scrap ");
            if (this.o) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (h()) {
            sb.append(" invalid");
        }
        if (!g()) {
            sb.append(" unbound");
        }
        boolean z10 = true;
        if ((this.f7162j & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            sb.append(" update");
        }
        if (j()) {
            sb.append(" removed");
        }
        if (p()) {
            sb.append(" ignored");
        }
        if (l()) {
            sb.append(" tmpDetached");
        }
        if (!i()) {
            sb.append(" not recyclable(" + this.f7165m + ")");
        }
        if ((this.f7162j & 512) == 0 && !h()) {
            z10 = false;
        }
        if (z10) {
            sb.append(" undefined adapter position");
        }
        if (this.f7153a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
