package r3;

import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f9349a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9350b;

    /* renamed from: c, reason: collision with root package name */
    public float f9351c;

    /* renamed from: d, reason: collision with root package name */
    public float f9352d;

    /* renamed from: e, reason: collision with root package name */
    public float f9353e;

    /* renamed from: f, reason: collision with root package name */
    public float f9354f;

    /* renamed from: g, reason: collision with root package name */
    public float f9355g;

    /* renamed from: h, reason: collision with root package name */
    public float f9356h;

    /* renamed from: i, reason: collision with root package name */
    public float f9357i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f9358j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9359k;

    /* renamed from: l, reason: collision with root package name */
    public String f9360l;

    public i(i iVar, n.e eVar) {
        k gVar;
        this.f9349a = new Matrix();
        this.f9350b = new ArrayList();
        this.f9351c = 0.0f;
        this.f9352d = 0.0f;
        this.f9353e = 0.0f;
        this.f9354f = 1.0f;
        this.f9355g = 1.0f;
        this.f9356h = 0.0f;
        this.f9357i = 0.0f;
        Matrix matrix = new Matrix();
        this.f9358j = matrix;
        this.f9360l = null;
        this.f9351c = iVar.f9351c;
        this.f9352d = iVar.f9352d;
        this.f9353e = iVar.f9353e;
        this.f9354f = iVar.f9354f;
        this.f9355g = iVar.f9355g;
        this.f9356h = iVar.f9356h;
        this.f9357i = iVar.f9357i;
        String str = iVar.f9360l;
        this.f9360l = str;
        this.f9359k = iVar.f9359k;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(iVar.f9358j);
        ArrayList arrayList = iVar.f9350b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f9350b.add(new i((i) obj, eVar));
            } else {
                if (obj instanceof h) {
                    gVar = new h((h) obj);
                } else if (obj instanceof g) {
                    gVar = new g((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f9350b.add(gVar);
                Object obj2 = gVar.f9362b;
                if (obj2 != null) {
                    eVar.put(obj2, gVar);
                }
            }
        }
    }

    @Override // r3.j
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9350b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((j) arrayList.get(i10)).a()) {
                return true;
            }
            i10++;
        }
    }

    @Override // r3.j
    public final boolean b(int[] iArr) {
        int i10 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.f9350b;
            if (i10 < arrayList.size()) {
                z9 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z9;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f9358j;
        matrix.reset();
        matrix.postTranslate(-this.f9352d, -this.f9353e);
        matrix.postScale(this.f9354f, this.f9355g);
        matrix.postRotate(this.f9351c, 0.0f, 0.0f);
        matrix.postTranslate(this.f9356h + this.f9352d, this.f9357i + this.f9353e);
    }

    public String getGroupName() {
        return this.f9360l;
    }

    public Matrix getLocalMatrix() {
        return this.f9358j;
    }

    public float getPivotX() {
        return this.f9352d;
    }

    public float getPivotY() {
        return this.f9353e;
    }

    public float getRotation() {
        return this.f9351c;
    }

    public float getScaleX() {
        return this.f9354f;
    }

    public float getScaleY() {
        return this.f9355g;
    }

    public float getTranslateX() {
        return this.f9356h;
    }

    public float getTranslateY() {
        return this.f9357i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.f9352d) {
            this.f9352d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f9353e) {
            this.f9353e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f9351c) {
            this.f9351c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f9354f) {
            this.f9354f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f9355g) {
            this.f9355g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.f9356h) {
            this.f9356h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f9357i) {
            this.f9357i = f10;
            c();
        }
    }

    public i() {
        this.f9349a = new Matrix();
        this.f9350b = new ArrayList();
        this.f9351c = 0.0f;
        this.f9352d = 0.0f;
        this.f9353e = 0.0f;
        this.f9354f = 1.0f;
        this.f9355g = 1.0f;
        this.f9356h = 0.0f;
        this.f9357i = 0.0f;
        this.f9358j = new Matrix();
        this.f9360l = null;
    }
}
