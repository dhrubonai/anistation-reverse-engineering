package r3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class d extends f implements Animatable {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f9331x = 0;

    /* renamed from: b, reason: collision with root package name */
    public final b f9332b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f9333c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.d f9334d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f9335e = null;

    /* renamed from: f, reason: collision with root package name */
    public final g.g f9336f;

    public d(Context context) {
        g.g gVar = new g.g(this);
        this.f9336f = gVar;
        this.f9333c = context;
        this.f9332b = new b(gVar);
    }

    @Override // r3.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            a0.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return a0.b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f9332b;
        bVar.f9326a.draw(canvas);
        if (bVar.f9327b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return a0.a.a(drawable);
        }
        return this.f9332b.f9326a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f9332b.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return a0.b.c(drawable);
        }
        return this.f9332b.f9326a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f9338a != null && Build.VERSION.SDK_INT >= 24) {
            return new c(this.f9338a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f9332b.f9326a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f9332b.f9326a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f9332b.f9326a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0187, code lost:
    
        if (r8.f9327b != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0189, code lost:
    
        r8.f9327b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0190, code lost:
    
        r8.f9327b.playTogether(r8.f9328c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0197, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.content.res.Resources.Theme r27) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return a0.a.d(drawable);
        }
        return this.f9332b.f9326a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f9332b.f9327b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f9332b.f9326a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f9332b.f9326a.setBounds(rect);
        }
    }

    @Override // r3.f, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f9332b.f9326a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f9332b.f9326a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f9332b.f9326a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            a0.a.e(drawable, z9);
        } else {
            this.f9332b.f9326a.setAutoMirrored(z9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f9332b.f9326a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            w7.b.V(drawable, i10);
        } else {
            this.f9332b.f9326a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            w7.b.W(drawable, colorStateList);
        } else {
            this.f9332b.f9326a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            w7.b.X(drawable, mode);
        } else {
            this.f9332b.f9326a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.setVisible(z9, z10);
        }
        this.f9332b.f9326a.setVisible(z9, z10);
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f9332b;
        if (bVar.f9327b.isStarted()) {
            return;
        }
        bVar.f9327b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f9332b.f9327b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
