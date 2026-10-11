package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class c0 extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final r f430a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f431b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f432c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        w3.a(context);
        this.f432c = false;
        v3.a(getContext(), this);
        r rVar = new r(this);
        this.f430a = rVar;
        rVar.e(attributeSet, i10);
        d0 d0Var = new d0(this);
        this.f431b = d0Var;
        d0Var.e(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f430a;
        if (rVar != null) {
            rVar.a();
        }
        d0 d0Var = this.f431b;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f430a;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f430a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        x3 x3Var;
        d0 d0Var = this.f431b;
        if (d0Var == null || (x3Var = (x3) d0Var.f443d) == null) {
            return null;
        }
        return (ColorStateList) x3Var.f707d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        x3 x3Var;
        d0 d0Var = this.f431b;
        if (d0Var == null || (x3Var = (x3) d0Var.f443d) == null) {
            return null;
        }
        return (PorterDuff.Mode) x3Var.f708e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(((ImageView) this.f431b.f441b).getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f430a;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f430a;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        d0 d0Var = this.f431b;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        d0 d0Var = this.f431b;
        if (d0Var != null && drawable != null && !this.f432c) {
            d0Var.f440a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (d0Var != null) {
            d0Var.c();
            if (!this.f432c) {
                ImageView imageView = (ImageView) d0Var.f441b;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(d0Var.f440a);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f432c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f431b.f(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        d0 d0Var = this.f431b;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f430a;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f430a;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        d0 d0Var = this.f431b;
        if (d0Var != null) {
            d0Var.g(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        d0 d0Var = this.f431b;
        if (d0Var != null) {
            d0Var.h(mode);
        }
    }
}
