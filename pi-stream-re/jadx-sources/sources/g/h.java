package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public abstract class h extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final i f4130a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f4131b;

    /* renamed from: c, reason: collision with root package name */
    public int f4132c;

    /* renamed from: d, reason: collision with root package name */
    public int f4133d;

    /* renamed from: e, reason: collision with root package name */
    public int f4134e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f4135f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable[] f4136g;

    /* renamed from: h, reason: collision with root package name */
    public int f4137h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4138i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4139j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f4140k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4141l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4142m;

    /* renamed from: n, reason: collision with root package name */
    public int f4143n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f4144p;

    /* renamed from: q, reason: collision with root package name */
    public int f4145q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4146r;

    /* renamed from: s, reason: collision with root package name */
    public int f4147s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4148t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4149u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4150v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4151w;

    /* renamed from: x, reason: collision with root package name */
    public int f4152x;

    /* renamed from: y, reason: collision with root package name */
    public int f4153y;

    /* renamed from: z, reason: collision with root package name */
    public int f4154z;

    public h(h hVar, i iVar, Resources resources) {
        Resources resources2;
        int i10;
        this.f4138i = false;
        this.f4141l = false;
        this.f4151w = true;
        this.f4153y = 0;
        this.f4154z = 0;
        this.f4130a = iVar;
        if (resources != null) {
            resources2 = resources;
        } else if (hVar != null) {
            resources2 = hVar.f4131b;
        } else {
            resources2 = null;
        }
        this.f4131b = resources2;
        if (hVar != null) {
            i10 = hVar.f4132c;
        } else {
            i10 = 0;
        }
        int i11 = i.D;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f4132c = i10;
        if (hVar != null) {
            this.f4133d = hVar.f4133d;
            this.f4134e = hVar.f4134e;
            this.f4149u = true;
            this.f4150v = true;
            this.f4138i = hVar.f4138i;
            this.f4141l = hVar.f4141l;
            this.f4151w = hVar.f4151w;
            this.f4152x = hVar.f4152x;
            this.f4153y = hVar.f4153y;
            this.f4154z = hVar.f4154z;
            this.A = hVar.A;
            this.B = hVar.B;
            this.C = hVar.C;
            this.D = hVar.D;
            this.E = hVar.E;
            this.F = hVar.F;
            this.G = hVar.G;
            if (hVar.f4132c == i10) {
                if (hVar.f4139j) {
                    this.f4140k = hVar.f4140k != null ? new Rect(hVar.f4140k) : null;
                    this.f4139j = true;
                }
                if (hVar.f4142m) {
                    this.f4143n = hVar.f4143n;
                    this.o = hVar.o;
                    this.f4144p = hVar.f4144p;
                    this.f4145q = hVar.f4145q;
                    this.f4142m = true;
                }
            }
            if (hVar.f4146r) {
                this.f4147s = hVar.f4147s;
                this.f4146r = true;
            }
            if (hVar.f4148t) {
                this.f4148t = true;
            }
            Drawable[] drawableArr = hVar.f4136g;
            this.f4136g = new Drawable[drawableArr.length];
            this.f4137h = hVar.f4137h;
            SparseArray sparseArray = hVar.f4135f;
            if (sparseArray != null) {
                this.f4135f = sparseArray.clone();
            } else {
                this.f4135f = new SparseArray(this.f4137h);
            }
            int i12 = this.f4137h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f4135f.put(i13, constantState);
                    } else {
                        this.f4136g[i13] = drawableArr[i13];
                    }
                }
            }
            return;
        }
        this.f4136g = new Drawable[10];
        this.f4137h = 0;
    }

    public final int a(Drawable drawable) {
        int i10 = this.f4137h;
        if (i10 >= this.f4136g.length) {
            int i11 = i10 + 10;
            j jVar = (j) this;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = jVar.f4136g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            jVar.f4136g = drawableArr;
            int[][] iArr = new int[i11];
            System.arraycopy(jVar.H, 0, iArr, 0, i10);
            jVar.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f4130a);
        this.f4136g[i10] = drawable;
        this.f4137h++;
        this.f4134e = drawable.getChangingConfigurations() | this.f4134e;
        this.f4146r = false;
        this.f4148t = false;
        this.f4140k = null;
        this.f4139j = false;
        this.f4142m = false;
        this.f4149u = false;
        return i10;
    }

    public final void b() {
        this.f4142m = true;
        c();
        int i10 = this.f4137h;
        Drawable[] drawableArr = this.f4136g;
        this.o = -1;
        this.f4143n = -1;
        this.f4145q = 0;
        this.f4144p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f4143n) {
                this.f4143n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.o) {
                this.o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f4144p) {
                this.f4144p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f4145q) {
                this.f4145q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f4135f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.f4135f.keyAt(i10);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f4135f.valueAt(i10);
                Drawable[] drawableArr = this.f4136g;
                Drawable newDrawable = constantState.newDrawable(this.f4131b);
                a0.c.b(newDrawable, this.f4152x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f4130a);
                drawableArr[keyAt] = mutate;
            }
            this.f4135f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i10 = this.f4137h;
        Drawable[] drawableArr = this.f4136g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                if (a0.b.b(drawable)) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f4135f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int indexOfKey;
        Drawable drawable = this.f4136g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f4135f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f4135f.valueAt(indexOfKey)).newDrawable(this.f4131b);
        a0.c.b(newDrawable, this.f4152x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f4130a);
        this.f4136g[i10] = mutate;
        this.f4135f.removeAt(indexOfKey);
        if (this.f4135f.size() == 0) {
            this.f4135f = null;
        }
        return mutate;
    }

    public abstract void e();

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f4133d | this.f4134e;
    }
}
