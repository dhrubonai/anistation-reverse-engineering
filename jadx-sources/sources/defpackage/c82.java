package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c82 extends Drawable.ConstantState {
    public Drawable.ConstantState a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public int m;
    public float n;
    public int o;
    public float p;
    public int q;
    public float r;
    public int s;
    public pm5 t;
    public int u;
    public int v;
    public final Rect w;
    public final int[] x;

    public c82(c82 c82Var) {
        this.b = 0;
        this.c = false;
        this.d = Integer.MIN_VALUE;
        this.e = false;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = Float.NaN;
        this.k = Integer.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Integer.MIN_VALUE;
        this.n = Float.NaN;
        this.o = Integer.MIN_VALUE;
        this.p = Float.NaN;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = null;
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = null;
        this.x = FocusRingDrawable.M;
        if (c82Var != null) {
            this.a = c82Var.a;
            this.b = c82Var.b;
            this.c = c82Var.c;
            this.d = c82Var.d;
            this.e = c82Var.e;
            this.f = c82Var.f;
            this.g = c82Var.g;
            this.h = c82Var.h;
            this.i = c82Var.i;
            this.j = c82Var.j;
            this.k = c82Var.k;
            this.l = c82Var.l;
            this.m = c82Var.m;
            this.n = c82Var.n;
            this.o = c82Var.o;
            this.p = c82Var.p;
            this.q = c82Var.q;
            this.r = c82Var.r;
            this.s = c82Var.s;
            this.u = c82Var.u;
            this.v = c82Var.v;
            pm5 pm5Var = c82Var.t;
            if (pm5Var != null) {
                this.t = pm5Var.f().a();
            } else {
                this.t = pm5Var;
            }
            if (c82Var.w != null) {
                this.w = new Rect(c82Var.w);
            }
            int[] iArr = c82Var.x;
            this.x = Arrays.copyOf(iArr, iArr.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i;
        Drawable.ConstantState constantState = this.a;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return this.b | i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources);
    }
}
