package r3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class m extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f9380a;

    /* renamed from: b, reason: collision with root package name */
    public l f9381b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f9382c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f9383d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9384e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f9385f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f9386g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f9387h;

    /* renamed from: i, reason: collision with root package name */
    public int f9388i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9389j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9390k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f9391l;

    public m(m mVar) {
        this.f9382c = null;
        this.f9383d = o.A;
        if (mVar != null) {
            this.f9380a = mVar.f9380a;
            l lVar = new l(mVar.f9381b);
            this.f9381b = lVar;
            if (mVar.f9381b.f9370e != null) {
                lVar.f9370e = new Paint(mVar.f9381b.f9370e);
            }
            if (mVar.f9381b.f9369d != null) {
                this.f9381b.f9369d = new Paint(mVar.f9381b.f9369d);
            }
            this.f9382c = mVar.f9382c;
            this.f9383d = mVar.f9383d;
            this.f9384e = mVar.f9384e;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f9380a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new o(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new o(this);
    }

    public m() {
        this.f9382c = null;
        this.f9383d = o.A;
        this.f9381b = new l();
    }
}
